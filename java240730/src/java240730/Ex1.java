package java240730;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class Ex1 {

	public static void main(String[] args) {
		List<Stndent> list = new ArrayList<>();
		list.add(new Stndent("Ken", 100));
		list.add(new Stndent("Shin", 60));
		list.add(new Stndent("Kim", 80));
		
		long num = list.stream().filter(s->s.getScore() >= 70).count();
		System.out.println("70점 이상은" + num + "명");
		
		list.stream().filter(s->s.getScore() >= 70)
		.forEach(s->System.out.println(s.getName()));
		
		// 점수가 70점 미만인 사람은 리스트에서 삭제
//		for(int i=0; i< list.size(); i++) {
//			if (list.get(i).getScore()<70) {
//				list.remove(i);
//			}
//		}
		
		list.stream().forEach(a->{
			String msg = MessageFormat.format("{0},{1}", a.getName(), a.getScore());
			System.out.println(msg);
		});
		
		
		for (Stndent st: list) {
			String msg = MessageFormat.format("{0}, {1}", st.getName(), st.getScore());
			System.out.println(msg);
		}

	}

}
