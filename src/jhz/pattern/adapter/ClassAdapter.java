package jhz.pattern.adapter;
/**
 * ��������ģʽ
 * @author zhj
 * @version 1.0.0
 * @date 2018��3��30�� ����2:35:18
 */
public class ClassAdapter extends Adaptee implements Target {

	@Override
	public void needoperator() {
		System.out.println("���������");
	}

}
