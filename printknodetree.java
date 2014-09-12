package practice1;
import java.util.*;
public class printPath {
	public static void main(String args[]){
		TreeNode1 root = new TreeNode1(1);
		TreeNode1 node1 = new TreeNode1(2);
		TreeNode1 node2 = new TreeNode1(3);
		TreeNode1 node3 = new TreeNode1(4);
		TreeNode1 node4 = new TreeNode1(5);
		TreeNode1 node5 = new TreeNode1(6);
		TreeNode1 node6 = new TreeNode1(7);
		TreeNode1 node7 = new TreeNode1(8);
		TreeNode1 node8 = new TreeNode1(9);
		root.left = node1;
		root.middle = node2;
		root.right = node3;
		root.last = node4;
		node1.left = node5;
		node1.middle = node6;
		node1.right = node7;
		node1.last = node8;
		ArrayList<Integer> result = new  ArrayList<Integer>();
		result.add(root.val);
		print(root,result);
	}
	public static void print(TreeNode1 root,ArrayList<Integer> path){
		if(root == null){
			return ;
		}
		boolean isLeaf = true;
		for(TreeNode1 one : root.children()){
			if(one != null){
				isLeaf = false;
				path.add(one.val);
				print(one,path);
				path.remove(path.size()-1);
			}else{
				print(one,path);
			}
		}
		if(isLeaf){
			doPrint(path);
		}
		
	}
	public static void doPrint(ArrayList<Integer> path){
		for(int i = 0; i < path.size();i++){
			System.out.print(path.get(i));
		}
		System.out.println("");
	}
}
