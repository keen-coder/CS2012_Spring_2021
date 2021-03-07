
public class MyClass {
	private String[] colors;
	
	private static final double PI = 3.14159265;
	
	
	
	public MyClass() {
		
	}
	
	public MyClass(String[] colors) {
		this.colors = colors;
	}
	
	public MyClass(int x) {
		
	}
	
	public MyClass(String[] colors, int x) {
		
	}
	
	public static double getPI() {
		return PI;
	}
	
	
	public String[] getColors() {
		String[] temp = new String[this.colors.length];
		System.arraycopy(this.colors, 0, temp, 0, this.colors.length);
		return temp;
	}
	
	@Override
	public String toString() {
		String result = "";
		
		result += "Colors: ";
		
		for (int i = 0 ; i < this.colors.length ; i++) {
			result += this.colors[i] + " ";
		}
		
		return result;
	}
	
	
}
