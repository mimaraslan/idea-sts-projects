package com.mimaraslan.model.factory.v1pojo;

public class Gemi extends Tasima{

	public Gemi() {
		super(TasimaTipi.DENIZ);
		hazirlikIslemleriniYap();
	}

	@Override
	protected void hazirlikIslemleriniYap() {
		System.out.println("Gemi hazir.");
		
	}

}
