
public class App {

	public static void main(String[] args) {
		TeacherFactory factory = new TeacherFactory();
		
		Teacher teacher = factory.getTeacher(TeacherType.mathTeacher);
		teacher.teachSubject();
	}
	
}
