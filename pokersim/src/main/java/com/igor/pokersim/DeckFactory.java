package com.igor.pokersim;

import java.util.*;

public class DeckFactory {
    public static Deck createDeck(){
        List<Card> cards = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(rank, suit));
            }
        }
        return new Deck(cards);
    }
}
