package List;

import java.util.*;

class BrowserHistory {
    private LinkedList<String> linkedList = new LinkedList<>();
    int index = 0;

    public BrowserHistory(String homepage) {
        linkedList.add(homepage);
    }

    //맨 뒤에 url 추가
    public void visit(String url) {
        index++;
        linkedList.add(index, url);
        while(index < linkedList.size() - 1){ //해당 index가 마지막이 아니라면
            linkedList.removeLast();
        }
    }

    //이전 url로 이동
    //index < step -> index = 0 -> 처음꺼 반환
    //아니면 해당 step만큼 뒤로 간 페이지 반환
    public String back(int steps) {
        if(index < steps){
            index = 0;
            return linkedList.getFirst();
        }
        index -= steps;
        return linkedList.get(index);
    }

    //앞에 url로 이동
    //현재 list size < index + steps -> 마지막꺼 반환
    //아니면 해당 steps만큼 이동한 페이지 반환
    public String forward(int steps) {
        if (index + steps > linkedList.size()){
            index += linkedList.size() - 1;
            return linkedList.getLast();
        }
        index += steps;
        return linkedList.get(index);


    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
