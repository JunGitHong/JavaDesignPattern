package jhz.pattern.bulider;
/**
 * 导演者（Director）角色：担任这个角色的类调用具体建造者角色以创建产品对象。应当指出的是，导演者角色并没有产品类的具体知识，真正拥有产品类的具体知识的是具体建造者角色。
 * @author zhj
 * @version 1.0.0
 * @date 2018年3月30日 下午1:23:06
 */
public class PersonDirector {
	public PersonBuilder builder;
	
	public PersonDirector(PersonBuilder builder){
		this.builder = builder; 
	}
	
	/**
	 * 构建
	 */
	public Person construct(){
		builder.buildHead();
		builder.buildBody();
		builder.buildFoot();
		return builder.buildPerson();
	}
	
//	public void construct(){
//		builder.buildHead();
//		builder.buildBody();
//		builder.buildFoot();
//	}
}
