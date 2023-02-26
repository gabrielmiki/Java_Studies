package Data.Quarkus;

public class Room {
    private String roomNumber;
    private String bedInfo;
    private String name;

    public Room() {
    }

    public Room(String roomNumber, String bedInfo, String name) {
        this.roomNumber = roomNumber;
        this.bedInfo = bedInfo;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber='" + roomNumber + '\'' +
                ", bedInfo='" + bedInfo + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
