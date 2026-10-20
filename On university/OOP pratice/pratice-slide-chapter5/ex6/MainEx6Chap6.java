public class MainEx6Chap6 {
    public static void main(String[] args){

        Currency currency = new Currency("USD", 25.000);
        Place place = new Place("New York city", "USA", currency, "9999");
        Room room1 = new Room(1, true, true);
        Room room2 = new Room(2, true, false);
        Room room3 = new Room(2, false, true);

        Room [] rooms = {room1, room2, room3};

        Hotel hotel = new Hotel(rooms,"Lucky hotel", place);

        System.out.println(hotel.getRooms()[1]);
        System.out.println(hotel.toString());
    }
}
