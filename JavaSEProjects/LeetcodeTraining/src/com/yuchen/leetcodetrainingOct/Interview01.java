package com.yuchen.leetcodetrainingOct;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Interview01 {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> input1 = new ArrayList<String>();
		List<String> input2 = new ArrayList<String>();
		List<String> result = new ArrayList<String>();
		input1.add("se 3n03");
		input1.add("se 2f03");
		input1.add("se 1c03");
		input1.add("econ 1b03");
		input2.add("se 3n03");
		input2.add("se 2f03");
		input2.add("se 2a03");
		input2.add("se 3ta4");
		input2.add("se 2xa3");
		input2.add("se 4aa4");
		result = getCourses2(input1,input2);
		printList(result);
		
	}
	
	public static void printList(List<String> input) {
		
		for(int i =0;i<input.size();i++	){
			System.out.println(input.get(i));
		}
	}
	
	
	// This method takes: 1. a list of course codes the student completed, 2. A list of course
	// codes required for the degree  
	// result : a list of course codes the student still needs to complete 
	// The run time efficiency of this method is O(n)
	public static List<String> getCourses(List<String> compCourses, List<String> allCourses){
		List<String> result = new ArrayList<String>();

		Map<String, Integer> map = new HashMap<String, Integer>();
		for(int i =0;i<allCourses.size();i++){
			map.put(allCourses.get(i),i);
		}
		for(int j=0;j<compCourses.size();j++){
			if(map.containsKey(compCourses.get(j))){
				map.remove(compCourses.get(j));
			}
		}
		for(String key: map.keySet()){
			result.add(key);
		}
		return result;
	}
	
	
	public static List<String> getCourses2(List<String> compCourses, List<String> allCourses)
	{
		for(int i =0;i<compCourses.size();i++){
			if(allCourses.contains(compCourses.get(i))){
				allCourses.remove(compCourses.get(i));
			}
		}
		return allCourses;
	}
	
	

}
