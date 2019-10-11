package inteviewProgram;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapTesting {
	public static void main(String[] args) {
         Map<String , String> map = new TreeMap();
         map.put("name1", "name");
         map.put("pankaj", "pankaj");
         map.put("name3", "shashank");
         map.put("name5", "sachin");
         map.put("name7", "kailas");
         map.put("name8", "pritesh");
         map.put("mayur", "mayur");
         System.out.println(map);
              Set st = map.entrySet();
              	Iterator it = st.iterator();
              	while(it.hasNext()) {
              		System.out.println(it.next());
              	}
         for (Entry en : map.entrySet()) {
			if (en.getKey().equals(en.getValue())) {
				System.out.println(en.getKey() +"  "+en.getValue());
			}
		}
	}
}
