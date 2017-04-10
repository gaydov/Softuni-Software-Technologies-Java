import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class BookLibraryModification {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String[] quantityBooksStr = console.nextLine().split(" ");
        int quantityBooks = Integer.parseInt(quantityBooksStr[0]);
        Library privateLib = new Library();
        privateLib.setBooks(new ArrayList<Book>());
        ArrayList<Book> listBooks = new ArrayList<>();

        for (int i = 0; i < quantityBooks; i++) {
            String[] bookArgs = console.nextLine().split(" ");
            Book currentBook = new Book();
            currentBook.setTitle(bookArgs[0]);
            currentBook.setAuthor(bookArgs[1]);
            currentBook.setPublisher(bookArgs[2]);
            LocalDate date = LocalDate.from(f.parse(bookArgs[3]));
            currentBook.setReleaseDate(date);
            currentBook.setISBN(bookArgs[4]);
            currentBook.setPrice(Double.parseDouble(bookArgs[5]));

            listBooks.add(currentBook);
        }
        privateLib.setBooks(listBooks);

        String newLine = System.getProperty("line.separator");
        String afterDateStr = console.nextLine();
        LocalDate afterDate = LocalDate.from(f.parse(afterDateStr));

        List<Book> result = privateLib.getBooks().stream()
                .filter(b -> b.getReleaseDate().isAfter(afterDate))
                .sorted(Comparator.comparing(Book::getReleaseDate)
                        .thenComparing(Book::getTitle))
                .collect(Collectors.toList());


        for (int i = 0; i < result.size(); i++) {
            System.out.printf("%s -> %s%s", result.get(i).getTitle(), result.get(i).getReleaseDate().format(f), newLine);
        }
    }

    public static class Book {
        public String getTitle() {
            return Title;
        }

        private void setTitle(String title) {
            Title = title;
        }

        private String getAuthor() {
            return Author;
        }

        private void setAuthor(String author) {
            Author = author;
        }

        public String getPublisher() {
            return Publisher;
        }

        private void setPublisher(String publisher) {
            Publisher = publisher;
        }

        public LocalDate getReleaseDate() {
            return ReleaseDate;
        }

        private void setReleaseDate(LocalDate releaseDate) {
            ReleaseDate = releaseDate;
        }

        public String getISBN() {
            return ISBN;
        }

        private void setISBN(String ISBN) {
            this.ISBN = ISBN;
        }

        private double getPrice() {
            return Price;
        }

        private void setPrice(double price) {
            Price = price;
        }

        private String Title;
        private String Author;
        private String Publisher;
        private LocalDate ReleaseDate;
        private String ISBN;
        private double Price;
    }

    public static class Library {
        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        private ArrayList<Book> getBooks() {
            return Books;
        }

        private void setBooks(ArrayList<Book> books) {
            Books = books;
        }

        private String Name;
        private ArrayList<Book> Books;
    }
}
