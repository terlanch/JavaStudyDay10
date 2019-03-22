package cn.tedu.Object;

public class Demo24 {
	public static void main(String[] args) {
		KeyBoard keyBoard = new KeyBoard();
		keyBoard.run();
		keyBoard.insertCard(new MusicCard());
		keyBoard.insertCard(new NetCard());
	}

}
class KeyBoard{
	public void run(){
		System.out.println("����������");
	}
	public void insertCard(Card card){
		card.start();
		card.stop();
	}
	
}
//�� --����
class Card{
	//����
	public void start(){
		System.out.println("������");
	}
	public void stop(){
		System.out.println("���γ�");
	}
}
//Ӣ�￨
class MusicCard extends Card{
	//
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("�����Ѳ���");
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("������ֹͣ");
	}
	
}
class NetCard extends Card{
	//
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("�����ѿ�ʼ");
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("������ֹͣ");
	}
}