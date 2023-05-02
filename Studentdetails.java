
public class Studentdetails {
    public static void main(String args[]){
        
      Student s1=new Student();
      Student s2=new Student();
      s1.name="Amar Kumar";
      s1.city="Pune";
      s1.age=22;
      s2.name="Anurag Sharma";
      s2.city="Banglore";
      s2.age=23; 
      s1.printData();
      s2.printData();
    }
    
}
class Student{
    String name,city;
        int age;
 public void printData()
    {
        System.out.println("Students Details");
        System.out.println("Name="+name+"\tCity="+city+"\tAge="+age);
    }

}
