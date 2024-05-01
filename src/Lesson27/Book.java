package Lesson27;

import java.util.Collections;

public class Book implements IBook{

      private String Title;
      private   String Author;
      private BookStatus status;

    public Book(BookStatus status) {
        this.status = status;
    }

    public Book(String title, String author) {
        Title = title;
        Author = author;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }

    @Override
    public void borrowBook() throws CustomException{
       if (status==BookStatus.AVAILABLE){
          status = BookStatus.BORROWED;
       }else {
           throw new CustomException("Bele bir kitab yoxdur");
       }
    }

    @Override
    public void returunBook() throws CustomException {
        if (status==BookStatus.BORROWED){
            status=BookStatus.AVAILABLE;
        }else {
            throw  new CustomException("kitab hazirda movcuddur");
        }
    }



}
