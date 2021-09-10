package week1.day2;

public class FindIntersectionInArrays {
	public void findIntersect(int a[], int b[]) {

		if (a.length >= b.length) {
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < b.length; j++) {
					if (a[i] == b[j]) {
						int intersectionArr[] = new int[a.length];
						int k = 0;
						intersectionArr[k] = a[i];
						System.out.println(intersectionArr[k]);
						k++;
					}

				}
			}
		} else {
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < b.length; j++) {
					if (a[i] == b[j]) {
						int intersectionArr[] = new int[b.length];
						int k = 0;
						intersectionArr[k] = b[j];
						System.out.println(intersectionArr[k]);
						k++;
					}

				}
			}
		}

	}

	public static void main(String[] args) {
		int a1[] = { 2, 4, 6, 8, 10 };
		int b1[] = { 2, 4, 6, 8, 10, 12 };
		FindIntersectionInArrays f = new FindIntersectionInArrays();
		f.findIntersect(a1, b1);

	}
}
