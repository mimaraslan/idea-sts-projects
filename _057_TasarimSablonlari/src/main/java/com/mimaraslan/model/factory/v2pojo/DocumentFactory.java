package com.mimaraslan.model.factory.v2pojo;

/**
 * DocumentFactory sinifi bir fabrika tasarim sablonu implementasyonudur.
 * 
 */
public class DocumentFactory {

	/**
	 * Kullanicinin istedigi tipte bir doküman olusturur
	 */
	public static IDocument builder(final String type) {
		if (type.equalsIgnoreCase("WORD")) {
			return new Word();
		}if (type.equalsIgnoreCase("PDF")) {
			return new Pdf();
		} else if (type.equalsIgnoreCase("TEXT")) {
			return new Text();
		} else {
			throw new RuntimeException("Doküman tipi belli degil!");
		}
	}
}
