package cn.tedu.finall;

public class FinalDemo2 {
	public static void main(String[] args) {
		
		//new FD().i++;
	}
}
class FD{
	
	//属性
	//被final修饰的成员变量需要在创建对象之前进行赋值
	//被final和static共同修饰---静态常量要保证在类加载完之前进行赋值
	static final int i ;
	static{
		i = 1;
	}
	
	/*{
		i = 1;
	}*/
	
	public FD(){
		//i = 9;
	}
	
}