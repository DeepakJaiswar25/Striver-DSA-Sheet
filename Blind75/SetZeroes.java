import java.util.Arrays;

public class SetZeroes {

    public static void main(String[] args) {
        int[][] matrix = {
                            {1,2,3},
                            {4,0,5},
                            {6,7,8}};

        setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));


        }

        public static void setZeroes(int[][] matrix) {
            //Better Approach
            // int m= matrix.length;
            // int n= matrix[0].length;

            // int[] row=new int[m];
            // int[] col=new int[n];

            // for(int i=0;i<m;i++){
            //     for(int j=0;j<n;j++){
            //         if(matrix[i][j]==0){
            //             row[i]=1;
            //             col[j]=1;
            //         }
            //     }
            // }

            // for(int i=0;i<m;i++){
            //     for(int j=0;j<n;j++){
            //         if(row[i]==1 || col[j]==1){
            //             matrix[i][j]=0;
            //         }
            //     }
            // }

            //Optimal Approach

            int m= matrix.length;
            int n= matrix[0].length;
            boolean firstrow=false;
            boolean firstcol=false;

            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(matrix[i][j]==0){
                        if(i==0) firstrow=true;
                        if(j==0) firstcol=true;
                        matrix[i][0]=0;
                        matrix[0][j]=0;
                    }
                }
            }

            for(int i=1;i<m;i++){
                for(int j=1;j<n;j++){
                    if(matrix[i][0]==0 || matrix[0][j]==0){
                        matrix[i][j]=0;
                    }
                }
            }

            if(firstrow){
                for(int i=0;i<n;i++){
                    matrix[0][i]=0;
                }
            }
             if(firstcol){
                for(int i=0;i<n;i++){
                    matrix[i][0]=0;
                }
            }
        }
    }
