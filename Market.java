import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Market implements QueueBehaviour, MarketBehaviour {
    private Queue<String> queue = new LinkedList<>();
    private Queue<String> orders = new LinkedList<>();

    // Реализация методов из QueueBehaviour
    @Override
    public void enqueue(String person) {
        queue.offer(person);
    }

    @Override
    public String dequeue() {
        return queue.poll();
    }

    @Override
    public int size() {
        return queue.size();
    }

    // Реализация методов из MarketBehaviour
    @Override
    public void acceptOrder(String order) {
        orders.offer(order);
    }

    @Override
    public String fulfillOrder() {
        return orders.poll();
    }

    public static void main(String[] args) {
        Market market = new Market();
        Scanner scanner = new Scanner(System.in);

        // Добавление клиентов в очередь
        System.out.print("Введите имя первого клиента: ");
        String customer1 = scanner.nextLine();
        market.enqueue(customer1);

        System.out.print("Введите имя второго клиента: ");
        String customer2 = scanner.nextLine();
        market.enqueue(customer2);

        // Добавление заказов
        System.out.print("Введите заказ первого клиента: ");
        String order1 = scanner.nextLine();
        market.acceptOrder(order1);

        System.out.print("Введите заказ второго клиента: ");
        String order2 = scanner.nextLine();
        market.acceptOrder(order2);

        // Вывод информации
        System.out.println("Текущий размер очереди: " + market.size());
        System.out.println("Обработанный заказ: " + market.fulfillOrder());
    }
}
