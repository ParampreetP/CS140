package lab05;

public class Zipper{

		public static int[] zip(int[] arr1, int[] arr2){

			if(arr1 == null || arr2 == null || arr1.length != arr2.length){
					throw new IllegalArgumentException("bad input");
			}

			int length = arr1.length + arr2.length;
			int[] array = new int[length];
			
			for (int i = 0, x = 0; i < arr1.length; i++){
				array[x++] = arr1[i];
				array[x++] = arr2[i];
			}
			return array;
			}







		}




