public class Main {

    public static void main(String[] args) {
        int number =28;
        int total = 0;
        if (number<=1){
            System.out.println("Geçersiz Sayı");
            return;
        }
        for (int i=1; i<number;i++){
            if (number%i==0){
                total=total+i;
            }
        }
        System.out.println(total);

        if (total==number){
            System.out.println("Mükemmel Sayıdır");
        }else {
            System.out.println("Mükemmel Sayı Değildir");
        }
    }
}