/*
Question Description :
Given an integer array nums, find the contiguous subarray 
(containing at least one number) which has the largest sum and return its sum.
*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Karandeep Singh
 */
public class MaximumSubarray {
    public int maxSum(int [] ar)
    {
        int current = ar[0];
        int result = ar[0];
        for(int i = 1; i < ar.length; i++)
        {
            current = Math.max(ar[i], current+ar[i]);
            result = Math.max(result, current);
        }
        return result;
    }
    public static void main(String[] args) {
        MaximumSubarray ms = new MaximumSubarray();
        int [] ar = new int[] {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(ms.maxSum(ar));
    }
}
