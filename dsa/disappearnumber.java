//class Solution {
////    https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
////    question number 448
//    public List<Integer> findDisappearedNumbers(int[] nums) {
//
//
//        int i = 0;
//        while (i <nums.length) {
//            int correct =nums[i] - 1;
//            if (nums[i] != nums[correct]) {
//                int temp = nums[i];
//                nums[i] =nums[correct];
//                nums[correct] = temp;
//            } else {
//                i++;
//            }
//        }
//
//        List<Integer> list = new ArrayList<>();
//        //search for missing number basically the index
//        for(int index = 0;index<nums.length;index++){
//            if(nums[index]!=index+1){
//                list.add(index+1);
//            }
//        }
//        return list;
//    }
//}
//        return list;
//    }
//}