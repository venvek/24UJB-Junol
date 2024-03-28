package q596;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char[] a = new char [5];
		for(int i=0; i<a.length;i++) {
		a[i]=sc.next().charAt(0);
		}
		int b = sc.nextInt();
		sc.close();
		System.out.print(a[4]);
		System.out.print(a[3]);
		System.out.print(a[2]);
	}
}