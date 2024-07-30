package java240730;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex2 {

	public static void main(String[] args) {
		Integer[] arr = new Integer[] {1,62,31,1,54,31};
		List<Integer> list3 = Arrays.asList(1,62,31,1,54,31);
		Set<Integer> set3 = new HashSet<Integer>(list3);
		
		List<Integer> list = Arrays.asList(1,62,31,1,54,31);
		List<String> list2 = Arrays.asList("홍길동","김길동","홍길동");
		
		
		System.out.println(list);
		System.out.println(list2);
		
		Set<Integer> set1 = new HashSet<>(list);
		System.out.println(set1);
		Set<Integer> set2 = new HashSet<>(list);
		System.out.println(set2);
	}

}
