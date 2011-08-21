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
public class BasicFileNode implements FileNode {

  private File file;
  
  @Override
  public String getNodeName() {
    return file.getName();
  }

  @Override
  public Node getParent() {
    return NodeFactory.getInstance().createNode(file.getParentFile());
  }

  @Override
  public Attribute getAttribute(String name) {
    return null;
  }
  
  public void setFile(File f) {
    file = f;
  }
  
  public File getFile() {
    return file;
  }

  @Override
  public String toString() {
    return getNodeName();
  }
}
