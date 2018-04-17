package jhz.pattern.factory.factorymethod;

import jhz.pattern.factory.simplefactory.Person;
import jhz.pattern.factory.simplefactory.Student;

public class StudentFactory implements Factory {

	@Override
	public Person createPerson() {
		// TODO Auto-generated method stub
		return new Student();
	}

}
