package Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> EmpIds = new TreeSet<>();
		
		EmpIds.add(105);
		EmpIds.add(103);
		EmpIds.add(104);
		
		System.out.println(EmpIds);
		
		EmpIds.add(102);
		
		System.out.println(EmpIds);
	}
}
