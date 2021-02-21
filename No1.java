
public class No1 {
    public static <T> void print(T a[]){
        int siz=a.length/2;
        for (int i = 0; i < siz; i++) {
            T b=a[i];
            a[i]=a[(a.length-1)-i];
            a[(a.length-1)-i]=b;

        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }

    public static void main(String[] args) {
        Integer[] w={1,2,3,4,5,6,7,8,9};
        String e[]={"abdu","hasan", "ali","malek","mohamed"};
        print(e);
    }
}
