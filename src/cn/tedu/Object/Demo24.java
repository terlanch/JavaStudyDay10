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
		System.out.println("电脑已启动");
	}
	public void insertCard(Card card){
		card.start();
		card.stop();
	}
	
}
//卡 --父类
class Card{
	//方法
	public void start(){
		System.out.println("卡插入");
	}
	public void stop(){
		System.out.println("卡拔出");
	}
}
//英语卡
class MusicCard extends Card{
	//
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("音乐已播放");
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("音乐已停止");
	}
	
}
class NetCard extends Card{
	//
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("网络已开始");
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("网络已停止");
	}
}