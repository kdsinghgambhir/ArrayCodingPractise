/*
Question Description :
Given a non-empty array of integers, every element appears twice except for one.
Find that single one.
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
public class SingleNumber {
    public int SingleNum(int [] ar)
    {
        int temp = 0;
        for(int n : ar)
        {
            temp ^= n;
        }
        return temp;
    }
    public static void main(String[] args) {
        SingleNumber num = new SingleNumber();
        int [] ar1 = new int[] {2,2,1};
        int [] ar2 = new int[] {4,1,2,1,2};
        System.out.println(num.SingleNum(ar1));
        System.out.println(num.SingleNum(ar2));
    }
}
