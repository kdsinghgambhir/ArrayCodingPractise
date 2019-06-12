/*
Question Description :
Given an array of size n, find the majority element.
The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and 
the majority element always exist in the array.
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
public class MajorityElement {
    public int majorElement(int [] ar)
    {
        int count = 1;
        int majorNum = ar[0];
        for(int i = 1; i < ar.length; i++)
        {
            if(count == 0)
            {
                majorNum = ar[i];
                count++;
            }
            else if(ar[i] == majorNum)
            {
                count--;
            }
            else
            {
                count--;
            }
        }
        return majorNum;
    }
    public static void main(String[] args) {
        MajorityElement m = new MajorityElement();
        int [] ar = new int[] {2,2,1,1,1,2,2};
        int [] ar1 = new int[] {3,2,3};
        System.out.println(m.majorElement(ar));
        System.out.println(m.majorElement(ar1));
    }
}
