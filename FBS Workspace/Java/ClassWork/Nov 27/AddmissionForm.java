package classwork;

public class AddmissionForm {
	String studentName;
	int age;
	double percentage ;
	double courseFees ;
	double feesPaid ;
	AddmissionForm(String studentName, int age, double percentage, double courseFees, double feesPaid) {
		this.studentName = studentName;
		this.age = age;
		this.percentage = percentage;
		this.courseFees = courseFees;
		this.feesPaid = feesPaid;
	}
	String getStudentName() {
		return studentName;
	}
	void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	int getAge() {
		return age;
	}
	void setAge(int age) {
		this.age = age;
	}
	double getPercentage() {
		return percentage;
	}
	void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	double getCourseFees() {
		return courseFees;
	}
	void setCourseFees(double courseFees) {
		this.courseFees = courseFees;
	}
	double getFeesPaid() {
		return feesPaid;
	}
	void setFeesPaid(double feesPaid) {
		this.feesPaid = feesPaid;
	}
	
	public void validateForm() throws EmptyNameException, UnderageException, InvalidPercentageException, NotFitForAdmissionException,
	FeesNotPaidException, InsufficientFeesException{
		if(this.studentName==" ") {
			throw new EmptyNameException();
		}
		else if(this.age<17) {
			throw new UnderageException();
		}
		else if(this.percentage<0 && this.percentage>100) {
			throw new InvalidPercentageException ();
		}
		else if(this.percentage<35) {
			throw new NotFitForAdmissionException ();
		}
		else if(this.feesPaid<0) {
			throw new FeesNotPaidException ();
		}
		else if(this.feesPaid<this.courseFees*0.30) {
			throw new InsufficientFeesException  ();
		}
	}
}
class TestAddmission{
	public static void main(String[] args) {
		AddmissionForm a1=new AddmissionForm("Adi",18,38,3800,2000);
		try {
			a1.validateForm();
			System.out.println("Admission Successful!");
		} catch (EmptyNameException | UnderageException | InvalidPercentageException | NotFitForAdmissionException
				| FeesNotPaidException | InsufficientFeesException e) {
			System.out.println(e);
		}
	}
}
