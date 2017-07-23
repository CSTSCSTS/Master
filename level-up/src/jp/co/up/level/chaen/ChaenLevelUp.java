package jp.co.up.level.chaen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ChaenLevelUp {
	public static void main(String args[]){
//for(int i = 0;i< 11;i++) {
//		if(i % 3 == 0) {
//			System.out.println("fizz");
//		}
//	}
//		System.out.println("2で割り切れるもの");
//		for(int i = 1;i < 11;i++){
//			if(i % 2 == 0){
//				System.out.println(i);
//			}
//		}
//    System.out.println();
//    System.out.println("3で割り切れるもの");
//    for(int i = 1;i<11; i++){
//    	if(i % 3 == 0){
//    		System.out.println(i);
//    	}
//    }
//    System.out.println();
//    System.out.println("5で割り切れるもの");
//    for(int i = 1;i<11;i++) {
//    	if(i % 5 == 0) {
//    		System.out.println(i);
//    	}
//    }
//
//    System.out.println();
//    System.out.println("fizzbuzz問題");
//    for(int i = 1; i<31; i++){
//    	if(i % 3 == 0 && i % 5 == 0) {
//    		System.out.println("fizzbuzz");
//    	} else if (i % 3 == 0) {
//    		System.out.println("fizz");
//    	} else if (i % 5 == 0) {
//    		System.out.println("buzz");
//    	} else {
//    		System.out.println(i);
//    	}
//    }
//   List<Integer> a = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//    Iterator<Integer> b = a.iterator();
//    while (b.hasNext()) {
//			int s = b.next();
//				System.out.println(s);
//	}
//    for (int hg : a) {
//			if(hg % 3 == 0 ) {
//				System.out.println(hg);
//			}
////		}
//    a.stream().filter(integer -> integer % 5 == 0).forEach(s ->
//    System.out.println(s)
//    );
//    //or
//    a.stream().filter(integer -> integer % 2 == 0).forEach(rg -> {
//    	System.out.println(rg);
//    });

//   List <Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//   for (int i : list) {
//  	 System.out.println(i);
//   }

//   List <Integer> list2 = Arrays.asList(1,2,null,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30);
//   list2.stream()
//   .filter(element -> element<15)
//   .forEach(foo -> System.out.println(foo+10));
 //  Iterator<Integer> loop = list2.iterator();
//   while (loop.hasNext()) {
//  	 int element = loop.next();
//  	 if (element % 3 == 0 && element % 5 == 0) {
//  		 System.out.println("fizzbuzz");
//  	 } else if (element % 3 == 0) {
//  		   System.out.println("fizz");
//  	 } else if (element % 5 == 0) {
//  		   System.out.println("buzz");
//  	 } else {
//  		 System.out.println(element);
//  	 }
//
//
//		List<Integer> listhg = new ArrayList<>();
//		for (int i=1;i<111;i++) {
//			listhg.add(i);
//		}
//		Iterator<Integer> iterator = listhg.iterator();
//		while(iterator.hasNext()){
//			int hg = iterator.next();
//			System.out.println(hg);
//
//		}

		List<Integer> listrg = new ArrayList<>();
		for (int i = 1;i<11;i++) {
			listrg.add(i);
		}
		Iterator<Integer> iterator2 = listrg.iterator();
		while (iterator2.hasNext()) {

			System.out.println(iterator2.next() * 2);

		}
	}
}