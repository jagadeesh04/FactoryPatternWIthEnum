
public enum TeacherType {

	scienceTeacher{
		public Teacher getTeacher(){
			return new ScienceTeacher();
		}
	},
	mathTeacher{
		public Teacher getTeacher(){
			return new MathTeacher();
		}
	},
	socialTeacher{
		public Teacher getTeacher(){
			return new SocialTeacher();
		}
	};
	
	public abstract Teacher getTeacher();
	
}
