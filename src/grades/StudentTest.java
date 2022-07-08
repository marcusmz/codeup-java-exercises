package grades;

public class StudentTest {
    public static void main(String[] args) {
        Student marcus = new Student("Marcus");
        marcus.addGrade(75);
        marcus.addGrade(85);
        marcus.addGrade(95);
        System.out.println(marcus.getGrades());
        System.out.println(marcus.getGradeAverage());
    }
}
