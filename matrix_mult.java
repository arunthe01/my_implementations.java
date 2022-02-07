public class matrix_mult {
        public static void main(String[] args){
               int[][] arr ={{1,2,3} , {4,5,6} };
               int[][] arr1 = {{1,2,3}, {4,5,6}, {7,8,9}};

               int column_size = 3;

               int[][] arr2 = new int[2][3];
              

               for(int i =0 ; i<arr.length;i++){
                       int j = 0; int it =0;
                       while(j != column_size){
                               int sum =0 ,  mul;
                               for(int k =0 ; k < arr[i].length; k++){
                                       mul = arr[i][k]*arr1[k][it];
                                       sum = sum+mul;
                               }
                               arr2[i][j++]= sum;
                               ++it;   
                       }
                       
               }

               for (int itr = 0; itr < arr2.length; itr++) {
                       for (int jtr = 0; jtr < arr2[itr].length; jtr++) {
                               System.out.print(arr2[itr][jtr] + "\t");
                       }
                       System.out.println();
               }



        }
        
}
