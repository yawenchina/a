package practice1;
import java.util.*;
public class generateParanthesis {
	public static char[] leftP ={'(','[','{'};
	public static char[] rightP ={')',']','}'};
	
	public static void main(String args[]){
		int[] n = {1,2,1};
		int[] l = {0,0,0};
		int[] r = {0,0,0};
		Stack<Character> s = new Stack<Character>();
		generate(s, n, l, r,"");
		return ;
		
	}
	public static void generate(Stack<Character> s,int[] n,int[] l,int[] r,String temp ){
		boolean print = false;;
		if(r[0] == n[0] && r[1] == n[1] && r[2] == n[2]){
			print = true;
		}
		if(print){
			System.out.println(new String(temp));
		}
		for(int j = 0; j < n.length; j++){
			if(l[j] < n[j]){
				s.push(leftP[j]);
				l[j]++;
				generate(s,n,l,r,temp+leftP[j]);
				l[j]--;
				s.pop();
				
			}
		}
		for(int p = 0; p < n.length; p++){
			if(r[p] < l[p]){
				if(s.peek()==leftP[p]){
					///need to be in one pair
				s.push(rightP[p]);
				r[p]++;
				generate(s,n,l,r,temp+rightP[p]);
				r[p]--;
				s.pop();
				}
				
			}
		}
	}
}
