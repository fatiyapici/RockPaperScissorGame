import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen seçiminizi yapınız.");
        System.out.println("Taş: T --- Kağıt: K --- Makas: M");

        String weaponType = scanner.nextLine();
        weaponType = weaponType.trim();
        if (weaponType.equals("T")) {
            System.out.println("Seçiminiz: " + weaponType + "-> Taş");
        }
        if (weaponType.equals("K")) {
            System.out.println("Seçiminiz: " + weaponType + "-> Kağıt");
        }
        if (weaponType.equals("M")) {
            System.out.println("Seçiminiz: " + weaponType + "-> Makas");
        }

        Random rand = new Random();
        int nxt = rand.nextInt(2);
        ArrayList<String> weapon = new ArrayList<String>();
        weapon.add("Taş");
        weapon.add("Kağıt");
        weapon.add("Makas");
        var bilgisayarSecimi = weapon.get(nxt);

        if (weaponType.equals("T") && bilgisayarSecimi.equals("Taş")) {
            System.out.println("Bilgisayarın seçimi:"+bilgisayarSecimi);
            System.out.println("Berabere");
        }
        if (weaponType.equals("T") && bilgisayarSecimi.equals("Kağıt")) {
            System.out.println("Bilgisayarın seçimi:"+bilgisayarSecimi);
            System.out.println("Kaybettiniz");
        }
        if (weaponType.equals("T") && bilgisayarSecimi.equals("Makas")) {
            System.out.println("Bilgisayarın seçimi:"+bilgisayarSecimi);
            System.out.println("Kazandınız");
        }
        if (weaponType.equals("K") && bilgisayarSecimi.equals("Taş")) {
            System.out.println("Bilgisayarın seçimi:"+bilgisayarSecimi);
            System.out.println("Kazandınız");
        }
        if (weaponType.equals("K") && bilgisayarSecimi.equals("Kağıt")) {
            System.out.println("Bilgisayarın seçimi:"+bilgisayarSecimi);
            System.out.println("Berabere");
        }
        if (weaponType.equals("K") && bilgisayarSecimi.equals("Makas")) {
            System.out.println("Bilgisayarın seçimi:"+bilgisayarSecimi);
            System.out.println("Kaybettiniz");
        }
        if (weaponType.equals("M") && bilgisayarSecimi.equals("Taş")) {
            System.out.println("Bilgisayarın seçimi:"+bilgisayarSecimi);
            System.out.println("Kaybettiniz");
        }
        if (weaponType.equals("M") && bilgisayarSecimi.equals("Kağıt")) {
            System.out.println("Bilgisayarın seçimi:"+bilgisayarSecimi);
            System.out.println("Kazandınız");
        }
        if (weaponType.equals("M") && bilgisayarSecimi.equals("Makas")) {
            System.out.println("Bilgisayarın seçimi:"+bilgisayarSecimi);
            System.out.println("Berabere");
        }
    }
}

