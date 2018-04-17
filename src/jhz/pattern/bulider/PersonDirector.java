package jhz.pattern.bulider;
/**
 * �����ߣ�Director����ɫ�����������ɫ������þ��彨���߽�ɫ�Դ�����Ʒ����Ӧ��ָ�����ǣ������߽�ɫ��û�в�Ʒ��ľ���֪ʶ������ӵ�в�Ʒ��ľ���֪ʶ���Ǿ��彨���߽�ɫ��
 * @author zhj
 * @version 1.0.0
 * @date 2018��3��30�� ����1:23:06
 */
public class PersonDirector {
	public PersonBuilder builder;
	
	public PersonDirector(PersonBuilder builder){
		this.builder = builder; 
	}
	
	/**
	 * ����
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
