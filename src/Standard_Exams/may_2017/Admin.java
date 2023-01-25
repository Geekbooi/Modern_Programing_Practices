package Standard_Exams.may_2017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Admin {
    //Returns phone numbers (in sorted order) of the Library Members who have ever checked out the specified lending item
    public static List<String> getPhoneNums(LibraryMember[] members, LendingItem item) {
        List<String> phoneNums = new ArrayList<>();
        for(LibraryMember member : members){
            List<CheckoutRecordEntry> checkoutRecordEntryList = member.getcheckoutRecord().getCheckoutEntryList();
            for(CheckoutRecordEntry check : checkoutRecordEntryList){
                if(check.getLendingitem().equals(item)){
                    phoneNums.add(member.getPhone());
                    }
                }
            }


        return phoneNums;

    }
}
