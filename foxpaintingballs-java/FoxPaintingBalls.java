/*
 * SRM522-D1-250
 * SOLVED
 */

import static java.lang.Math.*;

public class FoxPaintingBalls {

	public long theMax(long R, long G, long B, int N) {
		long sum = R + G + B;

		if (N == 1)
			return sum;

		long min = min(R, min(G, B));
		long size = N * ((long) N + 1) / 2;

		return min(sum / size, min / (size / 3));
	}

}
