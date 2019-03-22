package cn.tedu.Object;
/*
 * 铁通僵尸 属性： 血量 方法：被打一次掉2血  直到被打死
 * 帽子僵尸 属性： 血量 方法：被打一次掉5血  直到被打死
 * 封装一个 打僵尸的方法
 */
public class Demo23 {
	public static void main(String[] args) {
		zombie(new TTzombie(40));
		zombie(new MZzombie(50));
	}
	public static void zombie(Zombie zombie){
		zombie.play();
	}

}
//僵尸父类
class Zombie{
	//血量
	private int blood;
	
	
	public int getBlood() {
		return blood;
	}


	public void setBlood(int blood) {
		this.blood = blood;
	}

	//有参构造方法
	public Zombie (int blood){

		this.blood = blood;
	}
	//方法
	public void play(){
		System.out.println("僵尸被打了");
	}
}
//铁桶僵尸
class TTzombie extends Zombie{

	public TTzombie(int blood) {
		super(blood);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		while(true){
			if(this.getBlood() <= 0){
				System.out.println("铁桶僵尸被打死了");
				break ;
			}
			this.setBlood(this.getBlood() - 2);
			System.out.println("铁桶僵尸剩余的血量"+this.getBlood());
		}
	}
}
//帽子僵尸
class MZzombie extends Zombie{

	public MZzombie(int blood) {
		super(blood);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		
			if(this.getBlood() <= 0){
				System.out.println("帽子僵尸被打死了");
				return ;
			}
			this.setBlood(this.getBlood() - 5);
			System.out.println("帽子僵尸剩余血量"+this.getBlood());
			play();
		}
	
}


