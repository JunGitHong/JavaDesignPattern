package jhz.pattern.decorator;
/**
 * 具体被装饰者
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月2日 上午10:39:39
 */
public class Programmer implements IProgrammer {

	@Override
	public void useSkill() {
		System.out.println("我现在只会java！");
	}

}
