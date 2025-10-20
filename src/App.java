public class App {
     Scanner scanner = new Scanner(System.in);
        
        System.out.print("Пожалуйста, введите ваше имя: ");
        String name = scanner.nextLine();
        
        System.out.println("Пока, " + name + "! Добро пожаловать в мир Java!");
        
        scanner.close();
    }
}
