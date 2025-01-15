

public class StudentData {
    private int stuID;
   private String stuName;
   private int stuAge;
// default constructor
   StudentData(){
    stuName = "Mohammad";   
    stuAge = 25;
    stuID = 12345;
   }
// parameterized constructor
   StudentData(int num, String name, int num2){
       stuID = num;
       stuName = name;
       stuAge = num2;
   }
//setter methods
public void setStuID(int stuID){
    this.stuID = stuID;
}
public void setStuName(String stuName){
    this.stuName = stuName;
}
public void setStuAge(int stuAge){
    this.stuAge = stuAge;
}
//getter methods
public int getStuID(){
    return stuID;
}
public String getStuName(){
    return stuName;
}
public int getStuAge(){
    return stuAge;
}


 
   public static void main(String args[])
   {
       //This object creation would call the default constructor
       StudentData myobj = new StudentData();
       System.out.println("Student Name is: "+myobj.getStuName());
       System.out.println("Student Age is: "+myobj.getStuAge());
       System.out.println("Student ID is: "+myobj.getStuID());
 
       /*This object creation would call the parameterized
        * constructor StudentData(int, String, int)*/
       StudentData myobj2 = new StudentData(555, "Chaitanya", 25);
       System.out.println("Student Name is: "+myobj2.getStuName());
       System.out.println("Student Age is: "+myobj2.getStuAge());
       System.out.println("Student ID is: "+myobj2.getStuID()); 
  }

}
