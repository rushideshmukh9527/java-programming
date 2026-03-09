import java.util.ArrayList;
public class LibraryManager {
           private ArrayList<Book> books = new ArrayList<>();
          
           public void addBook(Book b){
           books.add(b);
           System.out.println("book added Succesfully ");
          }
          public void displayBooks(){
         
          if(books.isEmpty()){
          System.out.println("No books Available ");
          return ;
           }
          else {
          for(Book b : books){
          System.out.println(b);
          }
         
          }
      } 
         public Book findBookById(int id){
         for(Book b : books ) {
         if(b.getBookId() == id ) {
         return b;
           }
         }
            return null;
}
        public void searchBookByTitle(String title) {
         
        boolean found = false ;
        for(Book b : books ) {
        if(b.getTitle().equalsIgnoreCase(title)){
         System.out.println(b);
         found = true ;
        } 
}
        if(!found){
         System.out.println("book not found :");
         }
}
       public void issueBook(int id ,String studentName ){
       Book b = findBookById(id);
       
       if(b == null ){
       System.out.println("Book not Found ");
       return ;
       }
       if(b.isIssued()){
       System.out.println("BOok is already issued ");
       } 
        else {
        b.setIssued(true);
        b.setIssuedTo(studentName);
        System.out.println("Book issued succesfully ");
        }
      }
       public void returnBook(int id){
       Book b = findBookById(id);
        
       if(b== null){
        System.out.println("Book not found :");
        return ;
         }
        if(!b.isIssued()){
        System.out.println("Book is not issued");
        }
         else {
            b.setIssued(false);
            b.setIssuedTo("");
            System.out.println("Book returned Successfully :");
             }
}
      public void deleteBook(int id){
          Book b = findBookById(id);

         if(b != null ){
         books.remove(b);
         System.out.println("Book deleated successfully :");
         }
          else {
          System.out.println("Book not found :");
          }
}
}

       