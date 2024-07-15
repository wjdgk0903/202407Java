package dp2;

public class Main {
	
	public static void main(String[] args) {
		Student s1 = new Student("민수");
		Student s2 = new Student("길동");
		
		Course c1 = new Course("자바");
		Course c2 = new Course("C/C++");
		
		Transcript t1 = new Transcript(c1, s1, "2024년 2학기", "A"); //민수 성적등록 자바
		Transcript t2 = new Transcript(c2, s2, "2024년 2학기", "B"); // 길동
		Transcript t3 = new Transcript(c1, s1, "2024년 2학기", "A+"); // 민수
		
		s1.addTranscript(t1);
		s2.addTranscript(t2);
		s1.addTranscript(t3);
		
		c1.addTranscript(t1);
		c1.addTranscript(t2);
		
		c2.addTranscript(t3);
		
		for (Transcript transcript : s1.getTranscript()) {
			System.out.println(transcript.getCourse().getName()+",");
			System.out.println(transcript.getGrade());
		}
		System.out.println("-------------------");
		
		for (Transcript transcript : c1.getTranscript()) {
			System.out.println(transcript.getStudent().getName()+",");
			System.out.println(transcript.getGrade());
		}
	}

}
