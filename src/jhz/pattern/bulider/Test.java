package jhz.pattern.bulider;
/**
 * �ͻ��˸��𴴽������ߺ;��彨���߶���Ȼ�󣬿ͻ��˰Ѿ��彨���߶��󽻸������ߣ������߲������彨���ߣ���ʼ������Ʒ������Ʒ��ɺ󣬽����߰Ѳ�Ʒ�������ͻ��ˡ�
 * �Ѵ������彨���߶�������񽻸��ͻ��˶����ǵ����߶�����Ϊ�˽������߶�������彨���߶������ϱ�ɶ�̬�ģ��Ӷ�ʹ�����߶�����Բ����������彨���߶����е��κ�һ����
 * @author zhj
 * @version 1.0.0
 * @date 2018��3��30�� ����1:29:12
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonBuilder builder = new BoyBuilder();
		//�����ߵ��ý����ߴ�����Ʒ
		PersonDirector director = new PersonDirector(builder);
		Person person = director.construct();
		
//		Person person = builder.buildPerson();
		System.out.println(person.getHead()+","+person.getBody()+","+person.getFoot());
	}

}
