import java.util.*;
class MathOperation{
double r;
int x,y;
MathOperation(){

}
void init()
{
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the value of x");
    x=s.nextInt();
    System.out.println("Enter the value of y");
    y=s.nextInt();
}
void add(){
    int r=x+y;
    System.out.println("The added value is"+r);

}
void multiply(){
    int r=x*y;
    System.out.println("The multiplied value is"+r);

}
void power(){
    double r=Math.pow(x, y);
    System.out.println("R="+r);
}
void display(){
    add();
    multiply();
    power();
}
}
class MathOperationD{
    public static void main(String args[]){
        MathOperation m=new MathOperation();
        m.init();
        m.display();
    }
   

}
