package minion;

import java.util.HashSet;
import java.util.Scanner;

public class minion 
{
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++)
        {
            boolean[][] matrix;
            HashSet<String> forbidden = new HashSet<>();
            int k = sc.nextInt();
            
            for(int j=0; j<k; j++)
                forbidden.add(sc.next());
            
            int numNodes = sc.nextInt();
            int paths = sc.nextInt();
            
            matrix = new boolean[numNodes][numNodes];
            
            for(int j=0; j<paths; j++)
            {
                int tempx = sc.nextInt();
                int tempy = sc.nextInt();
                
                String tempStr = sc.next();
                
                if(!forbidden.contains(tempStr))
                {
                    matrix[tempx][tempy] = true;
                    matrix[tempy][tempx] = true;
                }
                else
                {
                    matrix[tempx][tempy] = false;
                    matrix[tempy][tempx] = false;
                }
            }
            
            System.out.println(DFS(matrix, new boolean[numNodes], 0, numNodes-1));
            
        }
        
    }
    
    public static int DFS(boolean matrix[][], boolean visited[], int current, int numNodes)
    {
        visited[current] = true;
        
        if(current==numNodes)
            return 1;
        
        int temp=0;
        
        for(int i=0; i<matrix.length; i++)
        {
            if(matrix[current][i] && !visited[i])
                temp = DFS(matrix, visited, i, numNodes);
            
            if(temp!=0)
                return temp;
        }
        
        return temp;
    }
    
}
