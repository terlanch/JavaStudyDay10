package cn.tedu.staticc;
/*
 * static(��̬)
 * 		�ؼ���---���η� ����������������顢�ڲ���
 * 
 * ���α���---��̬����
 * 		��̬�����������ࣨ������Ϣ���ļ��أ�����ȥ
 * 		�ľ�̬�����أ������ؾ�̬�������Ÿ����ʼֵ��
 * 		��̬����Ҳ������������Ծ�̬��������ͬ������
 * 		�����ȶ����ȴ��ڣ�����ͨ������.����ʽ����
 * 		��̬����Ҳ����ͨ��������á�
 * 		��̬�����ײ����һ�������ж�����ĵ�ַ-
 * 		--ȫ�־�һ��
 * 		��̬����---����---�����Ƿ��ʺϹ���?
 * 		
 * 		�����п��Զ��徲̬�����������ԣ�����Ҫ�ȵ�
 * 		���õ�ʱ�����ݲ�ִ�У���̬��������ͬ��
 * 
 * 		
 */
public class StaticDemo {
	public static void main(String[] args) {
		//��������
		Person person  = new Person();
		//��ֵ
		person.name = "lili";
		person.age = 18;
		person.gender = 'Ů';
		Person person2 = new Person();
		person2.name = "lulu";
		person2.age = 19;
		person2.gender ='��';
		
		System.out.println(person);//��������lili 18 Ů
		System.out.println(person2);//��������lulu 19 ��
	}
}
//person��
class Person{
	//����
	String name;
	static int age =1;
	//static ���α���
	static char gender;
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+" "+age+" "+gender;
	}
}
