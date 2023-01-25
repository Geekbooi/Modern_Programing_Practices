package Standard_Exams.may_2017;

public class Book extends LendingItem{
    private String isbn;
    private String title;
    private String authorFirstName;
    private String authorLastName;

    public Book(String isbn, String title, String authorFirstName, String authorLastName) {
        this.isbn = isbn;
        this.title = title;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
    }
    @Override
    public boolean equals(Object obj) {
        return obj instanceof  Book && ( (Book) obj).isbn.equals(this.isbn);
    }

}
