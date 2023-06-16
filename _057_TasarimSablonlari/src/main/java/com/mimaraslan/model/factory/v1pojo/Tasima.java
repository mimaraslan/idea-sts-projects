package com.mimaraslan.model.factory.v1pojo;

public abstract class Tasima {

	private TasimaTipi tasimaTipi = null;

	public Tasima(TasimaTipi tasimaTipi) {
		this.tasimaTipi = tasimaTipi;
		yapialcakAraislem();
	}

	private void yapialcakAraislem() {
		// nesne olusturma sirasinda yapmak istediiiniz islemler var ise burada yer alabilir.
	}

							// hazirlik
	protected abstract void hazirlikIslemleriniYap();

	public TasimaTipi getTasimaTipi() {
		return tasimaTipi;
	}

	public void setTasimaTipi(TasimaTipi tasimaTipi) {
		this.tasimaTipi = tasimaTipi;
	}

}