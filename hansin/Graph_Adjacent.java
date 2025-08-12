package com.hansin;
import java.util.*;
public class Graph_Adjacent {
	private Map<String, List<String>> adjList=new HashMap<>();
	public void addVertex(String vertex) {
		adjList.putIfAbsent(vertex, new ArrayList<>());
	}
	public void addEdge(String v1,String v2) {
		adjList.get(v1).add(v2);
		adjList.get(v2).add(v1);
	}
	public void printGraph() {
		for(String vertex:adjList.keySet()) {
			System.out.println(vertex+"->"+adjList.get(vertex));
		}
	}
	public static void main(String[] args) {
		Graph_Adjacent graph = new Graph_Adjacent();
		graph.addVertex("Pune");
		graph.addVertex("Mumbai");
		graph.addVertex("Delhi");
		graph.addEdge("Pune", "Mumbai");
		graph.addEdge("Mumbai", "Delhi");
		graph.printGraph();
	}

}
