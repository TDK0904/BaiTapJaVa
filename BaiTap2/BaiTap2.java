package BaiTap2;

import java.util.Scanner;

public class BaiTap2 {
	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao mot so: ");
		a = sc.nextInt();
		System.out.println("So vua nhap la so chan: "+ (a%2==0));
		System.out.println("So vua nhap la so le: "+ (a%2==1));
	}

}
