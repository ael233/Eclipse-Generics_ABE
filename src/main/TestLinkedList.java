package main;
import linkedlist.Node;
import linkedlist.LinkedList;
import linkedlist.GenericNode;
import linkedlist.GenericLinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		
		LinkedList myList=new LinkedList();
		
		Node aNode=new Node();
		aNode.setData("Element 1");
		myList.addNode(aNode);
		aNode = new Node();
		aNode.setData("Element 2");
		myList.addNode(aNode);
		
		Node tempnode=myList.getList();
		do 
		{
			System.out.println(tempnode.getData());
			tempnode=tempnode.getNextNode();
		} while (tempnode!=null);

		//This will create a GenericLinkedList that can hold Integer objects.
		GenericLinkedList<Integer> integerList = new GenericLinkedList<>();
		GenericNode<Integer> bNode = new GenericNode<>();
		bNode.setData(1);
		integerList.addNode(bNode);
		bNode = new GenericNode<>();
		bNode.setData(12);
		integerList.addNode(bNode);
				
		GenericNode otherTempnode = integerList.getList();
		do 
		{
			System.out.println(otherTempnode.getData());
			otherTempnode=otherTempnode.getNextNode();
		} while (otherTempnode!=null);
		
		//This will create a GenericLinkedList that can hold Double objects.
		GenericLinkedList<Double> doubleList = new GenericLinkedList<>();
		GenericNode<Double> cNode = new GenericNode<>();
		cNode.setData(3.03);
		doubleList.addNode(cNode);
		cNode = new GenericNode<>();
		cNode.setData(5.05);
		doubleList.addNode(cNode);
				
		GenericNode otherTempnode2 = doubleList.getList();
		do 
		{
			System.out.println(otherTempnode2.getData());
			otherTempnode2=otherTempnode2.getNextNode();
		} while (otherTempnode2!=null);
		
		//This will create a GenericLinkedList that can hold String objects.
		GenericLinkedList<String> StringList = new GenericLinkedList<>();
		GenericNode<String> dNode = new GenericNode<>();
		dNode.setData("Twenty-two");
		StringList.addNode(dNode);
		dNode = new GenericNode<>();
		dNode.setData("Forty-four");
		StringList.addNode(dNode);
		dNode = new GenericNode<>();
		dNode.setData("Eighty-eight");
		StringList.addNode(dNode);
				
		GenericNode otherTempnode3 = StringList.getList();
		do 
		{
			System.out.println(otherTempnode3.getData());
			otherTempnode3=otherTempnode3.getNextNode();
		} while (otherTempnode3!=null);
		
	}//end main

}//end class
