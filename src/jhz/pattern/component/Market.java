package jhz.pattern.component;
/**
 * 
 * @author zhj
 * @version 1.0.0
 * @date 2018��3��30�� ����3:13:00
 */
public abstract class Market {
	
	String name;
	
	public abstract void add(Market c);
	
	public abstract void remove(Market c);
	
	public abstract void pay();
	

}
