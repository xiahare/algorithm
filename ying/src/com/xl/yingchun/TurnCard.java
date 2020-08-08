package com.xl.yingchun;

import java.util.ArrayList;
import java.util.List;

public class TurnCard {

	private static int NUM = 25;

	public static void main(String[] args) {
		/* check if there are some rules
		for(int i=3; i<= 25; i++) {
			compu(i);
		}
		*/
		compu(NUM);
	}
	
	public static void compu(int temnum) {
		
		NUM = temnum;
		List l = new ArrayList();
		for(int i=0; i<NUM; i++) {
			l.add(i);
		}
		
		int count = 0;
		System.out.println("CARD NUM: "+NUM + "  TURNING ......");
		while (true) {
			List t = new ArrayList();

			for(int i=3; i<NUM; i++) {
				t.add(l.get(i));
			}
			t.add(l.get(2));
			t.add(l.get(1));
			t.add(l.get(0));
			count++;
			printlist(count,t);
			if( success(t) ) {
				System.out.println("TURN TIMES: "+count);
				break;
			}
			
			l = t;
		}
	}

	private static void printlist(int count, List t) {
		System.out.println(count + ":" + t);
		
	}

	private static boolean success(List<Integer> t) {
		for (int i=0; i<NUM; i++) {
			if( i != t.get(i)) {
				return false;
			}
		}
		
		return true;
	}
	

}
