Spiral  order traversal:

/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[][] matrix1 = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		int[][] matrix2 = new int[][]{{1}};
		int[][] matrix = new int[][]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		ArrayList<Integer> result = spiralOrder(matrix);
		for(int i = 0; i < result.size();i++ ){
			System.out.print(result.get(i));
		}
	}
	
    public static ArrayList<Integer> spiralOrder(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(matrix == null || matrix.length == 0) 
            return result;
        
        find (result, matrix, 0, row);
        return result;
    }
    public static void find(ArrayList<Integer> result, int[][] matrix,int offset,int size){
        //find the up
        if(size < 1){
            return ;
        }
        for(int i = 0; i< size;i++){
            result.add(matrix[offset][offset+i]);
        }
        //find the right
        for(int p = offset+1 ;p < size + offset ;p++){
            result.add(matrix[p][offset+size-1]);
        }
        //find the down
        for(int q = offset+size-2 ;q >= offset ;q--){
            result.add(matrix[offset+size-1][q]);
        }
        //find the left
        for(int m = size+offset-2; m > offset ; m--){
            result.add(matrix[m][offset]);
        }
        find(result, matrix, offset+1, size-2);
       

    

    }

}

