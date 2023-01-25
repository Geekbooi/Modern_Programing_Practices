package Standard_Exams.may_2017;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CheckoutRecordEntry {
    private LocalDate checkoutDate;
    private LocalDate dueDate;
    private LendingItem lendingitem;
    private ItemType itemType;

    public CheckoutRecordEntry(LendingItem lendingitem,LocalDate checkoutDate, LocalDate dueDate,  ItemType itemType) {
        this.checkoutDate = checkoutDate;
        this.dueDate = dueDate;
        this.lendingitem = lendingitem;
        this.itemType = itemType;
    }

    public void setCheckoutDate(LocalDate checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    public LocalDate getCheckoutDate() {
        return checkoutDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public LendingItem getLendingitem() {
        return lendingitem;
    }

    public ItemType getItemType() {
        return itemType;
    }
}
