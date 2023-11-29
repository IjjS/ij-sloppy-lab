package com.buildexc.app;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ImportedTest {

	@Test
	public void testImportedClass() {
		Imported importedClass = new Imported();
		importedClass.helloFromImported();
		System.out.println("But this is just test!");
		assertEquals(1, 1);
	}
}
