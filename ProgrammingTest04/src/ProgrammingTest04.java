import java.util.ArrayList;
import java.util.Iterator;

class Student {
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int sum;
	private double ave;
	
	public Student(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	public String getName() {
		return name;
	}
	
	public int getKor() {
		return kor;
	}
	
	public int getEng() {
		return eng;
	}
	
	public int getMat() {
		return mat;
	}
	
	public int getSum() {
		return (this.kor + this.eng + this.mat);
	}
	
	public double getAve() {
		return (double)(getSum())/3;
	}
		
	public void setName(String name) {
		this.name = name;
	}
	
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public void setMat(int mat) {
		this.mat = mat;
	}
	
	public void setSum(int sum) {
		this.sum = sum;
	}
	
	public void setAve(double ave) {
		this.ave = ave;
	}
	
	public String toString() {
		return "Student [name=" + name + ", kor= " + kor + ", "
				+ "eng=" + eng + ", mat=" + mat + ", sum=" 
				+ getSum() + ", " + "ave=" + getAve() + "]";
	}
	
}

public class ProgrammingTest04 {
	public static void main(String[] args) {
		Student[] Student = new Student[] {
				new Student("동백" , 95, 90, 88),
				new Student("황용식", 88, 85, 78),
				new Student("강종렬", 77, 65, 72),
				new Student("제시카", 96, 93 ,92),
				new Student("노규태", 66, 84, 73)
		};
		
		
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		for(int i = 0; i<Student.length; i++) {
			studentList.add(Student[i]);
		}
		
		for(int i = 0; i<studentList.size(); i++) {
			System.out.println(studentList.get(i));
		}
		
		System.out.println("- 황용식의 영어 점수를 95점으로 수정 -");
		for(int i =0; i<studentList.size(); i++) {
			if(studentList.get(i).getName().equals("황용식")) {
				studentList.get(i).setEng(95);
			}
		}
		for(int i = 0; i<studentList.size(); i++) {
			System.out.println(studentList.get(i));
		}
		
		System.out.println("--- Iterator를 이용하여 출력 ---");
		Iterator<Student> it = studentList.iterator();
		while(it.hasNext()) {
			Student a = it.next();
			System.out.println(a);
		}
		
	}

}
