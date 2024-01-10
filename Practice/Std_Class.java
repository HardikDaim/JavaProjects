
class std {
    // Properties.
    public String name;
    public int roll_no;
    public String course;
    public int m1;
    public int m2;
    public int m3;
    // Methods.
    public int total() {
        return m1+m2+m3;
    }
    public int average() {
        return (m1+m2+m3)/3;
    }
    public char grade() {
        if(average()>=60) {
            return 'A';
        }
        else {
            return 'B';
        }
    }
    public String details() {
        return "Roll No : " + roll_no +"\n"+ "Name : " + name +"\n"+ "Course : " + course + "\n" ;
    }

}

public class Std_Class {
    std s = new std();
    

}
