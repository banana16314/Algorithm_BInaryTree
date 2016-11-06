package BinaryTree;

/**
 * Created by He on 2016/11/6.
 */
public class BinaryTree {

    class Node {
        private int data;

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }
    }

    private Node root;//根节点
    private BinaryTree left;
    private BinaryTree right;

    public void insert(int data){
        if(root==null){//插入根节点
            root=new Node();
            root.setData(data);
        }
        else{//插入其它结点
            if(data<root.getData()){//左子树
                if(this.left==null)
                    this.left=new BinaryTree();
                this.left.insert(data);
            }
            else{
                if(this.right==null)
                    this.right=new BinaryTree();
                this.right.insert(data);
            }
        }
    }

    public void buildTree(int[] data){
    	for(int i :data){
    		insert(i);
    	}
    }
    public void printBt(){
        if(this.root==null){
            return;
        }
        System.out.print(this.root.data+" ");
        if(this.left!=null)
        	this.left.printBt();
        if(this.right!=null)
        	this.right.printBt();
    }
}
