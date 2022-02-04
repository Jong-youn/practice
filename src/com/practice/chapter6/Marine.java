package com.practice.chapter6;

public class Marine {
    int x = 0, y = 0;
    int hp = 60;
    static int weapon = 6;
    static int armor = 0;

    static void weaponUp() {
        weapon++;
    }

    static void armorUp() {
        armor++;
    }

    void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

// 8: 2 5
// 9: 4
// 10: 3 4
// 11: 2,3,4
// 12: 5, 3, 4
// 13: 1
// 14: 1 (5)
// 15: 2 6
// 16: