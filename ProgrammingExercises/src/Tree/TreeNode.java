package Tree;

public class TreeNode {

	
	private int data;
	private TreeNode leftChild;
	private TreeNode rightChild;
    private boolean isDeleted=false;
	
	public TreeNode(int data)
	{
	this.data=data;	
	}
	public Integer getData() {
		return data;
	}
	public Integer smallest()
	{
		if(this.leftChild==null)
			return this.data;
		else
		  return this.leftChild.smallest();
	}
	
	public Integer largest()
	{
		if(this.rightChild==null)
			return this.data;
		else
		   return this.rightChild.largest();
	}
	
	public TreeNode find(Integer data)
	{
		if(this.data==data&&!isDeleted)
			return this;
		if(data<this.data&&leftChild!=null)
			return leftChild.find(data);
		
		if(rightChild!=null)
			return rightChild.find(data);
		
		return null;
	}
	public void insert(Integer data)
	{
		if(this.data>=data)
		{
			if(rightChild==null)
			{
				this.rightChild=new TreeNode(data);
			}
			else
				this.rightChild.insert(data);
		}
		else
		{
			if(leftChild==null)
			{
				this.leftChild=new TreeNode(data);
			}
			else
				this.leftChild.insert(data);
		}
		
	}


	public TreeNode getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}
	public TreeNode getRightChild() {
		return rightChild;
	}
	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}
   public void delete()
   {
	   this.isDeleted=true;
   }
	
}
