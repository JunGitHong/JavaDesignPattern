package jhz.pattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * ��˵��
 * @author zhj
 * @version 1.0.0
 * @date 2018��4��17�� ����11:26:17
 */
public class ObjectStructure {
	 private List<Node> nodes = new ArrayList<Node>();
	    
	    /**
	     * ִ�з�������
	     */
	    public void action(IVisitor visitor){
	        
	        for(Node node : nodes)
	        {
	            node.accept(visitor);
	        }
	        
	    }
	    /**
	     * ���һ����Ԫ��
	     */
	    public void add(Node node){
	        nodes.add(node);
	    }
}
