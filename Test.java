public class Test {
    public static void main(String[] args){

        int[][] matrixe = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};
        int max = matrixe[2][2];
        int min = matrixe[0][0];
        int srd = matrixe[1][1];
        for(int i = 0; i<matrixe.length; i++){
            for(int j =0; j<matrixe[i].length; j++){
                System.out.print(matrixe[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("min :" + min);
        System.out.println("max :" + max);
        System.out.println("srd :" +srd);



    }
}



