package homework;

public class BookLost extends Lost{
    private String bookName;//书名。
    public BookLost(String lostItem, String lostPlace, int year, int month, int day, String bookName)
    {
        super(lostItem, lostPlace, year, month, day);
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "失物地点:" + super.getLostPlace() + "失物时间:" +super.getLostTime() +
                "失物项目:" + super.getLostItem() + "失物书籍:" + bookName;
    }
}