package cn.tedu.staticc;
/*
 * 修饰代码块---静态代码块
 * 		在方法外类内static{}，随着类的加载而加载只加载一次（被
 * 		static修饰的内容都只加载一次）静态
 */

public class StaticDemo2 {
	public static void main(String[] args) {
		new SD();
		
				
	}

}
class SD1{
	static{
		System.out.println("静态代码块1");
	}
	
	{
		System.out.println("构造代码块1");
	}
}
class SD extends SD1{
	
	//属性
	int i;
	//静态代码块   随着类的加载而加载但是只加载一次（被statici修饰的内容都只加载一次） 
	//与类同级
	static{
		System.out.println("静态代码块");
	}
	
	{
		System.out.println("构造代码块");
	}
	
	public SD() {
		System.out.println("子类无参构造");
	}
}
