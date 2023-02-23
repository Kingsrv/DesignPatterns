package structural.adapter;

import structural.adapter.thirdParty.bank.ICICIBankApi;

public class ICICIBankApiAdapter implements BankApiAdapter{

    private ICICIBankApi iciciBankApi;

    public ICICIBankApiAdapter() {
        this.iciciBankApi = iciciBankApi;
    }

    @Override
    public float checkBalance(String accNo, String pin) {
        //write logic to check balance using ICICIApi
        return 0;
    }

    @Override
    public boolean authenticate(String accNo, String pin) {
        //write logic to authenticate using ICICIApi
        return false;
    }

    @Override
    public boolean transaction(String fromAccNo, String toAccNo) {
        //write logic to do transaction using ICICIApi
        return false;
    }
}
