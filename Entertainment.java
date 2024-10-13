import java.util.ArrayList;
import java.util.Scanner;

public class Entertainment {  
    protected ArrayList<Movie> entertainmentList = new ArrayList<>();

    public void addToList() { 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        System.out.print("Enter director: ");
        String director = scanner.nextLine();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        System.out.print("Enter rating: ");
        double rating = scanner.nextDouble();
        entertainmentList.add(new Movie(title, director, year, rating));
        System.out.println("Movie added successfully!");
    }

    public void findStringValue() { 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter movie title to search: ");
        String searchTitle = scanner.nextLine();
        boolean found = false;
        for (Movie movie : entertainmentList) { 
            if (movie.getTitle().equalsIgnoreCase(searchTitle)) {
                System.out.println(movie);
                found = true;
            }
        }
        if (!found) { 
            System.out.println("Movie not found.");
        }
    }

    public void findPrimitiveValue() { 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the minimum rating to search for: ");
        double minRating = scanner.nextDouble();
        System.out.print("Enter the maximum rating to search for: ");
        double maxRating = scanner.nextDouble();
        boolean found = false;
        for (Movie movie : entertainmentList) { 
            if (movie.getRating() >= minRating && movie.getRating() <= maxRating) {
                System.out.println(movie);
                found = true;
            }
        }
        if (!found) { 
            System.out.println("No movies found in the specified rating range.");
        }
    }

    public void changeValue() { 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter movie title to change details: ");
        String searchTitle = scanner.nextLine();
        boolean found = false;
        for (Movie movie : entertainmentList) { 
            if (movie.getTitle().equalsIgnoreCase(searchTitle)) {
                System.out.println("Current details: ");
                System.out.println(movie);
                System.out.println("Enter new details: ");
                System.out.print("Enter title: ");
                String newTitle = scanner.nextLine();
                System.out.print("Enter director: ");
                String newDirector = scanner.nextLine();
                System.out.print("Enter year: ");
                int newYear = scanner.nextInt();
                System.out.print("Enter rating: ");
                double newRating = scanner.nextDouble();
                movie.setTitle(newTitle);
                movie.setDirector(newDirector);
                movie.setYear(newYear);
                movie.setRating(newRating);
                System.out.println("Movie details updated successfully!");
                found = true;
                break;
            }
        }
        if (!found) { 
            System.out.println("Movie not found.");
        }
    }

    public void printAll() { 
        if (entertainmentList.isEmpty()) {
            System.out.println("No movies in the list.");
        } else {
            System.out.println("All movies: ");
            for (Movie movie : entertainmentList) { 
                System.out.println(movie);
            }
        }
    }
}
