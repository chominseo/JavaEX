 import chapter3.ex5.oop.isa.Exam;

public class VExam extends Exam {
	
	private int com;
	
	public VExam() {
		
	}

	public VExam(int kor, int eng, int math,int com) {
		
		super(kor,eng,math);
		this.com=com;
	}
	
	@Override
	public int total() {
		return super.total()+com;
	}
	@Override
	public float avg() {
		return this.total()/4.0f;
	}
}
