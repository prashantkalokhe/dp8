package Array;

public class EnhanceForLoopDemo {
	int arr[];

	EnhanceForLoopDemo() {
		arr = new int[5];
		for (int i = 0; i < arr.length; i++)
			arr[i] = i;
	}

	EnhanceForLoopDemo(int o[]) {
		arr = o;
	}

	public int addArrayElements() {
		int sum = 0;
		for (int i : arr)
			sum = sum + i;
		return sum;
	}

	// return array from method.
	public int[] reverseArr() {
		int sss[] = new int[arr.length];
		int j = arr.length - 1;
		for (int i = 0; i < sss.length; i++) {
			sss[i] = arr[j];
			j--;
		}
		return sss;
	}

	public void printElement() {
		for (int i : arr)
			System.out.println(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnhanceForLoopDemo obj = new EnhanceForLoopDemo();
		System.out.println(obj.addArrayElements());
		int objArr[] = { 5, 6, 7, 9 };
		EnhanceForLoopDemo obj1 = new EnhanceForLoopDemo(objArr);
		System.out.println(obj1.addArrayElements());
		int resArr[] = obj.reverseArr();

		for (int i : resArr)
			System.out.println(i);
	}

}
