package com.qa.receiver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.qa.entity.SentUser;
import com.qa.repository.ConsumerRepository;



@Component
public class PokeReceiver {
	
    @Autowired
    private ConsumerRepository repo;

    @JmsListener(destination = "AccountQueue", containerFactory = "myFactory")
    public void receiveMessage(SentUser sentUser) {
    	System.out.println(sentUser);
        repo.save(sentUser);
    }

}
