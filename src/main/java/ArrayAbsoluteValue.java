
public class ArrayAbsoluteValue {
    /**
     * Given an array of integers 'nums', produce an array of integers composed of the absolute values of all the
     * numbers in 'nums'. Absolute value represents the distance from zero, so negative numbers should become positive
     * and positive numbers should stay the same.
     *
     * @param nums an array.
     * @return the absolute value array of nums.
     */
    public int[] getArrayAbs(int[] nums){
        // create an array of type 'int' w/ length set to nums.length
        int[] numsAbs = new int[nums.length];

        // iterator for while-loop below
        int i = 0;
        // loop through each 'num' within 'nums' int array
        while(i < nums.length){
            // if current int is a non-negative int
            // if(nums[i] < 0){
            //     // find the absolute value via Math.abs() & append to empty 'numsAbs' array
            //     numsAbs[i] = Math.abs(nums[i]);
            // }
            // // otw ...
            // else{
            //     // append to 'numsAbs' array
            //     numsAbs[i] = nums[i];
            // }

            /* Recall: 'Math' library did NOT need to be explicitly imported as by default java.lang.* (includes Math) package is already included  */
            // perform Math.abs() on every number in 'nums' int[] array & append to new int[] array
            numsAbs[i] = Math.abs(nums[i]);

            // increment by 1 to keep loop functioning
            ++i;
        }
        return numsAbs;
    }
}