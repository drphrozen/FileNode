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
public class NodeFactory {

  private static NodeFactory nodeFactory = new NodeFactory();
  
  private NodeFactory() {}
  
  public static NodeFactory getInstance() {
    return nodeFactory;
  }
  
  public Node createNode(File f) {
    if(f == null) {
      return null;
    }
    if(f.isDirectory()) {
      BasicDirectoryNode basicDirectoryNode = new BasicDirectoryNode();
      basicDirectoryNode.setFile(f);
      return basicDirectoryNode;
    } else {
      BasicFileNode basicFileNode = new BasicFileNode();
      basicFileNode.setFile(f);
      return basicFileNode;
    }
  }
}
