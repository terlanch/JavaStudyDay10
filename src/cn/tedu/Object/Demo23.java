package cn.tedu.Object;
/*
 * ��ͨ��ʬ ���ԣ� Ѫ�� ����������һ�ε�2Ѫ  ֱ��������
 * ñ�ӽ�ʬ ���ԣ� Ѫ�� ����������һ�ε�5Ѫ  ֱ��������
 * ��װһ�� ��ʬ�ķ���
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
//��ʬ����
class Zombie{
	//Ѫ��
	private int blood;
	
	
	public int getBlood() {
		return blood;
	}


	public void setBlood(int blood) {
		this.blood = blood;
	}

	//�вι��췽��
	public Zombie (int blood){

		this.blood = blood;
	}
	//����
	public void play(){
		System.out.println("��ʬ������");
	}
}
//��Ͱ��ʬ
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
				System.out.println("��Ͱ��ʬ��������");
				break ;
			}
			this.setBlood(this.getBlood() - 2);
			System.out.println("��Ͱ��ʬʣ���Ѫ��"+this.getBlood());
		}
	}
}
//ñ�ӽ�ʬ
class MZzombie extends Zombie{

	public MZzombie(int blood) {
		super(blood);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		
			if(this.getBlood() <= 0){
				System.out.println("ñ�ӽ�ʬ��������");
				return ;
			}
			this.setBlood(this.getBlood() - 5);
			System.out.println("ñ�ӽ�ʬʣ��Ѫ��"+this.getBlood());
			play();
		}
	
}


