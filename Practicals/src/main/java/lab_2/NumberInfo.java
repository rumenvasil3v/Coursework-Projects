package lab_2;

public class NumberInfo {
	private int limit;
	private int value;
	
	public NumberInfo(int limit) {
		super();
		this.limit = limit;
		this.value = 0;
	}
	
	public int getValue() {
		return this.value;
	}

	public int getLimit() {
		return this.limit;
	}
	
	public int increment() {
		this.value = this.value + 1;		
		this.value = (this.value) % (this.limit + 1);
		
		return this.value;
	}
}
