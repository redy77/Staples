package ru.victor.staplesEx;

import java.util.PriorityQueue;
import java.util.Queue;

public class Staples {

    public static void main(String[] args) {
    }

    public static boolean checkStaples(String str){
        Queue<Character> queue = new PriorityQueue<>();
        char[] staples = str.toCharArray();
        if(staples[0] == ')') return false;
        else {
            queue.offer(staples[0]);
            for (int i = 1; i < staples.length; i++) {
                if(staples[i] == '(') queue.offer(staples[i]);
                else if (queue.size() != 0)queue.poll();
                else return false;
            }
        }
        return queue.size() == 0;
    }
}
