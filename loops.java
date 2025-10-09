public class loops {
    public static void main(String[] args) {
        // for loop
        for(int i=0;i<5;i++){
            System.out.println("Hello World " + i);
        }

        // while loop
        int j=0;
        while(j<5){
            System.out.println("Hello World " + j);
            j++;
        }

        // do while loop
        int k=0;
        do{
            System.out.println("Hello World " + k);
            k++;
        }while(k<5);
    
    // for each loop
    int[] marks = {97, 98, 95, 93, 96};
    for(int element: marks){
        System.out.println(element);}

    //prob
    int n = 4;
    int sum = n;
    for(int i = 0; i <= n; i++) {
        sum += i;
    }
    System.out.println(sum);

    // table of num
    int num = 5;
    for(int i = 1; i <= 10; i++) {
        System.out.println(num + " x " + i + " = " + (num * i));}
        
    }

}
