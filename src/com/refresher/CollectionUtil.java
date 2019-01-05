package com.refresher;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionUtil {
	public List<String> findUniqueString(List<String> list) {
		if (list == null || list.isEmpty()) return null;
		Set<String> hs = new HashSet<>();
		List<String> listN = new ArrayList<>();
		for (String string : list) {
			if (!hs.contains(string)) {
				hs.add(string);
				listN.add(string);
			} else {
				listN.remove(string);
			}
		}
		for (String string : listN) {
			System.out.println(string);
		}
		return listN;
	}
}
