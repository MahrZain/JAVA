public class Student {
    private String name;
    private int age;
    private char grade;

    public void Student_Name(String sName) {
        name = sName;
    }
    public void Student_Age(int sAge) {
        age = sAge;
    }
    public void Student_Grade(char sGrade) {
        grade = sGrade;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}
