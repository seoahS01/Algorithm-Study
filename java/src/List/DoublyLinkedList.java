package List;

import java.util.*;

public class DoublyLinkedList {

    public static void main(String[] args){
        //선언
        LinkedList<String> linkedList = new LinkedList<>();

        //============삽입==============
        /*
        add와 offer 모두 사용 가능
        add: 실패할 경우 에러 발생
        offer: 실패할 경우 false 반환
         */

        //insert 시간 복잡도: O(n)
        //insertLast, insertFirst 시간복잡도 O(1)

        linkedList.add(2, "z"); //default index는 마지막
        linkedList.addFirst("a");
        linkedList.addLast("b");

        //============제거==============
        //remove 시간복잡도: O(n)
        //removeLast, removeFirst 시간복잡도: O(1)

        linkedList.remove(2); //default index는 마지막
        linkedList.removeFirst();
        linkedList.removeLast();

        //============조회==============
        //get 시간복잡도: O(n)
        //getLast, getFirst 시간복잡도: O(1)

        linkedList.get(1);
        linkedList.getFirst();
        linkedList.getLast();

        //============변경==============
        linkedList.set(1, "g");

    }
}
