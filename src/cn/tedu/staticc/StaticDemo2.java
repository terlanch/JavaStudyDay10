package cn.tedu.staticc;
/*
 * ���δ����---��̬�����
 * 		�ڷ���������static{}��������ļ��ض�����ֻ����һ�Σ���
 * 		static���ε����ݶ�ֻ����һ�Σ���̬
 */

public class StaticDemo2 {
	public static void main(String[] args) {
		new SD();
		
				
	}

}
class SD1{
	static{
		System.out.println("��̬�����1");
	}
	
	{
		System.out.println("��������1");
	}
}
class SD extends SD1{
	
	//����
	int i;
	//��̬�����   ������ļ��ض����ص���ֻ����һ�Σ���statici���ε����ݶ�ֻ����һ�Σ� 
	//����ͬ��
	static{
		System.out.println("��̬�����");
	}
	
	{
		System.out.println("��������");
	}
	
	public SD() {
		System.out.println("�����޲ι���");
	}
}
