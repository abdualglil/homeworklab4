public class NO2 {
    public static <T,A> void merg(T a[],T b[]){
        int c=(a.length+b.length);
        int asaez=a.length;
        int ad=0;
        T d[]= (T[]) new Object[c];
        for (int i = 0; i < c; i++) {
            if (i<asaez)
                d[i]=a[i];
            else {
                d[i]=b[ad];
                ad++;
            }
        }
        for (int i = 0; i < c; i++) {
            System.out.print(d[i]+"   ");
        }
  }
    public static void main(String[] args) {
        Integer[] w={1,2,3,4,5,6,7,8,9};
        String e[]={"abdu","hasan", "ali","malek","mohamed"};
        merg(e,w);
    }
}