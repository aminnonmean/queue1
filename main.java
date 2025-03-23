import java.util.*;

public class main {
    public static void main(String[] args) {
        List<String> firstClients = List.of("Anya", "Sveta", "Olya", "Alexandra", "Ruslana", "Olesya", "Vika");
        Queue<String> clients = new LinkedList<>();
        clients.addAll(firstClients);
        while (!clients.isEmpty()) {
            String next = clients.poll();
            if (Math.random() < 0.5) { // проверка условия, которое срабатывает с 50% вероятностью
                clients.offer("friend of " + next);
            }
            System.out.printf("%s сделал новый маникюр\n", next);
        }
    }
}
