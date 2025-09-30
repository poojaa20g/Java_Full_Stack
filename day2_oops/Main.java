package day2_oops;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mangotree m = new Mangotree();
		Appletree a = new Appletree();
		a.leaftype="small";
		m.branch=50;
		a.life="1000 days";
		m.life="5000 days";
		System.out.println(a.leaftype);
		System.out.println(a.fruit);
		System.out.println(a.life);
		System.out.println("***************");
		System.out.println(m.branch);
		System.out.println(m.fruit);
		System.out.println(m.life);

	}

}
