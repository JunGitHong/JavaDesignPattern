package jhz.pattern.bulider;
/**
 * ������ģʽ����һ�����ӵĹ��������ʾ����룬ʹ��ͬ���Ĺ������̿��Դ�����ͬ�ı�ʾ��
 * 
 * �������ߣ�Builder����ɫ���� ��һ������ӿڣ��Թ淶��Ʒ����ĸ�����ɳɷֵĽ��졣
 * һ����ԣ��˽ӿڶ�����Ӧ�ó������ҵ�߼���ģʽ��ֱ�Ӵ�����Ʒ������Ǿ��彨���� (ConcreteBuilder)��ɫ�����彨���������ʵ������ӿ���Ҫ������ַ�����һ���ǽ��췽��(buildPart1�� buildPart2)����һ���Ƿ����ṹ����(retrieveResult)��
 * һ����˵����Ʒ�������������Ŀ�뽨�췽������Ŀ���������֮���ж��� ��������ж�����Ӧ�Ľ��췽����
 * @author zhj
 * @version 1.0.0
 * @date 2018��3��30�� ����1:13:51
 */
public interface PersonBuilder {
	void buildHead();
	void buildBody();
	void buildFoot();
	
	Person buildPerson();
}
