package jhz.pattern.factory.factorymethod;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory stuFcFactory = new StudentFactory();
		stuFcFactory.createPerson();
		
		Factory teachFactory = new TeacherFactory();
		teachFactory.createPerson();
	}

}
