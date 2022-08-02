class PolymDemo {
	public void print(String s){
		System.out.println("First Method with only String- "+ s);
	}
	public void print (int i){
		System.out.println("Second Method with only int- "+ i);
	}
	public void print (String s, int i){
		System.out.println("Third Method with both- "+ s + "--" + i);
	}
}

class PolymDemo1 extends PolymDemo{
    @Override
    public void print(String s){
        System.out.println("First Method of child class with only String- "+ s);
    }
}

 class OverrideExample {
	public static void main(String[] args) {
		PolymDemo obj = new PolymDemo();
		obj.print(10);
		obj.print("Amit");
		obj.print("Hello", 100);

        PolymDemo1 obj1 = new PolymDemo1();
        obj1.print("Java");
	}
}