/*
Question Description :
Given an array of integers, return indices of the two numbers such that 
they add up to a specific target.

You may assume that each input would have exactly one solution, 
and you may not use the same element twice.
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
import java.util.HashMap;
public class TwoSum {
    public int[] sum(int [] ar, int target)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < ar.length; i++)
        {
            int current = ar[i];
            int difference = target-current;
            if(!map.isEmpty() && map.keySet().contains(difference))
            {
                return new int[] {map.get(difference), i};
            }
            map.put(current, i);
        }
        return null;
    }
    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int [] ar = new int[]{2,11,7,15};
        int target = 9;
        System.out.println(ts.sum(ar, target));
    }
}
