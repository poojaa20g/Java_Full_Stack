package day12_Collections;

import java.util.*;

public class Collections_list_array_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1 = new ArrayList();
		
		System.out.println("add method");
		a1.add(1);
		a1.add("Priya");
		a1.add(5.9);
		a1.add("Priya");
		a1.add(true);
		ArrayList a2 = new ArrayList();
		a2.add(1);
		a2.add(2);
		a2.add(3);
		a2.add(4);
		a2.add(5);
		System.out.println("a1 :"+a1);
		System.out.println("a2 :"+a2);
		
		System.out.println("size method");
		int s = a1.size();
		System.out.println(s);
		
		System.out.println("get method");
		Object g = a1.get(3);
		System.out.println(g);
		
		System.out.println("addAll method");
		a1.addAll(a2);
		System.out.println("a1 :"+a1);
		
		System.out.println("remove method");
		a1.remove(3);
		System.out.println("a1 :"+a1);
		
		System.out.println("removeAll method");
		a1.removeAll(a2);
		System.out.println("a1 :"+a1);
		
		System.out.println("Iterator forward");
		ListIterator itr = a2.listIterator();
		while(itr.hasNext()) {
			System.out.println("a2 :"+itr.next());
			
		}
		
		System.out.println("Iterator backward");
		while(itr.hasPrevious()) {
			System.out.println("a2 :"+itr.previous());
		}
		
		a1.add("Priya");
		a1.add(5);
		a1.add(6);
		
		System.out.println("Convert ArrayList to set");
		System.out.println("a1 :"+a1);
		HashSet itr1 = new HashSet(a1);
		System.out.println("Set remove duplicates and has random order");
		System.out.println("a1 :"+itr1);
		
		System.out.println("Convert ArrayList to LinkedHashSet");
		System.out.println("a1 :"+itr1);
		LinkedHashSet itr2 = new LinkedHashSet(a1);
		System.out.println("a1 :"+itr2);
		
		
		
	}

}
