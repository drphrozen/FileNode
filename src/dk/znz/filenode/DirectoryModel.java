/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.znz.filenode;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.AbstractListModel;

/**
 *
 * @author drphrozen
 */
public class DirectoryModel extends AbstractListModel<Node> {

  private DirectoryNode root;
  private final ArrayList<Node> children = new ArrayList<Node>(1024);

  public DirectoryModel(File root) {
    setRoot((DirectoryNode)NodeFactory.getInstance().createNode(root));
    refresh();
  }

  DirectoryModel(DirectoryNode node) {
    setRoot(node);
    refresh();
  }

  @Override
  public int getSize() {
    return children.size();
  }

  @Override
  public Node getElementAt(int index) {
    return children.get(index);
  }

  public final void refresh() {
    children.clear();
    Node parent = root.getParent();
    if(parent != null && parent instanceof DirectoryNode) {
      children.add(new ParentNode((DirectoryNode)root.getParent()));
    }
    children.addAll(Arrays.asList(root.getChildNodes()));
  }

  public final void setRoot(DirectoryNode root) {
    this.root = root;
  }
}
