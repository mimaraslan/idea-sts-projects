package com.mimaraslan.model.factory.v1pojo;

public class Kamyonet extends Tasima{

	public Kamyonet() {
		super(TasimaTipi.KARA);
		hazirlikIslemleriniYap();
	}

	@Override
	protected void hazirlikIslemleriniYap() {
		System.out.println("Kamyonet hazir");
	}

}
