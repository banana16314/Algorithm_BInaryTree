package test;

import BinaryTree.BinaryTree;
import junit.framework.TestCase;

public class testBinaryTree extends TestCase{
	
	
	public void testBinarytree(){
		BinaryTree bt=new BinaryTree();
		int[] data={2,8,7,4,9,3,1,6,7,5};
		
		bt.buildTree(data);
		bt.printBt();
		
	}

	
}
