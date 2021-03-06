/*
 * SRM564-D1-250
 * SOLVED
 */

public class KnightCircuit2 {

	public int maxSize(int w, int h) {
		if (h > w)
			return maxSize(h, w);

		if (h == 1)
			return 1;
		else if (h == 2)
			return (w + 1) / 2;
		else if (h == 3 && w == 3)
			return 8;

		return w * h;
	}

}
