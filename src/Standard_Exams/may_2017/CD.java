package Standard_Exams.may_2017;

public class CD extends LendingItem{
    private String productId;
    private String title;
    private String company;

    public CD(String productId, String title, String company) {
        this.productId = productId;
        this.title = title;
        this.company = company;
    }
    @Override
    public boolean equals(Object obj) {
        return obj instanceof CD && ((CD) obj).productId.equals(productId) && ((CD) obj).title.equals(this.title);
    }
}
