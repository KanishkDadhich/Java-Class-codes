class First{
    //defining fields  
    int id = 10; 
    String name = "IIITian";  
    String Branch = "CSB+IT";
}

class ClassExample{   
   public static void main(String args[]){  
    //Creating an object or instance  
    First s1 = new First();  
   
    //Printing values of the object  
    System.out.println("Hi");
    System.out.println(s1.id); 
    System.out.println(s1.name);
    System.out.println("Branch of the student is " + s1.Branch + " Hello!");
   }  
  }