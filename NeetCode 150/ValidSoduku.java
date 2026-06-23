import java.util.HashSet;

public class ValidSoduku {
    public static void main(String[] args) {
        char[][] board={{'1','2','.','.','3','.','.','.','.'},
                        {'4','.','.','5','.','.','.','.','.'},
                        {'.','9','8','.','.','.','.','.','3'},
                        {'5','.','.','.','6','.','.','.','4'},
                        {'.','.','.','8','.','3','.','.','5'},
                        {'7','.','.','.','2','.','.','.','6'},
                        {'.','.','.','.','.','.','2','.','.'},
                        {'.','.','.','4','1','9','.','.','8'},
                        {'.','.','.','.','8','.','.','7','9'}};
        boolean ans= isValidSudoku(board);
        System.out.println(ans);

    }


    public static boolean isValidSudoku(char[][] board) {

        HashSet<Character> rows[]= new HashSet[9];
        HashSet<Character> cols[]= new HashSet[9];
        HashSet<Character> boxes[]= new HashSet[9];

        for(int i=0;i<9;i++){
            rows[i]= new HashSet<>();
            cols[i]= new HashSet<>();
            boxes[i]= new HashSet<>();
        }

        for(int r=0;r<board.length;r++){
            for(int c=0;c<board[0].length;c++){

                char cell= board[r][c];
                if(cell=='.')  continue;
                if(rows[r].contains(cell)){
                    return false;
                }
                rows[r].add(cell);
                if(cols[c].contains(cell)){
                    return false;
                }
                cols[c].add(cell);
                int boardIndex= 3* (r/3)+ c/3;
                if(boxes[boardIndex].contains(cell)){
                    return false;
                }
                boxes[boardIndex].add(cell);
            }
        }
        return true;
        
    }
}
