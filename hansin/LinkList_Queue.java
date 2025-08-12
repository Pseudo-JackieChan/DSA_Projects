package com.hansin;
import java.util.LinkedList;
import java.util.Queue;
public class LinkList_Queue {
	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();{
			list.add(1);
			list.add(2);
			list.add(3);
			list.add(4);
			list.add(5);
			list.pop();
			list.pop();
			System.out.println("Elements in the LinkedList: " + list);
			
		}
	}
}
