package jhz.pattern.bulider;
/**
 * 客户端负责创建导演者和具体建造者对象。然后，客户端把具体建造者对象交给导演者，导演者操作具体建造者，开始创建产品。当产品完成后，建造者把产品返还给客户端。
 * 把创建具体建造者对象的任务交给客户端而不是导演者对象，是为了将导演者对象与具体建造者对象的耦合变成动态的，从而使导演者对象可以操纵数个具体建造者对象中的任何一个。
 * @author zhj
 * @version 1.0.0
 * @date 2018年3月30日 下午1:29:12
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonBuilder builder = new BoyBuilder();
		//导演者调用建造者创建产品
		PersonDirector director = new PersonDirector(builder);
		Person person = director.construct();
		
//		Person person = builder.buildPerson();
		System.out.println(person.getHead()+","+person.getBody()+","+person.getFoot());
	}

}
