/*
Question Description :
Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), 
some elements appear twice and others appear once.

Find all the elements of [1, n] inclusive that do not appear in this array.
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
import java.util.ArrayList;
import java.util.List;
public class FindAllNumbersDisappearedInAnArray {
    public List<Integer> find(int [] ar)
    {
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < ar.length; i++)
        {
            int val = Math.abs(ar[i])-1;
            if(ar[val] > 0)
            {
                ar[val] = -ar[val];
            }
        }
        for(int i = 0; i < ar.length; i++)
        {
            if(ar[i] > 0)
            {
                result.add(i+1);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        FindAllNumbersDisappearedInAnArray find = new FindAllNumbersDisappearedInAnArray();
        int [] ar = new int[] {4,3,2,7,8,2,3,1};
        System.out.println(find.find(ar));
    }
    
}
