import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    AdjListGraph g = new AdjListGraph();
    g.readData(scan);
    g.printAdjacencyList();
  
    System.out.println("Algorimo DFS en grafos");
    g.DFS(0);
    g.printTree();

  }
}


/*
A 1 
B 2 
C 3  
D 4 
E 5
F 6
G 7
H 8
I 9
J 10
K 11
L 12
*/