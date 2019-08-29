package com.wa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class day03 {
                 public static void main(String[] args) {
         				ArrayList<String> list = new ArrayList<>();
         				list.add("ccc");
         				list.add("ccc");
         				list.add("aaa");
         				list.add("aaa");
         				list.add("bbb");
         				list.add("ddd");
         				list.add("ddd");
         				
         				sort(list);
         				System.out.println(list);
         			}

				private static void sort(ArrayList<String> list) {
					TreeSet<String>ts = new TreeSet<>(new Comparator<String>(){

						
						@Override
						public int compare(String o1, String o2) {
							int num = o1.compareTo(o2);
							return num == 0 ? 1:num;
						}
						
				});
					ts.addAll(list);
					list.clear();
					list.addAll(ts);
				}
}
