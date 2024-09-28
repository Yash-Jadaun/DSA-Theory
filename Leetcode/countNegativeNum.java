public class countNegativeNum {
    static int countNegative(int [] [] grid){
        int rows=grid.length;
        int cols=grid[0].length;
        int count=0;
        int lastNeg=cols-1;
        for(int i=0;i<rows;i++){
            if(grid[i][0]<0){
                count+=cols;
                continue;
            }
            
        
        if(grid[i][cols-1]>0)
        continue;

        int l=0,r=lastNeg;
        while(l<=r){
            int mid=l+(r-l)/2;

            if(grid[i][mid]<0){
                r=mid-1;
            }
            else{
                l=mid+1;
            }

            count += (cols-l)
        }
    
    
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
       int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
       System.out.println(countNegative(grid));

       int[][] grid2 = {{3,2},{1,0}};
       System.out.println(countNegative(grid));

      
        
    }
}
