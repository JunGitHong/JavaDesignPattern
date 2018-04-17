package jhz.pattern.factory.abstractfactory;

public class NikeFactory implements AbstractFactory {

	@Override
	public Clothes createClothes() {
		// TODO Auto-generated method stub
		return new NikeClothes();
	}

	@Override
	public Trousers createTrousers() {
		// TODO Auto-generated method stub
		return new NikeTrousers();
	}

}
