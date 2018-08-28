package com.bst;

import java.awt.MenuComponent;
import java.lang.reflect.Array;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

import javax.imageio.ImageTypeSpecifier;
import javax.management.MXBean;

import org.omg.PortableInterceptor.IORInterceptor;
import org.w3c.dom.ls.LSInput;

public class TheDifference {
	public class Node {
		int key;
		Node left;
		Node right;

		Node(int item) {
			key = item;
			left = null;
			right = null;
		}
	}

	public static void main(String[] args) {
		// System.out.println(findTheDifference2("abcd", "abcde"));
		// System.out.println(findTheDifference2("a", "aa"));
		// System.out.println(findTheDifference2("abcd", "abcde"));
		// System.out.println(findTheDifference2("a", "aa"));

		// String s =
		// "ymbgaraibkfmvocpizdydugvalagaivdbfsfbepeyccqfepzvtpyxtbadkhmwmoswrcxnargtlswqemafandgkmydtimuzvjwxvlfwlhvkrgcsithaqlcvrihrwqkpjdhgfgreqoxzfvhjzojhghfwbvpfzectwwhexthbsndovxejsntmjihchaotbgcysfdaojkjldprwyrnischrgmtvjcorypvopfmegizfkvudubnejzfqffvgdoxohuinkyygbdzmshvyqyhsozwvlhevfepdvafgkqpkmcsikfyxczcovrmwqxxbnhfzcjjcpgzjjfateajnnvlbwhyppdleahgaypxidkpwmfqwqyofwdqgxhjaxvyrzupfwesmxbjszolgwqvfiozofncbohduqgiswuiyddmwlwubetyaummenkdfptjczxemryuotrrymrfdxtrebpbjtpnuhsbnovhectpjhfhahbqrfbyxggobsweefcwxpqsspyssrmdhuelkkvyjxswjwofngpwfxvknkjviiavorwyfzlnktmfwxkvwkrwdcxjfzikdyswsuxegmhtnxjraqrdchaauazfhtklxsksbhwgjphgbasfnlwqwukprgvihntsyymdrfovaszjywuqygpvjtvlsvvqbvzsmgweiayhlubnbsitvfxawhfmfiatxvqrcwjshvovxknnxnyyfexqycrlyksderlqarqhkxyaqwlwoqcribumrqjtelhwdvaiysgjlvksrfvjlcaiwrirtkkxbwgicyhvakxgdjwnwmubkiazdjkfmotglclqndqjxethoutvjchjbkoasnnfbgrnycucfpeovruguzumgmgddqwjgdvaujhyqsqtoexmnfuluaqbxoofvotvfoiexbnprrxptchmlctzgqtkivsilwgwgvpidpvasurraqfkcmxhdapjrlrnkbklwkrvoaziznlpor";
		// String t =
		// "qhxepbshlrhoecdaodgpousbzfcqjxulatciapuftffahhlmxbufgjuxstfjvljybfxnenlacmjqoymvamphpxnolwijwcecgwbcjhgdybfffwoygikvoecdggplfohemfypxfsvdrseyhmvkoovxhdvoavsqqbrsqrkqhbtmgwaurgisloqjixfwfvwtszcxwktkwesaxsmhsvlitegrlzkvfqoiiwxbzskzoewbkxtphapavbyvhzvgrrfriddnsrftfowhdanvhjvurhljmpxvpddxmzfgwwpkjrfgqptrmumoemhfpojnxzwlrxkcafvbhlwrapubhveattfifsmiounhqusvhywnxhwrgamgnesxmzliyzisqrwvkiyderyotxhwspqrrkeczjysfujvovsfcfouykcqyjoobfdgnlswfzjmyucaxuaslzwfnetekymrwbvponiaojdqnbmboldvvitamntwnyaeppjaohwkrisrlrgwcjqqgxeqerjrbapfzurcwxhcwzugcgnirkkrxdthtbmdqgvqxilllrsbwjhwqszrjtzyetwubdrlyakzxcveufvhqugyawvkivwonvmrgnchkzdysngqdibhkyboyftxcvvjoggecjsajbuqkjjxfvynrjsnvtfvgpgveycxidhhfauvjovmnbqgoxsafknluyimkczykwdgvqwlvvgdmufxdypwnajkncoynqticfetcdafvtqszuwfmrdggifokwmkgzuxnhncmnsstffqpqbplypapctctfhqpihavligbrutxmmygiyaklqtakdidvnvrjfteazeqmbgklrgrorudayokxptswwkcircwuhcavhdparjfkjypkyxhbgwxbkvpvrtzjaetahmxevmkhdfyidhrdeejapfbafwmdqjqszwnwzgclitdhlnkaiyldwkwwzvhyorgbysyjbxsspnjdewjxbhpsvj";
		// System.out.println(findTheDifference3(s, t));
		// findKsmallestUnsortedArray() ;
		// int[] nums = {7, 15, 4, 3, 20, 10};
		// partition(nums, 0, 5);
		// quickSort(nums, 0, 5);
		// String a="hello";
		// String b="hello";
		// String c=new String("hello");
		// String d=c;
		// String e=new String("hello");
		//
		// System.out.println(a==b); //T
		// System.out.println(a.equals(b)); //T
		//
		// System.out.println(a==c); // F
		// System.out.println(c==d); // F => T
		// System.out.println(c.equals(d)); //T
		// System.out.println(c== e); // F
		// System.out.println(c.equals(e)); // F => T

		/*
		 * int[] nums = {12, 3, 5, 7, 4, 19, 26}; System.out.println(kthSmallest(nums,
		 * 0, 6, 3)); int a1[] = {1, 4, 5, 7}; int a2[] = {10, 20, 30, 40}; int a3[] =
		 * {1, 4, 5, 7, 10, 20, 30, 40}; int x = 36; closetPairs(a1, a2, x);
		 * findClosest(a3, x); findPairs(a1, a2, 4, 4, x);
		 */

		// System.out.println(isPalindrome("racertecar"));

		/*
		 * int a[] = { 2, 2, 7, 7, 2, 1, 5, 4, 5, 1, 1 }; int b[] = { 2, 3, 4, 7, 10 };
		 * 
		 * findCommons2(a, b);
		 */
		// System.out.println(reverse(123));

		/*
		 * int arr[] = {1, 3, 5, 5, 5, 5 ,67, 123, 125}; firstLastOccur(arr, 5);
		 */
		/*
		 * int a[] = { 1, 2, 3, 5, 6, 7, 8, 9, 10 };
		 * System.out.println(searchSortedRotated2(a, 0, 8, 6));
		 */

		/*
		 * int a[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
		 * System.out.println(searchSortedRotated(a, 9, 3));
		 */
		// System.out.println(reverseString2("hello"));

		/*
		 * String str = "12abc20yz-68"; sumAll(str);
		 */

		/*
		 * int[] sortedArray = {1,2,5,8,13,16};
		 * System.out.println(countPairs(sortedArray, 10));
		 */
		
		/*
		ArrayList<Integer> flowerPot = new ArrayList<Integer>();
		flowerPot.add(0);
		flowerPot.add(1);
		flowerPot.add(0);
		flowerPot.add(0);
		flowerPot.add(1);
		flowerPot.add(1);
		flowerPot.add(0);
		flowerPot.add(0);
		flowerPot.add(0);
		flowerPot.add(0);

		for (Integer integer : flowerPot) {
			System.out.print(integer + " ");
		}
		plantFlowers(flowerPot);

		System.out.println();
		for (Integer integer : flowerPot) {
			System.out.print(integer + " ");
		}*/
		
		/*
		int[] adjacents = {2, 1, 1, 3, 3, 2, 2, 2, 2, 1, 1};
		getMostAdjacents(adjacents);
		*/
		
		/*
		String str = "abppplee";
		List<String> list = Arrays.asList("able", "ale", "apple", "bale", "kangaroo");
		//System.out.println(list.get(0));
		longestSubString(str, list);
		*/
		
		//String string = "abcabcbb";
		//String string = "pwwkew";
		String string = "abcabcbb";
		longestSubStringWithoutRepeating4("abcabcbb");
	}
	
	static void longestSubStringWithoutRepeating4(String str) { 
		HashMap<Character, Integer> tmp = new HashMap<>();
		HashMap<String, Integer> hashMap = new HashMap<>();
		int index = 0;
		
		int i;
		int j = 0;
		for (i = 0; i < str.length(); ) {
			if (!tmp.containsKey(str.charAt(i))) {
				tmp.put(str.charAt(i), i++);
			} else {
				index = j < tmp.get(str.charAt(i)) ? j : tmp.get(str.charAt(i));
				hashMap.put(str.substring(index, i), index);
				tmp.clear();
				i = index + 1;
				j = index + 1;
			}
		}
		hashMap.put(str.substring(j, i), j);
		
		for (java.util.Map.Entry<String, Integer> entry: hashMap.entrySet()) {
			
			System.out.printf("%s : %d\n", entry.getKey(), entry.getValue());
		}
		
	}
	
	static int longestSubStringWithoutRepeating3(String str) {
		HashMap<Character, Integer> hashMap = new HashMap<>();
		int ans = 0;
		
		for (int j = 0, i = 0; j < str.length(); j++) {
			if (hashMap.containsKey(str.charAt(j))) {
				i = Math.max(hashMap.get(str.charAt(j)), i);
			}
			ans = Math.max(ans, j - i + 1);
			hashMap.put(str.charAt(j), j + 1);
		}
		return ans;
	}
	
	
	
	static void longestSubStringWithoutRepeating(String str) {
		Map<Character, Integer> map = new HashMap<>();
		Map<String, Integer> hmMap = new HashMap<>();
		
		int lastIndex = 0;
		for (int i = 0; i < str.length();) {
			if (!map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), i);
				i++;
			} else {
				int beginIndex = lastIndex < map.get(str.charAt(i)) ? lastIndex: map.get(str.charAt(i));
				
				hmMap.put(str.substring(beginIndex, i), beginIndex);
				map.clear();
				i = beginIndex + 1;
			}
		}
		
		for (java.util.Map.Entry<String, Integer> entry: hmMap.entrySet()) {
			//max = Math.max(max, entry.getKey().length());
			
			System.out.printf("%s : %d\n", entry.getKey(), entry.getValue());
		}
		//return max;
	}
	
	static int longestSubStringWithoutRepeating2(String str) {
		int n = str.length();
		int i = 0, j = 0, ans = 0;
		Set<Character> hSet = new HashSet<>();
		
		while (i < n && j < n) {
			if (!hSet.contains(str.charAt(j))) {
				hSet.add(str.charAt(j++));
				ans = Math.max(ans, j - i);
			} else {
				hSet.remove(str.charAt(i++));
			}
		}
		return ans;
	}
	
	static void longestSubString(String str, List<String> list) {
		String longestSub = "";
		for (int i = 0; i < list.size(); i++) {
			String dic = list.get(i);
			int k = 0;
			int j;
			for (j = 0; j < dic.length(); ) {
				if (dic.charAt(j) == str.charAt(k)) {
					j++;
					k++;
				} else {
					if (k == str.length() - 1)
						break;
					k++;
				}
			}
			if (j == dic.length() && dic.length() > longestSub.length()) {
				longestSub = dic;
			}
		}
	}
	
	static void longestSubSequences(String str, List<String> list) {
		String longestStr = "";
		for (int k = 0; k < list.size(); k++) {
			String sub = list.get(k);
			int i = 0;
			int j;
			for (j = 0; j < sub.length();) {
				if (str.charAt(i) == sub.charAt(j)) {
					i++;
					j++;
				} else {
					if (str.length() -1 == i)
						break;
					i++;
				}
			}
			if (j == sub.length() && sub.length() > longestStr.length()) {
				longestStr = sub;
				 
			}
		}
		System.out.printf("%s is a longest sub str.\n", longestStr);
		
	}
	
	static void getMostAdjacents(int[] nums) 
	{
		int count = 0;
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			int r = runTo(nums, i);
			int c = r - i + 1;
			if (c > count) {
				index = i;
				count = c;
				i = r -1;
			}
		}
		System.out.printf("start from: %d, get: %d", index, count);
	}
	static int runTo(int[] nums, int index) {
		for (int i = index; i < nums.length-1; i++) {
			if (nums[i] != nums[i+1])
				return i;
		}
		return nums.length - 1;
	}
	
	/*
	 * ArrayList<Integer> flowerPot = [0, 1, 0, 0, 1, 1, 0, 0, 0, 0] Write a
	 * function that plants flowers such that no two flowers are adjacent Maximize
	 * the number of flowers that can be planted Output Array = [0, 1, 0, 0, 1, 1,
	 * 0, 1, 0, 1]
	 * 
	 * in  [0, 1, 0, 0, 1, 1, 0, 0, 0, 0]
	 * 
	 * out [0, 1, 0, 0, 1, 1, 0, 1, 0, 1]
	 */
	public static void plantFlowers(List<Integer> list) {
		int n = list.size() - 1;

		for (int i = 0; i < list.size(); i++) {
			if (i == 0 || i == n) {
				if (i == 0 && list.get(i) == 0 && list.get(i + 1) != 1) {
					list.set(i, 1);
				} else if (i == n && list.get(i) == 0 && list.get(i - 1) != 1) {
					list.set(i, 1);
				}
			} else {
				if (list.get(i) == 0 && list.get(i-1) != 1 && list.get(i+1) != 1) {
					list.set(i, 1);
				}
			}
		}
	}

	// int[] sortedArray = [1,2,5,8,13,16]
	// Write a function that returns the number of pairs such that x + y <= target
	public static int countPairs(int[] sortedArray, int target) {
		int l = 0;
		int r = sortedArray.length - 1;
		int count = 0;

		while (l < r) {
			if (sortedArray[r] > 10)
				r--;
			if (sortedArray[l] + sortedArray[r] <= target) {
				System.out.printf("(%d, %d)\n", sortedArray[l], sortedArray[r]);
				++l;
				++count;
				if (l == r && r != 0) {
					l = 0;
					r--;
				}
			} else {
				--r;
				l = 0;
			}
		}
		return count;
	}

	static void sumAll(String string) {
		String tmp = "";
		int sum = 0;
		for (int i = 0; i < string.length(); i++) {
			if (Character.isDigit(string.charAt(i))) {
				tmp += string.charAt(i);
			} else if (!tmp.isEmpty()) {
				sum += Integer.parseInt(tmp);
				tmp = "";
			}

		}
		System.out.println(sum);
	}

	static void reverseString(String str) {
		char[] chars = str.toCharArray();
		int l = 0;
		int r = chars.length - 1;
		while (l <= r) {
			char c = chars[l];
			chars[l++] = chars[r];
			chars[r--] = c;
		}
		System.out.println(Arrays.toString(chars).toString());
	}

	static String reverseString2(String str) {
		if (str == null || str.isEmpty())
			return "";
		return str.charAt(str.length() - 1) + reverseString2(str.substring(0, str.length() - 1));
	}

	/*
	 * Search an element in a sorted and rotated array
	 *
	 */
	public static int searchSortedRotated(int[] a, int n, int x) {
		int pivot = findPivot(a, 0, n - 1);
		if (pivot == -1)
			biSearchIter(a, 0, n - 1, x);
		if (a[pivot] == x)
			return pivot;
		if (a[0] <= x)
			return biSearchIter(a, 0, pivot - 1, x);
		return biSearchIter(a, pivot + 1, n - 1, x);
	}

	public static int findPivot(int[] a, int l, int r) {
		if (r < l)
			return -1;
		if (l == r)
			return l;

		int mid = (l + r) / 2;
		if (mid < r && a[mid] > a[mid + 1])
			return mid;
		if (mid > l && a[mid - 1] > a[mid])
			return mid - 1;

		if (a[l] >= a[mid])
			return findPivot(a, l, mid - 1);

		return findPivot(a, mid + 1, r);
	}

	public static int biSearchIter(int[] a, int l, int r, int x) {
		while (l <= r) {
			int mid = (l + r) / 2;
			if (a[mid] == x)
				return mid;
			else if (a[mid] < x)
				l = mid + 1;
			else
				r = mid - 1;
		}
		return -1;
	}

	public static int biSearchRec(int[] a, int l, int r, int x) {
		if (l > r)
			return -1;
		int mid = (l + r) / 2;
		if (a[mid] == x)
			return mid;
		else if (a[mid] < x)
			return biSearchRec(a, mid + 1, r, x);
		return biSearchRec(a, l, mid - 1, x);
	}

	public static int searchSortedRotated2(int[] a, int l, int r, int x) {

		while (l <= r) {
			int mid = (l + r) / 2;
			if (a[mid] == x) {
				return mid;
			} else if (a[mid] < x)
				l = mid + 1;
			else {
				r = mid - 1;
			}
		}
		return -1;
	}

	/*
	 * public static int findPivot(int[] a, int l, int r) { if (r < l) return -1; if
	 * (l == r) return l; int mid = (l + r) / 2; if (mid < r && a[mid] > a[mid+1])
	 * return mid; if (mid > l && a[mid-1] > a[mid]) return mid-1;
	 * 
	 * if (a[l] >= a[mid]) return findPivot(a, l, mid-1); return findPivot(a, mid+1,
	 * r); }
	 */

	public static void firstLastOccur(int a[], int x) {
		int first = -1;
		int last = -1;

		for (int i = 0; i < a.length; i++) {
			if (x != a[i])
				continue;
			if (first == -1)
				first = i;
			last = i;
		}
		System.out.printf("first: %d; last: %d", first, last);
	}

	public static int reverse(int nums) {
		int result = 0;
		while (nums > 0) {

			result = result * 10 + (nums % 10);
			nums = nums / 10;
		}
		return result;
	}

	public static void findCommons(int[] a, int[] b) {
		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j] && !set.contains(a[i])) {
					set.add(a[i]);
					System.out.printf("(%d, %d)\n", a[i], b[j]);
				}
			}
		}
	}

	public static void findCommons2(int[] a, int[] b) {
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			set1.add(a[i]);
		}

		for (int i = 0; i < b.length; i++) {
			set2.add(b[i]);
		}
		set1.retainAll(set2);
		System.out.println(set1.toString());
	}

	public static boolean isPalindrome(String s) {

		Stack<Character> stack = new Stack<>();
		Queue<Character> queue = new LinkedList<>();

		for (int i = 0; i < s.length(); i++) {
			stack.push(s.charAt(i));
			queue.add(s.charAt(i));
		}

		while (!stack.isEmpty()) {
			if (stack.pop() != queue.remove())
				return false;
		}

		return true;
	}

	// Given a sorted array and a number x, find the pair in array whose sum is
	// closest to x
	public static void findClosest(int[] a, int x) {
		int l = 0;
		int r = a.length - 1;

		int i = 0;
		int j = 0;

		int diff = Integer.MAX_VALUE;

		while (l < r) {
			if (Math.abs(a[l] + a[r] - x) < diff) {
				diff = Math.abs(a[l] + a[r] - x);
				i = l;
				j = r;
			}

			if (a[l] + a[r] > x)
				r--;
			else
				l++;
		}
		System.out.printf("(%d,%d)", a[i], a[j]);
	}

	public static void findPairs(int[] a1, int[] a2, int l1, int l2, int x) {
		int i = 0;
		int j = 0;
		int l = 0;
		int r = l2 - 1;

		int diff = Integer.MAX_VALUE;
		while (l < l1 && r > 0) {
			if (Math.abs(a1[l] + a2[r] - x) < diff) {
				diff = Math.abs(a1[l] + a2[r] - x);
				i = l;
				j = r;
			}
			if (a1[l] + a2[r] > x)
				r--;
			else
				l++;
		}

		System.out.printf("(%d, %d)", a1[i], a2[j]);
	}

	// Find the closest pair from two sorted arrays
	// simple solution, not recommended
	public static void closetPairs(int[] a1, int[] a2, int x) {
		int min = Integer.MAX_VALUE;
		int k = 0, l = 0;

		for (int i = 0; i < a1.length; i++) {
			for (int j = 0; j < a2.length; j++) {
				if (min > Math.abs(a1[i] + a2[j] - x)) {
					min = Math.abs(a1[i] + a2[j] - x);
					k = i;
					l = j;
				}
			}
		}
		System.out.printf("pair: (%d, %d)", a1[k], a2[l]);
	}

	public static int kthSmallest(int[] a, int l, int r, int k) {
		if (k > 0 && k <= r - l + 1) {
			int pos = partition(a, l, r);
			if (pos - l == k - 1) {
				return a[pos];
			}

			if (pos - l > k - 1) {
				return kthSmallest(a, l, pos - 1, k);
			}
			return kthSmallest(a, pos + 1, r, k - pos + l - 1);
		}
		return Integer.MAX_VALUE;
	}

	/*
	 * public ArrayList InOrder(Node root){ ArrayList result=new ArrayList();
	 * if(root != null){ result.addAll(InOrder(root.left)); result.add(root.key);
	 * result.addAll(InOrder(root.right)); } return result; }
	 */

	public static void quickSort(int[] a, int l, int r) {
		if (l < r) {
			int pos = partition(a, l, r);
			quickSort(a, l, pos - 1);
			quickSort(a, pos + 1, r);
		}

	}

	public static int partition(int[] a, int l, int r) {
		int pivot = a[r];
		int i = l;
		for (int j = l; j < r; j++) {
			if (a[j] <= pivot) {
				int tmp = a[i];
				a[i] = a[j];
				a[j] = tmp;
				i++;

			}
		}
		int tmp = a[i];
		a[i] = a[r];
		a[r] = tmp;

		return i;

	}

	public static void findKsmallestUnsortedArray() {
		int[] nums = { 7, 15, 4, 3, 20, 10 };
		int k = 3;
		Arrays.sort(nums);
		System.out.println(nums[k - 1]);
	}

	public static char findTheDifference2(String s, String t) {
		HashSet<Character> hSet = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			Character c = s.charAt(i);
			hSet.add(c);
		}

		for (int i = 0; i < t.length(); i++) {
			Character c = t.charAt(i);
			if (hSet.contains(c)) {
				hSet.remove(c);
			} else {
				return c;
			}
		}

		return ' ';
	}

	public static char findTheDifference(String s, String t) {

		HashMap<Character, Integer> hm = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			Character c = s.charAt(i);
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(c, 1);
			}
		}
		for (int j = 0; j < t.length(); j++) {
			Character c = t.charAt(j);
			if (!hm.containsKey(c))
				return c;
			else {
				hm.put(c, hm.get(c) - 1);
			}
			if (hm.get(c) < 0) {
				return c;
			}
		}
		return ' ';
	}

	public static char findTheDifference3(String s, String t) {
		char[] s1 = s.toCharArray();
		Arrays.sort(s1);
		char[] t1 = t.toCharArray();
		Arrays.sort(t1);

		for (int i = 0; i < s.length(); i++) {
			if (s1[i] != t1[i]) {
				return t1[i];
			}
		}
		return t1[t1.length - 1];
	}

	public static char findTheDifference4(String s, String t) {
		int[] count = new int[26];
		for (char c : s.toCharArray()) {
			count[c - 'a']++;
		}

		for (char c : t.toCharArray()) {
			count[c - 'a']--;
		}

		for (int i = 0; i < 26; i++) {
			if (count[i] < 0)
				return (char) (i + (int) 'a');
		}

		return Character.MIN_VALUE;
	}

	/*
	 * public static int countBinarySubstrings(String s) { char[] chars =
	 * s.toCharArray(); Stack<Character> stack = new Stack<>();
	 * stack.push(chars[0]);
	 * 
	 * for (int i = 1; i < chars.length; i++) { char c = chars[i];
	 * 
	 * } }
	 */
}
