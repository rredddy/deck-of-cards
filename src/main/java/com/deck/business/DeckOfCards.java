package com.deck.business;

import com.deck.beans.Card;

/**
 * Implements Deck of Card game.
 * Created by ravender on 3/13/2016.
 */
public interface DeckOfCards {

    void shuffle(int numberOftime);
    Card deal();
}
