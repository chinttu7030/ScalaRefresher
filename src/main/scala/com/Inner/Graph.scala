package com.Inner

class Graph {


  class Node {
    var connectedNodes: List[Node] = Nil

    def connectTo(node: Node): Unit = {
      if (!connectedNodes.exists(node.equals)) {
        connectedNodes = node :: connectedNodes
      }
    }
  }

  var nodes: List[Node] = Nil

  def newNode: Node = {
    val res = new Node
    nodes = res :: nodes
    res
  }

}









