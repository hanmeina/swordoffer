import java.util.Scanner;

public class ABC {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);  
    int row1 = sc.nextInt();  
    int line1_row2 = sc.nextInt();  
    int line2 = sc.nextInt();  
    int[][] matrix1 = new int[row1][line1_row2];  
    int[][] matrix2 = new int[line1_row2][line2];  
    int[][] matrix = new int[row1][line2];  
    for (int i = 0; i < row1; i++)  
        for (int j = 0; j < line1_row2; j++)  
            matrix1[i][j] = sc.nextInt();  

    for (int i = 0; i < line1_row2; i++)  
        for (int j = 0; j < line2; j++)  
            matrix2[i][j] = sc.nextInt();  
    sc.close();  

    for (int i = 0; i < row1; i++) {  
        for (int j = 0; j < line2; j++) {  
            for (int k = 0; k < line1_row2; k++) {  
                matrix[i][j] += matrix1[i][k] * matrix2[k][j];  
            }  
            System.out.printf("%d", matrix[i][j]);  
            if (j < line1_row2 - 1)  
                System.out.print(" ");  
        }  
        if (i < row1 - 1)  
            System.out.println();  
    }  
}  
}
