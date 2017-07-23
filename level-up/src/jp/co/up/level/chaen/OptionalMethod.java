package jp.co.up.level.chaen;

import java.util.Optional;

public class OptionalMethod {

//	public List<Integer> Optional(OptionalList<Integer> optional) {
//		for (int i=0;i<optional.size();i++) {
//			System.out.println(optional.get(i));
//
//		}
//
//		return null;
//	}
	 int hgTorg (Optional<Integer> hg) {
			return hg.orElse(0);
		}
	 int getDouble (int b) {
		 return b * 2;
	 }

}
