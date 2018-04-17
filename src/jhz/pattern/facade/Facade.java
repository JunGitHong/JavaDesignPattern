package jhz.pattern.facade;
/**
 * 
 * 外观模式
 * 门面(Facade)角色 ：客户端可以调用这个角色的方法。此角色知晓相关的（一个或者多个）子系统的功能和责任。在正常情况下，本角色会将所有从客户端发来的请求委派到相应的子系统去。
 * 子系统(SubSystem)角色 ：可以同时有一个或者多个子系统。每个子系统都不是一个单独的类，而是一个类的集合（如上面的子系统就是由ModuleA、ModuleB、ModuleC三个类组合而成）。每个子系统都可以被客户端直接调用，或者被门面角色调用。子系统并不知道门面的存在，对于子系统而言，门面仅仅是另外一个客户端而已。
 * 门面模式的优点：
　　松散耦合
　　门面模式松散了客户端与子系统的耦合关系，让子系统内部的模块能更容易扩展和维护。
　　简单易用
       门面模式让子系统更加易用，客户端不再需要了解子系统内部的实现，也不需要跟众多子系统内部的模块进行交互，只需要跟门面类交互就可以了。
　　更好的划分访问层次
　　通过合理使用Facade，可以帮助我们更好地划分访问的层次。有些方法是对系统外的，有些方法是系统内部使用的。把需要暴露给外部的功能集中到门面中，这样既方便客户端使用，也很好地隐藏了内部的细节。
 * @author zhj
 * @version 1.0.0
 * @date 2018年3月30日 下午4:09:54
 */
public class Facade {
	private ModuleA moduleA = new ModuleA();
	private ModuleB moduleB = new ModuleB();
	
	//
	public void moduleA_1(){
		moduleA.methodA_1();
	}
	
	//
	public void moduleB_1(){
		moduleB.ModuleB_1();
	}
}
