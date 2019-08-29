package com.wa;

import java.util.HashSet;
import java.util.Scanner;

public class day01 {
                      public static void main(String[] args) {
						Scanner sc = new Scanner(System.in);
						System.out.println(" ‰»Î£∫");
						String line = sc.nextLine();
						char[]arr = line.toCharArray();
						HashSet<Character>hs=new HashSet<>();
						for(char c:arr){
							hs.add(c);
						}
						for(Character ch:hs){
							System.out.print(ch
									);
						}
					}
}
