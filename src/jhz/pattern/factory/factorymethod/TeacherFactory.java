package jhz.pattern.factory.factorymethod;

import jhz.pattern.factory.simplefactory.Person;
import jhz.pattern.factory.simplefactory.Teacher;

public class TeacherFactory implements Factory {

	@Override
	public Person createPerson() {
		// TODO Auto-generated method stub
		return new Teacher();
	}

}
