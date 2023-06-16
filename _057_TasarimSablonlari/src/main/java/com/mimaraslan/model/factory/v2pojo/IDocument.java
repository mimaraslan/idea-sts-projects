package com.mimaraslan.model.factory.v2pojo;


// Degisik türde doküman türleri olusturmak icin tanimlanan ara yüz.
public interface IDocument {

	/**
	 * Dokümanin tipini veren metotd
	 * @return String doküman tipi (pdf, word, text ....)
	 */
	public String getDocumentType();
}
