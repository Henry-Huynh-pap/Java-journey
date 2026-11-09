public class Hotel {
    private Room rooms [];
    private String name;
    private Place place;

    public Hotel(Room rooms[], String name, Place place){
        this.rooms = rooms;
        this.name = name;
        this.place = place;
    }

    public void setRooms(Room rooms[]) {
        this.rooms = rooms;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public Place getPlace() {
        return place;
    }

    @Override
    public String toString() {
        String result = "";
        for(int i = 0; i < rooms.length; i++){
            result = result + rooms[i] + "; ";
        }
        return "Room: " + result + "; Name: " + name + "; Place: " + place ;
    }
}
