package List;

/*
int array -> nums
int -> target
result = target이 만들어지는 조합
같은 요소 2번 못 씀
정렬 안 되어 있음
1. 그냥 냅다 다 더하기
2. 정렬 후 더하기
 */

import java.util.*;

public class TwoSum {
    public boolean twoSum(int[] nums, int target) {
        //정렬하기
        Arrays.sort(nums);

        int left = 0;
        int right = nums.length -1;

        //두 개가 만나면 루프 끝 -> 만났는지 안 만났는지 확인(while)
        while(left < right){
            //맨 앞과 맨 뒤 더해서
            int sum = nums[left] + nums[right];
            if ( sum == target){
                return true;
            }
            //작으면 -> 맨 앞에 있는거 뒤로 한 칸
            else if (sum < target){
                left ++;
            }
            //크면 -> 맨 뒤에 있는거 앞으로 한 칸
            else{
                right --;
            }
        }


        return false;
    }
}
