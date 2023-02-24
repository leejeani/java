package ifcontrol;

public class P87 {

	public static void main(String[] args) {
		String grade = "";
		String gender = "M";
		double sum = 90.0;

		System.out.println("Start....");

		if (gender.equals("M")) {
			System.out.println("Male....");
		} else {
			System.out.println("Female....");
		}
		// 59 이하 NORMAL
		// 69 ~ 60 BRONZE
		// 79 ~ 70 SILVER4
		// 89 ~ 80 GOLD
		// 100 ~ 90 VIP




		if (sum >= 90.0) {
			grade = "VIP";
		} else if (sum >= 80.0) {
			grade = "GOLD";
		} else if (sum >= 70.0) {
			grade = "SILVER";
		} else if (sum >= 60.0) {
			grade = "BRONZE";
		} else {
			grade = "NORMAL";
		}

		// 100 ~ 95 또는 90 ~ 85 VIP
		// 80 ~ 75 또는 60 ~ 65 GOLD
		// 나머지는 NORMAL

		// 남자 이고 90점 이상이면 MVIP
		// 여자 이고 90점 이상이면 FVIP
		// 남자 이고 80점 이상이면 MVIP
		// 여자 이고 80점 이상이면 FVIP
		// 남자 이고 80점 미만이면 MNORMAL
		// 여자 이고 80점 미만이면 FNORMAL

		if (grade.equals("VIP")) {
			System.out.println("VIP 혜택....");
			// return;
		}
		System.out.printf("%s, %s, %4.2f \n", grade, gender, sum);

		System.out.println("End....");
	}

}
