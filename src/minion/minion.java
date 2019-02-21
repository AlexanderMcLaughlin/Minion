package minion;

import java.util.HashSet;
import java.util.Scanner;

public class minion {
    
    public static void main(String[] args) {
        //For inputting the values from stdin
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        //Will cycle through n different possible maps
        for(int i=0; i<n; i++) {
            //An adjacency matrix will keep track of which nodes are connected
            boolean[][] matrix;
            //Will keep track of the 'trials' that can not be completed
            HashSet<String> forbidden = new HashSet<>();
            //Will keep track of the number of 'trials' that can not be completed
            int k = sc.nextInt();
            
            //Add each of these trials to the HashSet
            for(int j=0; j<k; j++) {
                forbidden.add(sc.next());
            }
            
            int numNodes = sc.nextInt();
            int paths = sc.nextInt();
            
            //Allocate memory for the map
            matrix = new boolean[numNodes][numNodes];
            
            //Cycle through all the provided paths that go from node tempx to node tempy
            for(int j=0; j<paths; j++) {
                int tempx = sc.nextInt();
                int tempy = sc.nextInt();
                
                //Each path's trial name
                String tempStr = sc.next();
                
                //If the trial name isn't in the list then add to the matrix
                if(!forbidden.contains(tempStr)) {
                    matrix[tempx][tempy] = true;
                    matrix[tempy][tempx] = true;
                } 
                //Otherwise do not
                else {
                    matrix[tempx][tempy] = false;
                    matrix[tempy][tempx] = false;
                }
            }
            
            //Will perform a simple depth first search on the tree to see if there is a path from the start
            //to the finish and return 0 if there is not a path and 1 if there is
            System.out.println(DFS(matrix, new boolean[numNodes], 0, numNodes-1));
            
        }
        
    }
    
    public static int DFS(boolean matrix[][], boolean visited[], int current, int numNodes) {
        //Mark this node as visited
        visited[current] = true;
        
        //If this node is the last one then return 1, we made it all the way
        if(current==numNodes)
            return 1;
        
        int temp=0;
        
        //Recurse through possible untouched nodes from the current node
        for(int i=0; i<matrix.length; i++) {
            //Check if there is a edge between these vertices, and it is not visited, then go there next
            if(matrix[current][i] && !visited[i])
                temp = DFS(matrix, visited, i, numNodes);
            
            //If one of these vertices had a path to the last node then return its value (1)
            if(temp!=0)
                return temp;
        }
        
        //Otherwise temp will remain 0 and return at the end (0)
        return temp;
    }
    
}
