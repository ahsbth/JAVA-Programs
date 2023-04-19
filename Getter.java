public class Getter {
    public static void main(String args[])
    {
        Student s=new Student();
        s.getAdmNO("22SCSE2140004");
        s.setMarks(25);
        System.out.println(this.adMno);
        System.out.println(this.marks);

    }

    
}
class Student
{
    private String adMno;
    private int marks;
    //Getter method
    public String getAdmNO(String adMno)
    {
        return this.adMno;
    }
    //Setter methde
    public int  setMarks(int marks)
    {
      return this.marks;
    }

}
