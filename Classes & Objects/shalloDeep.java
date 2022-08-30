public class shalloDeep {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Rahul";
        s1.age = 12;
        s1.password = "qwert";
        s1.marks[0] = 25;
        s1.marks[1] = 58;
        s1.marks[2] = 78;

        Student s2 = new Student(s1);
        s2.password = "asdf";
        s1.marks[2] = 99;

        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }

    }

}

class Student {
    String name;
    int age;
    String password;
    int marks[];

    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.age = s1.age;

        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[1];
        }
    }

    public Student() {
    }

}

//error - Exception in thread "main" java.lang.NullPointerException