import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FoxAndMp3Test {

	protected FoxAndMp3 solution;

	@Before
	public void setUp() {
		solution = new FoxAndMp3();
	}

	@Test(timeout = 2000)
	public void testCase0() {
		int n = 3;

		String[] expected = new String[] { "1.mp3", "2.mp3", "3.mp3" };
		String[] actual = solution.playList(n);

		Assert.assertArrayEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase1() {
		int n = 10;

		String[] expected = new String[] { "1.mp3", "10.mp3", "2.mp3", "3.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3" };
		String[] actual = solution.playList(n);

		Assert.assertArrayEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase2() {
		int n = 16;

		String[] expected = new String[] { "1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "2.mp3", "3.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3",
				"8.mp3", "9.mp3" };
		String[] actual = solution.playList(n);

		Assert.assertArrayEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase3() {
		int n = 32;

		String[] expected = new String[] { "1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3",
				"21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "4.mp3", "5.mp3", "6.mp3",
				"7.mp3", "8.mp3", "9.mp3" };
		String[] actual = solution.playList(n);

		Assert.assertArrayEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase4() {
		int n = 100000009;

		String[] expected = new String[] { "1.mp3", "10.mp3", "100.mp3", "1000.mp3", "10000.mp3", "100000.mp3", "1000000.mp3", "10000000.mp3", "100000000.mp3", "100000001.mp3",
				"100000002.mp3", "100000003.mp3", "100000004.mp3", "100000005.mp3", "100000006.mp3", "100000007.mp3", "100000008.mp3", "100000009.mp3", "10000001.mp3",
				"10000002.mp3", "10000003.mp3", "10000004.mp3", "10000005.mp3", "10000006.mp3", "10000007.mp3", "10000008.mp3", "10000009.mp3", "1000001.mp3", "10000010.mp3",
				"10000011.mp3", "10000012.mp3", "10000013.mp3", "10000014.mp3", "10000015.mp3", "10000016.mp3", "10000017.mp3", "10000018.mp3", "10000019.mp3", "1000002.mp3",
				"10000020.mp3", "10000021.mp3", "10000022.mp3", "10000023.mp3", "10000024.mp3", "10000025.mp3", "10000026.mp3", "10000027.mp3", "10000028.mp3", "10000029.mp3",
				"1000003.mp3" };
		String[] actual = solution.playList(n);

		Assert.assertArrayEquals(expected, actual);
	}

	@Test(timeout = 2000)
	public void testCase5() {
		int n = 1;

		String[] expected = new String[] { "1.mp3" };
		String[] actual = solution.playList(n);

		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void testCase6() {
		for (int n = 2; n < 2000; ++n) {
			String[] data = new String[n];
			String[] actual = solution.playList(n);

			for (int i = 1; i <= n; ++ i)
				data[i-1] = i + ".mp3";

			Arrays.sort(data);
			String[] expected = Arrays.copyOf(data, Math.min(n,50));

			Assert.assertArrayEquals(expected, actual);
		}
	}

}
