package ru.victor.staplesEx;

import java.util.PriorityQueue;
import java.util.Queue;

public class Staples {

    public static void main(String[] args) {
    }

    public static boolean checkStaples(String str) {
        Queue<Character> queue = new PriorityQueue<>();
        char[] staples = str.toCharArray();
        for (char staple : staples) {
            if (queue.size() != 0 && staple == queue.peek())
                queue.poll();
            else if (staple == ')') queue.offer('(');
            else queue.offer(')');

        }
        return queue.size() == 0;
    }

    public static boolean checkWithoutCollection(String str) {
        char[] staples = str.toCharArray();
        int countOpen = 0;
        int countClose = 0;
        for (char staple : staples) {
            if (countOpen != 0 && staple == ')') countOpen--;
            else if (countClose != 0 && staple == '(') countClose--;
            else if (staple == '(') countOpen++;
            else if (staple == ')') countClose++;
        }
        return (countClose == 0 && countOpen == 0);
    }
}

