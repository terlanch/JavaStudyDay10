package cn.tedu.staticc;
/*
 * ���η���---��̬����
 * 		������ļ��ض����ص��������ľ�̬��������Ծ�̬����
 * 		���и�ֵ��ֻ�Ǵ�ţ��������õ�ʱ���Զ����ص�ջ��ִ
 * 		�С�����ͬ�����෽����ͨ������.����Ҳ����ͨ������
 * 		����
 * 		System.arraycopy()
 * 		Arrays.copyof()
 * 		Arrays.toString()
 * 		Arrays.sort()
 * 		��̬�������Զ��徲̬�����𣿲�����
 * 		��̬���������ʹ��this�������ԣ���̬�������༶��ģ�
 * 		this�Ƕ��󼶱��
 * 		main��̬������ֱ�ӵ��÷Ǿ�̬�����Ժͷ����������ԣ���
 * 		̬��Ϣ����ֱ�ӵ��÷Ǿ�̬����Ϣ���Ǿ�̬�Ŀ���ֱ�ӵ���
 * 		��̬��
 * 		
 * 		��̬������������
 * 		��̬������������д  ��Ϊ��̬��������ͬ��
 * 						��д---��̬---������---����
 * 						��̬����û����д	
 * 		���Ǹ������п��Գ��ַ���ǩ��һ�µ�
 *
 * 		��̬���������и�������Ҫô���Ǿ�̬Ҫô���ǷǾ�̬		
 */
public class StaticDemo1 extends Object {

	public static void main(String[] args) {
		
	}
	

}
class A {
	public static void n(){
		System.out.println("qwe");
	}
}
class B extends A{
	public static void n(){
		System.out.println("asd");
	}
}

