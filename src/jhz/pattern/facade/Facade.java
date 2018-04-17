package jhz.pattern.facade;
/**
 * 
 * ���ģʽ
 * ����(Facade)��ɫ ���ͻ��˿��Ե��������ɫ�ķ������˽�ɫ֪����صģ�һ�����߶������ϵͳ�Ĺ��ܺ����Ρ�����������£�����ɫ�Ὣ���дӿͻ��˷���������ί�ɵ���Ӧ����ϵͳȥ��
 * ��ϵͳ(SubSystem)��ɫ ������ͬʱ��һ�����߶����ϵͳ��ÿ����ϵͳ������һ���������࣬����һ����ļ��ϣ����������ϵͳ������ModuleA��ModuleB��ModuleC��������϶��ɣ���ÿ����ϵͳ�����Ա��ͻ���ֱ�ӵ��ã����߱������ɫ���á���ϵͳ����֪������Ĵ��ڣ�������ϵͳ���ԣ��������������һ���ͻ��˶��ѡ�
 * ����ģʽ���ŵ㣺
������ɢ���
��������ģʽ��ɢ�˿ͻ�������ϵͳ����Ϲ�ϵ������ϵͳ�ڲ���ģ���ܸ�������չ��ά����
����������
       ����ģʽ����ϵͳ�������ã��ͻ��˲�����Ҫ�˽���ϵͳ�ڲ���ʵ�֣�Ҳ����Ҫ���ڶ���ϵͳ�ڲ���ģ����н�����ֻ��Ҫ�������ཻ���Ϳ����ˡ�
�������õĻ��ַ��ʲ��
����ͨ������ʹ��Facade�����԰������Ǹ��õػ��ַ��ʵĲ�Ρ���Щ�����Ƕ�ϵͳ��ģ���Щ������ϵͳ�ڲ�ʹ�õġ�����Ҫ��¶���ⲿ�Ĺ��ܼ��е������У������ȷ���ͻ���ʹ�ã�Ҳ�ܺõ��������ڲ���ϸ�ڡ�
 * @author zhj
 * @version 1.0.0
 * @date 2018��3��30�� ����4:09:54
 */
public class Facade {
	private ModuleA moduleA = new ModuleA();
	private ModuleB moduleB = new ModuleB();
	
	//
	public void moduleA_1(){
		moduleA.methodA_1();
	}
	
	//
	public void moduleB_1(){
		moduleB.ModuleB_1();
	}
}