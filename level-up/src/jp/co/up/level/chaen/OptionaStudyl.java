package jp.co.up.level.chaen;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
public class OptionaStudyl {
	public static void main(String args[]) {

//  	List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
//
//  	for (int i = 0; i < list.size(); i++) {
//
//    }
		OptionalMethod a = new OptionalMethod();
		List<Integer> list2 = Arrays.asList(1,2,null,4,5,6,null);
		for (int i = 0;i<list2.size();i++) {
			System.out.println(a.hgTorg(Optional.ofNullable(list2.get(i))));
		}
//		OptionalMethod a = new OptionalMethod();
//		a.Optional(Optional.ofNullable(list2));



	}



}
