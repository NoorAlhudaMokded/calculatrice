import java.util.Scanner;
public class calculatrice {
    int x;
    int y;
    calculatrice(int x,int y){
        this.x=x;
        this.y=y;
    }
     int addition(int a,int b) {
            return a+b;
        }
        int soustraction(int a,int b){
            return a-b;
        }
        int multiplication(int a,int b){
            return a*b;
        }
        float  division(int a, int b){
            if(b == 0){
                return a/b;
            }
            else{
                return 0;
            }
        }
        public static void main(String[]args){
            Scanner sa=new Scanner(System.in);
            int a;
            int b;
            String choix;
            System.out.print("donner a:");
            a=sa.nextInt();
            System.out.print("donner b:");
            b=sa.nextInt();
            calculatrice c =new calculatrice(a, b);
            sa.nextLine();
            System.out.print("donner choix de l'operation:");
            choix=sa.nextLine();
            if (choix.equals("add")){
                System.out.println("la somme: "+c.addition(a,b));
            }
          else if(choix.equals("soustraction")){
                System.out.println("la soustraction: "+c.soustraction(a,b));
            }
          else if(choix.equals("multi")){
                System.out.println("la multiplication "+c.multiplication(a,b));
            }
         else  if(choix.equals("division")){
                System.out.println("la division "+c.division(a,b));

            }  
            else {
                System.out.println("not operation");
            }    
    }
}