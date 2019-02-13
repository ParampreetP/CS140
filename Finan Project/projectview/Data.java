package project;

public class Data {
	public static final int DATA_SIZE = 2048;
	private int[] data = new int[DATA_SIZE];
	private int changedIndex = -1;
	
	
	int[] getData() {
		return data;
	}
	public int getChangedIndex()
	{
		return changedIndex;
	}
	int setChangedIndex(int index){
		if(index < 0 || index > DATA_SIZE) {
			throw new MemoryAccessException("Illegal access to data memory, index " + index);
		}
		changedIndex = index;
		return changedIndex;
	}
	public int getData(int index) {
		if (index < 0 || index > DATA_SIZE) {
			throw new MemoryAccessException("Attempt to get data outside its bounds");
		}
		return data[index];
	}
	public void setData(int index, int value) {
		if (index < 0 || index > DATA_SIZE) {
			throw new MemoryAccessException("Illegal access to data memory, index" + index);
		}
		data[index] = value;
		changedIndex = index;	
	}
	public void clearData(int start, int end) {
		for (int i = start; i < end; i++) {
			data[i] = 0;
			changedIndex = -1;
		}
	}
}
