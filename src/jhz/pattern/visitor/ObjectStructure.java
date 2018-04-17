package jhz.pattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 类说明
 * @author zhj
 * @version 1.0.0
 * @date 2018年4月17日 上午11:26:17
 */
public class ObjectStructure {
	 private List<Node> nodes = new ArrayList<Node>();
	    
	    /**
	     * 执行方法操作
	     */
	    public void action(IVisitor visitor){
	        
	        for(Node node : nodes)
	        {
	            node.accept(visitor);
	        }
	        
	    }
	    /**
	     * 添加一个新元素
	     */
	    public void add(Node node){
	        nodes.add(node);
	    }
}
