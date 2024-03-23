package dataStructures.queue;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

/*
Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.
An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
You may assume all four edges of the grid are all surrounded by water.
 */
public class numberOfIslands {
    public int numIslands(char[][] grid) {
        if(grid == null || grid[0] ==null) return 0;
        int rows = grid.length;
        int cols = grid[0].length;
        int islands=0;
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j] =='1'){
                    islands++;
                    Queue<int[]> queue = new LinkedList<>();
                    queue.add(new int[]{i,j});
                    grid[i][j] = '0';

                    while(!queue.isEmpty()){
                        int[] currentCell = queue.remove();
                        int row = currentCell[0];
                        int col = currentCell[1];

                        if (row -1 >=0 && grid[row-1][col]=='1') {
                            queue.add(new int[]{row-1,col});
                            grid[row-1][col] = '0';
                        }
                        if (row +1 < rows && grid[row+1][col]=='1') {
                            queue.add(new int[]{row+1,col});
                            grid[row+1][col] = '0';
                        }
                        if (col-1 >=0 && grid[row][col-1]=='1') {
                            queue.add(new int[]{row,col-1});
                            grid[row][col-1] = '0';
                        }
                        if (col+1 < cols && grid[row][col+1]=='1') {
                            queue.add(new int[]{row,col+1});
                            grid[row][col+1] = '0';
                        }
                    }
                }
            }
        }

    return islands;
    }
}
