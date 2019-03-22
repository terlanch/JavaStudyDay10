package cn.tedu.staticc;
/*
 * 修饰方法---静态方法
 * 		随着类的加载而加载到方法区的静态区，不会对静态方法
 * 		进行赋值，只是存放，当被调用的时候自动加载到栈中执
 * 		行。与类同级，类方法，通过类名.调用也可以通过对象
 * 		调用
 * 		System.arraycopy()
 * 		Arrays.copyof()
 * 		Arrays.toString()
 * 		Arrays.sort()
 * 		静态方法可以定义静态变量吗？不可以
 * 		静态方法里可以使用this？不可以，静态方法是类级别的，
 * 		this是对象级别的
 * 		main静态方法，直接调用非静态的属性和方法？不可以，静
 * 		态信息不能直接调用非静态的信息，非静态的可以直接调用
 * 		静态的
 * 		
 * 		静态方法可以重载
 * 		静态方法不可以重写  因为静态方法与类同级
 * 						重写---多态---多样性---对象
 * 						静态方法没有重写	
 * 		但是父子类中可以出现方法签名一致的
 *
 * 		静态方法，所有父子类中要么都是静态要么都是非静态		
 */
public class StaticDemo1 extends Object {

	public static void main(String[] args) {
		
	}
	

}
class A {
	public static void n(){
		System.out.println("qwe");
	}
}
class B extends A{
	public static void n(){
		System.out.println("asd");
	}
}

