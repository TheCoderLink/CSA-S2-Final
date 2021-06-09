public class Chemistry extends Science {
  //variable for the name of the Textbook
  public String textBookName;

  //class constructor
  public Chemistry(String name, int gradeLevel, int age, int roomNo, String textBookName) {
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
    System.out.println("I teach a Chemistry class, and the textbook that I use is " + textBookName + ".\n");
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