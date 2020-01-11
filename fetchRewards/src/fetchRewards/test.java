package fetchRewards;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class test {
	public static void main(String[]args) {
		String test1 = "banana";
		String test2 = "bandana";
		boolean rs1 = checkPyramid(test1);
		boolean rs2 = checkPyramid(test2);
		System.out.println(rs1);
		System.out.println(rs2);
	}
	public static boolean checkPyramid(String s) {
		if (s == null || s.length() == 0) {
			return true;
		}
		Map<Character, Integer> map = new HashMap<>();
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			} else {
				map.put(s.charAt(i), 1);
			}
		}
		for (int value : map.values()) {
			if (set.contains(value)) {
				return false;
			} else {
				set.add(value);
			}
			
		}
		
		
		return true;
	}
}
