package juaracoding;

public class Percabangan {
    public static void main(String[] args) {
        if(false){
            System.out.println("Statement");
        }

        System.out.println("Next Statement");

        // program ganjil genap
        int platNomor = 1234;
        if(platNomor % 2 == 0){ // 0 == 0 (false)
            System.out.println("Plat Nomor Genap");
        } else{
            System.out.println("Plat Nomor Ganjil");
        }

        // if majemuk
        // size, price
        String size ="L";
        int price = 0; // assigment value
        if(size == "S"){
            price = 40000;
        } else if (size == "M"){
            price = 50000;
        } else if(size == "L"){
            price = 60000;
        }
        System.out.println("Size: "+size+" Price: "+price);

        // login username password, string object
        String username = "admin";
        String password = "p4ssw0rd";
        if(username.equalsIgnoreCase("admin") && password.equals("p4ssw0rd")){
            System.out.println("Login Berhasil");
            }  else {
            System.out.println("Login Gagal");
        }
    }
}
