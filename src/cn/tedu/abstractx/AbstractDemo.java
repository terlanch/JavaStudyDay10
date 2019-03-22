package cn.tedu.abstractx;
/*
 *	abstract（抽象）例子看-->Day09/src/cn/tedu/Object/ShapeDemo.java
 * 		
 * 		关键字---修饰符  方法 类
 * 		如果父类的某个方法被所有的子类进行了不同程度的重写
 * 		，那么此时这个方法的方法体就没有了实际意义，就把方
 * 		法体去掉用abstract修饰就变成了抽象方法，如果一个类
 * 		中存在抽象方法，那么这个类就要变成抽象类，如果一个普
 * 		类继承了抽象类就要把所有的抽象方法进行重写，如果不想
 * 		全部重写就把普通类变成抽象类
 * 
 * 		抽象类中一定含有抽象方法？ 不一定
 * 		抽象类有没有对象？没有对象，因为抽象类也是类，就含有
 * 		构造方法就可以创建对象，但是这个对象是由底层C语言来
 * 		创建的，java拿不到就相当于没有这个对象。
 */
public class AbstractDemo {

}
