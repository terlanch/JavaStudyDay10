package cn.tedu.Object;

public class Demo22 {
	public  static void Wq(WQ wq){
		wq.play();
		//判断Wq方法调用的参数对象是否是Dao类中的实例，是则返回true
		if(wq instanceof Dao){
			Dao dao = (Dao)wq;
			dao.prictise();
		}
		//判断Wq方法调用的参数对象是否是Gun类中的实例，是则返回true
		if(wq instanceof Gun){
			Gun gun = (Gun)wq;
			gun.practise();
		}
	}
	public static void main(String[] args) {
		Wq(new Dao());
		Wq(new Gun());
	}

}
class WQ{
	public  void play(){
		System.out.println("挥舞武器");
	}
}
class Dao extends WQ{
	@Override
	public  void play() {
		// TODO Auto-generated method stub
		System.out.println("挥舞刀砍人");;
	}
	
	public void prictise(){
		System.out.println("练刀");
	}
}
class  Gun extends WQ{
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("挥舞棍敲人");;
	}
	
	public void practise(){
		System.out.println("练棍");
	}
}