//circle class
public class Circle implements Comparable<Circle> {

    private Profile profile,profile1,profile2,profile3,profile4,profile5,profile6,profile7,profile8,profile9,profile10;
    
    public Circle(Profile profile, Profile profile1){
        this.profile = profile;
        this.profile1 = profile1;
    }
    
    public Circle(Profile profile, Profile profile1, Profile profile2){
        this.profile = profile;
        this.profile1 = profile1;
        this.profile2 = profile2;
    }
    
    public Circle(Profile profile, Profile profile1, Profile profile2, Profile profile3){
        this.profile = profile;
        this.profile1 = profile1;
        this.profile2 = profile2;
        this.profile3 = profile3;
    }
    
    public Circle(Profile profile, Profile profile1, Profile profile2, Profile profile3, Profile profile4){
        this.profile = profile;
        this.profile1 = profile1;
        this.profile2 = profile2;
        this.profile3 = profile3;
        this.profile4 = profile4;
    }
    
    public Circle(Profile profile, Profile profile1, Profile profile2, Profile profile3, Profile profile4, Profile profile5){
        this.profile = profile;
        this.profile1 = profile1;
        this.profile2 = profile2;
        this.profile3 = profile3;
        this.profile4 = profile4;
        this.profile5 = profile5;
    }

    public Circle(Profile profile, Profile profile1, Profile profile2, Profile profile3, Profile profile4, Profile profile5, Profile profile6){
        this.profile = profile;
        this.profile1 = profile1;
        this.profile2 = profile2;
        this.profile3 = profile3;
        this.profile4 = profile4;
        this.profile5 = profile5;
        this.profile6 = profile6;
    }
    
    public void setProfile(Profile profile){
        this.profile = profile;
    }
    
    public void setProfile1(Profile profile1){
        this.profile1 = profile1;
    }
    
    public void setProfile2(Profile profile2){
        this.profile2 = profile2;
    }
    
    public void setProfile3(Profile profile3){
        this.profile3 = profile3;
    }
    
    public void setProfile4(Profile profile4){
        this.profile4 = profile4;
    }
    
    public void setProfile5(Profile profile5){
        this.profile5 = profile5;
    }
    
    public void setProfile6(Profile profile6){
        this.profile6 = profile6;
    }
    
    public Profile getProfile() {
        return profile;
    }

    public Profile getProfile1() {
        return profile1;
    }

    public Profile getProfile2() {
        return profile2;
    }

    public Profile getProfile3() {
        return profile3;
    }

    public Profile getProfile4() {
        return profile4;
    }

    public Profile getProfile5() {
        return profile5;
    }

    public Profile getProfile6() {
        return profile6;
    }
    
    @Override
    public int compareTo(Circle c) {
        return 0;
    }
}
