package Ex1;
public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Wellington Tuler", "tulermoraes@yahoo.com", 'm');
        System.out.println("Autor criado:");
        System.out.println("Nome: " + author.getName());
        System.out.println("Email: " + author.getEmail());
        System.out.println("Sexo: " + author.getGender());
        System.out.println(author);

        System.out.println("Após tentativa de alteração:");
        System.out.println("Nome: " + author.getName());
        System.out.println("Sexo: " + author.getGender());
    }
}
