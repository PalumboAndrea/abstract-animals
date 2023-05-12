package org.java.animals.obj.obs;

import org.java.animals.obj.Animale;
import org.java.animals.obj.AnimaleManager;

public class Cane extends Animale implements AnimaleManager{

	@Override
	public void verso() {
		// TODO Auto-generated method stub
		System.out.println("Bau Bau");
	}

	@Override
	public void mangia() {
		// TODO Auto-generated method stub
		System.out.println("Croccantini");
	}

	@Override
	public void faiVolare() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void faiNuotare() {
		// TODO Auto-generated method stub
		nuota();
	}
	
	public void nuota() {
		System.out.println("Sto nuotando!!!");
	}

	
	


	

	
	
}
