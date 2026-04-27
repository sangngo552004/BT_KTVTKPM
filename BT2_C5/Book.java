package BT2_C5;

class Book implements Comparable<Book> {
    private int id;
    private String title;

    public Book(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }


    @Override
    public int compareTo(Book other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Book[ID=" + id + ", Title='" + title + "']";
    }
}
