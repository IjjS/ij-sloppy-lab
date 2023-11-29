package com.buildexc.app;

import com.buildexc.app.Imported;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		Imported importedClass = new Imported();
		importedClass.helloFromImported();
	}
}
