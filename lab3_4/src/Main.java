class Room{
    private int id;
    private int codeNumbers;
    private int numberPeople;
    private int comfortType;
    public double price;
    public Room (){
        this.id = 0;
        this.codeNumbers = 1;
        this.numberPeople = 1;
        this.comfortType = 1;
        this.price = 10000.0;
    }
    public Room ( int id, int code, int people){
        this.id = id;
        this.codeNumbers = code;
        if (people > 0)
            this.numberPeople = people;
        else this.numberPeople = 1;
        this.comfortType = 1;
        this.price = 10000.0;
    }
    public void setId (int id){
        this.id = id;
    }
    public void setCodeNumbers (int code){
        this.codeNumbers = code;
    }
    public void setNumberPeople (int people){
        if (people > 0) {
            this.numberPeople = people;
        }
        else {
            this.numberPeople = 1;
        }
    }
    public void setComfortType(int type){
        if ((type != 1)&&(type != 2 )&&(type != 3)&&(type != 4)&&(type != 5)) {
            this.comfortType = 1;
        }
        else {
            this.comfortType = type;
        }
    }
    public void setPrice(double price){
        if (price >= 0) {
            this.price = price;
        }
        else {
            this.price = 10000.0;
        }
    }
    public int getId(){
        return this.id;
    }
    public int getCodeNumbers(){
        return this.codeNumbers;
    }
    public int getNumberPeople(){
        return this.numberPeople;
    }
    public int getComfortType(){
        return this.comfortType;
    }
    public double getPrice(){
        return this.price;
    }
    public String toString(){
        return "id: "+this.id+"\nКод номера: "+this.codeNumbers+"\nКоличество людей: "+this.numberPeople+"\nТип комфорта: "+this.comfortType+"\nЦена: "+this.price;
    }

}

//public class Main {
//    public static void main(String[] args) {
//    Room room = new Room();
//    System.out.println(room);
//    room.setId( 1 );
//    room.setCodeNumbers( 123 );
//    room.setNumberPeople( 2 );
//    room.setComfortType( 5 );
//    room.setPrice( 12000.0 );
//        System.out.println(room);
//        }
//    }
