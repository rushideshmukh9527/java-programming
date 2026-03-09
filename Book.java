public class Book {

          private int bookId;
          private String title;
          private String author;
          private boolean issued;
          private String issuedTo;


          public Book (int bookId ,String title,String author ) {
           this.bookId = bookId;
           this.title = title;
           this.author = author;
           this.issued = false;
           this.issuedTo = "";
}
        public int getBookId(){
           return bookId;
}
        public String getTitle(){
           return title;
}
        public String getAuthor(){
           return author;
}
        public boolean isIssued(){
           return issued;
}
        public String getIssuedTo(){
           return issuedTo;
}
        public void setIssued(boolean issued) {
           this.issued = issued;
}

        public void setIssuedTo(String issuedTo) {
           this.issuedTo = issuedTo;
}
     @Override
public String toString() {
    return "Book ID: " + bookId +
           ", Title: " + title +
           ", Author: " + author +
           ", Issued: " + issued +
           ", Issued To: " + issuedTo;
}
}