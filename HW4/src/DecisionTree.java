/**
 * This class provides a framework for accessing a decision tree.
 * Put your code in constructor, printInfoGain(), buildTree and buildPrunedTree()
 * You can add your own help functions or variables in this class 
 */
public class DecisionTree {
	/**
	 * training data set, pruning data set and testing data set
	 */
	private DataSet train = null;		// Training Data Set
	private DataSet tune = null;		// Tuning Data Set
	private DataSet test = null;		// Testing Data Set

	/**
	 * Constructor
	 * 
	 * @param train  
	 * @param tune
	 * @param test
	 */
	DecisionTree(DataSet train, DataSet tune, DataSet test) {
		this.train = train;
		this.tune = tune;
		this.test = test;
		// TODO: you can add code here, if it is necessary
	}
	
	/**
	 * print information gain of each possible question at root node.
	 * 
	 */
	public void printInfoGain()
	{
		// TODO: add code here
	}
	
	/**
	 * Build a decision tree given only a training set.
	 * 
	 */
	public void buildTree() {
		
		// TODO: add code here
		
	}
	

	/**
	 * Build a decision tree given a training set then prune it using a tuning set.
	 * 
	 */
	public void buildPrunedTree() {

		// TODO: add code here
		
	}

	
  /**
   * Evaluates the learned decision tree on a test set.
   * @return the label predictions for each test instance 
   * 	according to the order in data set list
   */
	public String[] classify() {
		
		// TODO: add code here
		return null;
	}

	/**
	 * Prints the tree in specified format. It is recommended, but not
	 * necessary, that you use the print method of DecTreeNode.
	 * 
	 * Example:
	 * Root {odor?}
     *     a (e)
     *     m (e)
   	 *	   n {habitat?}
     *         g (e)
     *  	   l (e)
     *	   p (p)
   	 *	   s (e)
	 *         
	 */
	public void print() {
		// TODO: add code here

	}
}
