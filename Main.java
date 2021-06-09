import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    List<Teacher> teacherList = new ArrayList<Teacher>();

    Chemistry chemistryTeacher = new Chemistry("Placeholder", 10, 22, 456, "Fundamentals of Chemistry");
    EuroHistory euroTeacher = new EuroHistory("Placeholder", 10, 37, 615, "Modern European History");
    Algebra algebraTeacher = new Algebra("Placeholder", 10, 62, 586, "Basic Algebra I");

    //adding the objects to the arraylist
    teacherList.add(chemistryTeacher);
    teacherList.add(euroTeacher);
    teacherList.add(algebraTeacher);

    //user input for the teacher's name
    System.out.println("What is the Chemistry Teacher's name?: ");
    String answer = scan.nextLine();
    chemistryTeacher.setName(answer);
    System.out.println("What is the European History Teacher's name?: ");
    String answer2 = scan.nextLine();
    euroTeacher.setName(answer2);
    System.out.println("What is the Algebra Teacher's name?: ");
    String answer3 = scan.nextLine();
    algebraTeacher.setName(answer3);
    System.out.println();

    //the combined "toString" methods stringIntro, for Teacher Introductions
    System.out.println("----Teacher Intros:----");
    chemistryTeacher.stringIntro();
    euroTeacher.stringIntro();
    algebraTeacher.stringIntro();
    System.out.println();

    //Printing out the Arraylist
    System.out.println("----Class Requirements:----");
    for(int i = 0; i < teacherList.size(); i++)
    {
      teacherList.get(i).arrayPrint();
    }
  }
}