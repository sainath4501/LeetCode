class Solution {
    public int[][] generateMatrix(int n) {
        int matrix[][]=new int[n][n];
        
        int startRow=0;
        int endRow=matrix.length-1;
        int startCol=0;
        int endCol=matrix[0].length-1;
        int num=1;

        while(startRow <= endRow && startCol <= endCol){
            
            //Top
            for(int j=startCol;j<=endCol;j++){
                matrix[startRow][j]=num++;
            }
            startRow++;

            //Right
            for(int i=startRow;i<=endRow;i++){
                matrix[i][endCol]=num++;
            }
            endCol--;

            //bottom
            for(int j=endCol;j>=startCol;j--){
                if(startRow>endRow){
                    break;
                }
                matrix[endRow][j]=num++;
            }
            endRow--;
            //left
            for(int i=endRow;i>=startRow;i--){
                if(startCol>endCol){
                    break;
                }
                matrix[i][startCol]=num++;
            }
            startCol++;
        }
        return matrix;

    }
}