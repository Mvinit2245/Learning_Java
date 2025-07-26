package day2;

public class ArrayEX {
	
	public static void main(String args[]) {
		
		int[] arr = {1,2,3,4,5};
		
		for(int e : arr) {
			System.out.print(e + " , ");
		}
		System.out.println();
		
		rotateArr(arr);
		
		
		for(int e : arr) {
			System.out.print(e+ " , ");
		}
		
		
		
		
		
	}
	public static void rotateArr(int[] arr) {
		
		int last = arr[arr.length-1];
		
		for(int i=arr.length-1; i>=1; i-- ) {
			arr[i] = arr[i-1];
		}
		arr[0] =last;
	}
	
	public static void rotateKtimes(int[] arr, int k) {
		
		while(k>0) {
			rotateArr(arr);
			k--;
		}
	}

}
