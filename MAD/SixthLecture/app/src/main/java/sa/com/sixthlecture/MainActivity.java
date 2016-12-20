package sa.com.sixthlecture;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserInfo;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    EditText usernameET;
    EditText passwordET;
    FirebaseAuth auth;
    FirebaseDatabase db;
    DatabaseReference ref;
    TextView statusTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameET = (EditText) findViewById(R.id.userNameET);
        passwordET = (EditText) findViewById(R.id.passwordET);
        Button loginBtn = (Button) findViewById(R.id.loginBtn);

        auth = FirebaseAuth.getInstance();
        if(auth.getCurrentUser()!=null){
            FirebaseUser userInfo = auth.getCurrentUser();
            userInfo.getDisplayName();
        }

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = usernameET.getText().toString();
                String password = passwordET.getText().toString();

                auth.signInWithEmailAndPassword(username, password).addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_LONG).show();
                        }
                        else {
                            Toast.makeText(MainActivity.this, "Login unsuccessful", Toast.LENGTH_LONG).show();
                        }
                    }
                });
            }
        });

        statusTV = (TextView) findViewById(R.id.status);
        db = FirebaseDatabase.getInstance();
        ref = db.getReference("Season");
        ref.setValue(new String("Spring"));

        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String s = dataSnapshot.getValue(String.class);
                statusTV.setText(s);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        DatabaseReference productRef = db.getReference("ProductList");
        DatabaseReference newRef = productRef.push();
        newRef.setValue(new Product("HP probook", 956000.78));


        productRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String res = "";
                for(DataSnapshot temp : dataSnapshot.getChildren()){
                    Product p = temp.getValue(Product.class);
                    res+=p.productName+" "+p.price+"\n";
                }
                statusTV.setText(res);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }
}















