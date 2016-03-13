package com.deck.utils;

/**
 * Created by ravender on 3/13/2016.
 */
public enum Suit {

    DIAMONDS("Diamonds"),
    SPADES("Spades"),
    CLUBS("Clubs"),
    HEARTS("Hearts");

    private String value;

    private Suit(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

}
