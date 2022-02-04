package com.practice.chapter7;

public class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        for (int i = 0; i < CARD_NUM; i++) {
            int num = i % 10 + 1;
            boolean isKwang = (i < 10) && (num == 1 || num == 3 || num == 8);
            cards[i] = new SutdaCard(num, isKwang);
        }
    }

    public void shuffle() {
        for(int i=0; i<cards.length;i++) {
            int j = (int) (Math.random() * cards.length);
            SutdaCard tmp = cards[i];
            cards[i] = cards[j];
            cards[j] = tmp;
        }
    }

    public SutdaCard pick(int index) {
        return cards[index];
    }

    public SutdaCard pick() {
        int index = (int) Math.random()*CARD_NUM;
        return cards[index];
    }
}
