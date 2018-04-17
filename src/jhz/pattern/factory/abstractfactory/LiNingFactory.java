package jhz.pattern.factory.abstractfactory;

public class LiNingFactory implements AbstractFactory {

	@Override
	public Clothes createClothes() {
		// TODO Auto-generated method stub
		return new LiNingClothes();
	}

	@Override
	public Trousers createTrousers() {
		// TODO Auto-generated method stub
		return new LiNingTrousers();
	}

}
