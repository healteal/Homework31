package Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class General {
    public static void main(String[] args) throws IOException {
        ArrayList<Auto> autos = new ArrayList<>();
        autos.add(new Auto("Toyota", 2022, 600000.50, Color.RED, 8));
        autos.add(new Auto("Mazda", 2022, 45000.50, Color.YELLOW, 6));
        autos.add(new Auto("BMW", 2021, 100000, Color.WHITE, 12));
        autos.forEach(x -> System.out.print(x + " "));
        System.out.println("\n" + "Введите цвет:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String color = reader.readLine();
        autos.stream()
                .filter(colorFilter -> colorFilter.getColor().equals(Color.valueOf(color)))
                .forEach(System.out::println);
        System.out.println("\n" + "Введите объем:");
        int volume = Integer.parseInt(reader.readLine());
        autos.stream()
                .filter(volumeOfEngine -> volumeOfEngine.getEngineVolume() == volume)
                .forEach(System.out::println);
        System.out.println("\n" + "Введите минимальную стоимость:");
        double price = Double.parseDouble(reader.readLine());
        autos.stream()
                .filter(priceOfCar -> priceOfCar.getPrice() > price)
                .forEach(System.out::println);
        System.out.println("\n" + "Введите самый ранний год выпуска:");
        int lowestBound = Integer.parseInt(reader.readLine());
        System.out.println("Введите самый поздний год выпуска:");
        int highestBound = Integer.parseInt(reader.readLine());
        autos.stream()
                .filter(autoYearOfRelease -> autoYearOfRelease.getYearOfRelease() > lowestBound && autoYearOfRelease.getYearOfRelease() < highestBound)
                .forEach(System.out::println);
    }
}
