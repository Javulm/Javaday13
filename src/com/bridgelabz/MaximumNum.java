package com.bridgelabz;

public class MaximumNum <T extends Comparable> {
	   T var1, var2, var3;
	    public FindMaximum(T var1, T var2, T var3) {
	        this.var1 = var1;
	        this.var2 = var2;
	        this.var3 = var3;
	    }
	public static void main(String[] args) {
		System.out.println("Welcome to Generic Program.");
		Integer a = 20, b = 50, c = 80;
		Float p = 20.85f, q = 90.55f, r = 80.98f;
		String e = "Apple", f = "Peach", g = "Banana";
		new FindMaximum.getMaximum(a, b, c).max();
		new FindMaximum.getMaximum(p, q, r).max();
		new FindMaximum.getMaximum(e, f, g).max();
	}
	 private void max() {
	        FindMaximum.getMaximum(var1, var2, var3);

	    }
	private static <T extends Comparable> void getMaximum(T a, T b, T c) {
		T max = a;
		if (b.compareTo(a) > 0) {
			max = b;
		}
		if (c.compareTo(max) > 0) {
			max = c;
		}
		System.out.println("Maximum ::" + max);
	}
}
