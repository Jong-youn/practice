package com.company.chapter6;

public class PlayingCard {
    //인스턴스 변수
    int kind;
    int num;

    PlayingCard(int k, int n) {
        kind = k;
        num = n;
        //여기서 kind, num은 지역변수.
    }

    public static void main(String[] args) {
        PlayingCard card = new PlayingCard(1,1);
    }
}
