/**
 *
 * @author ACER
 *NAMA              : Nurul Khafidoh
 *KELAS             : PBO RegPagi
 *NIM               : 22166012
 *DESKRIPSI PROGRAM : Program Latihan 55
 */

// Class Handphone
class Handphone {
    protected String manufacture;
    protected String operatingSystem;
    protected String model;
    protected int harga;

    public Handphone(String man, String os, String model, int harga) {
        this.manufacture = man;
        this.operatingSystem = os;
        this.model = model;
        this.harga = harga;
    }

    public void displayProduct() {
        System.out.println("Manufacture: " + manufacture);
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("Model: " + model);
        System.out.println("Harga: " + harga);
    }
}

// Class Android yang merupakan subclass dari Handphone
class Android extends Handphone {
    private String keyStore;

    public Android(String man, String os, String model, int harga, String keyStore) {
        super(man, os, model, harga);
        this.keyStore = keyStore;
    }

    public String getKeyStore() {
        return keyStore;
    }

    public void setKeyStore(String keyStore) {
        this.keyStore = keyStore;
    }
}

// Class BlackBerry yang merupakan subclass dari Handphone
class BlackBerry extends Handphone {
    private String pinBB;

    public BlackBerry(String man, String os, String model, int harga, String pinBB) {
        super(man, os, model, harga);
        this.pinBB = pinBB;
    }

    public String getPinBB() {
        return pinBB;
    }

    public void setPinBB(String pinBB) {
        this.pinBB = pinBB;
    }
}

// Class WindowsPhone yang merupakan subclass dari Handphone
class WindowsPhone extends Handphone {
    private String wpKeyStore;

    public WindowsPhone(String man, String os, String model, int harga, String wpKeyStore) {
        super(man, os, model, harga);
        this.wpKeyStore = wpKeyStore;
    }

    public String getWpKeyStore() {
        return wpKeyStore;
    }

    public void setWpKeyStore(String wpKeyStore) {
        this.wpKeyStore = wpKeyStore;
    }
}

public class PBOLat55 {
    public static void main(String[] args) {
        // Membuat objek Android
        Android android = new Android("Samsung", "Android", "Grand", 3000000, "234ibfd3840fo");
        android.displayProduct();
        System.out.println("Android Key Store: " + android.getKeyStore());
        System.out.println();

        // Membuat objek BlackBerry
        BlackBerry blackberry = new BlackBerry("BlackB", "RIM", "Curve", 2000000, "BHS249");
        blackberry.displayProduct();
        System.out.println("Pin: " + blackberry.getPinBB());
        System.out.println();

        // Membuat objek WindowsPhone
        WindowsPhone windowsPhone = new WindowsPhone("Nokia", "Win8", "Lumia", 1000000, "UUUQIJWORJ");
        windowsPhone.displayProduct();
        System.out.println("Wp Key Store: " + windowsPhone.getWpKeyStore());
    }
}
