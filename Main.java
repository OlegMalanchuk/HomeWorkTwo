

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static  void main(String[] args)
    {
//        Потрібно створити словник(асоціативний масив) з трьома ключами:
//         name
//         email
//         password
//         І сканером записати по черзі туди дані, тобто спочатку ім'я ітд,
//         Після того, як він буде створений, вивести всі дані к термінал, в порядку емалі, пароль, імя
//         Закинути на гіт, і написати коменти до свого коду
        Scanner sc = new Scanner(System.in);
        System.out.println("register person");

        System.out.print("name : ");
        String name = sc.nextLine();
        System.out.print("gmail : ");
        String gmail = sc.nextLine();
        System.out.print("pass : ");
        String pass = sc.nextLine();

        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("name ", " "+name); //Oleg
        hashMap.put("gmail ", " "+gmail);//olegmalan676@gmail.com
        hashMap.put("pass ", " "+pass);//11111111


        System.out.println(hashMap.toString());



















































    }
}