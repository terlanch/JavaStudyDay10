package cn.tedu.Object;

public class Demo22 {
	public  static void Wq(WQ wq){
		wq.play();
		//�ж�Wq�������õĲ��������Ƿ���Dao���е�ʵ�������򷵻�true
		if(wq instanceof Dao){
			Dao dao = (Dao)wq;
			dao.prictise();
		}
		//�ж�Wq�������õĲ��������Ƿ���Gun���е�ʵ�������򷵻�true
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
		System.out.println("��������");
	}
}
class Dao extends WQ{
	@Override
	public  void play() {
		// TODO Auto-generated method stub
		System.out.println("���赶����");;
	}
	
	public void prictise(){
		System.out.println("����");
	}
}
class  Gun extends WQ{
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("���������");;
	}
	
	public void practise(){
		System.out.println("����");
	}
}