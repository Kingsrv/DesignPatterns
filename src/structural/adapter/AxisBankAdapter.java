package structural.adapter;

import structural.adapter.thirdParty.bank.AxisBankApi;

public class AxisBankAdapter implements BankApiAdapter{

    private AxisBankApi axisBankApi;

    public AxisBankAdapter() {
        this.axisBankApi = axisBankApi;
    }

    @Override
    public float checkBalance(String accNo, String pin) {
        return 0;
    }

    @Override
    public boolean  authenticate(String accNo, String pin) {
        return false;
    }

    @Override
    public boolean transaction(String fromAccNo, String toAccNo) {
        return false;
    }
}
