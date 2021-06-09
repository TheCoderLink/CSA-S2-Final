public class History extends Teacher {
  //variable for the Room Number of the Teacher's classroom
  public int roomNo;

  //class constructor
  public History(String name, int gradeLevel, int age, int roomNo) {
    super(name, gradeLevel, age);
    this.roomNo = roomNo;
  }

  //getter for the class
  public int getRoomNo() {
    return roomNo;
  }

  //setter for the class
  public void setRoomNo(int newRoomNo) {
    this.roomNo = newRoomNo;
  }

  //The second level of the intro methods, which will be overrided.
  public void stringIntro() {
    super.stringIntro();
    System.out.println("I teach a history class in room " + roomNo + " ");
  }

  public void arrayPrint()
  {
    System.out.println(super.toString());
    System.out.println(this.toString());
  }
  
  //toString method, level 2
  public String toString()
  {
    return "Room Number: " + this.getRoomNo();
  }
}