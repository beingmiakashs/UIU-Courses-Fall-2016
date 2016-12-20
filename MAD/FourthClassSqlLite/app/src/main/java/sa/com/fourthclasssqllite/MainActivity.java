package sa.com.fourthclasssqllite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.activeandroid.query.Select;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Student> tmList = new Select().from(Student.class).execute();
        for(Student student : tmList){
            //student.delete();
        }

        Student student1 = new Student("Anik", "01254", "CSE");
        Student student2 = new Student("Rifat", "1245", "EEE");

        student1.save();
        student2.save();

        List<Student> studentList = new Select().from(Student.class).execute();

        String list="";
        for(Student student : studentList){

            list += student.studentName+" "+student.studentID+" "+student.dept+"\n";
            student.studentName="1111";
            student.save();
        }

        TextView listTV = (TextView) findViewById(R.id.stListTV);
        listTV.setText(list);
    }
}











