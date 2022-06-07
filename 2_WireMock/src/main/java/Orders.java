import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;//FileReader + FileWriter + IOException
import java.util.*;//ArrayList + List

public class Orders {

    public static void main(String[] args) throws IOException {//компилятор говорит о том, что в этом месте возможна проблема ввода-вывода

        List<Product> productList = new ArrayList<>();//создаем список продуктов, который будет позже наполнять
        for (int x = 1; x <= 50; x++) {

            Orange orange = new Orange(x, "Сочные апельсины", x, true);//price = 1 USD for 1 KG
            Apple apple = new Apple(x, "Вкусные яблоки", x, "green");//price = 1 USD for 1 KG

            productList.add(orange);
            productList.add(apple);
        }

        //List<Product> addressList = new ArrayList<>();//создаем список адресов, по которым будут развозиться продукты
        Delivery_address address = new Delivery_address("Russia", "Ufa", "Korolev", 6, 4, 49);
        //addressList.add(address);
        Order order = new Order(productList,address);

        ObjectMapper mapper = new ObjectMapper();// -> json
        //записываем все содержимое в файл
        FileWriter fileWriter = new FileWriter("src/order.json");
        mapper.writeValue(fileWriter, order);
        FileReader fileReader = new FileReader("src/order.json");
        order = mapper.readValue(fileReader, Order.class);
        System.out.println(order.toString());//
    }

}
