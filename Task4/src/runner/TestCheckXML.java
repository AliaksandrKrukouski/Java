package runner;

import org.junit.Test;

import by.krukouski.xml.validator.CheckXML;
import junit.framework.Assert;

public class TestCheckXML {

	@Test
	public void test() {
		String fileName = "data/flowers.xml";
		String schemaName = "data/flowers.xsd";
		
		CheckXML checkXML = new CheckXML(fileName, schemaName);
		
		boolean actual = checkXML.check();
		boolean expected = true;
		
		Assert.assertEquals(expected, actual);
	}
}