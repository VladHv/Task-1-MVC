package ua.javatraining.mvc;

/*
 * Created by Vlad Herasimov on 24.06.2021.
 */

public class Model {

    private String finalMessage;
    private String wordHello;
    private String wordWorld;


    public void setWordHello(String wordHello) {
        this.wordHello = wordHello;
    }

    public void setWordWorld(String wordWorld) {
        this.wordWorld = wordWorld;
    }

    public String getFinalMessage() {
        return finalMessage = wordHello + " " + wordWorld;
    }
}
