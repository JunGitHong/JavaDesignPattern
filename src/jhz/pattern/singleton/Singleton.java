package jhz.pattern.singleton;

/**
 * 静态内部类实现单例
 * @author Administrator
 *
 */
public class Singleton {
	private static class LazyHolder {  
	       private static final Singleton INSTANCE = new Singleton();  
	}  
	
    private Singleton (){} 
    
    public static final Singleton getInstance() {  
       return LazyHolder.INSTANCE;  
    }  

}
