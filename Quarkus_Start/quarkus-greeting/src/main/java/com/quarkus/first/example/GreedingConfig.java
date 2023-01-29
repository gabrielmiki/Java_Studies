package com.quarkus.first.example;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreedingConfig {
    String recipient = "Linkedin Learn Students";

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }
}
