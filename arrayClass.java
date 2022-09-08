import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class arrayClass {
    public static void main(String[] args) {
        //1 st problem
        String[][] inputArray = {{"Luke", "Shaw"}, {"Wanwy", "rooney"}, {"rooney", "Ronaldo"}, {"Shaw", "rooney"}};
        String foundedName = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("enter");
        String name = sc.next();
        int count=0;
        for(int i = 0; i < inputArray.length;i++){
            for(int j = 0;j<=1;j++){
                if(inputArray[i][j].equals(name)){

                    System.out.println(foundedName+=inputArray[i][j-1]);
                }
            }
            String child = foundedName;
            for(int k = 1;k <=1;k++){
                if(inputArray[i][k].equals(child)){
                    count++;
                }
            }
        }
        //2nd program
        int[] array = {36,40,8,12,7};
        method2(array);
                }


    static boolean squareRoot(int num){
        int i = 0;
        while(i*i<=num){
            if(i*i==num)
                return true;
            i++;
        }
        return false;
    }
    static void method2(int[] input){
        int[] weight = new int[input.length];
        for(int i = 0; i < input.length;i++){

            if(squareRoot(input[i])){
                weight[i]+=5;
            }
             if((input[i]%4==0)&&(input[i]%6==0)){
                weight[i]+=4;
            }
             if(input[i]%2==0){
                weight[i]+=3;
            }

        }
        for(int i = 0; i < input.length-1;i++){
            for(int j = i +1; j< input.length;j++){
                if(weight[i]<weight[j]){
                    int temp1 = weight[i];
                    weight[i]=weight[j];
                    weight[j]=temp1;
                    int temp2 = input[i];
                    input[i]=input[j];
                    input[j]=temp2;
                }
            }
        }
        for(int i = 0; i < input.length;i++){
            System.out.print(input[i]+" "+weight[i]+" ");
        }
    }
    //3rd program
 static void xPattern(){
        String str = "PROGRAM";
        int i = 0, j = 0;
        for(i = 0; i < str.length();i++){
            for(j = 0; j < str.length();j++){
                if(i==j||i+j==str.length()-1){
                    System.out.print(str.charAt(j));
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
 }
 //4th program
 static int[][] userDefinedMatrix(){
        Scanner scan = new Scanner(System.in);
     System.out.println("enter the no of rows");
     int row = scan.nextInt();
     System.out.println("enter the no of columns");
     int columns = scan.nextInt();
     int[][] matrix1 = new int[row][columns];
     for(int i = 0; i < matrix1.length;i++){
         for(int j  = 0; j < matrix1[i].length;j++){
             matrix1[i][j] = scan.nextInt();
         }
     }
     return matrix1;
 }
 static void multiplicationMatrix(){
        int[][] matrix = userDefinedMatrix();
        int[][] matrix1 = userDefinedMatrix();
        int[][] resultMatrix = new int[matrix.length][matrix1[1].length];
        for(int i = 0; i < matrix.length;i++){
            for(int j = 0;j< matrix1[0].length;j++){
                for(int k = 0; k < matrix.length;k++){
                    resultMatrix[i][j]=resultMatrix[i][j]+matrix[i][k]*matrix1[k][j];
                }
                System.out.print(resultMatrix[i][j]+" ");
            }
            System.out.println();
        }
 }
 //5th program
    static void sortingArray(){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the range");
        int range = scan.nextInt();
        int[] inputArray = new int[range];
        for(int j=0 ;j<range;j++)
            inputArray[j] = scan.nextInt();
        Arrays.sort(inputArray);
        int[] sorting = new int[range];
        int middle=range/2;
        if(range%2==0)
            middle=range/2-1;

        int x=1,y=0;
        sorting[y++]=inputArray[middle];

        while(y<range){
            if(y<range)
                sorting[y++]=inputArray[middle+x];
            if(y<range)
                sorting[y++]=inputArray[middle-x];
            x++;
        }
        for(int k=0;k<range;k++)
            System.out.print(sorting[k]+" ");
        }

    }

