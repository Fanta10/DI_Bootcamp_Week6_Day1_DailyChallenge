
public class Person {
	
	private String name;
	private int age ;
	private double salary;
	
	

	public Person() { 
	}
	



	public Person(String name, int age, double salary) {
		
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	




	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
		this.salary = -1;
	}
	
	public void PersondisplayInfo(){
		System.out.println("nom : " + this.name + " age : " + this.age + " ans " + " salaire :  " 
	+ this.salary);
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person personne1 = new Person();
		Person personne2 = new Person("KAMATE Radia", 10 , 100000);
		
		personne1.PersondisplayInfo();
		personne2.PersondisplayInfo();
		
		Person personne3 = new Person("Kamate Noura", 5);
		personne3.PersondisplayInfo();
		

	}

}
