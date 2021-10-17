package chapter1Interface;

import java.util.ArrayList;
import java.util.List;

public class Chapter1Exercise1 {
	private List list;

	public Chapter1Exercise1() {
		list = new ArrayList();
	}

	private List getList() {
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chapter1Exercise1 lce = new Chapter1Exercise1();
		List list = lce.getList();
		System.out.println(list);
	}

}
