package java240730;

public class Stndent {
	private String name;
	private int score;
	

	public Stndent(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	@Override
	public String toString() {
		return "Stndent [name=" + name + ", score=" + score + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}	
	


