package cn.tedu.finall;
/*
 * final
 * 		
 * 	修饰方法---最终方法
 * 		可以重载？可以
 * 		可以重写？不可以
 */

public class FinalDemo3 {

}
class FD2{
	//可以重载
	public final void m(){}
	public final void m(int m){}
}
class FD3 extends FD2{
	//不存在重写
	//public final void m(){}
}
