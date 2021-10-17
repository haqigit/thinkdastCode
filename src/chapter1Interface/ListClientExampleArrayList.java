package chapter1Interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListClientExampleArrayList {
	@SuppressWarnings("rawtypes")
	private List list;

	@SuppressWarnings("rawtypes")
	public ListClientExampleArrayList() {
		list = new ArrayList();
	}

	@SuppressWarnings("rawtypes")
	public List getList() {
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListClientExampleArrayList lce = new ListClientExampleArrayList();
		List list = lce.getList();
		System.out.println(list);
	}
}