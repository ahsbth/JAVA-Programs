public class Student {
    Getter g=new Getter();
    
}
class Getter{
    private String name;
    private int age; 
    //getter
    public String getName() {
        return name;
      }
      //getter
      public int getAge() {
        return age;
      }
      //setter
      public void setName(String name) {
        this.name = name;
      }
      //setter
      public void setAge(int age) {
        this.age = age;
      }
   } 
