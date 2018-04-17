package jhz.pattern.visitor;
/**
 * 类说明
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月17日 上午11:19:34
 */
public abstract class Node {
	/**
     * 接受操作
     */
    public abstract void accept(IVisitor visitor);
}
