
public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.registerUser("Yakudza","ssssssssss", "ssssssssss");
       UserService User1 = new UserService();
        User1.registerUser("User001","palala","pal2ala");

    }
//    1. Створити юзера.
    //2. Визвати метод регістр на юзері
    //3. Перевірка павроля
    //4. Якщо ок, то писати "Hello, login", якщо не ок, то інший меседж
    //5. Виводити в любому випадку "Ty man, for registration"
}