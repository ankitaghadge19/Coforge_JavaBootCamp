package BeanInheritance.Models;

public class Book {
        private int BookId;
        private String Bookname;
        private String publisher;

        public int getBookId() {
            return BookId;
        }
        public void setBookId(int bookId) {
            BookId = bookId;
        }
        public String getBookname() {
            return Bookname;
        }
        public void setBookname(String bookname) {
            Bookname = bookname;
        }
        public String getPublisher() {
            return publisher;
        }
         public void setPublisher(String publisher) {
            this.publisher = publisher;
        }
        @Override
        public String toString(){
            return "Book details: "+ this.BookId+" | "+this.Bookname+" | "+this.publisher;
        }
}
