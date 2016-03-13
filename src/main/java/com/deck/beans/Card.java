package com.deck.beans;

import com.deck.utils.Rank;
import com.deck.utils.Suit;

/**
 * Created by ravender on 3/13/2016.
 */
public class Card {

    private final Suit suit;

    private final Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getValue() {
        return rank;
    }

    @Override
    public String toString() {
        return suit + "-" + rank;
    }
}
