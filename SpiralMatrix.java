import java.util.*;
public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(spiralOrder(matrix));
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
              List<Integer> res = new ArrayList<>();
              int left =0;
              int right = matrix[0].length;
              int top = 0;
              int bottom = matrix.length;
              while(left<right && top < bottom){
                  for(int i=left;i<right;i++){
                      res.add(matrix[top][i]);
                  }

                  top++;
                  for(int i=top;i<bottom;i++){
                      res.add(matrix[i][right-1]);
                  }

                  right--;

                  // Check if we are done
                  if (!(left < right && top < bottom)) break;

                  for(int i= right-1;i>=left;i--){
                      res.add(matrix[bottom-1][i]);
                  }
                  bottom--;
                  for(int i=bottom-1;i>=top;i--){
                      res.add(matrix[i][left]);

                  }
                  left++;

              }
              return res;

    }
}
