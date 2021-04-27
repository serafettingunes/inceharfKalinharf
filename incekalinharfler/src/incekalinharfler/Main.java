package incekalinharfler;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		char[] inceHarf = { 'e', 'i', 'ö', 'ü' };
		char[] kalinHarf = { 'a', 'ý', 'o', 'u' };
		Scanner in = new Scanner(System.in);
		System.out.print("biþey yazýn : ");

		String girilenYazi1 = in.nextLine();
		String girilenYazi2=girilenYazi1.replaceAll(" ", "").toLowerCase();
		
		
		System.out.println(girilenYazi1 + " yazýsýndaki ince harfler");
		System.out.println("--------------------------");
		char[] gelenchar = inceHarfMetod(girilenYazi2,girilenYazi1,inceHarf);
		System.out.println(gelenchar);
		
		System.out.println("------------------------------------------------");
		
		System.out.println(girilenYazi1 + " yazýsýndaki kalýn harfler");
		System.out.println("--------------------------");
		char[] gelenchar2 = inceHarfMetod(girilenYazi2,girilenYazi1,kalinHarf);
		System.out.println(gelenchar2);
		
		
		
	}

	public static char[] inceHarfMetod(String girilenYazi2, String girilenYazi1 ,char[] inceHarf) {

		
		
		char[] secilenInceHarf = new char[girilenYazi2.length()];

		char[] charX = girilenYazi2.toCharArray();

		for (int i = 0; i < charX.length; i++) {
			for (int j = 0; j < inceHarf.length; j++) {
				if (charX[i] == inceHarf[j]) {
					secilenInceHarf[j] = inceHarf[j];

				}
			}
		}

		
		return secilenInceHarf;

	}

}
