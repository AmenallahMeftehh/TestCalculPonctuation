package com.example.demo.web.rest.vm;

public class PunctuationTextVM {

    private String text;

    public PunctuationTextVM() {
    }

    public PunctuationTextVM(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "PunctuationTextVM{" +
                "text='" + text + '\'' +
                '}';
    }
}
