package com.practice.chapter6;

public class MyTv {
    boolean isPowerOn;
    int channel;
    int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    void turnOnOff() {
        isPowerOn = !isPowerOn;
        if (isPowerOn) {
            System.out.println("TURN ON");
        } else {
            System.out.println("TURN OFF");
        }
    }

    void volumeUp() {
        if (volume == MAX_VOLUME) {
            System.out.println("최대 음량입니다.");
        } else {
            volume++;
            System.out.println("[증가] 현재 음량: " + volume);
        }
    }

    void volumeDown() {
        if (volume == MIN_VOLUME) {
            System.out.println("최소 음량입니다.");
        } else {
            volume--;
            System.out.println("[감소] 현재 음량: " + volume);
        }
    }

    void channelUp() {
        if (channel == MAX_CHANNEL) {
            System.out.println("더이상 유효한 채널이 없습니다.");
        } else {
            channel++;
            System.out.println("[증가] 현재 채널: " + channel);
        }
    }

    void channelDown() {
        if (channel == MIN_CHANNEL) {
            System.out.println("더이상 유효한 채널이 없습니다.");
        } else {
            channel--;
            System.out.println("[감소] 현재 채널: " + channel);
        }
    }
}
