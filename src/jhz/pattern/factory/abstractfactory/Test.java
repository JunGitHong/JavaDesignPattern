package jhz.pattern.factory.abstractfactory;

public class Test {

	public static void main(String[] args) {
		AbstractFactory linFactory = new LiNingFactory();
		linFactory.createClothes();
		linFactory.createTrousers();
		
		AbstractFactory nikeFactory = new NikeFactory();
		nikeFactory.createClothes();
		nikeFactory.createTrousers();

	}

}
