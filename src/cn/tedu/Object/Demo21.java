package cn.tedu.Object;

public class Demo21 {
	public static void main(String[] args) {
		Per per = new Pz();
		System.out.println(per);
		per.speak();
		
		Pz pz = (Pz)per ;
		System.out.println(pz);
		pz.hit();
	
		
	}

}
class Per{
	public Per(){
		
	}
	
	public void speak(){
		System.out.println("");
	}
}
class Pz extends Per{
	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("Ï´ÄÔ");;
	}
	public void hit(){
		System.out.println("´óÈË");
	}
}
