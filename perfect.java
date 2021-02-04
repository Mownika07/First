import java.io.*;
class perfect
{
    public static void main(String[] args)throws IOException
    {        
       int n= 0,sum=0;  
       System.out.print("Please enter a Number :");
       BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
       n  = Integer.parseInt(br.readLine());
       for(int i = 1; i < n; i++)
        {
            if(n % i == 0)
            {
                sum = sum + i;
            }
        }
        if(sum == n)
        {
            System.out.println("Given number is Perfect");
        }
        else
        {
            System.out.println("Given number is not Perfect");
        }    
    }

}