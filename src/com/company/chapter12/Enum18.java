package com.company.chapter12;

public class Enum18 {
    int x, y;
    Direction dir;

    void init() {
        dir = Direction.EAST;
        System.out.println(dir);
    }

    public static void main(String[] args) {
        Enum18 example = new Enum18();
        example.init();
        System.out.println(Direction.WEST.name());
        for (Direction d : Direction.values()) {
            System.out.printf("%s=%d%n", d.name(), d.ordinal());
        }

//        Direction2.of(0);
        System.out.println(Direction2.of(2));

        Direction2 d1 = Direction2.EAST;
        Direction2 d2 = Direction2.of(1);

        System.out.printf("d1=%s, %d%n", d1.name(), d1.getValue());
        System.out.printf("d2=%s, %d%n", d2.name(), d2.getValue());
        System.out.println(Direction2.EAST.rotate(1));
        System.out.println(Direction2.EAST.rotate(2));
        System.out.println(Direction2.EAST.rotate(-1));
        System.out.println(Direction2.EAST.rotate(-2));
    }
}
