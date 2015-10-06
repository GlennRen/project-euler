public class Prob1 {
	public static int multiples (int n){
		int total = 0;
		for (int i=1; i<n; i++) {
			if (i%3==0 || i%5==0) {
				total += i;
			}
		}
		return total;
	}

	public static void main (String[] args){
		System.out.println(multiples(1000));
	}
}