import HWork8.Author;
import HWork8.Book;

public class Main {
    public static void main(String[] args) {
        Author lev = new Author("Лев", "Толстой");
        Book war = new Book("Война и мир", lev, 1863);
        System.out.println(war);
        Author nik = new Author("Николай", "Гоголь");
        Book souls = new Book("Мертвые души", nik, 1835);
        System.out.println(souls);
        Author lev2 = new Author("Лев", "Толстой");
        Book war2 = new Book("Война и мир", lev2, 1863);

        if (lev.equals(nik)) {
            System.out.println("Авторы одинаковые");
        } else {
            System.out.println("Авторы разные");
        }
        if (lev.equals(lev2)) {
            System.out.println("Авторы одинаковые");
        } else {
            System.out.println("Авторы разные");
        }

        if (war.equals(souls)) {
            System.out.println("Книги одинаковые");
        } else {
            System.out.println("Книги разные");
        }
        if (war.equals(war2)) {
            System.out.println("Книги одинаковые");
        } else {
            System.out.println("Книги разные");
        }

    }
}