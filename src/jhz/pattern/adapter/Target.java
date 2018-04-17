package jhz.pattern.adapter;
/**
 * 目标(Target)角色：这就是所期待得到的接口。注意：由于这里讨论的是类适配器模式，因此目标不可以是类。
 * @author zhj
 * @version 1.0.0
 * @date 2018年3月30日 下午2:30:22
 */
public interface Target {
	public void needoperator();
}
