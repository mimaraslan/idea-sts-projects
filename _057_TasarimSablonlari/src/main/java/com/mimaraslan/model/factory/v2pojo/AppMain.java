package com.mimaraslan.model.factory.v2pojo;

public class AppMain {

	public static void main(final String[] args) {

		IDocument document = DocumentFactory.builder("PDF");
		System.out.println(document.getDocumentType());

		document = DocumentFactory.builder("WORD");
		System.out.println(document.getDocumentType());

		document = DocumentFactory.builder("TEXT");
		System.out.println(document.getDocumentType());
	}
}
