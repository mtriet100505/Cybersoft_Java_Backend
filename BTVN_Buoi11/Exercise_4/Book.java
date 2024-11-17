package Exercise_4;
public class Book {
    private String title;
    private String author;
    private String status;
    public Book(){}
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.status = "có sẵn";
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public void borrow(){
        if(status.equals("có sẵn")) {
            status = "đã mượn ";
            System.out.println("Sách: "+this.title+" đã được mượn ");
        }else{
            System.out.println("Sách: "+this.title+ " không có sẵn");
        }
    }
    public void returnBook(){
        if(status.equals("đã mượn ")){
            status="có sẵn";
            System.out.println("Sách "+this.title+" đã được trả");
        }else{
            System.out.println("Sách "+this.title+ " không cần trả ");
        }
    }
    @Override
    public String toString() {
        return "Book{" + "title='" + title + '\'' + ", author='" + author + '\'' + ", status='" + status + '\'' + '}';
    }
}
