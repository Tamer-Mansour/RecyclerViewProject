package com.example.recyclerviewproject;

public class MyCardJob {
    private String cardName;
    private String cardJob;
    private Integer cardImage;

    public MyCardJob(String cardName, String cardJob, Integer cardImage) {
        this.cardName = cardName;
        this.cardJob = cardJob;
        this.cardImage = cardImage;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCardJob() {
        return cardJob;
    }

    public void setCardJob(String cardJob) {
        this.cardJob = cardJob;
    }

    public Integer getCardImage() {
        return cardImage;
    }

    public void setCardImage(Integer cardImage) {
        this.cardImage = cardImage;
    }
}
