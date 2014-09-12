package practice1;
import java.util.*;
public class TreeNode1 {
	int val;
	TreeNode1 left;
	TreeNode1 middle;
	TreeNode1 right;
	TreeNode1 last;
	public TreeNode1(int val){
		this.val = val;
		this.left = null;
		this.middle = null;
		this.right = null;
		this.last = null;
		
	}
	public ArrayList<TreeNode1> children(){
		ArrayList<TreeNode1> result = new ArrayList<TreeNode1>();
		result.add(left);
		result.add(middle);
		result.add(right);
		result.add(last);
		return result;
	}
}
