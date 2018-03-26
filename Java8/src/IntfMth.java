import java.util.ArrayList;
import java.util.Collection;

public class IntfMth {
	
	public static void main (String args[]) {
		
 //Arith a1 = (int a,int b) -> {a + b};
 Arith a2 = ( a, b) -> {if (b==0) return 0; else return a/b;};
 
 Coll c = s-> {System.out.println(s.toString());return s.size();};
 //Colle c = s-> {System.out.println(s.toString());return s.size();};
 
 //Arith a3 = (ArrayList<Integer> list) -> {list.};
 ArrayList<String> s = new ArrayList<String>();
 s.add("a");
 System.out.println(a2.add(10, 0));
 System.out.println(c.oper(s));
}
}

interface Arith{
	
	int add(int a, int b);
	// add1(ArrayList<Integer> list);
	
}

interface Coll{
	
	int oper(Collection<String> c);
	default int oper(String c) {return 1;};
	// add1(ArrayList<Integer> list);
	
}