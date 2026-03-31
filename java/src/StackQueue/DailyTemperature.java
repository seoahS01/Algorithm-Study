package StackQueue;

import java.util.*;

public class DailyTemperature {
    public int[] dailyTemperatures(int[] temperatures){
        Stack<Integer> stack = new Stack<>(); //날짜의 index
        int[] ans = new int[temperatures.length];

        for (int day = 0; day < temperatures.length; day++){

            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[day]){
                int prevDay = stack.pop();
                ans[prevDay] = day - prevDay;
            }

            stack.push(day);
        }

        return ans;

    }
}


