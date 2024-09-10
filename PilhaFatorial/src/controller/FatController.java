package controller;

import br.com.jonas.estruturas.PilhaInt;

public class FatController {
	public FatController() {
		super();
	}
	
	PilhaInt p = new PilhaInt();
	
	public int fatorial(int n) {
		for(int i = 2; i <= n; i++) {
			if(p.isEmpty()) {
				p.push(i);
			}else {
				try {
					p.push(i * p.pop());
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
		
		int fat = 0;
		
		try {
			fat = p.pop();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return fat;
	}
}
