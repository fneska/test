package hu.prolan.xtendTest2

import java.util.ArrayList
import java.util.List

class TestClass {
	public def testFunction() {
		System.out.printf("hello world\n")
	}
	
	public def test2() {
		val list = new ArrayList<String>();
		list.map[s|s + "1"];
	}
}