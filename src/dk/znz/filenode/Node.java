/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.znz.filenode;

/**
 *
 * @author drphrozen
 */
public interface Node {
  String getNodeName();
  Node getParent();
  Attribute getAttribute(String name);
}
