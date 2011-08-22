/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.znz.filenode;

import java.io.File;

/**
 *
 * @author drphrozen
 */
public class ParentNode implements DirectoryNode {

  private final DirectoryNode directoryNode;

  public ParentNode(DirectoryNode directoryNode) {
    this.directoryNode = directoryNode;
  }
  
  @Override
  public String toString() {
    return "..";
  }

  @Override
  public Node[] getChildNodes() {
    return directoryNode.getChildNodes();
  }

  @Override
  public String getNodeName() {
    return directoryNode.getNodeName();
  }

  @Override
  public Node getParent() {
    return directoryNode.getParent();
  }

  @Override
  public Attribute getAttribute(String name) {
    return directoryNode.getAttribute(name);
  }

  @Override
  public File getFile() {
    return directoryNode.getFile();
  }
}
