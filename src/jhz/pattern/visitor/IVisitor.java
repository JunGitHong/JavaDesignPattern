package jhz.pattern.visitor;
/**
 * 类说明
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月17日 上午11:19:06
 */
public interface IVisitor {
	/**
     * 对应于NodeA的访问操作
     */
    public void visit(NodeA node);
    /**
     * 对应于NodeB的访问操作
     */
    public void visit(NodeB node);
}
