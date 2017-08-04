package lianxi;

import javax.swing.text.ChangedCharSetException;

public class Solution {
    /**
     * @param grid a boolean 2D matrix
     * @return an integer
     * 
     * 
     * ��һ��01������ͬ�ĵ���ĸ�����
       0������1�������������1���ڣ���ô������1����ͬһ����������ֻ������������Ϊ���ڡ�
     */
    public static int numIslands(int[][] grid) {
    	int num = 0;
        if(grid==null){
        	return 0;
        }
        for(int i = 0; i < grid.length; i++){
        	for (int j = 0; j < grid.length; j++) {
				if(grid[i][j]==1){
				  num++;
				  grid = change(grid,i,j);
				}
			}
        	
        	
        	
        }
        return num;
    }

	private static int[][] change(int[][] grid, int i, int j) {
		// TODO Auto-generated method stub
		//�޸�Ϊfalse
		grid[i][j] = 0;
		if(i > 0 && grid[i-1][j] == 1){
			//�޸���ߵ�
			grid = change(grid, i-1, j);
					
		}
		if (j < grid[i].length-1 && grid[i][j+1] == 1) {
			//�޸��ұߵ�
			grid = change(grid, i, j+1);
		}
		if (j > 0 && grid[i][j-1] == 1) {
			//�޸��ϱߵ�
			grid = change(grid, i, j-1);
		}
		if (i < grid.length-1 && grid[i+1][j] == 1) {
				//�޸��±ߵ�
				grid = change(grid, i+1, j);
		}
		return grid;
	}
	public static void main(String[] args) {
		int[][] grid = {{1,1,0,0,0},{0,1,0,0,1},{0,0,0,1,1},{0,0,0,0,0},{0,0,0,0,1}};
		int num = numIslands(grid);
		System.out.println("�м������죺"+num);
	}
}