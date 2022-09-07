import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		String[] strArr = str.substring(1, str.length() - 1).split(",");
		Queue<Integer> pq = new PriorityQueue<>();
		Set<Integer> st = new HashSet<>();
		for(int i = 0 ; i < strArr.length ; ++i) {
			int x = Integer.valueOf(strArr[i]);
			if(st.contains(x) == false) {
				st.add(x);
				pq.add(x);
			}
		}
		if(pq.size() < 3) {
			while(pq.size() > 1) {
				pq.remove();
			}
		} else {
			while(pq.size() > 3) {
				pq.remove();
			}	
		}
		System.out.println(pq.peek());
		return;
	}
}
