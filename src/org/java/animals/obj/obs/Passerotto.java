package org.java.animals.obj.obs;

import org.java.animals.obj.Animale;
import org.java.animals.obj.AnimaleManager;

public class Passerotto extends Animale implements AnimaleManager{

	@Override
	public void verso() {
		// TODO Auto-generated method stub
		System.out.println("Sku Sku");
	}

	@Override
	public void mangia() {
		// TODO Auto-generated method stub
		System.out.println("Insetti");
	}

	@Override
	public void faiVolare() {
		// TODO Auto-generated method stub
		vola();
	}

	@Override
	public void faiNuotare() {
		// TODO Auto-generated method stub
		
	}
	
	public void vola() {
		System.out.println("Sto volando!!!");
	}

	
}
