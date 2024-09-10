package view;

import java.util.Scanner;

import controller.FatController;

public class Principal {
	public static void main(String[] args) {
		FatController fc = new FatController();
		Scanner ler = new Scanner(System.in);
		
		int n = 0;
		while(true) {
			System.out.println("Informe um valor entre 0 e 10");
			n = ler.nextInt();
			ler.nextLine();
			
			if(n >= 0 && n <= 10) {
				break;
			}
		}
		
		System.out.println(fc.fatorial(n));
		
		ler.close();
	}
}
