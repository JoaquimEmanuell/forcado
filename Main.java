public static void main(String[] args) {
// Cria um AccountManager
AccountManager am = new AccountManager();
// Adiciona um usuario John Doe, de idade 25, com email john.doe@email.com
am.addUser("John Doe", 25, "john.doe@email.com");
// Print all users
am.pU(); // Chamada do método atualizado
// Atualiza email
am.uE("John Doe", "john@doe.com"); // Chamada do método atualizado
// Deleta usuário
am.dU("John Doe"); // Chamada do método atualizado
// Print all users again to see the result
am.pU(); // Chamada do método atualizado
}
