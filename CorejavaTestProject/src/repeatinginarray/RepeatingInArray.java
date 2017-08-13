package repeatinginarray;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class RepeatingInArray {

	public static void main(String[] args) {
		int ar[] = { 2, 3, 4, 4, 3, 6, 4, 5 };
		new RepeatingInArray().printFirstRepeatingElement(ar);
	}

	private void printFirstRepeatingElement(int[] ar) {
		Integer curr = null;
		Integer prev = null;
		Map<Integer, Integer> map = new HashMap<>();
		for (int p = 0; p < ar.length / 2; p++) {
			if (map.containsValue(ar[p])) {
				curr = p;
				if(curr != null && prev != null && curr<prev){
					System.out.println(ar[p]);
				}
			} else {
				map.put(p, ar[p]);
			}
			if (map.containsValue(ar[ar.length - p - 1])) {
				prev = ar.length - p - 1;
			} else {
				map.put((ar.length - p - 1), ar[ar.length - p - 1]);
			}
		}
	}
}
