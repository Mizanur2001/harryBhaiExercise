// 8. Use multithreading to create two threads Fibonacci and Prime. Fibonacci thread will display the series for the n terms with 6000ms delay and Prime thread will display prime numbers of a given range with 3000ms delay.

class Fibonacci extends Thread {
    public void run(){
        int i=0;
        int j=1;
        try{Thread.sleep(6000);}catch (Exception e){System.out.println(e);}
        System.out.println(i);
        try{Thread.sleep(6000);}catch (Exception e){System.out.println(e);}
        System.out.println(j);

        for(int k=2;k<10;k++){
            int n=i+j;
            try{Thread.sleep(6000);}catch (Exception e){System.out.println(e);}
            System.out.println(n);
            i=j;
            j=n;
        }
    }
}

class Prime extends Thread {
    public boolean isprime(int n){
        for(int i = 2 ; i <= n/2 ; i++){
            if(n%i==0){
                return false;
             }
        }
        return true;
    }
    public void run() {
        for(int i=2;i<16;i++){
            if(isprime(i)){
                try{Thread.sleep(3000);}catch(Exception e){System.out.println(e);}
                System.out.printf("%d is prime\n",i);
            }
        }
    }
}

class ThreadDemo {
    public static void main(String[] args) {
        Prime p = new Prime();
        Fibonacci f = new Fibonacci();
        p.start();
        f.start();
    }
}