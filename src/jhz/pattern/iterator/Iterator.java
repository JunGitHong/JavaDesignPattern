package jhz.pattern.iterator;
/**
 * 迭代模式
 * 迭代子模式又叫游标(Cursor)模式，是对象的行为模式。迭代子模式可以顺序地访问一个聚集中的元素而不必暴露聚集的内部表象（internal representation）。
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月13日 下午3:05:49
 */
public interface Iterator {
	/**
	 * 
	 * 迭代子模式涉及到以下几个角色：
　　●　　抽象迭代子(Iterator)角色：此抽象角色定义出遍历元素所需的接口。
　　●　　具体迭代子(ConcreteIterator)角色：此角色实现了Iterator接口，并保持迭代过程中的游标位置。
　　●　　聚集(Aggregate)角色：此抽象角色给出创建迭代子(Iterator)对象的接口。
　　●　　具体聚集(ConcreteAggregate)角色：实现了创建迭代子(Iterator)对象的接口，返回一个合适的具体迭代子实例。
　　●　　客户端(Client)角色：持有对聚集及其迭代子对象的引用，调用迭代子对象的迭代接口，也有可能通过迭代子操作聚集元素的增加和删除。
	
	 * Fail Fast
	 *  如果一个算法开始之后，它的运算环境发生变化，使得算法无法进行必需的调整时，这个算法就应当立即发出故障信号。这就是Fail Fast的含义。
　　		如果聚集对象的元素在一个动态迭代子的迭代过程中发生变化时，迭代过程会受到影响而变得不能自恰。这时候，迭代子就应当立即抛出一个异常。这种迭代子就是实现了Fail Fast功能的迭代子。
	Fail Fast在JAVA聚集中的使用
　　		JAVA语言以接口java.util.Iterator的方式支持迭代子模式，Collection接口要求提供iterator()方法，此方法在调用时返还一个Iterator类型的对象。而作为Collection接口的子类型，AbstractList类的内部成员类Itr便是实现Iterator接口的类。
	 	AbstractList.Itr迭代子是一个Fail Fast的迭代子。
	 	
	 	迭代模式的优点
　　（1）迭代子模式简化了聚集的接口。迭代子具备了一个遍历接口，这样聚集的接口就不必具备遍历接口。
　　（2）每一个聚集对象都可以有一个或多个迭代子对象，每一个迭代子的迭代状态可以是彼此独立的。因此，一个聚集对象可以同时有几个迭代在进行之中。
　　（3）由于遍历算法被封装在迭代子角色里面，因此迭代的算法可以独立于聚集角色变化。
	 * 
	 */
	
	public void first();
	
	public void next();
	
	public boolean isDone();
	
	public Object currentItem();
	
}
