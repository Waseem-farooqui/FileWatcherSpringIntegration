package org.tiss;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.integration.annotation.Transformer;

public class ByteToFileConverter {

	File file = null;
	FileOutputStream fop = null;
	
	@Transformer
	public File convertString(byte[] fileContent) throws IOException {
		file = File.createTempFile("temp",".json");
		fop = new FileOutputStream(file);
		fop.write(fileContent);
		fop.flush();
		fop.close();
		return file;
	}
}
