package cn.tedu.staticc;

public class StaticDemo4 {
	public static void main(String[] args) {
		//System.out.println(new SDText().i);
		System.out.println(new SDText().x);//4
		System.out.println(new SDText().y);//3
		
		
	}
}

class SDText{
	/*		����
	 * 		��̬��	��һ��	�ڶ���	������
	 *  sd	null	0x001	0x001	0x001
	 *  x	0		1		3		3
	 *  y	0		1		1		1
	 */
	//����staticֻ�����һ�β��ᱨ��
	//����static�ͻᱨ��һֱ�ڴ�������
	static SDText sd = new  SDText();
	static int x = 3;
	static int y ;
	public SDText(){
		x++;
		y++;
	}
	
	
	
	
	
	
	
	
	
	/*int i = 1;
	{
		i += 6;
	}*/
	
	/*{
		i += 3;
	}
	 int i =1 ;*/
	
}