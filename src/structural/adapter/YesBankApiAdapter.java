package structural.adapter;

import structural.adapter.thirdParty.bank.YesBankApi;

public class YesBankApiAdapter implements BankApiAdapter{

    private YesBankApi yesBankApi;

    public YesBankApiAdapter() {
        this.yesBankApi = yesBankApi;
    }

    @Override
    public float checkBalance(String accNo, String pin) {
        //write logic to check balance using YesBankApi
        return 0;
    }

    @Override
    public boolean authenticate(String accNo, String pin) {
        //write logic to authenticate using YesBankApi
        return false;
    }

    @Override
    public boolean transaction(String fromAccNo, String toAccNo) {
        //write logic to do transaction using YesBankApi
        return false;
    }
}
