package Projects;

class Solution {

    public int maxProductDifference(int[] nums) {

        int arraylength = nums.length;
        int max_1 = nums[0];
        int max_2 = nums[0];
        int min_1 = nums[0];
        int min_2 = nums[0];

        for (int i = 0; i < nums.length; i++) {

          //System.out.println("Debug max_1: " + max_1);

            if (max_1 < nums[i]) {
              max_2 = max_1;
              max_1 = nums[i];
            }

             if (min_1 > nums[i]) {
              min_2 = min_1;
              min_1 = nums[i];  
            }

        }


        System.out.println("max_1 = " + max_1);
        System.out.println("max_2 = " + max_2);
        System.out.println("min_1 = " + min_1);
        System.out.println("min_2 = " + min_2);

        return (max_1 * max_2) - (min_1 * min_2) ;
        
    }

    public static void main(String[] args) {

      Solution body = new Solution();
      
      body.maxProductDifference(new int[]{5,6,2,7,4});

    }
}