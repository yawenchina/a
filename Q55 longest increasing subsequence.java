package practice1;

public class subsequence {
	 public static void main(String []args){
	        int[] array = {0,12,2,6,50,9,10};
	        int[] max = new int[array.length];
	        max[0] = 1;
	        for(int i = 1 ;i < array.length ;i++){
	            int value = 1;
	            for(int j = 0 ;j < i ;j++){
	                if(array[j] < array[i]){
	                    value = Math.max(max[j]+1,value);
	                }
	            }
	            max[i] = value;
	        }
	        for(int one : max){
	            System.out.print(one);
	        }
	     }
}