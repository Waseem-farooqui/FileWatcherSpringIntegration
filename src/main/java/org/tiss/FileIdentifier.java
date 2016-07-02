package org.tiss;

import java.io.File;

import org.springframework.integration.core.MessageSelector;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class FileIdentifier implements MessageSelector {

	@Override
	public boolean accept(Message<?> message) {
		// TODO Auto-generated method stub
		File file = (File) message.getPayload();
		System.out.println("This file is:" + file.getName() + " after the delayer");

		if (file.length() < 1) {
			System.out.println("File is still Empty");
			return false;
		}
		System.out.println("File is submitting");
		return true;
	}
}
