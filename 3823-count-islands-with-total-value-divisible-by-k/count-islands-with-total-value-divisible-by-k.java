class Solution {
    public int countIslands(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        
        int result = 0;
        for(int i =0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] != 0){
                    long temp = dfs(i, j, grid, m, n);
                    if(temp % k == 0) result++;
                }
            }
        }
        return result;
    }
    long dfs(int i, int j, int[][] grid, int m, int n){
        if(i<0 || j<0 || i>= m || j >= n || grid[i][j] == 0) return 0;
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        long sum = grid[i][j];
        grid[i][j] = 0;
        for(int k=0; k<4; k++){
             sum += dfs(i+dx[k], j+dy[k], grid, m , n);
        } 
        return sum;
    }
}