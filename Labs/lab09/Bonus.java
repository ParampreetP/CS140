package lab09;

import java.util.Comparator;

public class Bonus {
	public static void main(String[] args) {
    
		Comparator<Integer> intComp = (i, j) -> i - j; 
       BinarySearchTree<Integer> data = new BinarySearchTree<>(intComp);
        data.insert(3);
        data.insert(1);
        data.insert(4);
        data.insert(5);
        data.insert(6);
        data.insert(2);
     
	System.out.println(data.height());

}
}
