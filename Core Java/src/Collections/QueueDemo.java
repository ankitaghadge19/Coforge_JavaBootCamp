package Collections;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<Integer> EmpId = new LinkedList<>();
		EmpId.add(101);
		EmpId.add(102);
		EmpId.add(103);
		System.out.println(EmpId);
		EmpId.remove();
		System.out.println(EmpId);
		EmpId.poll();
		System.out.println(EmpId);
	}
}
