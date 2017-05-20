import java.util.ArrayList;
import java.util.HashMap;

//main class
public class Main {

    public static void main(String[] args){

        ArrayList<Profile> profiles = new ArrayList<>();
        ArrayList<Circle> circles = new ArrayList<>();
        
        profiles.add(new Profile("Nur Aisyiatul Mahmudah", "nuraisyiatul12@gmail.com"));
        profiles.add(new Profile("Elma Julia Devi", "elmajulia11@gmail.com"));
        
        profiles.add(new Profile("Haidar Ali", "haidarali21@gmail.com"));
        profiles.add(new Profile("Nabil Fawwaz", "nabilfawwaz13@gmail.com"));
        
        profiles.add(new Profile("Prasetyo Utomo", "prasetyo34@gmail.com"));
        profiles.add(new Profile("Ulum Pradana", "ulump67@gmail.com"));
        
        profiles.add(new Profile("Emha Dwi", "emhadwi23@gmail.com"));
        profiles.add(new Profile("Zogik Hanaris Rifani", "hzogik26@gmail.com"));
        
        profiles.add(new Profile("Vachlaf Hallaby", "hallaby19@gmail.com"));
        profiles.add(new Profile("Danar Bagus Aprillian", "bagus03@gmail.com"));
        
        profiles.add(new Profile("Rachmat Jati Puruasdi", "rachmat02@gmail.com"));
        profiles.add(new Profile("Mery Novitasari", "novitasari55@gmail.com"));
        
        profiles.add(new Profile("Nadya Pramita", "nadya123@gmail.com"));
        profiles.add(new Profile("Rahmatillah", "rahmatillah23@gmail.com"));
        
        profiles.add(new Profile("Irmawati", "irmaa31@gmail.com"));
        profiles.add(new Profile("Asty Astuti", "asty98@gmail.com"));
        
        profiles.add(new Profile("Faradhanti", "fara31@gmail.com"));
        profiles.add(new Profile("Gita Ismi", "gitgita06@gmail.com"));
        
        profiles.add(new Profile("Bella Cintya", "bella45@gmail.com"));
        profiles.add(new Profile("Nisviatul Mubarokah", "nisviatul35@gmail.com"));
        
        profiles.add(new Profile("Zivatul Ulya", "ziva1@gmail.com"));
        profiles.add(new Profile("Khairiyah", "Khairiyah@gmail.com"));
        
        
        profiles.add(new Profile("Merryandy Putri", "Merry11@gmail.com"));
        profiles.add(new Profile("Irvan Dana", "Irvan69@gmail.com"));
        
        
        
        HashMap<String, Circle> circleHashMap = new HashMap<>();
        
        group.put("Circle Teman SD",new Circle(profiles.get(0),profiles.get(1),profiles.get(2)));
        group.put("Circle Teman SMP",new Circle(profiles.get(3),profiles.get(4),profiles.get(5),profiles.get(6)));
        group.put("Circle Teman SMA",new Circle(profiles.get(7),profiles.get(8),profiles.get(9),profiles.get(10),profiles.get(21),profiles.get(22));
        group.put("Circle Teman Kuliah",new Circle(profies.get(11),profiles.get(12),profiles.get(13),profiles.get(14),profiles.get(15)));
        group.put("Circle Keluarga",new Circle(profiles.get(16),profiles.get(17),profiles.get(18),profiles.get(19),profiles.get(20)));
        
        System.out.println(group.containsKey("Circle Teman SD"));
        System.out.println(group.containsKey("Circle Teman SMP"));
        System.out.println(group.containsKey("Circle Teman SMA"));
        System.out.println(group.containsKey("Circle Teman Kuliah"));
        System.out.println(group.containsKey("Circle Keluarga"));
        
        for (Circle c:group.values()){
            System.out.println("Nama            : "+c.getProfile().getNama());
            System.out.println("Email           : "+c.getProfile().getEmail());
            System.out.println();
            
    }

}
