
package add.two.dim;

import java.util.Scanner;

public class AddTwoDim {
 
 static void  add(int h ,int g){
      
       
        System.out.println("please enter the length ");
      Scanner input=new Scanner(System.in);
       
        int x[][]=new int [h][g];
         for(int i=0;i<h;i++){
            for(int j=0;j<g;j++)
            {
                System.out.println("please enter the value of"+i+"*"+j);
                x[i][j]=input.nextInt();
                
            }
            
        }
  int n=0;
          for(int u=0;u<h;u++){
            for(int o=0;o<g;o++)
            {
               
             n+=x[u][o];
              
                
            }
            
          
        }
          System.out.println(n);
 
 }
  
  
    public static void main(String[] args) {
       
         Scanner input=new Scanner(System.in);
        int h=input.nextInt();
        int g=input.nextInt();
       add(h,g);
        
     
    }  
    
}






