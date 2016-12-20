package sa.com.fourthclasssqllite;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by akashs on 11/2/16.
 */

@Table(name = "StudentTable")
public class Student extends Model {

    @Column(name = "studentName")
    public String studentName;

    @Column(name = "studentId")
    public String studentID;

    @Column(name = "department")
    public String dept;

    public Student() {
    }

    public Student(String studentName, String studentID, String dept) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.dept = dept;
    }
}
