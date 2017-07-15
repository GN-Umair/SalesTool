package ca.demo.salestool;

import java.util.Arrays;
import java.util.List;

public class People {
	private static List<String> managers = Arrays.asList("Umair", "Subhan");
	
	public static List<String> getManagers() {
		return managers;
	}
}
