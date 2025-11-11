import java.time.LocalDate;

class BankAccount {
    String accountHolderName;
    int accountNumber;
    double balance;
    String branchName;
    LocalDate dateOpened;
    String accountType;
    boolean isActive;
    double minimumBalance;
    String currency;

    BankAccount() {
        this.accountHolderName = "Not Given";
        this.accountNumber = 0;
        this.balance = 0.0;
        this.branchName = "Not Given";
        this.dateOpened = LocalDate.now();
        this.accountType = "Not Given";
        this.isActive = false;
        this.minimumBalance = 0.0;
        this.currency = "INR";
    }

    BankAccount(String accountHolderName, int accountNumber, double balance, String branchName, LocalDate dateOpened,
                String accountType, boolean isActive, double minimumBalance, String currency) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.branchName = branchName;
        this.dateOpened = dateOpened;
        this.accountType = accountType;
        this.isActive = isActive;
        this.minimumBalance = minimumBalance;
        this.currency = currency;
    }

    String getAccountHolderName() { 
    	return accountHolderName; 
    }
    void setAccountHolderName(String accountHolderName) { 
    	this.accountHolderName = accountHolderName; 
    }

    int getAccountNumber() { 
    	return accountNumber; 
    }
    void setAccountNumber(int accountNumber) { 
    	this.accountNumber = accountNumber; 
    }

    double getBalance() { 
    	return balance; 
    }
    void setBalance(double balance) { 
    	this.balance = balance; 
    }

    String getBranchName() { 
    	return branchName; 
    }
    void setBranchName(String branchName) { 
    	this.branchName = branchName;
    }

    LocalDate getDateOpened() { 
    	return dateOpened;
    }
    void setDateOpened(LocalDate dateOpened) { 
    	this.dateOpened = dateOpened; 
    }

    String getAccountType() { 
    	return accountType; 
    }
    void setAccountType(String accountType) { 
    	this.accountType = accountType; 
    }

    boolean isActive() { 
    	return isActive; 
    }
    void setActive(boolean isActive) { 
    	this.isActive = isActive; 
    }

    double getMinimumBalance() { 
    	return minimumBalance; 
    }
    void setMinimumBalance(double minimumBalance) { 
    	this.minimumBalance = minimumBalance; 
    }

    String getCurrency() { 
    	return currency; 
    }
    void setCurrency(String currency) { 
    	this.currency = currency; 
    }

    void display() {
        System.out.println("\n--- Bank Account Details ---");
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Branch Name: " + branchName);
        System.out.println("Date Opened: " + dateOpened);
        System.out.println("Account Type: " + accountType);
        System.out.println("Is Active: " + isActive);
        System.out.println("Minimum Balance: " + minimumBalance);
        System.out.println("Currency: " + currency);
    }
}
// class BankAccount ends here

class SavingsAccount extends BankAccount {
    double interestRate;
    int withdrawalsThisMonth;
    boolean hasDebitCard;
    boolean hasNetBanking;
    boolean isSalaryAccount;

    SavingsAccount() {
        super();
        this.interestRate = 0.0;
        this.withdrawalsThisMonth = 0;
        this.hasDebitCard = false;
        this.hasNetBanking = false;
        this.isSalaryAccount = false;
    }

    SavingsAccount(String accountHolderName, int accountNumber, double balance, String branchName, LocalDate dateOpened,
                   String accountType, boolean isActive, double minimumBalance, String currency,
                   double interestRate, int withdrawalsThisMonth, boolean hasDebitCard, boolean hasNetBanking, boolean isSalaryAccount) {
        super(accountHolderName, accountNumber, balance, branchName, dateOpened, accountType, isActive, minimumBalance, currency);
        this.interestRate = interestRate;
        this.withdrawalsThisMonth = withdrawalsThisMonth;
        this.hasDebitCard = hasDebitCard;
        this.hasNetBanking = hasNetBanking;
        this.isSalaryAccount = isSalaryAccount;
    }

    double getInterestRate() { 
    	return interestRate; 
    }
    void setInterestRate(double interestRate) { 
    	this.interestRate = interestRate; 
    }

    int getWithdrawalsThisMonth() { 
    	return withdrawalsThisMonth; 
    }
    void setWithdrawalsThisMonth(int withdrawalsThisMonth) { 
    	this.withdrawalsThisMonth = withdrawalsThisMonth; 
    }

    boolean isHasDebitCard() { 
    	return hasDebitCard; 
    }
    void setHasDebitCard(boolean hasDebitCard) { 
    	this.hasDebitCard = hasDebitCard; 
    }

    boolean isHasNetBanking() { 
    	return hasNetBanking; 
    }
    void setHasNetBanking(boolean hasNetBanking) { 
    	this.hasNetBanking = hasNetBanking; 
    }

    boolean isSalaryAccount() { 
    	return isSalaryAccount; 
    }
    void setSalaryAccount(boolean salaryAccount) { 
    	isSalaryAccount = salaryAccount; 
    }

    void display() {
        super.display();
        System.out.println("\n--- Savings Account Specific Details ---");
        System.out.println("Interest Rate: " + interestRate);
        System.out.println("Withdrawals This Month: " + withdrawalsThisMonth);
        System.out.println("Has Debit Card: " + hasDebitCard);
        System.out.println("Has Net Banking: " + hasNetBanking);
        System.out.println("Is Salary Account: " + isSalaryAccount);
    }
}
// class SavingsAccount ends here

class CurrentAccount extends BankAccount {
    double overdraftLimit;
    String businessType;
    boolean hasChequeBook;
    boolean isPremium;
    int chequeBooksIssued;

    CurrentAccount() {
        super();
        this.overdraftLimit = 0.0;
        this.businessType = "Not Given";
        this.hasChequeBook = false;
        this.isPremium = false;
        this.chequeBooksIssued = 0;
    }

    CurrentAccount(String accountHolderName, int accountNumber, double balance, String branchName, LocalDate dateOpened,
                   String accountType, boolean isActive, double minimumBalance, String currency,
                   double overdraftLimit, String businessType, boolean hasChequeBook, boolean isPremium, int chequeBooksIssued) {
        super(accountHolderName, accountNumber, balance, branchName, dateOpened, accountType, isActive, minimumBalance, currency);
        this.overdraftLimit = overdraftLimit;
        this.businessType = businessType;
        this.hasChequeBook = hasChequeBook;
        this.isPremium = isPremium;
        this.chequeBooksIssued = chequeBooksIssued;
    }

    double getOverdraftLimit() { 
    	return overdraftLimit; 
    }
    void setOverdraftLimit(double overdraftLimit) { 
    	this.overdraftLimit = overdraftLimit; 
    }

    String getBusinessType() { 
    	return businessType; 
    }
    void setBusinessType(String businessType) { 
    	this.businessType = businessType; 
    }

    boolean isHasChequeBook() { 
    	return hasChequeBook; 
    }
    void setHasChequeBook(boolean hasChequeBook) {
    	this.hasChequeBook = hasChequeBook;
    }

    boolean isPremium() { 
    	return isPremium; 
    }
    void setPremium(boolean premium) { 
    	isPremium = premium; 
    }

    int getChequeBooksIssued() { 
    	return chequeBooksIssued; 
    }
    void setChequeBooksIssued(int chequeBooksIssued) { 
    	this.chequeBooksIssued = chequeBooksIssued; 
    }

    void display() {
        super.display();
        System.out.println("\n--- Current Account Specific Details ---");
        System.out.println("Overdraft Limit: " + overdraftLimit);
        System.out.println("Business Type: " + businessType);
        System.out.println("Has Cheque Book: " + hasChequeBook);
        System.out.println("Is Premium: " + isPremium);
        System.out.println("Cheque Books Issued: " + chequeBooksIssued);
    }
}
// class CurrentAccount ends here

class FixedDepositAccount extends BankAccount {
    int tenureMonths;
    double interestRate;
    LocalDate maturityDate;
    boolean autoRenewal;
    boolean prematureWithdrawalAllowed;

    FixedDepositAccount() {
        super();
        this.tenureMonths = 0;
        this.interestRate = 0.0;
        this.maturityDate = LocalDate.now();
        this.autoRenewal = false;
        this.prematureWithdrawalAllowed = false;
    }

    FixedDepositAccount(String accountHolderName, int accountNumber, double balance, String branchName, LocalDate dateOpened,
                        String accountType, boolean isActive, double minimumBalance, String currency,
                        int tenureMonths, double interestRate, LocalDate maturityDate, boolean autoRenewal, boolean prematureWithdrawalAllowed) {
        super(accountHolderName, accountNumber, balance, branchName, dateOpened, accountType, isActive, minimumBalance, currency);
        this.tenureMonths = tenureMonths;
        this.interestRate = interestRate;
        this.maturityDate = maturityDate;
        this.autoRenewal = autoRenewal;
        this.prematureWithdrawalAllowed = prematureWithdrawalAllowed;
    }

    int getTenureMonths() { 
    	return tenureMonths; 
    }
    void setTenureMonths(int tenureMonths) { 
    	this.tenureMonths = tenureMonths;
    }

    double getInterestRate() {
    	return interestRate; 
    }
    void setInterestRate(double interestRate) { 
    	this.interestRate = interestRate; 
    }

    LocalDate getMaturityDate() { 
    	return maturityDate; 
    }
    void setMaturityDate(LocalDate maturityDate) { 
    	this.maturityDate = maturityDate; 
    }

    boolean isAutoRenewal() { 
    	return autoRenewal; 
    }
    void setAutoRenewal(boolean autoRenewal) { 
    	this.autoRenewal = autoRenewal; 
    }

    boolean isPrematureWithdrawalAllowed() { 
    	return prematureWithdrawalAllowed; 
    }
    void setPrematureWithdrawalAllowed(boolean prematureWithdrawalAllowed) { 
    	this.prematureWithdrawalAllowed = prematureWithdrawalAllowed;
    }

    void display() {
        super.display();
        System.out.println("\n--- Fixed Deposit Account Specific Details ---");
        System.out.println("Tenure (Months): " + tenureMonths);
        System.out.println("Interest Rate: " + interestRate);
        System.out.println("Maturity Date: " + maturityDate);
        System.out.println("Auto Renewal: " + autoRenewal);
        System.out.println("Premature Withdrawal Allowed: " + prematureWithdrawalAllowed);
    }
}
// class FixedDepositAccount ends here

class TestBankAccount {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount("John Doe", 101, 50000, "Mumbai", LocalDate.of(2020, 1, 15), "General", true, 1000, "INR");
        b1.display();
        b2.display();

        SavingsAccount s1 = new SavingsAccount();
        SavingsAccount s2 = new SavingsAccount("Riya Sharma", 102, 70000, "Delhi", LocalDate.of(2021, 5, 10), "Savings", true, 5000, "INR",
                                               4.5, 2, true, true, true);
        s1.display();
        s2.display();

        CurrentAccount c1 = new CurrentAccount();
        CurrentAccount c2 = new CurrentAccount("Neha Verma", 103, 150000, "Bangalore", LocalDate.of(2019, 3, 5), "Current", true, 10000, "INR",
                                               50000, "Retail", true, true, 3);
        c1.display();
        c2.display();

        FixedDepositAccount f1 = new FixedDepositAccount();
        FixedDepositAccount f2 = new FixedDepositAccount("Amit Singh", 104, 200000, "Chennai", LocalDate.of(2022, 7, 20), "FD", true, 0, "INR",
                                                         12, 6.5, LocalDate.of(2023, 7, 20), true, false);
        f1.display();
        f2.display();
    }
}
//class testBankAccount ends here