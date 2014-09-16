package practice1;
import java.util.*;
public class changes {
	public static int[] coin = {25,10,5,1};
	private int input ;
	public static int[] solution = new int[4];
	public static void main(String args[]){
		int input1 = 100;
		int input2 = 99;
		changes(input1, solution,0);
		//changes(input2,solution,0);
	}
	public static void changes(int input ,int[] solution,int level){
		if(level == 3){
			if(input > 0){
			solution[level] = input;
			}
			///this is really important!!!!
			/// to avoid the result of negative number!!!!
			int[] one = new int[4];
			one[0] = solution[0];
			one[1] = solution[1];
			one[2] = solution[2];
			one[3] = solution[3];
			for(int i = 0; i <= level; i++){
				System.out.print("for the"+ coin[i]+"  solution is "+one[i]);
			}
			System.out.println("");
			return ;
		}
		for(int j = 0; j*coin[level] <= input; j++){
			solution[level] = j;
			changes(input-j*solution[level],solution,level+1);
			
		}
		
	}
}
