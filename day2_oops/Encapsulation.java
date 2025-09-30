package day2_oops;

public class Encapsulation {
	
	@SuppressWarnings("unused")
	private String name;
	@SuppressWarnings("unused")
	private int age;
	
	public Encapsulation(String name, int age){
		this.name=name;
		this.age=age;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public int getage() {
		return age;
	}
	public void setage(int age) {
		this.age=age;
	}
	public static void main(String[]args) {
		Encapsulation e=new Encapsulation("Anitha",23);
		System.out.println(e.getname());
		System.out.println(e.getage());
		e.setname("krishna");
		System.out.println(e.getname());
		
	}
}
