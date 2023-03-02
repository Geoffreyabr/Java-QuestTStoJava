import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class User {
    private Date birthdate;
    private int size;
    private ArrayList <Photo> photos;
    private Address address;


     public User(Date birthdate, int size, Address address, ArrayList <Photo> photos) {
        this.birthdate = birthdate;
        this.size = size;
        this.address = address;
        this.photos = new ArrayList<Photo>();
    }

    public Date getBirthdate(){
        return birthdate;
    }

    public void setBirthdate(Date birthdate){
        this.birthdate = birthdate;
    }

    public int getSize(){
        return size;
    }

    public void setSize(int size){
        this.size = size;
    }

    public Address getAddress(){
        return address;
    }

    public void setAddress(Address address){
        this.address = address;
    }

    public ArrayList<Photo> getPhotos(){
        return new ArrayList<Photo>();
    }

    public void setPhotos(ArrayList<Photo> photos){
        this.photos = photos;
    }
}