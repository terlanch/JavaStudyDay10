package cn.tedu.staticc;
/*
 * static(静态)
 * 		关键字---修饰符 变量、方法、代码块、内部类
 * 
 * 修饰变量---静态变量
 * 		静态变量是随着类（所有信息）的加载（方法去
 * 		的静态常量池）而加载静态区，接着赋予初始值。
 * 		静态变量也叫类变量（所以静态变量与类同级），
 * 		类优先对象先存在，可以通过类名.的形式调用
 * 		静态变量也可以通过对象调用。
 * 		静态变量底层就是一个被所有对象共享的地址-
 * 		--全局就一份
 * 		静态变量---共享---属性是否适合共享?
 * 		
 * 		方法中可以定义静态变量？不可以，方法要等到
 * 		调用的时候内容才执行，静态变量与类同级
 * 
 * 		
 */
public class StaticDemo {
	public static void main(String[] args) {
		//创建对象
		Person person  = new Person();
		//赋值
		person.name = "lili";
		person.age = 18;
		person.gender = '女';
		Person person2 = new Person();
		person2.name = "lulu";
		person2.age = 19;
		person2.gender ='男';
		
		System.out.println(person);//输出结果：lili 18 女
		System.out.println(person2);//输出结果：lulu 19 男
	}
}
//person类
class Person{
	//属性
	String name;
	static int age =1;
	//static 修饰变量
	static char gender;
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+" "+age+" "+gender;
	}
}
