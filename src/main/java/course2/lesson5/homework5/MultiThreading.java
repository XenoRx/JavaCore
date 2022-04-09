package course2.lesson5.homework5;

public class MultiThreading {
	public static void main(String[] args) throws InterruptedException {
		func1(SIZE);
		func2(SIZE);
	}
	
	static final int SIZE = 10000000;
	static final int HALF = SIZE / 2;
	float[] arr = new float[SIZE];
	
	public static float[] count(float[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (float) (arr[i] * Math.sin(0.2f + arr[i] / 5)
					* Math.cos(0.2f + arr[i] / 5)
					* Math.cos(0.4f + arr[i] / 2));
		}
		return arr;
	}
	
	public static void func1(int SIZE) {
		float[] arr = new float[SIZE];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 1.0f;
		}
		long a = System.currentTimeMillis();
		count(arr);
		System.out.println("Первый поток завершился за " + (System.currentTimeMillis() - a) + " ms");
		
	}
	
	public static void func2(int SIZE) throws InterruptedException {
		float[] arr = new float[SIZE];
		float[] arr1 = new float[HALF];
		float[] arr2 = new float[HALF];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 1.0f;
		}
		long startTime = System.currentTimeMillis();
		System.arraycopy(arr, 0, arr1, 0, HALF);
		System.arraycopy(arr, HALF, arr2, 0, HALF);
		
		Thread t1 = new Thread(() -> {
			count(arr1);
		});
		Thread t2 = new Thread(() -> {
			count(arr2);
		});
		
		System.arraycopy(arr1, 0, arr, 0, HALF);
		System.arraycopy(arr2, 0, arr, HALF, HALF);
		System.out.println("Второй поток завершился за " + (System.currentTimeMillis() - startTime) + " ms");
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
