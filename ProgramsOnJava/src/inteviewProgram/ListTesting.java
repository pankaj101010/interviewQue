package inteviewProgram;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.Vector;

public class ListTesting {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		Set st = new HashSet();
		ArrayList list1 = new ArrayList();
		Vector vc = new Vector();
		list.add(null);
		list.add(null);
		list.add(null);
		list.add(null);
		list.add("pankaj");
		list.add("pankaj1");
		list.add("pankaj2");
		list.add("pankaj3");
		list.add("pankaj4");
		list.add("pankaj5");
		list.add("pankaj6");
		list.add("pankaj7");
	
		list1.add(list.clone());
		System.out.println(list1);
		System.out.println(list);
		
	}

}
