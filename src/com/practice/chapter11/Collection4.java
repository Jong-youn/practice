package com.practice.chapter11;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class Collection4 {

    static Queue q = new LinkedList();
    static final int MAX_SIZE = 5;

    public static void main(String[] args) {
        System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");

        while (true) {
            System.out.print(">> ");

            try {
                Scanner s = new Scanner(System.in);
                String input = s.nextLine().trim();

                if (input.equals("")) continue;

                if (input.equalsIgnoreCase("q")) {
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                } else if (input.equalsIgnoreCase("history")) {
                    System.out.println("아직 안됨!");
                    System.out.println(q);

                    int i = 0;

                    LinkedList tmp = (LinkedList)q;
                    ListIterator it = tmp.listIterator();

                    while(it.hasNext())
                        System.out.println(++i + ". " + it.next());

                } else if (input.equalsIgnoreCase("help")) {
                    System.out.println("help - 도움말을 보여 줍니다.");
                    System.out.println("q 또는 Q - 프로그램을 종료합니다.");
                    System.out.println("history - 최근에 입력한 명령어를 " + MAX_SIZE + "개 보여줍니다.");

                } else {
                    save(input);
                    System.out.println(input);
                }
            } catch (Exception e) {
                System.out.println("입력오류 입니다.");
            }
        }
    }

    private static void save(String input) {
        q.offer(input);

        if (q.size() > MAX_SIZE)
            q.remove();
    }
}
