package organization;

public class Badge {
    int id;
    boolean ifFirstFloor;
    boolean ifBackDoor;
    String expDate;

    public Badge(int id, boolean ifFirstFloor, boolean ifBackDoor, String expDate) {
        this.id = id;
        this.ifFirstFloor = ifFirstFloor;
        this.ifBackDoor = ifBackDoor;
        this.expDate = expDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isIfFirstFloor() {
        return ifFirstFloor;
    }

    public void setIfFirstFloor(boolean ifFirstFloor) {
        this.ifFirstFloor = ifFirstFloor;
    }

    public boolean isIfBackDoor() {
        return ifBackDoor;
    }

    public void setIfBackDoor(boolean ifBackDoor) {
        this.ifBackDoor = ifBackDoor;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }





}
