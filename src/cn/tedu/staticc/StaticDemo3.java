
package cn.tedu.staticc;

public class StaticDemo3 {
	public static void main(String[] args) {
		new DB();
		
	}
}

class DA{
	
	/*static DC d;
	���������һ�����𣬵������Ժ͹�������ִ��˳��һ��
	˭��ǰ��˭��ִ��*/
	static{
		System.out.println("DA 1");
	}
	DD dd =new DD();
	{
		System.out.println("DA 2");
	}
	
	public DA(){
		System.out.println("DA 3");
	}
	
}
class DB extends DA{
	static{
		System.out.println("DB 1");
	}
	
	{
		System.out.println("DB 2");
	}
	
	public DB() {
		System.out.println("DB 3");
		// TODO Auto-generated constructor stub
	}
}
class DC{
	public DC() {
		System.out.println("DC");
		// TODO Auto-generated constructor stub
	}
}

class DD extends DC{
	public DD() {
		System.out.println("DD");
		// TODO Auto-generated constructor stub
	}
}
