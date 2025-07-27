package day2;

public class TowerOfHanoi {
	
	public static int hanoi(int n, char src,char des, char aux) {
		if(n==1 || n==0) {
			System.out.println("Move disk " + n + " from " + src + " to " + des);
			return n;
		}
		
		int s1 =hanoi(n-1, src, aux, des);
		System.out.println("Move disk " + n + " from " + src + " to " + des);
		int s2 = 1;
		
		int s3 = hanoi(n-1, aux, des, src);
		return s1+s2+s3;
		
		
	}
	
	public static void main(String[] args) {
		int totalMoves = hanoi(3, 'S', 'D', 'A');
	    System.out.println("\nTotal moves required : " + totalMoves);
		
	}

}
