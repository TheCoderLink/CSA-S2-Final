public class Teacher {
  public String name;
  public int gradeLevel;
  public int age;

  public Teacher(String name, int gradeLevel, int age) {
    this.name = name;
    this.gradeLevel = gradeLevel;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getGradeLevel() {
    return gradeLevel;
  }

  public int getAge() {
    return age;
  }

  public void setName(String newName) {
    this.name = newName;
  }

  public String ageCommentary() {
    if (getAge() >= 60) {
      return "I'm getting a little too old to be teaching, but I love it.";
    } else if (getAge() > 29 && getAge() <= 59) {
      return "I've been teaching for a while now.";
    } else {
      return "I'm pretty new to teaching, so I might as well be a substitute.";
    }
  }

  //The first level of intro methods, which will be overrided.
  public void stringIntro() {
    System.out.println("Hi! My name is " + name + "." + "\nI teach grade " + gradeLevel + "." + "\nI'm " + age + " years old! " + ageCommentary());
  }

  public void arrayPrint()
  {
    System.out.println(super.toString());
    System.out.println(this.toString());
  }

  public String toString()
  {
    return "Teacher name: " + this.getName() + 
           "\nTeacher Grade Level: " + this.getGradeLevel() + 
           "\nTeacher Age: " + this.getAge();
  }
}