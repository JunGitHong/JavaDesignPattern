package jhz.pattern.factory.simplefactory;

/**
 * �򵥹���
 * @author zhj
 *
 */
public class Factory {
	public Person createPerson(String type){
		Person person = null;
		if("stu".equals(type)){
			person = new Student();
		}else if("teac".equals(type)){
			person = new Teacher();
		}
		return person;
	}
}
