package exam01;
//SPRING 2017 EXAM
public class Lower extends Top{
	private int[] arr1;
	public Lower(int[] _arr1, int[]arr) {
		super(arr);
		this.arr1 = _arr1;
	}
	@Override
	public double average() {
		if (arr1 == null || arr1.length ==0) {
			return 0;
		}
		double sum = 0.0;
		double avg = 0.0;
		for (int i =0; i <arr1.length; i++) {
			sum = sum +arr1[i];
		}
		avg = sum/arr1.length;
		return avg;
	}
	@Override
	public int max() {
		if (arr1 == null || arr1.length ==0) {
			return Integer.MIN_VALUE;
		}
		int max = arr1[0];
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] > max) {
				max = arr1[i];
			}
		}
		return max;
	}

}
