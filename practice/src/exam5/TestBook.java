package exam5;

class Book {
    private String name;
    private String author;

    Book() {}

    Book(String name, String author) {
        name = name;
        author = author;
    }

    String getName() {
        return name;
    }

    String getAuthor() {
        return author;
    }
}

public class TestBook {
    public static void main(String[] args) {
//        private Book book = new Book("Head First Java", "Kathy Sierra");      //private caused compilation error
        Book book = new Book("Head First Java", "Kathy Sierra");
        System.out.println(book.getName());
        System.out.println(book.getAuthor());
    }
}

/*
    Variable 'book' in main(String[]) method of TestBook class cannot be declared private as it
    is a local variable. Hence, there is a compilation error in TestBook class.

    Only final modifier can be used with local variables.
*/