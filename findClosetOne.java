Q4: 找到比target小的最大值！！！！
package practice1;

public class findSmall {
	public static void main(String args[]){
		TreeNode  root = new TreeNode(10);
		TreeNode t1 = new TreeNode(5);
		TreeNode t2 = new TreeNode(15);
		TreeNode t3  = new TreeNode(2);
		TreeNode t4 = new TreeNode(7);
		TreeNode t5 = new TreeNode(12);
		TreeNode t6 = new TreeNode(20);
		root.left = t1;
		root.right = t2;
		t1.left = t3;
		t1.right = t4;
		t2.left = t5;
		t2.right = t6;
	
		System.out.print(find(root ,11));
	}
	public static int find(TreeNode root, int a){
		int last = -1;
		while(root != null){
			
			if(root.val < a){
				last =root.val;
				root = root.right;
			}else{
				//last =root.val;
				root = root.left;
			}
		}
		return last;
	}
}

