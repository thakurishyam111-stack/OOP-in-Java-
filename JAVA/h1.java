public class h1 {
    int a , b;
    h1(){
        int sum=0;
        sum =a+b;
        System.out.println(sum);

    }
    void sum(int a ,int b)
    {
        a=x;
        b=y;
    }
    public static void main(String[] args) {
        
        h1 a1=new h1(10,20);
        a1.sum();
    }
    

    
}

// this key word 

// public class A{
//     int a,b;
//     A(int a,int b){
//         this.a=a;  // this.a vaneko global "a"
//         this.b=b;  // this.b vaneko global "b"

//     }
//     void add(){
//         int sum =0;
//          sum = a+b;
//          System.out.println(sum);
//     }

//     public static void main(String[] args) {
//         A a1=new A(10, 12);
//         a1.add();
//     }

// }
