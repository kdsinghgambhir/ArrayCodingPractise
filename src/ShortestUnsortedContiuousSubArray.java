/*
Question Description :
Given an integer array, you need to find one continuous subarray that if you 
only sort this subarray in ascending order, then the whole array will be sorted 
in ascending order, too.

You need to find the shortest such subarray and output its length.
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
public class ShortestUnsortedContiuousSubArray {
    public int find(int [] ar)
    {
        int n = ar.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int start = 0;
        int end = -1;
        for(int i = 0; i < n; i++)
        {
            max = Math.max(max, ar[i]);
            min = Math.min(min, ar[n-i-1]);
            if(ar[i] < max)
                end = i;
            if(ar[n-i-1] > min)
                start = n-i-1;
        }
        return end-start+1;
    }
    public static void main(String[] args) {
        ShortestUnsortedContiuousSubArray SUCSA = new ShortestUnsortedContiuousSubArray();
        int [] ar = new int[] {2,6,4,8,10,9,15};
        System.out.println(SUCSA.find(ar));
    }
}
