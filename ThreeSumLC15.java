package Interviews;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by AG044529 on 10/20/2018.
 */
public class ThreeSumLC15 {
        public static List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            // sort the array first
            Arrays.sort(nums);
            for (int i = 0; i <= nums.length - 2; i++) {

                // For avoiding duplicate values check, add a if condition, which will see if adj elements are same
                if (i ==0 || nums[i] > nums [i-1]) {

                    int first = i + 1;
                    int last = nums.length - 1;
                    while (first < last) {
                        if (nums[i] + nums[first] + nums[last] == 0) {
                            result.add(Arrays.asList(nums[i], nums[first], nums[last]));
                            break;
                        } else if (nums[i] + nums[first] + nums[last] > 0) {
                            // make sure that we are not --ing to same element in list
                            int currentLast = last;
                            while (nums[last] == nums[currentLast] && first < last) {
                                last--;
                            }
                        } else {
                            int currentFirst = first;
                            while (nums[first] == nums[currentFirst] && first < last) {
                                first++;
                            }
                        }
                    }
                }
            }
            return result;
        }

        public static void main(String[] args) {
            System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));

        }


}
