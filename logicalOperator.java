public class logicalOperator {
    public static void main(String[] args) {
        int a=3;
        int b=4;
        if((a<b)&&(a>b))
        {
            System.out.println("print a"+a);
        }else{
            System.out.println("print b"+b);
        }
        if((a==3)||(a<4)){
            System.out.println("print a is equal to 3"+a);
        }else{
            System.out.println("print a is not equal to 3"+a);
        }
    }
}
