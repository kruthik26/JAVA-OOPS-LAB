/*   2. Develop a Java program to create a class Book with members Book ID, Title, Author, and Price. Use a constructor to initialize the details.
 Include methods to display book information, overload search() to search by Book ID and Title,
 and create a method that accepts another Book object and returns the costlier book.
  Use a static member to maintain the total number of books created.
 In the main class, create multiple book objects and demonstrate all the operations.  */
 
 
 class Book{
    int bookid;
    String booktitle;
    String author;
    double price;
    static int totalbooks;
    
    Book(int bookid,String booktitle,String author,double price){
       this.bookid=bookid;
       this.booktitle=booktitle;
       this.author=author;
       this.price=price;
       totalbooks++;
 }
 
 void diplay(){
   System.out.println("BOOK ID = "+bookid);
   System.out.println("BOOK TITLE = "+booktitle);
   System.out.println("BOOK AUTHOR = "+author);
   System.out.println("BOOK PRICE = "+price);
   System.out.println();

 }
 
  Book search(int bookid,String booktitle){
     if(this.bookid==bookid && this.booktitle==booktitle){
      System.out.println("Book Found");
      return null;
     }else{
       System.out.println("Book not Found");
       return null;
     } 
  }

  Book costlier(Book b){
    if(b.price<price ){
      System.out.println("Price" +price);

      return null;
     }else{
       System.out.println("Price" +b.price);
       return null;
     }
  }

 }
public class LAB2_book_details{
  public static void main(String[] args){
  
     System.out.println("NAME : Kruthik D");
     System.out.println("USN : 1WN25CS115");
     
    Book b1 = new Book(101, "Python", "Anthony", 2324.56);
    Book b2 = new Book(102, "Java", "James Gosling", 1899.50);
    Book b3 = new Book(103, "C Programming", "Dennis Ritchie", 1450.00);
    Book b4 = new Book(104, "Data Structures", "Seymour Lipschutz", 980.75);
    Book b5 = new Book(105, "Database Systems", "Raghu Ramakrishnan", 2100.25);
    
    Book b[]={b1,b2,b3,b4,b5};
    for(int i=0;i<b.length;i++){
      b[i].diplay();
      
     }
      System.out.println("Searching the Book");
     b1.search(101,"Python");
      System.out.println();
      
     System.out.println("Costlier Book ");
     b1.costlier(b2);
     System.out.println();
     
     System.out.println("TOTAL Book Found : "+Book.totalbooks);
     
  }
}