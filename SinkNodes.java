import java.util.*;
public class SinkNodes{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        int count=0;
        //int arr[][]={{0,1,1,0,1},{0,0,0,1,0}.......};
     /* 0 1 1 0 1
        0 0 0 1 0
        0 0 0 1 1
        0 0 0 0 0 
        0 0 0 0 0   */
        int arr[][]=new int[5][5];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            flag=true;
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==1) flag=false;
            }
            if(flag==true){
                System.out.println(i+" - "+(char)(i+65));
                count++;
             }
        }
        System.out.println("Count : "+count);
    }
}