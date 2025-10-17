public class bitManupulation {
    public static void main(String[] args) {
        int n = 5; // 0101
        int pos = 2;

        //get bit
        int bitMask=1<<pos;
        System.out.println(bitMask);
        System.out.println();

        if((bitMask&n)==0){
            System.out.println("bit was 0");
        }
        else{
            System.out.println("bit was 1");
        }

    }

}
