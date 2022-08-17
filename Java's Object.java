// this is class like a blueprint
public class Main {
  
    //state of an object
    String Name;
    int age;
    //behaviour of an object
    // public void  Used when you don't have to create an object and have no return.
    public void set_value (){
      age = 19;
      Name= " Chansovanmony Yoeun ";
    }
    public void get_value (){
      System.out.println("Age is " + age);
      Sytem.out.println("Name is " + Name);
    }
    // main method
    public static void main (String[]args){
      //create a new person object 
      Person p= new Person ();
      // change state through behavior 
      p.set_value();
    }
    }  
  }
    
  