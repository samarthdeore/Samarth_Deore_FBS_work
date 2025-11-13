
class Defence {
	String nameOfHead;
	int noOfTroops;
	double budget;
	int noOfDept;
	int noOfVehicle;
	String locationHeadQuarters;
	String countryName;
	int manPowerCount;
	int noOfMissionsPerformed;
	int noOfCasualties;
	int noOfBases;
	
	Defence() {
		this.nameOfHead = "not given";
		this.noOfTroops = 0;
		this.budget = 0;
		this.noOfDept = 0;
		this.noOfVehicle = 0;
		this.locationHeadQuarters = "not given";
		this.countryName = "not given";
		this.manPowerCount = 0;
		this.noOfMissionsPerformed = 0;
		this.noOfCasualties = 0;
		this.noOfBases = 0;
	}
	
	Defence(String nameOfHead, int noOfTroops, double budget, int noOfDept, int noOfVehicle,
			String locationHeadQuarters, String countryName, int manPowerCount, int noOfMissionsPerformed,
			int noOfCasualties, int noOfBases) {
		this.nameOfHead = nameOfHead;
		this.noOfTroops = noOfTroops;
		this.budget = budget;
		this.noOfDept = noOfDept;
		this.noOfVehicle = noOfVehicle;
		this.locationHeadQuarters = locationHeadQuarters;
		this.countryName = countryName;
		this.manPowerCount = manPowerCount;
		this.noOfMissionsPerformed = noOfMissionsPerformed;
		this.noOfCasualties = noOfCasualties;
		this.noOfBases = noOfBases;
	}

	String getNameOfHead() {
		return nameOfHead;
	}

	void setNameOfHead(String nameOfHead) {
		this.nameOfHead = nameOfHead;
	}

	int getNoOfTroops() {
		return noOfTroops;
	}

	void setNoOfTroops(int noOfTroops) {
		this.noOfTroops = noOfTroops;
	}

	double getBudget() {
		return budget;
	}

	void setBudget(double budget) {
		this.budget = budget;
	}

	int getNoOfDept() {
		return noOfDept;
	}

	void setNoOfDept(int noOfDept) {
		this.noOfDept = noOfDept;
	}

	int getNoOfVehicle() {
		return noOfVehicle;
	}

	void setNoOfVehicle(int noOfVehicle) {
		this.noOfVehicle = noOfVehicle;
	}

	String getLocationHeadQuarters() {
		return locationHeadQuarters;
	}

	void setLocationHeadQuarters(String locationHeadQuarters) {
		this.locationHeadQuarters = locationHeadQuarters;
	}

	String getCountryName() {
		return countryName;
	}

	void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	int getManPowerCount() {
		return manPowerCount;
	}

	void setManPowerCount(int manPowerCount) {
		this.manPowerCount = manPowerCount;
	}

	int getNoOfMissionsPerformed() {
		return noOfMissionsPerformed;
	}

	void setNoOfMissionsPerformed(int noOfMissionsPerformed) {
		this.noOfMissionsPerformed = noOfMissionsPerformed;
	}

	int getNoOfCasualties() {
		return noOfCasualties;
	}

	void setNoOfCasualties(int noOfCasualties) {
		this.noOfCasualties = noOfCasualties;
	}

	int getNoOfBases() {
		return noOfBases;
	}

	void setNoOfBases(int noOfBases) {
		this.noOfBases = noOfBases;
	}
	
	void display() {
	    System.out.println("\n--- Defence Details ---");
	    System.out.println("Name of Head: " + this.nameOfHead);
	    System.out.println("Number of Troops: " + this.noOfTroops);
	    System.out.println("Budget: " + this.budget);
	    System.out.println("Number of Departments: " + this.noOfDept);
	    System.out.println("Number of Vehicles: " + this.noOfVehicle);
	    System.out.println("Headquarters Location: " + this.locationHeadQuarters);
	    System.out.println("Country Name: " + this.countryName);
	    System.out.println("Manpower Count: " + this.manPowerCount);
	    System.out.println("Number of Missions Performed: " + this.noOfMissionsPerformed);
	    System.out.println("Number of Casualties: " + this.noOfCasualties);
	    System.out.println("Number of Bases: " + this.noOfBases);
	}
	void attack() {
		System.out.println("attack on enemies");
	}

	
}
//class defence ends here

class Army extends Defence{
	int noOfTanks;
	int noOfGuns;
	int noOfGranads;
	int noOfBatallion;
	
	Army() {
		super();
		this.noOfTanks = 0;
		this.noOfGuns = 0;
		this.noOfGranads = 0;
		this.noOfBatallion = 0;
	}
	
	Army(String nameOfHead, int noOfTroops, double budget, int noOfDept, int noOfVehicle,
			String locationHeadQuarters, String countryName, int manPowerCount, int noOfMissionsPerformed,
			int noOfCasualties, int noOfBases,int noOfTanks, int noOfGuns, int noOfGranads, int noOfBatallion) {
		super(nameOfHead,noOfTroops,budget,noOfDept,noOfVehicle,locationHeadQuarters,countryName,manPowerCount,noOfMissionsPerformed,noOfCasualties,noOfBases);
		this.noOfTanks = noOfTanks;
		this.noOfGuns = noOfGuns;
		this.noOfGranads = noOfGranads;
		this.noOfBatallion = noOfBatallion;
	}

	int getNoOfTanks() {
		return noOfTanks;
	}

	void setNoOfTanks(int noOfTanks) {
		this.noOfTanks = noOfTanks;
	}

	int getNoOfGuns() {
		return noOfGuns;
	}

	void setNoOfGuns(int noOfGuns) {
		this.noOfGuns = noOfGuns;
	}

	int getNoOfGranads() {
		return noOfGranads;
	}

	void setNoOfGranads(int noOfGranads) {
		this.noOfGranads = noOfGranads;
	}

	int getNoOfBatallion() {
		return noOfBatallion;
	}

	void setNoOfBatallion(int noOfBatallion) {
		this.noOfBatallion = noOfBatallion;
	}
	
	void display() {
	    super.display();  // Display Defence class details
	    System.out.println("\n--- Army Specific Details ---");
	    System.out.println("Number of Tanks: " + this.noOfTanks);
	    System.out.println("Number of Guns: " + this.noOfGuns);
	    System.out.println("Number of Grenades: " + this.noOfGranads);
	    System.out.println("Number of Battalions: " + this.noOfBatallion);
	}
	void attack() {
		System.out.println("attack on enemies using guns");
	}

}
//class army ends here

class Navy extends Defence{
	int noOfShips;
	int noOfSubmariens;
	int noOfTorpedoes;
	
	Navy() {
		super();
		this.noOfShips = 0;
		this.noOfSubmariens = 0;
		this.noOfTorpedoes = 0;
	}
	Navy(String nameOfHead, int noOfTroops, double budget, int noOfDept, int noOfVehicle,
			String locationHeadQuarters, String countryName, int manPowerCount, int noOfMissionsPerformed,
			int noOfCasualties, int noOfBases,int noOfShips, int noOfSubmariens, int noOfTorpedoes) {
		super(nameOfHead,noOfTroops,budget,noOfDept,noOfVehicle,locationHeadQuarters,countryName,manPowerCount,noOfMissionsPerformed,noOfCasualties,noOfBases);
		this.noOfShips = noOfShips;
		this.noOfSubmariens = noOfSubmariens;
		this.noOfTorpedoes = noOfTorpedoes;
	}
	int getNoOfShips() {
		return noOfShips;
	}
	void setNoOfShips(int noOfShips) {
		this.noOfShips = noOfShips;
	}
	int getNoOfSubmariens() {
		return noOfSubmariens;
	}
	void setNoOfSubmariens(int noOfSubmariens) {
		this.noOfSubmariens = noOfSubmariens;
	}
	int getNoOfTorpedoes() {
		return noOfTorpedoes;
	}
	void setNoOfTorpedoes(int noOfTorpedoes) {
		this.noOfTorpedoes = noOfTorpedoes;
	}
	
	void display() {
	    super.display();  // Display inherited Defence class details
	    System.out.println("\n--- Navy Specific Details ---");
	    System.out.println("Number of Ships: " + this.noOfShips);
	    System.out.println("Number of Submarines: " + this.noOfSubmariens);
	    System.out.println("Number of Torpedoes: " + this.noOfTorpedoes);
	}
	void attack() {
		System.out.println("attack on enemies using torpedoes");
	}

	
}
//class navy ends here

class Air extends Defence {
    int noOfMissils;
    int noOfAircrafts;
    int noOfSquadeon;

    // Default constructor
    Air() {
        super();
        this.noOfMissils = 0;
        this.noOfAircrafts = 0;
        this.noOfSquadeon = 0;
    }

    // Parameterized constructor
    Air(String nameOfHead, int noOfTroops, double budget, int noOfDept, int noOfVehicle,
        String locationHeadQuarters, String countryName, int manPowerCount, int noOfMissionsPerformed,
        int noOfCasualties, int noOfBases, int noOfMissils, int noOfAircrafts, int noOfSquadeon) {
        
        super(nameOfHead, noOfTroops, budget, noOfDept, noOfVehicle,
              locationHeadQuarters, countryName, manPowerCount,
              noOfMissionsPerformed, noOfCasualties, noOfBases);
        
        this.noOfMissils = noOfMissils;
        this.noOfAircrafts = noOfAircrafts;
        this.noOfSquadeon = noOfSquadeon;
    }

    // Getters and Setters
    int getNoOfMissils() {
        return noOfMissils;
    }

    void setNoOfMissils(int noOfMissils) {
        this.noOfMissils = noOfMissils;
    }

    int getNoOfAircrafts() {
        return noOfAircrafts;
    }

    void setNoOfAircrafts(int noOfAircrafts) {
        this.noOfAircrafts = noOfAircrafts;
    }

    int getNoOfSquadeon() {
        return noOfSquadeon;
    }

    void setNoOfSquadeon(int noOfSquadeon) {
        this.noOfSquadeon = noOfSquadeon;
    }

    // Display method
    void display() {
        super.display();  // Display Defence details
        System.out.println("\n--- Air Force Specific Details ---");
        System.out.println("Number of Missiles: " + this.noOfMissils);
        System.out.println("Number of Aircrafts: " + this.noOfAircrafts);
        System.out.println("Number of Squadrons: " + this.noOfSquadeon);
    }
    void attack() {
		System.out.println("attack on enemies using missils");
	}
}

class TestDefence {
    public static void main(String[] args) {

       
//        Defence d1 = new Defence();
//        Defence d2 = new Defence("General Martin", 50000, 120000000.0, 6, 200, 
//                                  "Washington D.C.", "USA", 60000, 150, 200, 10);
//        d1.display();
//        d2.display();
//
//        Army a1 = new Army();
//        Army a2 = new Army("General Singh", 100000, 250000000.0, 8, 500, 
//                            "New Delhi", "India", 120000, 300, 500, 20, 
//                            1000, 50000, 2000, 50);
//        a1.display();
//        a2.display();
//
//        Navy n1 = new Navy();
//        Navy n2 = new Navy("Admiral Nelson", 80000, 180000000.0, 5, 300, 
//                            "London", "UK", 90000, 200, 300, 15, 
//                            50, 20, 200);
//        n1.display();
//        n2.display();
//
//        Air air1 = new Air();
//        Air air2 = new Air("Air Chief Marshal Rao", 70000, 220000000.0, 7, 400, 
//                            "Bangalore", "India", 80000, 250, 400, 12, 
//                            150, 120, 15);
//        air1.display();
//        air2.display();
        
        Defence d5=new Defence();
        d5.attack();
        d5=new Air();
        d5.attack();
        d5=new Navy();
        d5.attack();
        d5=new Army();
        d5.attack();
        
    }
}
