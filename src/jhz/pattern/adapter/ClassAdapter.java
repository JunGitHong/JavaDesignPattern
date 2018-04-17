package jhz.pattern.adapter;
/**
 * 类适配器模式
 * @author zhj
 * @version 1.0.0
 * @date 2018年3月30日 下午2:35:18
 */
public class ClassAdapter extends Adaptee implements Target {

	@Override
	public void needoperator() {
		System.out.println("特殊操作！");
	}

}
