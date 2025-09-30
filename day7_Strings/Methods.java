package day7_Strings;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Nirmaan";
		String s2= new String("Nirmaan");
		String s3="nirmaan";
		String s4="Nirmaan";
		String s5="Welcome to the beautiful world";
		String s6="the";
		
		System.out.println("equals :"+s1.equals(s2));
		System.out.println(s1==s4);
		System.out.println("compareTo :"+s1.compareTo(s2));
		System.out.println("equalsIgnoreCase :"+s1.equalsIgnoreCase(s3));
		
		System.out.println("contains :"+s5.contains(s6));
		System.out.println("indexOf :"+s1.indexOf('a'));
		System.out.println("lastIndexOf :"+s1.lastIndexOf('a'));
		System.out.println("charAt :"+s1.charAt(1));
		
		String[] a = s5.split(" ");
		System.out.println("split :"+ a[1]);
		System.out.println("s5 length :"+s5.length());
		System.out.println("a length :"+a.length);
		
		System.out.println("Uppercase :"+s3.toUpperCase());
		System.out.println("Lowercase :"+s1.toLowerCase());
		
		
		
		System.out.println("replace :"+s5.replace("beautiful", "pleasant"));
		System.out.println("Subsstring :"+s5.substring(5,9));
		System.out.println("Startswith :"+s5.startsWith("welcome"));
		System.out.println("Endswith :"+s5.endsWith("world"));
		
		char ch='a';
		int res=ch;
		System.out.println("Ascii value :"+res);
		
		

	}
}
