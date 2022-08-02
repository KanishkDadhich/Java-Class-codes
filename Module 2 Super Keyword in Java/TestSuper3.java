//3) super is used to invoke parent class constructor.

class Animal5{  
    Animal5(){
        System.out.println("animal is created");
    }  
    Animal5(String ar){
        System.out.println("animal is created "+ ar);
    }
}   
class Dog1 extends Animal5{  
    Dog1(){  
        //super("dog");  
        System.out.println("dog is created");  
    }
    Dog1(String ss){  
        //this();
        super("dog");  
        System.out.println("dog is created "+ss);  
    }  
}  
class TestSuper3{  
    public static void main(String args[]){  
        Dog1 d=new Dog1("abc");  
    }
}