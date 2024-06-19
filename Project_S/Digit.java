package Project_S;

import java.util.Scanner;

public class Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] src= {12, 15, 88, 55, 8, 45, 10};
		int[] dest=new int[3];
		System.arraycopy(src, 1, dest, 0, 3);
		for(int i: dest) {
			System.out.print(i +"\t");
		}
		java.util.Arrays.sort(src);
		System.out.println(java.util.Arrays.toString(src));
		
		
		
		
		
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		System.out.printf("%05d", no);
		sc.close();
	}
}
