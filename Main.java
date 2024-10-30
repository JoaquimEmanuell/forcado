public class Main {
    public static void main(String[] args) {
        AccountManager manager= new AccountManager();
        
        manager.addUser("John Doe", 25, "john.doe@email.com");
        manager.printUser();
        manager.updateEmail("John Doe", "john@doe.com");
        manager.deleteUser("John Doe"); 
        manager.printUser();
    }
}
