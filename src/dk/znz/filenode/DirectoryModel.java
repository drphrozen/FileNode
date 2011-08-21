/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.znz.filenode;

import java.io.File;
import javax.swing.AbstractListModel;

/**
 *
 * @author drphrozen
 */
public class DirectoryModel extends AbstractListModel<Node> {

  private DirectoryNode root;
  private Node[] children;

  public DirectoryModel(File root) {
    this.root = (DirectoryNode)NodeFactory.getInstance().createNode(root);
    refresh();
  }

  @Override
  public int getSize() {
    return children.length;
  }

  @Override
  public Node getElementAt(int index) {
    return children[index];
  }

  public final void refresh() {
    children = root.getChildNodes();
  }

  public void setRoot(DirectoryNode root) {
    this.root = root;
  }
}
