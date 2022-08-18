package Task4;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

public class General {
    public static void main(String[] args) {
        ArrayList<TV> tvs = new ArrayList<>();
        tvs.add(new TV("E100", 2021, 6000, 33.3, Brand.LG));
        tvs.add(new TV("3ds400", 2022, 4000, 54.3, Brand.SAMSUNG));
        tvs.add(new TV("2", 2020, 10000, 70, Brand.AOC));
        tvs.forEach(System.out::println);
        System.out.println();
        filteredByDiagonal(tvs);
        System.out.println();
        presentYear(tvs);
        System.out.println();
        overprice(tvs);
        System.out.println();
        sortedNormal(tvs);
    }

    public static void filteredByDiagonal(ArrayList<TV> tvs) {
        tvs.stream().filter(x -> x.getDiagonal() == 33.3).forEach(System.out::println);
    }
    public static void presentYear(ArrayList<TV> tvs) {
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        tvs.stream().filter(x -> x.getYearOfRelease() == localDate.getYear()).forEach(System.out::println);
    }

    public static void overprice(ArrayList<TV> tvs) {
        tvs.stream().filter(x -> x.getPrice() > 5000).forEach(System.out::println);
    }

    public static void sortedNormal(ArrayList<TV> tvs) {
        Comparator<TV> tvComparator = (o1, o2) -> {
            if (o2.getPrice() > o1.getPrice()) {
                return -1;
            }
            if (o2.getYearOfRelease() == o1.getYearOfRelease() && o1.getName().equals(o2.getName())) {
                return 0;
            }
            else return 1;
        };
        tvs.stream().sorted(tvComparator).forEach(System.out::println);
    }
}
