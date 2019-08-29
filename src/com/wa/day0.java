package com.wa;

import java.util.HashSet;
import java.util.Random;

public class day0 {
              public static void main(String[] args) {
				HashSet<Integer>hs = new HashSet<>();
				Random r = new Random();
				while(hs.size()<10){
					int num = r.nextInt(20)+1;
					hs.add(num);
				}
				for(Integer w : hs){
					System.out.print(w+" ");
				}
			}
}
