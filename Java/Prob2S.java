// Slower and less efficient
import java.util.*;
public class Prob2S {
	public static int fibArray(){
		int total = 0;
		ArrayList<Integer> fibArray = new ArrayList<Integer>() {{
			add(1);
			add(2);
		}};
		ArrayList<Integer> evenArray = new ArrayList<Integer>() {{
			add(2);
		}};
		while ((fibArray.get(fibArray.size()-2) + fibArray.get(fibArray.size()-1))<4000000) {
			int newElement = fibArray.get(fibArray.size()-2) + fibArray.get(fibArray.size()-1);
			fibArray.add(newElement);
			if (newElement%2==0) {
				evenArray.add(newElement);
			}
		}

		for (int i: evenArray) {
			total += i;
		}
		return total;
	}
	public static void main (String[] args) {
		System.out.println(fibArray());
	}
}