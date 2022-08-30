public class typesOfConst {
    public static void main(String[] args) {
        Student s1 = new Student();
        // Student s2 = new Student("Rahul");
        // Student s3 = new Student(12);
        s1.name = "Rahul";
        s1.age = 12;
        s1.password = "qwert";
        s1.marks[0]=25;
        s1.marks[1]=58;
        s1.marks[2]=78;

        Student s2 = new Student(s1);
        s2.password = "asdf";
        s1.marks[2]=99;

        for(int i=0; i<3; i++){
            System.out.println(s2.marks[i]);
        }

    }

}

class Student {
    String name;
    int age;
    String password;
    int marks[];

    Student() { // non parametarized constructor
        marks=new int [3];
        System.out.println("constructor is called..");
    }

    Student(String name) {// parametarized constructor
        marks=new int [3];
        name = this.name;
    }

    Student(int age) {
        marks=new int [3];
        age = this.age;
    }

    Student(Student s1) {//copy contructor
        marks=new int [3];
        this.name = s1.name;
        this.age = s1.age;
        this.marks=s1.marks;
    }
}
