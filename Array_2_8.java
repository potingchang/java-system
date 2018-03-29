import javax.swing.plaf.basic.BasicBorders.ToggleButtonBorder;

public class Array_2_8 {

	public static void main(String[] args) {
		double[][] t = { { 18.2, 17.3, 15.0, 13.4 }, { 23.8, 25.1, 20.6, 17.8 }, { 20.6, 21.5, 18.4, 15.7 } };
		workA(t);
		workB(t);
		workc(t);
		workd(t);
		worke(t);

	}

	// 題目d溫度最低的日子與時段
	private static void worke(double[][] t) {
		System.out.println("\n 題目d溫度最低的日子與時段`");
		double min = 100;
		int temp1 = 0, temp2 = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				if (t[i][j] < min) {
					min = t[i][j];
					temp1 = i;// 记录时段
					temp2 = j;// 记录星期
				}
			}
		}
		System.out.println("temp1=" + temp1);
		System.out.println("temp1=" + temp2);
	}

	// 題目d溫度最高的日子與時段`
	private static void workd(double[][] t) {
		System.out.println("\n 題目d溫度最高的日子與時段`");
		double max = 0;
		int temp1 = 0, temp2 = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				if (t[i][j] > max) {
					max = t[i][j];
					temp1 = i;// 记录时段
					temp2 = j;// 记录星期
				}
			}
		}
		System.out.println("temp1=" + temp1);
		System.out.println("temp1=" + temp2);
	}

	// 題目c
	// 打印各個時段的平均氣溫`
	private static void workc(double[][] t) {
		System.out.println("\n題目c" + "打印各個時段的平均氣溫`");
		double[] t_sum = new double[3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				t_sum[i] += t[i][j];
			}
		}
		for (int i = 0; i < t_sum.length; i++) {
			System.out.println(t_sum[i] / 4);
		}
	}

	// 題目b 每日均溫
	private static void workB(double[][] t) {
		System.out.println("\n題目b 每日均溫");
		double[] d_sum = new double[4];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				d_sum[i] += t[j][i];
			}
		}

		for (int i = 0; i < d_sum.length; i++) {
			System.out.println("每日均溫=" + (d_sum[i] / d_sum.length));
		}
	}

	// 題目a 印出內容
	public static void workA(double t[][]) {
		System.out.println("題目a 印出內容");
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[i].length; j++) {
				System.out.print(t[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
