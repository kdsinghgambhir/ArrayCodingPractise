/*
Question Description :
Given an array nums, write a function to move all 0's to the end of it 
while maintaining the relative order of the non-zero elements.
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
public class MoveZeroes {
    public void shiftZeroes(int[] ar)
    {
        int i = 0;
        int j = 0;while(j < ar.length)
        {
            if(ar[j] != 0)
            {
                int temp = ar[i];
                ar[i] = ar[j];
                ar[j] = temp;
                i++;
                j++;
            }
            else
            {
                j++;
            }
        }
        
        for(int n : ar)
        {
            System.out.print(n + "->");
        }
    }
    public static void main(String[] args) {
        MoveZeroes move = new MoveZeroes();
        int [] ar = new int[] {0,1,0,3,12};
        move.shiftZeroes(ar);
    }
}
