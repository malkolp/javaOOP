//profile class
public class Profile implements Comparable<Profile>{

    private String nama,email;

    public Profile(String nama,String email){
        this.nama = nama;
        this.email = email;
    }

    public Profile(){
        this.nama = "";
        this.email = "";
    }

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int compareTo(Profile p) {
        return 0;
    }
    
}
