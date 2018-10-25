package com.hazem.hovosouq.Models;

public class Deal {
    private int background;
    private String deal_tags;
    private Deal deal;

    public Deal(int background, String deal_tags,Deal deal) {
        this.background = background;
        this.deal_tags = deal_tags;
        this.deal = deal;
    }

    public Deal getDeal() {
        return deal;
    }

    public void setDeal(Deal deal) {
        this.deal = deal;
    }

    public int getBackground() {
        return background;
    }

    public void setBackground(int background) {
        this.background = background;
    }

    public String getDeal_tags() {
        return deal_tags;
    }

    public void setDeal_tags(String deal_tags) {
        this.deal_tags = deal_tags;
    }
}
