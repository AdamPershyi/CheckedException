
public class Main {
    public static void main(String[] args) {
        UserService User00 = new UserService("Adam","1234567890","1234567890");
        User00.registerUser();
        UserService User01 = new UserService("SSS","12345","111111");
        User01.registerUser();

    }
//    1. Створити юзера.
    //2. Визвати метод регістр на юзері
    //3. Перевірка павроля
    //4. Якщо ок, то писати "Hello, login", якщо не ок, то інший меседж
    //5. Виводити в любому випадку "Ty man, for registration"
}