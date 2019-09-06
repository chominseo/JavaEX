import chapter3.ex5.oop.isa.Exam;

public class Program {

	public static void main(String[] args) {
	VExam exam=new VExam(1,1,1,1);
	
	System.out.printf("total is %d\n",exam.total());
	System.out.printf("avg is %f\n",exam.avg());
		
	
	Exam exam1 = new VExam(1,1,1,1);
	System.out.printf("total is %d\n",exam1.total());
	
	
	}

}
