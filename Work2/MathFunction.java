class MathFunction{
    void multiply(int a,int b)
    {
        System.out.println(a*b);
    }
    void multiply(float c,float d)
    {
        System.out.println(c*d);
    }
    void multiply(int p, float q)
    {
        System.out.println(p*q);
    }
    public static void main(String args[]){
        MathFunction mf=new MathFunction();
        mf.multiply(2,4);
        mf.multiply(5,6);
        mf.multiply(8,9);
    }
}