package Standard_Exams.may_2017;

import java.util.ArrayList;
import java.util.List;

public class CheckoutRecord {
    private final List<CheckoutRecordEntry> checkoutEntryList = new ArrayList<>();

    public List<CheckoutRecordEntry> getCheckoutEntryList() {
        return checkoutEntryList;
    }
    public void addCheckoutEntry(CheckoutRecordEntry entry){
        checkoutEntryList.add(entry);
    }
}