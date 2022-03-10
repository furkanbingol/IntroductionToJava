import java.util.Scanner;

public class atm_example {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int bakiye = 1000;
        int islem;
        int choice = 1;
        int c;
        
        while (choice == 1)
        {
            System.out.println("1: Bakiye Görüntüle ");
            System.out.println("2: Para Yatırma ");
            System.out.println("3: Para Çekme ");
            System.out.println("4: Sistemden Çıkış!");

            System.out.println("İşleminizi giriniz: ");
            islem = scan.nextInt();
            switch(islem)
            {
                case 1:
                    System.out.println("Bakiyeniz: " + bakiye);
                    System.out.println("İslemlere devam etmek istiyorsanız 1, çıkış yapmak istiyorsanız 0'a tıklayınız: ");
                    choice = scan.nextInt();
                    if(choice == 0)
                        System.out.println("Çıkış yapılıyor...");
                    break;
                case 2:
                    System.out.println("Ne kadar para yatırmak istiyorsunuz: ");
                    c = scan.nextInt();
                    bakiye += c;
                    System.out.println("İslemlere devam etmek istiyorsanız 1, çıkış yapmak istiyorsanız 0'a tıklayınız: ");
                    choice = scan.nextInt();
                    if(choice == 0)
                        System.out.println("Çıkış yapılıyor...");
                    break;
                case 3:
                    System.out.println("Bakiyeniz: " + bakiye);
                    System.out.println("Ne kadar para çekmek istiyorsunuz: ");
                    c = scan.nextInt();
                    if (c <= bakiye)
                        bakiye -= c;
                    else
                        System.out.println("Hata. Yeterli bakiyeye sahip değilsiniz!");
                    System.out.println("İslemlere devam etmek istiyorsanız 1, çıkış yapmak istiyorsanız 0'a tıklayınız: ");
                    choice = scan.nextInt();
                    if(choice == 0)
                        System.out.println("Çıkış yapılıyor...");
                    break;
                case 4:
                    System.out.println("Çıkış yapılıyor...");
                    choice = 0;
            }
        }
    }
}
