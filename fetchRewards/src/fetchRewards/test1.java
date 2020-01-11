package fetchRewards;

public class test1 {
	public static void main(String[] args) {
		String s1 = "1.0.0";
		String s2 = "1.0.1";
		String s3 = "2.0";
		System.out.println(compare(s1, s2));
		System.out.println(compare(s1, s3));
		System.out.println(compare(s3, s1));
	}
	public static String compare(String s1, String s2) {
		if (s1 == null && s2 != null) {
			
			return "after";
		}
		
		if (s1 != null && s2 == null) {
			
			return "before";
		}
		
		if (s1.equals(s2)) {
			
			return "equal";
		}
		String[] s11 = s1.split("\\.");
		String[] s22 = s2.split("\\.");
		int len = 0;		
		if (s11.length > s22.length) {
			len = s22.length;
		} else {
			len = s11.length;
		}
		
		
		for (int i = 0; i < len; i++) {
			int int1 = Integer.parseInt(s11[i]);
			int int2 = Integer.parseInt(s22[i]);
			if (int1 > int2) {
				return "after";
			} else if (int2 > int1){
				return "before";
			}
		}
		
		if (s1.length() > s2.length()) {
			return "before";
		} else {
			return "after";
		}
		
	}

}
