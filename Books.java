public class Books {
    private String title;
    private String author;
    private int numOfChapters;
    private String genre;

    public Books() {
        this.title = "Kingdom of Ash";
        this.author = "Sarah J. Mass";
        this.numOfChapters = 121;
        this.genre = "Fantasy";
    }

    public Books (String title, String author, int numOfChapters) {
        this.title = title;
        this.author = author;
        this.numOfChapters = numOfChapters;
    }

    public Books (String title, String author, int numOfChapters, String genre) {
        this.title = title;
        this.author = author;
        this.numOfChapters = numOfChapters;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getNumOfChapters() {
        return numOfChapters;
    }
    public String getGenre() {
        return genre;
    }

    public void setTitle() {
        this.title = title;
    }
    public void setAuthor() {
        this.author = author;
    }
    public void setNumOfChapters() {
        this.numOfChapters = numOfChapters;
    }
    public void setGenre() {
        this.genre = genre;
    }

    public boolean isFantasy() {
        return true;
    }
    public boolean isNonFiction() {
        return false;
    }

    public String notAfraid() {
        return "My name is Celaena Sardothien and I will not be afraid.";
    }


}
