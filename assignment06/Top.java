package exam01;
//EXAM SPRING 2017	
public class Top {
	private int[] arr;
	public Top(int[] _arr) {
		this.arr = _arr;
	}
	public double average() {
		if (arr == null || arr.length ==0) {
			return 0;
		}
		double sum = 0.0;
		double avg = 0.0;
		for (int i =0; i <arr.length; i++) {
			sum = sum +arr[i];
		}
		avg = sum/arr.length;
		return avg;
	}
	public int max() {
		if (arr == null || arr.length ==0) {
			return Integer.MIN_VALUE;
		}
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}
