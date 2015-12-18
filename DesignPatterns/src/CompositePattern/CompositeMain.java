package CompositePattern;

import Utils.Utils;

/**
 * Created by smile on 2015/12/16.
 * 组合模式:
 * 组合模式又叫部分-整体模式在处理类似树形结构的问题时比较方便
 * 使用场景:
 * 将多个对象组合在一起进行操作,常用于表示树形结构中.例如二叉树 数等
 */
public class CompositeMain {

    private TreeNode treeNode=null;

    public CompositeMain(String name){
        treeNode = new TreeNode(name);
    }

    public  static void main(String[] args){
        CompositeMain compositeMain=new CompositeMain("A");
        TreeNode treeNodeB=new TreeNode("B");
        TreeNode treeNodeC=new TreeNode("C");

        treeNodeB.add(treeNodeC);
        compositeMain.treeNode.add(treeNodeB);
        Utils.showStr("build the tree finished!");
    }
}
