package lessons3;

public class ArrayCls3 {
    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[0] = 2;
        arr[1] = 45;
        arr[2] = 32;
        arr[3] = 6;
        int cem=arr[0];
        int max=arr[0];
        int min =arr[0];

        int hasil=0;

        for (int i = 1; i < arr.length; i++) {
            cem=arr[i]+cem;

            hasil=arr[i]*hasil;
            if (max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println(cem);
        System.out.println(hasil);
        System.out.println(max);
        System.out.println(min);

    }
}
