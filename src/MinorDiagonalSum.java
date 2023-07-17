import java.util.Scanner;

public class MinorDiagonalSum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int rowsize=scan.nextInt();
        int colsize=scan.nextInt();
        int mat[][]=new int[rowsize][colsize];
        int sum=0;

        for(int i=0;i<rowsize;i++){
            for (int j=0;j<colsize;j++){
                mat[i][j]=scan.nextInt();
                if(i+j==rowsize-1){
                    sum+= mat[i][j];
                }
            }
        }
        System.out.println(sum);
    }

}
