package Assignment3;

abstract class Payment {
	int paymentId;
	double amount;
	String payerName;
	String status;
	Payment() {
		this.paymentId = 0;
		this.amount = 0;
		this.payerName = "not given";
		this.status ="PENDING";
	}
	Payment(int paymentId, double amount, String payerName) {
		this.paymentId = paymentId;
		this.amount = amount;
		this.payerName = payerName;
		this.status ="PENDING";
	}
	
	int getPaymentId() {
		return paymentId;
	}
	void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	double getAmount() {
		return amount;
	}
	void setAmount(double amount) {
		this.amount = amount;
	}
	String getPayerName() {
		return payerName;
	}
	void setPayerName(String payerName) {
		this.payerName = payerName;
	}
	String getStatus() {
		return status;
	}
	void setStatus(String status) {
		this.status = status;
	}
	
	
	void printSummary() {
        System.out.println("\nPayment ID : " + paymentId);
        System.out.println("Payer Name : " + payerName);
        System.out.println("Amount     : " + amount);
        System.out.println("Status     : " + status);
    }
	
	final void process() {
		if(validate()==false) {
			status = "FAILED";
            System.out.println("\n\nValidation Failed!");
            return;
		}
		deductAmount();
        sendNotification();
        this.status = "SUCCESS"; 
	}
	public String toString() {
	    return "\nPayment Details:\n" +
	           "Payment ID : " + paymentId + "\n" +
	           "Payer Name : " + payerName + "\n" +
	           "Amount     : " + amount + "\n" +
	           "Status     : " + status + "\n";
	}
	
	abstract boolean validate();
	abstract void  deductAmount();
	abstract void sendNotification();
}
//class payment ends here
class CardPayment extends Payment{
	String cardNumber;
	String cvv;
	CardPayment() {
		super();
		this.cardNumber = "not given";
		this.cvv = "0";
	}
	CardPayment(int paymentId, double amount, String payerName,String cardNumber, String cvv) {
		super(paymentId,amount,payerName);
		this.cardNumber = cardNumber;
		this.cvv = cvv;
	}
	
	String getCardNumber() {
		return cardNumber;
	}
	void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	String getCvv() {
		return cvv;
	}
	void setCvv(String cvv) {
		this.cvv = cvv;
	}
	
	
	boolean validate() {
		System.out.println("\n\nValidating Card Payment");
		if (cardNumber.length() != 16) {
            System.out.println("Invalid Card Number!");
            return false;
        }
		
		if (cvv.length() != 3) {
            System.out.println("Invalid CVV!");
            return false;
        }
		
		if (amount <= 0) {
            System.out.println("Amount must be greater than 0!");
            return false;
        }
		
		return true;
	}
	
	void deductAmount() {
		System.out.println("Deducting amount Rs. " + amount + " from Card Number: " + cardNumber);
		
	}
	
	void sendNotification() {
		System.out.println("Sending Card Payment Notification to " + payerName);
		
	}
	public String toString() {
	    return "\n--- Card Payment Details ---\n" +
	           super.toString() +
	           "Card Number: " + cardNumber + "\n" +
	           "CVV        : " + cvv + "\n";
	}
}
//class cardpayment ends here

class UPIPayment extends Payment {
    String upiId;

    UPIPayment() {
        super();
        this.upiId = "not given";
    }

    UPIPayment(int paymentId, double amount, String payerName, String upiId) {
        super(paymentId, amount, payerName);
        this.upiId = upiId;
    }

    String getUpiId() {
        return upiId;
    }

    void setUpiId(String upiId) {
        this.upiId = upiId;
    }

    boolean validate() {
        System.out.println("\n\nValidating UPI Payment");

        if (upiId.contains("@")==false) {
            System.out.println("Invalid UPI ID!");
            return false;
        }

        if (amount < 1 || amount > 100000) {
            System.out.println("Amount must be between 1 and 100000!");
            return false;
        }

        return true;
    }

    void deductAmount() {
        System.out.println("Deducting Rs. " + amount + " via UPI ID: " + upiId);
    }

    void sendNotification() {
        System.out.println("Sending UPI Payment Notification to " + payerName);
    }
    public String toString() {
        return "\n--- UPI Payment Details ---\n" +
               super.toString() +
               "UPI ID     : " + upiId + "\n";
    }
}
// class UPIPayment ends here


class TestPayment {
    public static void main(String[] args) {

       
        Payment p1 = new CardPayment(101, 2500, "Rahul", "1234567812345678", "123");
        System.out.println(p1);
        Payment p2 = new CardPayment(102, -500, "Amit", "9876543212345678", "999");
        System.out.println(p2);
        Payment p3 = new UPIPayment(201, 5000, "Priya", "priya@ybl");
        System.out.println(p3);
        Payment p4 = new UPIPayment(202, 250000, "Rohit", "rohit@upi");
        System.out.println(p4);

       
        p1.process();
        p1.printSummary();

        p2.process();
        p2.printSummary();

        p3.process();
        p3.printSummary();

        p4.process();
        p4.printSummary();
    }
}
