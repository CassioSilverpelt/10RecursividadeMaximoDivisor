package controller;

public class MaximoDivisorCController {
	public MaximoDivisorCController() {
		super();
	}
	
	public int maximoDivisorC(int a, int b){
		if (a == b) {
			return a;
		} else if (a > b) {
			return maximoDivisorC(a-b, b);
		} else {
			return maximoDivisorC(b, a);
		}
	}
	
}
