package org.java.animals.obj;

import org.java.animals.obj.obs.*;

public class Main {
	public static void main(String[] args) {
		
		Cane c = new Cane();
		
		Passerotto p = new Passerotto();
		
		Aquila a = new Aquila();
		
		Delfino d = new Delfino();
		
		Animale[] aArr = {c, p, a, d};
		
		for(int i = 0; i < aArr.length; i++) {
			
			Animale animale = aArr[i];
			
			animale.mangia();
			animale.dormi();
			animale.verso();
			
			System.out.println("\n----------------------------\n");
		}
		
	}
}
