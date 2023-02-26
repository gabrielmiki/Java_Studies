package Data.Quarkus;

public class Room {
    private String name;
    private String roomNumber;
    private String bedInfo;

    public Room() {
        super();
    }

    public Room(String name, String roomNumber, String bedInfo) {
        this.name = name;
        this.roomNumber = roomNumber;
        this.bedInfo = bedInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getBedInfo() {
        return bedInfo;
    }

    public void setBedInfo(String bedInfo) {
        this.bedInfo = bedInfo;
    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                ", debInfo='" + bedInfo + '\'' +
                '}';
    }
}
