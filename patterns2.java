public class patterns2 {
    public static void main(String[] args){
// Butterfly pattern
    int n=4;
for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
    for(int j=1;j<=2*(n-i);j++){
        System.out.print(" ");
    }
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
}
for(int i=n;i>=1;i--){
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
    for(int j=1;j<=2*(n-i);j++){
        System.out.print(" ");
    }
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
}
// Solid rhombus
int r=5;
for(int i=1;i<=r;i++){
    for(int j=1;j<=r-i;j++){
        System.out.print(" ");
    }
    for(int j=1;j<=r;j++){
        System.out.print("*");
    }

    System.out.println();
    }
// Number pattern
    int p=5;
    int k=1;
    for(int i=1;i<=p;i++){
        for(int j=1;j<=p-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print(k+" ");
            
        }
        k++;  
        System.out.println();
    }
    }
}
 