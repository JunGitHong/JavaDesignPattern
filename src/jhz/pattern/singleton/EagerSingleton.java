package jhz.pattern.singleton;

/**
 * ����ģʽ
 * ����ʽ�ǵ��͵Ŀռ任ʱ�䣬����װ�ص�ʱ��ͻᴴ�����ʵ�����������ò��ã��ȴ���������Ȼ��ÿ�ε��õ�ʱ�򣬾Ͳ���Ҫ���жϣ���ʡ������ʱ�䡣
 * @author zhj
 *
 */
public class EagerSingleton {
	
	private static EagerSingleton instance = new EagerSingleton();
	
	private EagerSingleton(){
		
	}
	
	public static EagerSingleton getInstance(){
		return instance;
	}

}
