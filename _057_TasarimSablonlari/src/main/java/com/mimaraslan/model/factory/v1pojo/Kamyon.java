package com.mimaraslan.model.factory.v1pojo;

public class Kamyon extends Tasima{

	public Kamyon() {
		super(TasimaTipi.KARA);
		hazirlikIslemleriniYap();
	}

	@Override
	protected void hazirlikIslemleriniYap() {
		System.out.println("Kamnyonhazir");
		
	}

	
}
