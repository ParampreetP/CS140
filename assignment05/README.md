# assignment05 due Sept 28, 11:59pm
The code goes in the package `assignment05`

Make a class `TwoDimNumArr` with a private field `int[][] array`. Write a constructor `public TwoDimNumArr(String fileName) throws FileNotFoundException` 
that takes a multi-line input file of `ints` like the one in Assignment 4. Copy the code from NumReader so that this constructor fills `array` 
with rows of ints from the file.

Write a method `public void toString()` which returns a single String that will print the original fill (almost).

For example if the input file "input.txt" is 

```
1 4 2 18 12   

2
 1 5 23 -10 6 8   
7 -100
   34 6 0 
```

and var test = new TwoDimNumArr("input.txt");
then System.out.println(test); will be

```
1 4 2 18 12
2
1 5 23 -10 6 8
7 -100
34 6 0
```
NOTE the blank line has been lost and spaces at the start of a line are gone. 

IMPORTANT: Learn about [StringBuffer](https://docs.oracle.com/javase/10/docs/api/java/lang/StringBuffer.html) for this method. 
Note that using StringBuffer to build up a String is more efficient that using lots of concatenations.

```java
public String toString() {
	StringBuilder sb = new StringBuilder();
	for(var row : array) {
        for(var num : row) {
            //look up the append method of StringBuffer to append (num + " ") to sb
        }
	    // set the length of sb to sb.length()-1 to get rid of last space on the line
	    // append a new line character "\n"
	}
	return sb.toString();
}
```

Write a method `public boolean compare(String filename) throws FileNotFoundException ` that returns true if field `array` has the same ints 
in the same order as the file. You can copy the `flatten` method into this class and use most of the code from Assignment 4.

Write a method `public int compareTo(TwoDimNumArr other)` which returns [Arrays.compare(flatten(this.array), flatten(other.array))](https://docs.oracle.com/javase/10/docs/api/java/util/Arrays.html#compare(int%5B%5D,int%5B%5D))

Create a Tester class with a main method for testing. Find three files test1.txt, test2.txt, test3.txt. so that we get these results:

```
var v1 = new TwoDimNumArr("test1.txt"); 
var v2 = new TwoDimNumArr("test2.txt"); 
var v3 = new TwoDimNumArr("test3.txt");
System.out.println(v1.compareTo(v2)); // prints a negative number
System.out.println(v1.compareTo(v3)); // prints 0 but test1.txt and text2.txt have different numbers of rows
System.out.println(v3.compareTo(v2)); // prints a positive number
```
Make a class `Locations`. It is just for practice with arrays but let's also introduce the class [`java.util.Random`](https://docs.oracle.com/javase/10/docs/api/java/util/Random.html)
There is a private field `int[] array` and a field `public static final Random rand = new Random()`. It is public so that in the Tester class we 
can use `Locations.rand.nextInt()` for example. In the class Locations make two constructors. One is for the TAs to test your code: it has one `int[]` 
parameter to set the value of the field `array`. The other is as follows:

```java
public Locations() {
	make an int len with the value 10+rand.nextInt(50);
	set array to be an int array with length len
	in a for loop set each array[i] to some randome value: rand.nextInt(100);
}
```
Provide a getter method for the field `array`.

Write a method `public int[] lessEQ(int[] test)` that returns an array of all the indices where `array[i] <= test[i]`. This time we will do it the easy way!
If array is null or test is null the return value is null. If array or test have length 0, the return value is the empty array. Make a List<Integer> instantiated as 
an ArrayList. Loop through the elements of array and test together, stopping at the end of the shorter one. Each time `array[i] <= test[i]` add `i` to the list.
At the end make an `int[] retVal` of length equal to the size() of the list and copy the elements of the list into this `retVal`. Return this array. 

In the Tester class make a Locations object using the random constructor and check that `lessEQ` works for the null, empty and non-empty values of `test`.


LIKE LAST WEEK, THERE WILL BE MORE CODE OVER THE WEEKEND
