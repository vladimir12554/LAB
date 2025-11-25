import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class lab5 {
    // Класс для хранения информации о фильме
    static class Movie {
        String title;
        int releaseYear;
        String country;
        String genre;
        double rentalCost;

        public Movie(String title, int releaseYear, String country, String genre, double rentalCost) {
            this.title = title;
            this.releaseYear = releaseYear;
            this.country = country;
            this.genre = genre;
            this.rentalCost = rentalCost;
        }

        // Метод для вывода информации о фильме
        public String getInfo() {
            return "Название: " + title + ", Год выпуска: " + releaseYear + ", Страна: " + country +
                    ", Жанр: " + genre + ", Стоимость проката: " + rentalCost;
        }
    }

    public static void main(String[] args) {
        // Создаем массив фильмов
        Movie[] movies = {
                new Movie("Механик", 2011, "США", "Боевик", 15.5),
                new Movie("Хроники Нарнии: Лев, колдунья и волшебный шкаф", 2005, "Великобритания", "фэнтези", 12.0),
                new Movie("Гарри Поттер и философский камень", 2001, "Великобритания", "Приключения", 20.0),
                new Movie("Аватар", 2009, "США", "Фантастика", 20.0)
        };

        // 1. Определяем фильмы со стоимостью проката выше средней
        double totalCost = 0;
        for (Movie movie : movies) {
            totalCost += movie.rentalCost;
        }
        double averageCost = totalCost / movies.length;
        System.out.println("Средняя стоимость проката: " + averageCost);
        System.out.println("Фильмы со стоимостью проката выше средней:");
        for (Movie movie : movies) {
            if (movie.rentalCost > averageCost) {
                System.out.println(movie.getInfo());
            }
        }
        System.out.println();

        // 2. Находим фильм самого раннего года выпуска
        Movie earliestMovie = movies[0];
        for (Movie movie : movies) {
            if (movie.releaseYear < earliestMovie.releaseYear) {
                earliestMovie = movie;
            }
        }
        System.out.println("Фильм самого раннего года выпуска:");
        System.out.println(earliestMovie.getInfo());
        System.out.println();

        // 3. Сортируем массив по названиям фильмов в алфавитном порядке
        Arrays.sort(movies, Comparator.comparing(movie -> movie.title));
        System.out.println("Фильмы, отсортированные по названию:");
        for (Movie movie : movies) {
            System.out.println(movie.getInfo());
        }
        System.out.println();

        // 4. Поиск по названию, редактирование и вывод информации
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название фильма для поиска: ");
        String searchTitle = scanner.nextLine();
        boolean found = false;

        for (Movie movie : movies) {
            if (movie.title.equalsIgnoreCase(searchTitle)) {
                found = true;
                System.out.println("Найден фильм: " + movie.getInfo());
                System.out.print("Введите новое значение стоимости проката: ");
                double newCost = scanner.nextDouble();
                movie.rentalCost = newCost;
                System.out.println("Информация после редактирования: " + movie.getInfo());
                break;
            }
        }

        if (!found) {
            System.out.println("Фильм с названием '" + searchTitle + "' не найден.");
        }
    }
}
