package io.turntabl;

public class CorporateClient extends Client {
    private String accountManagerName;

    public CorporateClient(String accountManager, int id, Level serviceLevel) {
        super(accountManager, id, serviceLevel);
        this.accountManagerName = accountManager;
    }

    @Override
    public String getName() {
        return this.accountManagerName;
    }
}
