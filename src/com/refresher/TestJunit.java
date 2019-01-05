//package com.refresher;
//
//import static org.junit.Assert.assertEquals;
//
//import java.util.Arrays;
//import java.util.List;
//
//import javax.crypto.spec.DHGenParameterSpec;
//
//import org.junit.Test;
//
//
//public class TestJunit {
//	GenericsUtil<Double> dGen = new GenericsUtil<Double>(15.0);
//	GenericsUtil<String> sGen = new GenericsUtil<String>("cmpe273");
//	@Test
//	public void test() {
//		assertEquals(Double.valueOf(15.0), dGen.getGen());
//		assertEquals("cmpe273", sGen.getGen());
//	}
//}
//
//
///*
//public class TestJunit {
//	CollectionUtil collectionUtil = new CollectionUtil();
//	List<String> list = Arrays.asList("abc", "def", "abc", "xyz");
//	List<String> expectedList = Arrays.asList("def", "xyz");
//	@Test
//	public void test() {
//		assertEquals(expectedList, collectionUtil.findUniqueString(list));
//	}
//}
//*/
//
///*
//public class TestJunit {
//	@Test
//	public void test() {
//	}
//}*/
//
///*
//public class TestJunit {
//	InterfaceUtil usaGreeting = new USAGreeting();
//	InterfaceUtil vietGreeting = new VietGreeting();
//	InterfaceUtil mexicoGreeting = new MexicoGreeting();
//
//	@Test
//	public void test() {
//		assertEquals("Hello", usaGreeting.greeting());
//		assertEquals("Xin chao", vietGreeting.greeting());
//		assertEquals("Hola", mexicoGreeting.greeting());
//	}
//}
//*/
//
//
///*
//public class TestJunit {
//	  ArrayUtil arrayUtil = new ArrayUtil();
//	  int[] a1 = {1,2,3,4,5,6,7,8};
//	  int[] a2 = {1,2,3,2,5,6,7,8};
//	  @Test
//	  public void testArrayUtil() {
//		  assertEquals(true, arrayUtil.isCreasing(a1));
//		  assertEquals(false, arrayUtil.isCreasing(a2));
//	  }
//}
//*/
//
//
//
///*
//public class TestJunit {
//	QueueUtil queueUtil = new QueueUtil();
//	@Test
//	public void testQueueUtil() {
//		assertEquals(true, queueUtil.isPalindrome("racecar"));
//		assertEquals(false, queueUtil.isPalindrome("racecar12"));
//	}
//}
//*/
//
//
///*
//public class TestJunit {
//
//   StackUtil stackUtil = new StackUtil();
//   @Test
//   public void testStackUil() {
//	   assertEquals(true, stackUtil.isBalancedParenthesis("{([[]])}"));
//	   assertEquals(false, stackUtil.isBalancedParenthesis("{(])}"));
//   }
//}*/
//
//
