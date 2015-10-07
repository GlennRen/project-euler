public class Prob2 {
	public static int evenTotal(int ceiling) {
		int numb1 = 1;
		int numb2 = 2;
		int total = 2;
		while (numb2 < ceiling) {
			int update2 = numb1 + numb2;
			numb1 = numb2; 
			numb2 = update2;
			if (update2%2==0) {
				total += update2;
			}
		}
		return total;
	}
	
	public static void main (String[] args) {
		System.out.println(evenTotal(4000000));
	}
}