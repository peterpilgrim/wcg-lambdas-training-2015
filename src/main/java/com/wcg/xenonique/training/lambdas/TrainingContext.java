package com.wcg.xenonique.training.lambdas;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ppilgrim on 17-Sep-2015.
 */
public class TrainingContext {

    private List<String> messages = new ArrayList<>();

    public List<String> getMessages() {
        return messages;
    }

    public void addMessage(String message) {
        messages.add(message);
    };
}
