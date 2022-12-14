public class Main {
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("Задача 1, 2");
        int [] arrr = new int[3];
        arrr[0]=1;
        int nomber11 = arrr[0];
        arrr[1]=2;
        int nomber22 = arrr[1];
        arrr[2]=3;
        int nomber33 = arrr[2];
        for (int i=0; i<2; i++) {
            System.out.print(arrr[i]+",");

        }
        System.out.println(arrr[2]+" ");

        double [] Myy = new double[] {-1.57, 7.654, 9.986};
        for (int i=0; i<2; i++) {
            System.out.print(Myy[i]+",");
        }
        System.out.println(Myy[2]+" ");

        int [] carr = new int [] {85675, 566769, 5, 8, 5};
        for (int i=0; i<4; i++) {
            System.out.print(carr[i]+",");
        }
        System.out.println(carr[4]+" ");

        System.out.println(" ");
        System.out.println("Задача 3");
        int [] arr = new int[3];
        arr[0]=1;
        int nomber1 = arr[0];
        arr[1]=2;
        int nomber2 = arr[1];
        arr[2]=3;
        int nomber3 = arr[2];
        System.out.print(arr[2]+",");
        System.out.print(arr[1]+",");
        System.out.println(arr[0]+",");

        double [] My = new double[] {-1.57, 7.654, 9.986};
        for (int i=2; i>=1; i--) {
            System.out.print(My[i]+",");
        }
        System.out.println(My[0]+" ");

        int [] car = new int [] {85675, 566769, 5, 8, 5};
        for (int i=4; i>=1; i--) {
            System.out.print(car[i]+",");
        }
        System.out.println(car[0]+" ");

        System.out.println(" ");
        System.out.println("Задача 4");
        int [] arrrr = new int[3];
        arrrr[0]=1;
        int nomber111 = arrrr[0];
        arrrr[1]=2;
        int nomber122 = arrrr[1];
        arrrr[2]=3;
        int nomber333 = arrrr[2];
        for (int i=0; i<3; i++) {
            if (arrrr[i]% 2 != 0) {
                arrrr[i] = arrrr[i] + 1;
            }
            System.out.println(arrrr[i]);
        }
    }
}