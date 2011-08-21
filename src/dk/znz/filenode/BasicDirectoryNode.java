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
public class BasicDirectoryNode implements DirectoryNode {
  
  private File file;

  @Override
  public Node[] getChildNodes() {
    File[] listFiles = file.listFiles();
    Node[] nodes = new Node[listFiles.length];
    NodeFactory nodeFactory = NodeFactory.getInstance();
    for (int i = 0; i < listFiles.length; i++) {
      nodes[i] = nodeFactory.createNode(listFiles[i]);
    }
    return nodes;
  }

  @Override
  public Attribute getAttribute(String name) {
    return null;
  }

  /**
   * @return the file
   */
  public File getFile() {
    return file;
  }

  /**
   * @param file the file to set
   */
  public void setFile(File file) {
    this.file = file;
  }

  @Override
  public String getNodeName() {
    return file == null ? "" : file.getName();
  }

  @Override
  public Node getParent() {
    return NodeFactory.getInstance().createNode(file.getParentFile());
  }

  @Override
  public String toString() {
    return getNodeName();
  }
}
