public class relationalOperator {
    public static void main(String[] args) {
        int a=3,b=4,c=0;
        c=a+b;
        System.out.println("c is equal to"+c);
       /* if((a!=b)||(a<c)){
            System.out.println("tha value of a is :"+a);
        }*/
        if((a<b)&&(a<c)){
            System.out.println("tha value of a is :"+a);
        }
        if((a+b)!=c){
            System.out.println("tha sum of a and b is ="+c);
        }
    }
}
