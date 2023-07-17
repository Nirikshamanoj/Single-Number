import java.util.Scanner;
public class SingleNumber {
    static int findSingleNumber(int[] A,int size)
    {
        int result=0;
        for(int i=0;i<size;i++)
        {
            result=result^A[i];
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int A[]=new int[n];
        for(int i=0;i<n;i++)
        {
            A[i]=scanner.nextInt();
        }
        int unique=findSingleNumber(A,n);
        System.out.println(unique);
    }
}
