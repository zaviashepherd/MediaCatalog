import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import static java.text.ChoiceFormat.nextDouble;

public class MediaParser {
    static ArrayList<MediaItem> Books = new ArrayList<MediaItem>();
    static ArrayList<MediaItem> Movies = new ArrayList<MediaItem>();
    static ArrayList<MediaItem> Albums = new ArrayList<MediaItem>();
    //method for menu
public static void menu(Scanner scanner){
    int c = 0;

    while(c != 5) {
        System.out.println("Please enter the number for the following action you would like to take:");
        System.out.println("1. List all items");
        System.out.println("2. Add item (book/movie/album)");
        System.out.println("3. Save catalog to CSV");
        System.out.println("4. Export catalog to binary file (catalog.bin)");
        System.out.println("5. Exit");
        c = scanner.nextInt();
        scanner.nextLine();

        if(c == 1){
            listAllItems();
        }
        else if(c == 2){
            addItem(scanner);
        }
        else if(c == 3){
            try{
                MediaParser.saveCatalog();
                System.out.println("You have successfully saved");
            }
            catch (Exception e){
                System.out.println("There was an error saving");
            }
        }
        else if(c == 4){
            try {
                exportCatalog();
                System.out.println("You have successfully exported");
            }
            catch (IOException e){
                System.out.println("There was an error exporting");
            }
        }
        else if(c != 5){
            System.out.println("There was an error please try again.");
        }
        else{
            System.out.println("Thank you for using Media Catalog");
        }

    }
}

//method for list all items
    public static void listAllItems(){

        for(int a = 0; a < Books.size(); a++){
            System.out.println(Books.get(a).summary());
        }
        for(int a = 0; a < Movies.size(); a++){
            System.out.println(Movies.get(a).summary());
        }
        for(int a = 0; a < Albums.size(); a++){
            System.out.println(Albums.get(a).summary());
        }
    }

    //method for add item
    public static void addItem(Scanner scanner){
        int a = 0;
        MediaItem media = new MediaItem();
        media = null;

        while(a == 0) {
            System.out.println("Would you like to add a:");
            System.out.println("1. Book");
            System.out.println("2. Movie");
            System.out.println("3. Album");
            System.out.println("4. Exit");
            a = scanner.nextInt();
            scanner.nextLine();
            if(a == 1){
                media = new Book();
                String s = generator(a);
                media.setId(s);
                System.out.println("What is the title: ");
                String title = scanner.nextLine();
                media.setTitle(title);
                System.out.println("What is the author: ");
                String author = scanner.nextLine();
                ((Book)media).setAuthor(author);
                System.out.println("What is the year of the book: ");
                int year = scanner.nextInt();
                scanner.nextLine();
                ((Book)media).setYear(year);
                System.out.println("What is the page count: ");
                int pageCount = scanner.nextInt();
                scanner.nextLine();
                ((Book)media).setPageCount(pageCount);
                System.out.println("Great job, you have created: " + ((Book)media).summary());
                Books.add(media);
            }
            else if(a == 2){
                media = new Movie();
                String s = generator(a);
                media.setId(s);
                System.out.println("What is the title: ");
                String title = scanner.nextLine();
                media.setTitle(title);
                System.out.println("Who is the director: ");
                String director = scanner.nextLine();
                ((Movie)media).setDirector(director);
                System.out.println("What is the year of the movie: ");
                int year = scanner.nextInt();
                scanner.nextLine();
                ((Movie)media).setYear(year);
                System.out.println("What is the runtime(in minutes): ");
                double runtime = scanner.nextDouble();
                scanner.nextLine();
                ((Movie)media).setRuntimeMinutes(runtime);
                System.out.println("Great job, you have created: " + ((Movie)media).summary());
                Movies.add(media);

            }
            else if(a == 3){
                media = new Album();
                String s = generator(a);
                media.setId(s);
                System.out.println("What is the title: ");
                String title = scanner.nextLine();
                media.setTitle(title);
                System.out.println("Who is the artist: ");
                String artist = scanner.nextLine();
                ((Album)media).setArtist(artist);
                System.out.println("What is the year of the album: ");
                int year = scanner.nextInt();
                scanner.nextLine();
                ((Album)media).setYear(year);
                System.out.println("What is the track count: ");
                int tracks = scanner.nextInt();
                scanner.nextLine();
                ((Album)media).setTrackCount(tracks);
                System.out.println("Great job, you have created: " + ((Album)media).summary());
                Albums.add(media);
            }
            else if(a != 4){
                System.out.println("There was an error please try again.");
                a = 0;
            }
        }
    }

    //method for save catalog
    public static void saveCatalog() throws IOException {
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("C:\\Users\\zavia\\OneDrive\\Desktop\\MediaCatalog\\catalog.csv")));

        for(int b = 0; b < Books.size(); b++){
            out.println(Books.get(b).summary());
        }
        for(int m = 0; m < Movies.size(); m++){
            out.println(Movies.get(m).summary());
        }
        for(int a = 0; a < Albums.size(); a++){
            out.println(Albums.get(a).summary());
        }
        out.close();
    }

    //method for exporting catalog
    public static void exportCatalog() throws IOException{
        DataOutputStream out = new DataOutputStream(new FileOutputStream("C:\\Users\\zavia\\OneDrive\\Desktop\\MediaCatalog\\catalog.bin"));

        for(int b = 0; b < Books.size(); b++){
            out.writeUTF(Books.get(b).summary());
        }
        for(int m = 0; m < Movies.size(); m++){
            out.writeUTF(Movies.get(m).summary());
        }
        for(int a = 0; a < Albums.size(); a++){
            out.writeUTF(Albums.get(a).summary());
        }
        out.close();
    }

    //method for selecting numbers
    public static String generator(int a){
    String s = "";

    if(a == 1){
        s = ("BK-" + (Books.size() + 1));
    }

    if(a == 2){
        s = ("MV-" + (Movies.size() + 1));
    }

    if(a == 3){
        s = ("AL-" + (Albums.size() + 1));
    }

        return s;
    }

    //loading from file method

    public static void loadIn() throws IOException{
    BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\zavia\\OneDrive\\Desktop\\MediaCatalog\\catalog.csv"));
    String s = "";
    String[] variables;
    Books.clear();
    Movies.clear();
    Albums.clear();

    while((s = in.readLine()) != null){
        variables = s.split(",");


        if(variables[0].equals("Book") && variables.length == 6){
            Book book = new Book();
            book.setId(variables[1]);
            book.setTitle(variables[2]);
            book.setAuthor(variables[3]);
            book.setYear(parseInt(variables[4]));
            book.setPageCount(parseInt(variables[5]));
            Books.add(book);
        }
        if(variables[0].equals("Movie") && variables.length == 6){
            Movie movie = new Movie();
            movie.setId(variables[1]);
            movie.setTitle(variables[2]);
            movie.setDirector(variables[3]);
            movie.setYear(parseInt(variables[4]));
            movie.setRuntimeMinutes(parseDouble(variables[5]));
            Movies.add(movie);
        }
        if(variables[0].equals("Album") && variables.length == 6){
            Album album = new Album();
            album.setId(variables[1]);
            album.setTitle(variables[2]);
            album.setArtist(variables[3]);
            album.setYear(parseInt(variables[4]));
            album.setTrackCount(parseInt(variables[5]));
            Albums.add(album);
        }
    }
        in.close();
    }
    }

