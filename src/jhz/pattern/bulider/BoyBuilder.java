package jhz.pattern.bulider;
/**
 * 
 * ���彨���ߣ�ConcreteBuilder����ɫ�����������ɫ������Ӧ�ó��������ص�һЩ�࣬������Ӧ�ó�������´�����Ʒ��ʵ���������ɫҪ��ɵ����������1.ʵ�ֳ�������Builder�������Ľӿڣ�����һ��һ������ɴ�����Ʒʵ���Ĳ�����2.�ڽ��������ɺ��ṩ��Ʒ��ʵ����
 * @author zhj
 * @version 1.0.0
 * @date 2018��3��30�� ����1:18:56
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
