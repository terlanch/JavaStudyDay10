package cn.tedu.Object;

public class Demo20 {
	
	public static void main(String[] args) {
		Anim anim1 = new Cat("����","С");
		Anim anim2 = new Dog("snoopy","��");
		anim1.speak();
		System.out.println(anim1);
		anim2.speak();
		System.out.println(anim2);
	}
	
}
class Anim{
	String name;
	String kind;
	
	public Anim(){
		
	}
	public Anim(String name,String kind){
		this.name = name;
		this.kind = kind;
	}
	
	public void speak(){
		System.out.println("����ᷢ������");
	}
}
class Cat extends Anim{
	public Cat(){
		
	}
	public Cat(String name,String kind){
		this.name = name;
		this.kind = kind;
	}
	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("������");;
	}
}
class  Dog extends Anim{
	public Dog(){
		
	}
	public Dog(String name,String kind){
		super.kind = kind;
		this.name = name;
	}
	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("������");;
	}
}