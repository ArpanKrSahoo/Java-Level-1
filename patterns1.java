public class patterns1 {
public static void main(String[] args) {
    // for (int i = 0; i < 10; i++) {
//         System.out.println("*".repeat(4));
// }

// Nested loops
for(int i=0;i<4;i++){  //outer loop
    for(int j=0;j<4;j++){  // inner loop
        System.out.print("*");
    }
    System.out.println();
}

//hollow rectangle
int rows=4; //outer loops
int cols=5; // inner loops
for(int i = 1;i<=rows;i++){
    for(int j=1;j<=cols;j++){
        if(i==1 || j==1 || i==rows || j==cols){
            System.out.print("*");
        }
        else{
            System.out.print(" ");
        }
    }
    System.out.println();
}

// Peramid
int row=4;
for(int i=1;i<=row;i++){
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
}
// Inverted Peramid
int row1=4;
for(int i=row1;i>=1;i--){
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
}

// reverse peramid
int row2=4;
for(int i=1;i<=row2;i++){
    for(int k=row2-i;k>=1;k--){
        System.out.print(" ");
    }
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
}

// print Floyd's triangle
int n=5;
int k=1;
for(int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
        System.out.print(k+" ");
        k++;
    }
    System.out.println();
}
int n1=5;
for(int i=1;i<=n1;i++){
    for(int j=1;j<=i;j++){
        if((i+j)%2==0)
            System.out.print(1);
        else
            System.out.print(0);    
    }
    System.out.println();
}
}
}
 