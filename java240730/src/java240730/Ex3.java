package java240730;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex3 {

	public static void main(String[] args) {
		List<Stndent> list = new ArrayList<>();
		list.add(new Stndent("Ken", 100));
		list.add(new Stndent("Shin", 60));
		list.add(new Stndent("Kim", 80));
		
		Collections.sort(list, (s1,s2)->Integer.compare(s1.getScore(), s2.getScore()));
		
		list.stream().forEach(s->{
			System.out.println(s.getName()+","+s.getScore());
		});

	}

}
