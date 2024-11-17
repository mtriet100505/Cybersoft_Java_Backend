package Exercise_4;

public class Test_Ex4 {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1=new Book("Phân tích thiết kế YC","Phạm Văn D");
        library.addBook(new Book("Lập trình Java", "Nguyễn Văn A"));
        library.addBook(new Book("Cơ sở dữ liệu", "Trần Văn B"));
        library.addBook(new Book("Nhập môn AI", "Lê Thị C"));
        library.addBook(book1);
        library.displayAvailableBooks();


        library.borrowBook("Lập trình Java");
        library.borrowBook("Nhập môn AI");

        library.displayAvailableBooks();

        library.returnBook("Lập trình Java");

        library.displayAvailableBooks();
    }
}
