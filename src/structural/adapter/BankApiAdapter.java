package structural.adapter;

public interface BankApiAdapter {

    float checkBalance(String accNo, String pin);
    boolean authenticate(String accNo, String pin);
    boolean transaction(String fromAccNo, String toAccNo);
}
