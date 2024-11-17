package Exercise_4;
import java.util.List;
import java.util.ArrayList;
public class Library {
    private List<Book> books;
    public Library(){
        books=new ArrayList<>();
    }
   public void addBook(Book book){
        books.add(book);
   }
   public void displayAvailableBooks(){
       System.out.println("Danh sách có sẵn: ");
       boolean coSan=false;
       for(Book book:books){
           if(book.getStatus().equals("có sẵn")){
               System.out.println("- "+book);
               coSan=true;
           }
       }
       if(!coSan){
           System.out.println("Khong co sach nao. ");
       }
   }
   public void borrowBook(String title){
        boolean borrow_book=false;
        for(Book book:books){
            if(book.getTitle().equals(title)){
                book.borrow();
                borrow_book=true;
            }
        }
        if(!borrow_book){
            System.out.println("Không tìm thấy sách "+title);
        }
   }
   public void returnBook(String tile){
        boolean return_book=false;
        for(Book book:books){
            if(book.getTitle().equals(tile)){
                book.returnBook();
                return_book =true;
            }
        }
        if(!return_book){
            System.out.println("Không tìm thấy sách "+tile);
        }
   }
}
