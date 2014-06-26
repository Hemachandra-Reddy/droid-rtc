package com.droidrtc.connection;

import org.jivesoftware.smack.Chat;
import org.jivesoftware.smack.MessageListener;
import org.jivesoftware.smack.packet.Message;

public class ChatMessageListner implements MessageListener {
		@Override
		public void processMessage(Chat chat, Message message) {
			String from = message.getFrom();
            String body = message.getBody();
            System.out.println(String.format("Received message '%1$s' from %2$s", body, from));			
		}
    }
