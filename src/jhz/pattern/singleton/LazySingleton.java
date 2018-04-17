package jhz.pattern.singleton;

/**
 * ����ģʽ
 * ����ʽ�ǵ��͵�ʱ�任�ռ�,����ÿ�λ�ȡʵ����������жϣ����Ƿ���Ҫ����ʵ�����˷��жϵ�ʱ�䡣��Ȼ�����һֱû����ʹ�õĻ����ǾͲ��ᴴ��ʵ�������Լ�ڴ�ռ䡣
 * ��������ʽ��ʵ�����̰߳�ȫ�ģ������ή���������ʵ��ٶȣ�����ÿ�ζ�Ҫ�жϡ�
 * @author zhj
 *
 */
public class LazySingleton {
	private static LazySingleton instance = null;
	
	
	private LazySingleton(){
		
	}
	
	/**
	 * ��̬��������ʹ����ͬ����synchronized���Դ�����̻߳���
	 * @return
	 */
//	public static synchronized LazySingleton getInstance(){
//		if(instance == null){
//			instance = new LazySingleton();
//		}
//		return instance;
//	}
	
	
	/**
	 * ˫�ؼ������ʵ��
	 * ����ʵ�ַ�ʽ�ȿ���ʵ���̰߳�ȫ�ش���ʵ�������ֲ�����������̫���Ӱ�졣��ֻ�ǵ�һ�δ���ʵ����ʱ��ͬ�����Ժ�Ͳ���Ҫͬ���ˣ��Ӷ��ӿ��������ٶȡ�
	 * @return
	 */
	public static LazySingleton getInstance() {
        if (instance == null) {  
            synchronized (LazySingleton.class) {  
               if (instance == null) {  
            	   instance = new LazySingleton(); 
               }  
            }  
        }  
        return instance; 
    }

}
