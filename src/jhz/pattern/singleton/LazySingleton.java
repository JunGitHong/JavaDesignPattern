package jhz.pattern.singleton;

/**
 * 懒汉模式
 * 懒汉式是典型的时间换空间,就是每次获取实例都会进行判断，看是否需要创建实例，浪费判断的时间。当然，如果一直没有人使用的话，那就不会创建实例，则节约内存空间。
 * 由于懒汉式的实现是线程安全的，这样会降低整个访问的速度，而且每次都要判断。
 * @author zhj
 *
 */
public class LazySingleton {
	private static LazySingleton instance = null;
	
	
	private LazySingleton(){
		
	}
	
	/**
	 * 静态工厂方法使用了同步化synchronized，以处理多线程环境
	 * @return
	 */
//	public static synchronized LazySingleton getInstance(){
//		if(instance == null){
//			instance = new LazySingleton();
//		}
//		return instance;
//	}
	
	
	/**
	 * 双重检查锁定实现
	 * 这种实现方式既可以实现线程安全地创建实例，而又不会对性能造成太大的影响。它只是第一次创建实例的时候同步，以后就不需要同步了，从而加快了运行速度。
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
