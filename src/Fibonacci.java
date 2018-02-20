
public class Fibonacci {
public static void main(String [] args) {
	int Second = 1;
	int First = 0;
	int Current = 0;
	System.out.println(First);
	System.out.println(Second);
	for(int i = 0; i < 11; i++) {
		Current = First + Second;
		System.out.println(Current);
		First = Second;
		Second = Current;
	}
}
}
