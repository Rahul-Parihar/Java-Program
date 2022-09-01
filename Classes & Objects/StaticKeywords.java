public class StaticKeywords {
    public static void main(String[] args) {


        Student s1=new Student();
        s1.schoolName="Jnv";

        Student s2=new Student();
        System.out.println(s2.schoolName);

        Student s3=new Student();
        s3.schoolName="bnp";

    }

}

class Student {

    int returnPercentage(int maths,int hindi,int sst){
        return (maths+hindi+sst)/100;
    }
    String name;
    int roll;

    static String schoolName;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}
