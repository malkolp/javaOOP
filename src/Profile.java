//profile class
public class Profile implements Comparable<Profile>{

    private String nama,email;

    public Profile(String nama,String email){
        this.nama = nama;
        this.email = email;
    }

    @Override
    public int compareTo(Profile p) {
        return 0;
    }
}