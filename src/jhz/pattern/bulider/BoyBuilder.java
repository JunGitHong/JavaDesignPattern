package jhz.pattern.bulider;
/**
 * 
 * 具体建造者（ConcreteBuilder）角色：担任这个角色的是与应用程序紧密相关的一些类，它们在应用程序调用下创建产品的实例。这个角色要完成的任务包括：1.实现抽象建造者Builder所声明的接口，给出一步一步地完成创建产品实例的操作。2.在建造过程完成后，提供产品的实例。
 * @author zhj
 * @version 1.0.0
 * @date 2018年3月30日 下午1:18:56
 */
public class BoyBuilder implements PersonBuilder {
	
	private Person person;
	
	public BoyBuilder(){
		person = new Person();
	}

	@Override
	public void buildHead() {
		// TODO Auto-generated method stub
		person.setHead("boyHead");
	}

	@Override
	public void buildBody() {
		// TODO Auto-generated method stub
		person.setBody("boybody");
	}

	@Override
	public void buildFoot() {
		// TODO Auto-generated method stub
		person.setFoot("boyfoot");
	}

	@Override
	public Person buildPerson() {
		// TODO Auto-generated method stub
		return person;
	}

}
