package BaiTap1;

import java.util.Scanner;

public class BaiTap1 {
	public static void main(String[] args) {
		int a, b;
		Scanner bt = new Scanner(System.in);
		System.out.println("Nhap vao a: ");
		a = bt.nextInt();
		System.out.println("Nhap vao b: ");
		b = bt.nextInt();
		
		// Cau a:
		int Tong = a + b;
		//System.out.println(a+" + "+b+" = "+Tong);
		int Hieu = a - b;
		//System.out.println(a+" - "+b+" = "+Hieu);
		int Tich = a * b;
		//System.out.println(a+" * "+b+" = "+Tich);
		float Thuong = (float) a / b;
		//System.out.println(a+" / "+b+" = "+Thuong);
		int Chialaydu = a % b;
		//System.out.println(a+" % "+b+" = "+Chialaydu);
		System.out.println("Tong: "+Tong);
		System.out.println("Hieu: "+Hieu);
		System.out.println("Tich: "+Tich);
		System.out.println("Thuong: "+Thuong);
		System.out.println("Chia Lay Du: "+Chialaydu);
		
		//Cau b:
		System.out.println(a+" Bang "+b+" : "+(a==b));
		System.out.println(a+" Khac "+b+" : "+(a!=b));
		System.out.println(a+" Nho hon "+b+" : "+(a<b));
		System.out.println(a+" Lon hon "+b+" : "+(a>b));
		System.out.println(a+" Nho hon hoac bang "+b+" : "+(a<=b));
		System.out.println(a+" Lon hon hoac bang "+b+" : "+(a>=b));
	}

}
