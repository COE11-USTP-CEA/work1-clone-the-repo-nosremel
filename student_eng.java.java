
class student_eng{
	public static void main(String[] args){
	
	EngStudent es = new EngStudent();

	es.setDept("CEA");
	es.setName("Nosremel");

	System.out.println("Enginering Students");
	System.out.println("--------------------");
	System.out.println("Department: "+es.getDept() );
	System.out.println("Name: "+es.getName() );
	}
}
