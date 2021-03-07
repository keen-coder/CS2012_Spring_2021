
public class Main {
	public static void main(String[] args) {
		String[] colors = new String[5];
		
		
		colors[0] = "blue";
		colors[1] = "red";
		colors[2] = "green";
		colors[3] = "pink";
		colors[4] = "orange";
		
		MyClass mc1 = new MyClass(colors);
		System.out.println(mc1);
		
		String[] colors2 = mc1.getColors();
		
		colors2[2] = "yellow";
		
		System.out.println(mc1);
	}
	
	public static int max(int x, int y) {
		return 0;
	}
	
	public static int max(double x, double y) {
		return 0;
	}
	
	public static int max(double x, double y, int z) {
		return 0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
