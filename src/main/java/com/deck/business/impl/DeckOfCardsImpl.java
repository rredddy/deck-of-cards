package com.deck.business.impl;

import com.deck.beans.Card;
import com.deck.business.DeckOfCards;
import com.deck.utils.Rank;
import com.deck.utils.Suit;

import java.util.Random;

/**
 * Implements Deck of Card game.
 *
 * Created by ravender on 3/13/2016.
 */
public class DeckOfCardsImpl implements DeckOfCards {

    private static final int SIZE = 52;
    private Card[] cards;
    private int currentCount;

    public DeckOfCardsImpl() {
        currentCount = 0;
        cards = new Card[SIZE];
        Suit[] suits = Suit.values();
        Rank[] values = Rank.values();

        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < values.length; j++) {
                cards[currentCount++] = new Card(suits[i], values[j]);
            }
        }
    }

    public void shuffle(int numberOftimes) {
        Random rand = new Random();

        for (int i = 0; i < numberOftimes; i++) {
            int m = rand.nextInt(currentCount);
            int n = rand.nextInt(currentCount);

            Card temp = cards[m];
            cards[m] = cards[n];
            cards[n] = temp;
        }
    }

    public Card deal() {
        return cards[--currentCount];
    }
}
