package code.innerClass;


public class StudentInfo {
	
	class StudentFamilyInfo{
		private String dad;
		private String mom; 
		private int dadAge;
		private int momAge;
		public StudentFamilyInfo( String dad, String mom) {
			super();
			this.dad = dad;
			this.mom = mom;
		}
		public StudentFamilyInfo(int dadAge, int momAge) {
			super();
			this.dadAge = dadAge;
			this.momAge = momAge;
		}
		String ReadStudentFamilyNameInfo(){
			return  dad+" "+mom;
		}
		String ReadStudentFamilyAgeInfo(){
			return  dadAge+" "+momAge;
		}
	}
	class StudentUniversityInfo{
		private String universityName;
		StudentUniversityInfo(String name){
			this.universityName = name;
		}
		String readStudentUniversityInfo(){
			return universityName;
		}
	}
	public StudentFamilyInfo sfi(String dad, String mom){
		return new StudentFamilyInfo( dad, mom);
	}
	public StudentFamilyInfo sfi2(int dadAge, int momAge){
		return new StudentFamilyInfo( dadAge, momAge);
	}
	public void integrate(String universityName, String DadName, 
			String MomName, int dadAge, int momAge){
		StudentFamilyInfo sf = new StudentFamilyInfo(DadName, MomName);
		System.out.println(sf.ReadStudentFamilyNameInfo());
		StudentFamilyInfo sf2 = new StudentFamilyInfo(dadAge, momAge);
		System.out.println(sf2.ReadStudentFamilyAgeInfo());
		StudentUniversityInfo su = new StudentUniversityInfo
				(universityName);
		System.out.println(su.readStudentUniversityInfo());
		
	}
	public static void main(String args[]){
		StudentInfo si = new StudentInfo();
		si.integrate("Peking University","Zhangkang","Jiran",25,25);
		
		//典型用法：外部类有一个方法， 该方法返回一个指向内部类的引用，eg: cFamilyInfo / cFamilyInfo2
		StudentInfo.StudentFamilyInfo cFamilyInfo = si.sfi("zhang", "ji");
		StudentInfo.StudentFamilyInfo cFamilyInfo2 = si.sfi2(28, 25);
	}
}
