public class GroupRoom {
    private String uId;
    private Room[] rooms;
    public GroupRoom() {
        this.uId = this.toString();
        rooms = new Room[100];
    }
    public GroupRoom(Room[] rooms) {
        this.uId = this.toString();
        this.rooms = rooms;
    }
    public Room[] getRooms() {
        return rooms;
    }
    public void setRooms(Room[] rooms) {
        if (rooms.length == 100) {
            this.rooms = rooms;
        }
        else if (rooms.length > 100) {
            for (int i = 0; i < rooms.length; i++) {
                this.rooms[i] = rooms[i];
            }
        }
    }
    public String getuId() {
        return uId;
    }
    public void setuId(String uId) {
        this.uId = uId;
    }
    public Room getRoom(int i) {
        if ((i < 0)||(i >= rooms.length)) {
            return null;
        }
        else {
            return rooms[i];
        }
    }
    public void setRoom(Room room, int i) {
        if ((i > 0)&&(i < this.rooms.length)) {
            this.rooms[i] = room;
        }
    }
}
