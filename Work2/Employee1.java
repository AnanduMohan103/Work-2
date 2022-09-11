import java.util.Scanner;
class Employee {
    String name;
    int employeeid;
    float result;
    float ass1,ass2,ass3;
    Employee(){
        System.out.println("Enter the Name ID and three assessment marks");
        Scanner s =new Scanner(System.in);
        name=s.next();
        employeeid=s.nextInt();
        ass1=s.nextFloat();
        ass2=s.nextFloat();
        ass3=s.nextFloat();    
    }
    void result(){
        if(ass1>=75&&ass2>=75&&ass3>=75){
            System.out.println("Promoted");}
        else{
            System.out.println("Demoted");
        }
    }
    void calculate(){
        float total=ass1+ass2+ass3;
        System.out.println("Total="+total);
        
        float percentage=(total/300)*100;
        System.out.println("Percentage="+percentage);

    }

}
 class Employee1{
    public static void main(String args[])
    {
     Employee e1=new Employee();
    e1.result();
    e1.calculate();
    }

}