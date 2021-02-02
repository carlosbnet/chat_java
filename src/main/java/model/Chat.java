package model;

import lombok.Data;

@Data
public class Chat {

    private String user;
    private String message;


    public Chat() {
    }

    public Chat(String user, String message) {
        this.user = user;
        this.message = message;
    }
}
