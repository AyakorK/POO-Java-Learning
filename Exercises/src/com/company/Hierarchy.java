package com.company;

public class Hierarchy {

            public static void main(String[] args) {


                Computer computer = new Computer(300, "ASUS", "Windows 10", 20);
                DVD dvd = new DVD(40, "Halloween the 13th", "Horreur", 10);
                VideoGame videoGame = new VideoGame(80, "GTA 6", "Aventure", 30);
                Book book = new Book(20, "Le chant des ronces", 30, "Sara KIPIN", 3);
                CD cd = new CD(30, "Smells more like than a spirit", "Nirvana", 3, 40);


                System.out.println(computer.toString());
                computer.showPrice();
                computer.buy();
                computer.buy();
                computer.buy();
                computer.buy();
                computer.buy();
                System.out.println(dvd.toString());
                dvd.watch();
                dvd.buy();
                System.out.println(videoGame.toString());
                videoGame.play();
                videoGame.buy();
                videoGame.buy();
                videoGame.buy();
                System.out.println(book.toString());
                book.read();
                book.buy();
                book.buy();
                System.out.println(cd.toString());
                cd.listen();
                cd.buy();
                cd.buy();
            }

        }



class Product {


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    int quantity;

    void buy() {
        System.out.println("Vous avez acheté ce produit");
        quantity --;
        System.out.println("Il reste " + quantity + " exemplaires de ce produit");
    }


}


class Technology extends Product {


}


class Entertainment extends Product {
    String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}


class Computer extends Technology {

    String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public double getPrice() {
        return this.price;
    }


    double price;

    double price2;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    String type;

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    String OS;

    public double setPrice(double price) {
        this.price = price;
        return price;
    }

    public Computer(double price, String type, String OS, int quantity) {
        getType();
        setType(type);
        getOS();
        setOS(OS);
        getPrice();
        setPrice2(price);
        setPrice(price);
        getTitle();
        setTitle(title);
        this.quantity = quantity;

    }


    public double setPrice2(double price) {
        this.price2 = price * 0.8;
        return this.price2;
    }

    public void showPrice() {
        System.out.println("Le prix initial était de " + price);
        System.out.println("Le pourcentage de réduction est de 80%");
        System.out.println("Le prix final après réduction est de" + price2);
    }


    public String toString() {
        return "Computer{" +
                ", price='" + price2 + '\'' +
                ", type='" + type + '\'' +
                ", OS='" + OS + '\'' +
                '}';
    }
}


class DVD extends Entertainment {

    String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    String genre;


    void watch() {
        System.out.println("Vous regardez le film");


    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    double price;

    public DVD(double price,String title, String genre, int quantity) {
        getGenre();
        setGenre(genre);
        getPrice();
        setPrice(price);
        getTitle();
        setTitle(title);
        this.quantity = quantity;
    }


    public String toString() {
        return "DVD{" +
                "price='" + price + '\'' +
                "title ='" + title + '\'' +
                "genre='" + genre + '\'' +
                '}';
    }



}


class VideoGame extends Entertainment {

    String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    String genre;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    double price;


    void play() {
        System.out.println("Vous jouez au jeu");
    }

    public VideoGame(double price, String title, String genre, int quantity) {
        getGenre();
        setGenre(genre);
        getPrice();
        setPrice(price);
        getTitle();
        setTitle(title);
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "VideoGame{" +
                "price='" + price + '\'' +
                "title='" + title + '\'' +
                "genre='" + genre + '\'' +
                '}';
    }
}


class Book extends Entertainment {

    String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    public int getNbPages() {
        return nbPages;
    }

    public void setNbPages(int nbPages) {
        this.nbPages = nbPages;
    }

    int nbPages;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    double price;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    String author;

    void read() {
        System.out.println("Vous lisez le livre");
    }

    public Book(double price, String title, int nbPages, String author, int quantity) {
        getNbPages();
        setNbPages(nbPages);
        getAuthor();
        setAuthor(author);
        getPrice();
        setPrice(price);
        getTitle();
        setTitle(title);
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "price='" + price + '\'' +
                "title='" + title + '\'' +
                "nbPages=" + nbPages +
                ", author='" + author + '\'' +
                '}';
    }
}
class CD extends Entertainment {

    String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    String band;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    double price;

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    int duration;


    void listen() {
        System.out.println("Vous écoutez le cd");
    }

    @Override
    public String toString() {
        return "CD{" +
                "price='" + price + " euros" + '\'' +
                "title='" + title + '\'' +
                "band='" + band + '\'' +
                ", duration=" + duration + " heures" +
                '}';
    }

    public CD(double price, String title, String band, int duration, int quantity) {
        getBand();
        setBand(band);
        getDuration();
        setDuration(duration);
        getPrice();
        setPrice(price);
        getTitle();
        setTitle(title);
        this.quantity = quantity;
    }
}



