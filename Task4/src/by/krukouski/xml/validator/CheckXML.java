package by.krukouski.xml.validator;

import java.io.File;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.SAXException;

public class CheckXML {
    private String fileName;
    private String schemaName;
    
	public CheckXML(String fileName, String schemaName) {
		this.fileName = fileName;
		this.schemaName = schemaName;
	}
	
	public boolean check() {
		boolean isValid = false;
		String language = XMLConstants.W3C_XML_SCHEMA_NS_URI;
		SchemaFactory factory = SchemaFactory.newInstance(language);
		File schemaLocation = new File(this.schemaName);
		
		try {
			Schema schema = factory.newSchema(schemaLocation);
			Validator validator = schema.newValidator();
			Source source = new StreamSource(fileName);
		
			validator.validate(source);
			isValid = true;
		} catch (SAXException e) { 
			System.err.print("Validation error for " + fileName + " because of " + e.getMessage());			
		} catch (IOException e) {
			System.err.print("IO error for " + fileName + " because of " + e.getMessage());		
		}
		
		return isValid;
	}
}
