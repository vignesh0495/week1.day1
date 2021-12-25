package week1.day1;

public class Fibonacci {
	
	public static void main(String[] args) {
	
	int range = 8;
	int firstNum = 0;
	int secNum = 1;
    int i;
	System.out.println(firstNum);
	for(i=1;i<range;i++) {
		int sum = firstNum + secNum;
		firstNum = secNum;
		secNum = sum;
		System.out.println(sum);
	}
	}
		
	
}
