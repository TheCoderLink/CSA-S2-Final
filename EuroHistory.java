public class EuroHistory extends History {
  //variable for the Room Number of the Teacher's classroom
  public String textBookName;

  //class constructor
  public EuroHistory(String name, int gradeLevel, int age, int roomNo, String textBookName) {
    super(name, gradeLevel, age, roomNo);
    this.textBookName = textBookName;
  }

  //getter for the class
  public String getTextBookName() {
    return textBookName;
  }

  //The third level of the intro methods, which will be overrided.
  public void stringIntro()
  {
    super.stringIntro();
    System.out.println("I teach a European History class, and the textbook that I use is " + textBookName + ".\n");
  }

  public void arrayPrint()
  {
    System.out.println(super.toString());
    System.out.println(this.toString());
  }

  //toString method, level 3
  public String toString()
  {
    return "Textbook: " + this.getTextBookName();
  }
}