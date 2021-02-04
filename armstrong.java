import java.io.*;
class armstrong
{
	public static void main(String[] args)throws IOException
	{        
       int n= 0;  
       System.out.print("Please enter a Number :");
       BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
       n  = Integer.parseInt(br.readLine());
       int temp=n,d,c=0;
       while(n>0)  
       {  
         d=n%10;
         c=c+(d*d*d);  
         n=n/10;  
           
        }  
        if(temp==c)  
        System.out.println("armstrong number");   
        else  
        System.out.println("Not armstrong number");   
   }  
}  
