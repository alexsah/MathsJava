package com.alexsah;

public class Main {

    public static void main(String[] args) {
        //1. Assign sum=0, A=0, B=1, i=1
        int sum = 0;
        int a = 0;
        int b = 1;

        //2. Get the no. of terms upto which u want to generate the Fibonacci no, i.e., n.
        int n = 10;
        System.out.println(a);
        System.out.println(b);

        //3.Add A and B to get the next Fibonacci number
        sum = a + b;
        //4. Assign the value of B to A i.e. A=B
        a=b;
        //5. Assign the value of sum to B i.e. B=sum
        b=sum;
        //6. Write the value of su to get next Fibonacci number in the series.
        System.out.println(sum);
        //7. increment i with 1 i.e. i=i+1 and repeat step 3,4,5,6 with the last value of i=n(n is the no. of terms which u wnt to generate Fibonacci no. series.)
        for(int i=0; i <20; i++){
            sum = a + b;
            a=b;
            b=sum;
            System.out.println(sum);
        }
    }
}
