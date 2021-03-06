package lab09;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;

/**
 * A class to implement the Binary Search Tree data structure.
 * The structure is generic in the type of Objects it contains.
 * @param <T> the type of the contained elements this structure is to hold
 */
public class BinarySearchTree<T> {
    private Comparator<T> comparator;
    private T data;
    private BinarySearchTree<T> left;
    private BinarySearchTree<T> right;

    /**
     * Constructs an empty BST with a Comparator
     * @param comp the Comparator to use to impose an ordering on instances of T
     */
    public BinarySearchTree(Comparator<T> comp) {
        this.comparator = comp;
    }

    /**
     * Constructs a BST with data and a Comparator
     * @param data the data this BST should hold
     * @param comp the Comparator to use to impose an ordering on instances of T
     */
    public BinarySearchTree(T data, Comparator<T> comp) {
        this.data = data;
        this.comparator = comp;
    }

    /**
     * Inserts an element into this BST
     * if the element to be inserted is already in the tree, do not insert again
     * we do this for the sake of simplicity, forcing elements in the tree to be unique
     * @param element the element to insert into this BST
     */
    public void insert(T element) {
    	if(element == null) {
        	return;
        }
        if(data == null) {
        	data = element;
        	return;
        }
        //if you try adding a number == to root
        if(comparator.compare(element, data) == 0) {
        	return;
        }
        
        //try adding a number that is less than root
        if(comparator.compare(data, element) > 0) {
        	if(left == null) {
            	left = new BinarySearchTree<T>(element, comparator);
        	} else {
        		left.insert(element);
        	}	
            
        } else {
        	if(right == null) {
        		right = new BinarySearchTree<T>(element, comparator);
        	} else {
        		right.insert(element);
        	}
        }
        // TODO
    }

    /**
     * Searchs for a given element in this BST
     * @param element the element to search this BST for
     * @return the element in this BST matching the given element, if found,
     *         otherwise null if the given element is not in this BST
     */
    public T find(T element) {
    	if (data == null)
			return null;

		int theCompare = comparator.compare(element, data);
		if (theCompare < 0)
		{
			if (left != null)
				return left.find(element);
			else
				return null;
		}
		else if (theCompare > 0)
		{
			
			if (right != null)
				return right.find(element);
			else
				return null;
		}
		else
		{
			return element;
		}
    	
    }

    /**
     * Gathers all the elements of this BST in order
     * @return a List holding the elements in this BST in order
     */
    public List<T> getElements() {
        List<T> list = new ArrayList<>();       
        if(left != null) {
        	list.addAll(left.getElements());
        }
        if(data != null) {
        	list.add(data);
        }
        if(right != null) {
        	list.addAll(right.getElements());
        }
        return list;
    }

    /**
     * Pretty prints the contents of this BST in a horizontal tree-like fashion
     */
    public void prettyPrint() {
        prettyPrint(0);
    }

    private void prettyPrint(int indentLevel) {
        // TODO
        // print `indentLevel` amount of spaces before printing data on its own line
	//HINT: you will want to do an in order traversal here. (see the Traversal section in the explanation of Binary Trees above)
        // you may use a for loop to print `indentLevel` amount of spaces
        // each time you recurse, you add to indentLevel
      	String string = "";
    	if(left != null) {
        	left.prettyPrint(indentLevel + 1);
        }
        if(data != null) {
        	for(int i = 0; i < indentLevel; i++) {
        		string = string + " ";
        	}
        	System.out.println(string + data);
        }
        if(right != null) {
        	right.prettyPrint(indentLevel + 1 );
        }
    }

    /**
     * A main method supplied for any debugging needs
     */
    public static void main(String[] args) {
        // Up to you how you use this main method, feel free to change it
        Comparator<Integer> intComp = (i, j) -> i - j; // lambda expression
        BinarySearchTree<Integer> tree = new BinarySearchTree<>(intComp);
        tree.insert(3);
        tree.insert(8);
        tree.insert(1);
        tree.insert(0);
        tree.insert(3);
        tree.insert(9);
        tree.insert(4);
        tree.prettyPrint();
        Comparator<String> sComp = (i, j) -> i.length() + j.length();
        BinarySearchTree<String> TTree = new BinarySearchTree<>(sComp);
        TTree.insert("hello");
        TTree.insert("hey");
        TTree.insert("rabbit");
        TTree.insert("dog");
        TTree.insert("cat");
        TTree.insert("mouse");
        TTree.insert("world");
        TTree.insert("hello");
        TTree.prettyPrint();
    }
    public int height() {//BONUS
    	if (data == null)

    		return 0;   

    		return 1 + Math.max( left!=null ? left.height() : 0, right!=null ? right.height(): 0);  
    }
}
