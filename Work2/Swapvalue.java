import java.util.*;
public class Swapvalue {
    int a,b;
    Swapvalue(){}
    Swapvalue(int p, int q){
        a=p;
        b=q;
    }
    void Swap(int a,int b){
        int c =a;
        a=b;
        b=c;
    }
    void Swapref(Swapvalue val){
        System.out.println("Before Swapping:  a =" +a+ " and b = " +b);
		int c;
		c=val.a;
		val.a=val.b;
		val.b=c;
		System.out.println("After Swapping: a =" +val.a+ " and b = " +val.b);
	}


    public static void main(String[] args)
	{	

        Scanner s = new Scanner(System.in);
		Swapvalue sv = new Swapvalue();
		int x = s.nextInt();
		int y = s.nextInt();
		System.out.println("Before Swapping a = " +x+ " and b = " +y);
		sv.Swap(x,y);
		System.out.println("After Swapping a = " +x+ " and b = " +y);

		Swapvalue sv2 = new Swapvalue(x,y);
		sv2.Swapref(sv2);
    }
}
