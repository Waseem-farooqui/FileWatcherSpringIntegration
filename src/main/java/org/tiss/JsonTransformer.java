package org.tiss;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class JsonTransformer {

	public String transform(byte[] fileContent) {

		BufferedReader br = null;
		String sCurrentLine;
		try {
			br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(fileContent)));
			StringBuilder builder = new StringBuilder();
			while ((sCurrentLine = br.readLine()) != null) {

				builder.append(sCurrentLine.trim());

			}
			return builder.toString().replaceAll("\n", "");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return null;
	}
}
