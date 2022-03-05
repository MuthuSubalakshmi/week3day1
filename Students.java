package overload.student;



public class Students {
public int getStudentInfo(int id)
{
	System.out.println(id);
	return id;
}
public String getStudentInfo(int id,String name)
{
System.out.println(name);
return name;

	
}
public int getStudentInfo(String email,int mobilenum)
{
	System.out.println(email);
	System.out.println(mobilenum);
	return mobilenum;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Students s1=new Students();
s1.getStudentInfo(3);
s1.getStudentInfo(2, "suba");
s1.getStudentInfo("suba",222);
	}

}
