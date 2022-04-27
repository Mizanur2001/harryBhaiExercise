// 3. Write a Java Program to take input of five city name through command line argument. Sort these cities in alphabetic order by using compareTo method.

class City{
    public static void main(String []args){
        int len = args.length;
        for(int i = 0; i<= len; i++){
            for(int j = i+1 ; j< len ; j++){
                if(args[j].compareTo(args[i])<0){
                    String temp = args[i];
                    args[i] = args[j];
                    args[j]=temp;
                }
            }
        }

        for(int i = 0; i < len ; i++){
            System.out.println(args[i]);
        }
    }
}