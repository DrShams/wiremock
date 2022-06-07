import com.fasterxml.jackson.annotation.JsonAutoDetect;

//добавить аннотации для работы при десериализации
//@JsonTypeInfo - или удалить
@JsonAutoDetect
public class Delivery_address {
    //
    public String country, city, street;
    public int home, level, room;

    public Delivery_address() {
        //пустой конструктор
    }

    public Delivery_address(String country, String city, String street, int home, int level, int room) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.home = home;
        this.level = level;
        this.room = room;
    }

    @Override//переопределение
    public String toString() {//строчное представление обьекта
        return "Delivery_address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", home=" + home +
                ", level=" + level +
                ", room=" + room +
                '}';
    }


}