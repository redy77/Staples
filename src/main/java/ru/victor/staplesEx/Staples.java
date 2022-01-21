package ru.victor.staplesEx;

import java.util.PriorityQueue;
import java.util.Queue;

public class Staples {

    public static void main(String[] args) {
    }

    public static boolean checkStaples(String str){
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
}
