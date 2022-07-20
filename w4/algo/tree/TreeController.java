package aco.w4.algo.tree;

import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;

import java.util.List;

public class TreeController implements ITreeController {

    @Override
    public Integer getAmount(Link link) throws Exception {

        List<Link> children = link.getChildren();
        int myRes = (Integer) link.getData();

         if (link == null){
             throw new Exception("Tree is empty");
         }
         if  (link.getChildren() == null || link.getChildren().isEmpty()) {
             return (Integer)  link.getData();
         }

         int amount = 0;
        for (int i = 0; i <children.size() ; i++) {

            Link child = children.get(i);
            int childRes = getAmount(child);
            amount += childRes;

        }
        return amount + myRes;
    }
}
