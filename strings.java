public class strings {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String str2 ="Arpan";
        String fullsen= str + " " + str2;
        System.out.println("Concatenated String: " + fullsen);
       

        for(int i=0;i<fullsen.length();i++){
            System.out.println(fullsen.charAt(i));
        }
   String name="arpan";
   String name2="Arpan";
   if(name.compareTo(name2)==0){
    System.out.println("Strings are equal");
   }
   else{
    System.out.println("Strings are not equal");
   }

   // substring
     String name3 = "TonyStark";

       System.out.println(name3.substring(0, 4));

    //to integer
     String str3 = "123";
       int number = Integer.parseInt(str3);
       System.out.println(number);

       int number2=23;
       String str6=Integer.toString(number2);
       System.out.println(str6);
    }
}
  