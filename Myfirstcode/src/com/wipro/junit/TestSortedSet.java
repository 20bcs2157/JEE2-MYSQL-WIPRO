package com.wipro.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
 
import java.util.SortedSet;
import java.util.TreeSet;
 
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;

class TestSortedSet {

	@Test
	void testGetData() {
		Test1 obj = new Test1();
		SortedSet<Integer> expectedSet
		  = new TreeSet<>();
		expectedSet.add(-5);
		expectedSet.add(6);
		expectedSet.add(67);
		expectedSet.add(100);
		expectedSet.add(152);
		expectedSet.add(234);
		expectedSet.add(333);
		SortedSet<Integer> actualSet = obj.getData();
		assertNotNull(actualSet, "Returned Set should not be null");
		assertEquals(expectedSet, actualSet,"The sets should be equal");
	}

}
