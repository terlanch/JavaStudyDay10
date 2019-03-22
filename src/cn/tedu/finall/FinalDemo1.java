package cn.tedu.finall;
/*
 * final(最终)
 * 		关键字---修饰符   数据、方法、类
 * 
 * 修饰数据---最终值
 * 		如果修饰的是基本数据类型就是值不改变，如果修饰的
 * 		是引用数据类型就是地址值不改变，元素值可以改变，如
 * 		果修饰的是属性保证对象创建之前有值，如果是静态常量
 * 		保证类加载完成之前有值；
 */

public class FinalDemo1 {
	public static void main(String[] args) {
		//final修饰基本数据类型---值不改变
		final int i = 8;
		
		/*int a = i+7;
		i = ;*/
		//final修饰应用数据类型---地址值不改变
		final int[] arr = {1,2,3};
		/*arr[0] = 6;
		arr = new int[3];*/
	}
}
