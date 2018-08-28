package com.bst;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};

public class EmployeeImportant {
	

	public static void main(String[] args) {
		//int[][] a = {{1, 5, {2, 3}}, {2, 3, {}}, {3, 3, {}}};
		int id = 1;

	}
	
	 public char findTheDifference(String s, String t) {
	        for (int i = 0; i < t.length(); i++) {
	            if (s.charAt(i) != t.charAt(i)) {
	                return t.charAt(i);
	            }
	        }
	        return ' ';
	  }
	
	Map<Integer, Employee> hs;
	public int getImportance(List<Employee> employees, int id) 
	{
		hs = new HashMap<>();
        for (Employee employee : employees) {
			hs.put(employee.id, employee);
		}
        return importance(id);
    }
	
	public int importance(int id) {
		Employee e = hs.get(id);
		int sum = e.importance;
		for (Integer i : e.subordinates) {
			sum += importance(i);
		}
		return sum;
	}

}
