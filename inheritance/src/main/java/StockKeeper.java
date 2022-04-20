public class StockKeeper {

    private String name;

    public StockKeeper(String name) {
        this.name = name;
    }

    public void manageMovie( Movie movie, String name ,String director, double price, int numberOfCopies) {
        movie.setDirector(director);
        movie.setName(name);
        movie.setPrice(price);
        movie.setNumberOfCopies(numberOfCopies);

        System.out.println("Movie managed by :"+ getName());
        System.out.println("Movie details::::::::::");
        System.out.println("Movie name : " + movie.getName());
        System.out.println("Movie director : " + movie.getDirector());
        System.out.println("Movie price : " + movie.getPrice());
        System.out.println("Movie number of copies : " + movie.getNumberOfCopies());
    }

    public void mangeAlbum(Album album, String name, String artist, double price, int numberOfCopies) {
        album.setName(name);
        album.setArtist(artist);
        album.setPrice(price);
        album.setNumberOfCopies(numberOfCopies);

        System.out.println("Album managed by :"+ getName());
        System.out.println("Album details::::::::::");
        System.out.println("Album name : " + album.getName());
        System.out.println("Album artist : " + album.getArtist());
        System.out.println("Album price : " + album.getPrice());
        System.out.println("Album number of copies : " + album.getNumberOfCopies());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
