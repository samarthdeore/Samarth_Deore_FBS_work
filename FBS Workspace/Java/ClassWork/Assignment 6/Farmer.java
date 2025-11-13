class Farmer {
	
	int farmerId;
	String farmerName;
	double landArea;
	String city;
	double annualIncoume;
	int noOfEquipments;
	double insuarnceAmt;
	
	Farmer() {
		
		this.farmerId = 0;
		this.farmerName = "not given";
		this.landArea = 0;
		this.city = "not Given";
		this.annualIncoume = 0;
		this.noOfEquipments = 0;
		this.insuarnceAmt = 0;
	}
	Farmer(int farmerId, String farmerName, double landArea, String city, double annualIncoume, int noOfEquipments,
			double insuarnceAmt) {
		
		this.farmerId = farmerId;
		this.farmerName = farmerName;
		this.landArea = landArea;
		this.city = city;
		this.annualIncoume = annualIncoume;
		this.noOfEquipments = noOfEquipments;
		this.insuarnceAmt = insuarnceAmt;
	}
	int getFarmerId() {
		return farmerId;
	}
	void setFarmerId(int farmerId) {
		this.farmerId = farmerId;
	}
	String getFarmerName() {
		return farmerName;
	}
	void setFarmerName(String farmerName) {
		this.farmerName = farmerName;
	}
	double getLandArea() {
		return landArea;
	}
	void setLandArea(double landArea) {
		this.landArea = landArea;
	}
	String getCity() {
		return city;
	}
	void setCity(String city) {
		this.city = city;
	}
	double getAnnualIncoume() {
		return annualIncoume;
	}
	void setAnnualIncoume(double annualIncoume) {
		this.annualIncoume = annualIncoume;
	}
	int getNoOfEquipments() {
		return noOfEquipments;
	}
	void setNoOfEquipments(int noOfEquipments) {
		this.noOfEquipments = noOfEquipments;
	}
	double getInsuarnceAmt() {
		return insuarnceAmt;
	}
	void setInsuarnceAmt(double insuarnceAmt) {
		this.insuarnceAmt = insuarnceAmt;
	}
	
	void display() {
	    System.out.println("\n--- Farmer Details ---");
	    System.out.println("Farmer ID: " + this.farmerId);
	    System.out.println("Farmer Name: " + this.farmerName);
	    System.out.println("Land Area: " + this.landArea);
	    System.out.println("City: " + this.city);
	    System.out.println("Annual Income: " + this.annualIncoume);
	    System.out.println("Number of Equipments: " + this.noOfEquipments);
	    System.out.println("Insurance Amount: " + this.insuarnceAmt);
	}
	void calSubsidy() {
		System.out.println("Subsidy received!!");
	}
}
//class farmer ends here

class DairyFarmer extends Farmer{
	int noOfCattles;
	double milkProducePerDay;
	int dairyLincenceNo;
	
	DairyFarmer() {
		super();
		this.noOfCattles = 0;
		this.milkProducePerDay = 0;
		this.dairyLincenceNo = 0;
	}
	DairyFarmer(int farmerId, String farmerName, double landArea, String city, double annualIncoume, int noOfEquipments,
			double insuarnceAmt,int noOfCattles, double milkProducePerDay, int dairyLincenceNo) {
		super(farmerId,farmerName,landArea,city,annualIncoume,noOfEquipments,insuarnceAmt);
		this.noOfCattles = noOfCattles;
		this.milkProducePerDay = milkProducePerDay;
		this.dairyLincenceNo = dairyLincenceNo;
	}
	int getNoOfCattles() {
		return noOfCattles;
	}
	void setNoOfCattles(int noOfCattles) {
		this.noOfCattles = noOfCattles;
	}
	double getMilkProducePerDay() {
		return milkProducePerDay;
	}
	void setMilkProducePerDay(double milkProducePerDay) {
		this.milkProducePerDay = milkProducePerDay;
	}
	int getDairyLincenceNo() {
		return dairyLincenceNo;
	}
	void setDairyLincenceNo(int dairyLincenceNo) {
		this.dairyLincenceNo = dairyLincenceNo;
	}
	
	void display() {
	    super.display();  
	    System.out.println("\n--- Dairy Farmer Specific Details ---");
	    System.out.println("Number of Cattles: " + this.noOfCattles);
	    System.out.println("Milk Produced Per Day: " + this.milkProducePerDay + " liters");
	    System.out.println("Dairy Licence Number: " + this.dairyLincenceNo);
	}
	void calSubsidy() {
		System.out.println("Subsidy received baised on Cattles!!");
	}
}
// class dairyFarmer ends here

class PoultyFarmer extends Farmer{
	int noOfChikens;
	int noOfShads;
	int eggsProducePerDay;
	String poultyFarmNm;
	
	PoultyFarmer() {
		super();
		this.noOfChikens = 0;
		this.noOfShads = 0;
		this.eggsProducePerDay = 0;
		this.poultyFarmNm = "not Given";
	}

	PoultyFarmer(int farmerId, String farmerName, double landArea, String city, double annualIncoume, int noOfEquipments,
			double insuarnceAmt,int noOfChikens, int noOfShads, int eggsProducePerDay, String poultyFarmNm) {
		super(farmerId,farmerName,landArea,city,annualIncoume,noOfEquipments,insuarnceAmt);
		this.noOfChikens = noOfChikens;
		this.noOfShads = noOfShads;
		this.eggsProducePerDay = eggsProducePerDay;
		this.poultyFarmNm = poultyFarmNm;
	}

	int getNoOfChikens() {
		return noOfChikens;
	}

	void setNoOfChikens(int noOfChikens) {
		this.noOfChikens = noOfChikens;
	}

	int getNoOfShads() {
		return noOfShads;
	}

	void setNoOfShads(int noOfShads) {
		this.noOfShads = noOfShads;
	}

	int getEggsProducePerDay() {
		return eggsProducePerDay;
	}

	void setEggsProducePerDay(int eggsProducePerDay) {
		this.eggsProducePerDay = eggsProducePerDay;
	}

	String getPoultyFarmNm() {
		return poultyFarmNm;
	}

	void setPoultyFarmNm(String poultyFarmNm) {
		this.poultyFarmNm = poultyFarmNm;
	}
	
	void display() {
	    super.display();  // Display Farmer class details first
	    System.out.println("\n--- Poultry Farmer Specific Details ---");
	    System.out.println("Number of Chickens: " + this.noOfChikens);
	    System.out.println("Number of Sheds: " + this.noOfShads);
	    System.out.println("Eggs Produced Per Day: " + this.eggsProducePerDay);
	    System.out.println("Poultry Farm Name: " + this.poultyFarmNm);
	}
	void calSubsidy() {
		System.out.println("Subsidy received on base of Chikens!!");
	}
}

//class PoultyFArmer ends here

class OrganicFarmer extends Farmer{
	int organicerId;
	String cropType;
	int noOfFertilizerUsed;
	OrganicFarmer() {
		super();
		this.organicerId = 0;
		this.cropType = "Not GIven";
		this.noOfFertilizerUsed = 0;
	}
	OrganicFarmer(int farmerId, String farmerName, double landArea, String city, double annualIncoume, int noOfEquipments,
			double insuarnceAmt,int organicerId, String cropType, int noOfFertilizerUsed) {
		super(farmerId,farmerName,landArea,city,annualIncoume,noOfEquipments,insuarnceAmt);
		this.organicerId = organicerId;
		this.cropType = cropType;
		this.noOfFertilizerUsed = noOfFertilizerUsed;
	}
	int getOrganicerId() {
		return organicerId;
	}
	void setOrganicerId(int organicerId) {
		this.organicerId = organicerId;
	}
	String getCropType() {
		return cropType;
	}
	void setCropType(String cropType) {
		this.cropType = cropType;
	}
	int getNoOfFertilizerUsed() {
		return noOfFertilizerUsed;
	}
	void setNoOfFertilizerUsed(int noOfFertilizerUsed) {
		this.noOfFertilizerUsed = noOfFertilizerUsed;
	}
	
	void display() {
	    super.display();  // Display Farmer class details first
	    System.out.println("\n--- Organic Farmer Specific Details ---");
	    System.out.println("Organicer ID: " + this.organicerId);
	    System.out.println("Crop Type: " + this.cropType);
	    System.out.println("Number of Fertilizers Used: " + this.noOfFertilizerUsed);
	}
	void calSubsidy() {
		System.out.println("Subsidy received based on crops!!");
	}
}
//class OrganicFarmer ends here
 class TeatFarmer {
    public static void main(String[] args) {
        
        
//        Farmer f1 = new Farmer();
//        Farmer f2 = new Farmer(101, "Ramesh", 5.2, "Nashik", 250000.0, 3, 50000.0);
//        f1.display();
//        f2.display();
//          
//        DairyFarmer d1 = new DairyFarmer();
//        DairyFarmer d2 = new DairyFarmer(201, "Suresh", 6.5, "Pune", 320000.0, 4, 75000.0, 20, 150.5, 9876);
//        d1.display();
//        d2.display();
//        
//        PoultyFarmer p1 = new PoultyFarmer();
//        PoultyFarmer p2 = new PoultyFarmer(301, "Mahesh", 3.8, "Kolhapur", 280000.0, 2, 60000.0, 500, 4, 450, "Sunrise Poultry Farm");
//        p1.display();
//        p2.display();
//        
//        OrganicFarmer o1 = new OrganicFarmer();
//        OrganicFarmer o2 = new OrganicFarmer(401, "Ganesh", 8.0, "Satara", 400000.0, 5, 90000.0, 111, "Wheat", 2);
//        o1.display();
//        o2.display();
        
        Farmer f3=new Farmer();
        f3.calSubsidy();
        f3=new OrganicFarmer();
        f3.calSubsidy();
        
    }
    //main ends here
}
//class test ends here