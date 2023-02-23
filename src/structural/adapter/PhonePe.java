package structural.adapter;

public class PhonePe {
    private BankApiAdapter bankApiAdapter;

    public PhonePe(BankApiAdapter bankApiAdapter) {
        this.bankApiAdapter = bankApiAdapter;
    }

    public boolean doTransaction(String fromAcc, String toAcc, String pin, float amount){
        if(bankApiAdapter.authenticate(fromAcc, pin)){
            float bal = bankApiAdapter.checkBalance(fromAcc, pin);
            if(bal >= amount){
                if(bankApiAdapter.transaction(fromAcc,toAcc)){
                    return true;
                }
            }
        }
        return false;
    }
}
