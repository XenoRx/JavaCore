package course2.lesson5.homework5;

public class MultiThreading {
	static final int SIZE = 10000000;
	static final int HALF = SIZE / 2;
	float[] arr = new float[SIZE];
	
	public float[] count(float[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (float) (arr[i] * Math.sin(0.2f + arr[i] / 5) * Math.cos(0.2f + arr[i] / 5) * Math.cos(0.4f + arr[i] / 2));
		}
		return arr;
	}
	
	public void oneThread() {
		float[] arr = new float[SIZE];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 1.0f;
		}
		long a = System.currentTimeMillis();
		count(arr);
		System.out.println("Первый поток завершился за " + (System.currentTimeMillis() - a) + " ms");
		
	}
	
	public void secondThread() {
		float[] arr = new float[SIZE];
		float[] arr1 = new float[HALF];
		float[] arr2 = new float[HALF];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 1.0f;
		}
		long startTime = System.currentTimeMillis();
		System.arraycopy(arr, 0, arr1, 0, HALF);
		System.arraycopy(arr, HALF, arr2, 0, HALF);
		new Thread() {
			public void run() {
				float[] f1 = count(arr1);
				System.arraycopy(f1, 0, arr1, 0, f1.length);
			}
		}.start();
		new Thread() {
			public void run() {
				float[] f2 = count(arr2);
				System.arraycopy(f2, 0, arr2, 0, f2.length);
			}
		}.start();
		System.arraycopy(arr1, 0, arr, 0, HALF);
		System.arraycopy(arr2, 0, arr, HALF, HALF);
		System.out.println("Второй поток завершился за " + (System.currentTimeMillis() - startTime) + " ms");
	}
	
	public static void main(String[] args) {
		MultiThreading mt = new MultiThreading();
		mt.oneThread();
		mt.secondThread();
	}
}
