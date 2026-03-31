package StackQueue;

import java.util.*;

public class FunctionDevelop {

        public int[] solution(int[] progresses, int[] speeds) {
            int[] answer = {};
            Queue<Integer> queue = new LinkedList<>();
            List<Integer> result = new ArrayList<>();

            for (int i = 0; i < progresses.length; i++) {
                int leftDay = (100 - progresses[i] + speeds[i] - 1) / speeds[i];
                queue.offer(leftDay);
            }


            while(!queue.isEmpty()){
                int deployDay = queue.poll();
                int count = 1;

                while (!queue.isEmpty() && queue.peek() <= deployDay){
                    queue.poll();
                    count++;
                }
                result.add(count);
            }

            answer = new int[result.size()];
            for (int i = 0; i < result.size(); i++){
                answer[i] = result.get(i);
            }

            return answer;
        }

}
