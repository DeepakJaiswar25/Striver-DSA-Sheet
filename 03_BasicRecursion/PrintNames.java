package BasicRecursion;

public class PrintNames {
public static void main(String[] args) {
    int n=4;
    print(1, n);
}

public static void print(int i,int n){
     if(i>n)
     return;
    System.out.println("Deepak");
     print(i+1,n);

}

}
