package cn.tedu.finall;

public class FinalDemo2 {
	public static void main(String[] args) {
		
		//new FD().i++;
	}
}
class FD{
	
	//����
	//��final���εĳ�Ա������Ҫ�ڴ�������֮ǰ���и�ֵ
	//��final��static��ͬ����---��̬����Ҫ��֤���������֮ǰ���и�ֵ
	static final int i ;
	static{
		i = 1;
	}
	
	/*{
		i = 1;
	}*/
	
	public FD(){
		//i = 9;
	}
	
}