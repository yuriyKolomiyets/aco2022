package aco.w4.algo.tree;

import java.util.List;

public class TreeController implements ITreeController {

    @Override
    public Integer getAmount(Link link) {

        List<Link> children = link.getChildren();
        int myRes = (Integer) link.getData();

         if (link == null){
             return null;
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
