package com.company.chapter7;

public class MyTv {
    private boolean isPowerOn;
    private int channel;
    private int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if (channel > MAX_CHANNEL || channel < MIN_CHANNEL) {
            System.out.println("채널은 1에서 100까지만 유효합니다");
        } else {
            this.channel = channel;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume > MAX_VOLUME || volume < MIN_VOLUME) {
            System.out.println("볼륨은 0에서 100까지만 유효함");
        } else {
            this.volume = volume;
        }
    }

    public void gotoPrevChannel() {
        
    }
}
