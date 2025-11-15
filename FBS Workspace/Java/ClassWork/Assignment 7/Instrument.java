abstract class Instrument {
    String name;
    String type;
    double price;

    Instrument() {
        name = "Generic Instrument";
        type = "Unknown";
        price = 1000;
    }

    Instrument(String n, String t, double p) {
        name = n;
        type = t;
        price = p;
    }
    
    String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getType() {
		return type;
	}

	void setType(String type) {
		this.type = type;
	}

	double getPrice() {
		return price;
	}

	void setPrice(double price) {
		this.price = price;
	}

	void display() {
        System.out.println("Instrument name is " + name);
        System.out.println("Type is " + type);
        System.out.println("Price is " + price);
    }
	abstract void play() ;
	public String toString() {
	    return "Instrument Name: " + name +
	           "\nType: " + type +
	           "\nPrice: " + price;
	}
}
//class instrument ends here
class Guitar extends Instrument {
    int strings;

    Guitar() {
        super();
        strings = 6;
    }

    Guitar(String n, String t, double p, int s) {
        super(n, t, p);
        strings = s;
    }

    int getStrings() {
		return strings;
	}

	void setStrings(int strings) {
		this.strings = strings;
	}

	void display() {
        super.display();
        System.out.println("Number of strings is " + strings);
        System.out.println();
    }
	void play() {
        System.out.println("Guitar " + name + " with " + strings + " strings is strummed.");
    }
	public String toString() {
	    return super.toString() +
	           "\nStrings: " + strings;
	}
}
//class guitar ends here
class Piano extends Instrument {
    int keys;

    Piano() {
        super();
        keys = 88;
    }

    Piano(String n, String t, double p, int k) {
        super(n, t, p);
        keys = k;
    }

    int getKeys() {
		return keys;
	}

	void setKeys(int keys) {
		this.keys = keys;
	}

	void display() {
        super.display();
        System.out.println("Number of keys is " + keys);
        System.out.println();
    }
	void play() {
        System.out.println("Piano " + name + " with " + keys + " keys is being played melodiously.");
    }
	public String toString() {
	    return super.toString() +
	           "\nKeys: " + keys;
	}
}
//class piano ends here
class Drum extends Instrument {
    int size;

    Drum() {
        super();
        size = 20;
    }

    Drum(String n, String t, double p, int s) {
        super(n, t, p);
        size = s;
    }

    int getSize() {
		return size;
	}

	void setSize(int size) {
		this.size = size;
	}

	void display() {
        super.display();
        System.out.println("Drum size is " + size + " inches");
        System.out.println();
    }
	void play() {
        System.out.println("Drum " + name + " of size " + size + " inches is being beaten rhythmically.");
    }
	public String toString() {
	    return super.toString() +
	           "\nSize: " + size + " inches";
	}
}
//class drum ends here
class TestInstrument {
    public static void main(String[] args) {
//        System.out.println("--- Instruments ---");
//        Instrument i1 = new Instrument();
//        Instrument i2 = new Instrument("Flute", "Wind", 2000);
//        i1.display();
//        i2.display();
//
//        System.out.println("--- Guitars ---");
//        Guitar g1 = new Guitar();
//        Guitar g2 = new Guitar("Fender", "String", 35000, 6);
//        g1.display();
//        g2.display();
//
//        System.out.println("--- Pianos ---");
//        Piano p1 = new Piano();
//        Piano p2 = new Piano("Yamaha", "Keyboard", 50000, 88);
//        p1.display();
//        p2.display();
//
//        System.out.println("--- Drums ---");
//        Drum d1 = new Drum();
//        Drum d2 = new Drum("Pearl", "Percussion", 30000, 22);
//        d1.display();
//        d2.display();
    	Instrument[] instruments = new Instrument[3];

    	instruments[0] = new Guitar("Fender", "String", 35000, 6);
    	instruments[1] = new Piano("Yamaha", "Keyboard", 50000, 88);
    	instruments[2] = new Drum("Pearl", "Percussion", 30000, 22);
    	for(int i=0;i<instruments.length;i++) {
    		instruments[i].play();
    	}
    	System.out.println(instruments[1]);
    	System.out.println(instruments[1].toString());
    }
    //main ends here
}
//class test ends here