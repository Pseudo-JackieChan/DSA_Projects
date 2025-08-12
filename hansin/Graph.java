package com.hansin;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
public class Graph {
	public static void main(String[] args) {
		Map<String,List<String>> graphs = new HashMap<>();
		graphs.put("City Pune",Arrays.asList("City Mumbai", "Delhi"));
		graphs.put("City Mumbai",Arrays.asList("City Pune", "Kolkata"));
		graphs.put("City Delhi",Arrays.asList("City Pune"));
		graphs.put("City Kolkata",Arrays.asList("City Mumbai"));
		List<String> cities = new ArrayList<>(graphs.keySet());
		
		for (int i = 0; i < cities.size(); i++) {
			String city = cities.get(i);
			System.out.println(city + " is connected to: " + graphs.get(city));
		}
		
	}

}
