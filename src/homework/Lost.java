package homework;

import java.time.LocalDate;

public class Lost implements Comparable<Lost>{
    private String lostPlace;//失物地点
    private LocalDate lostTime;//失物时间
    private String lostItem;//失物项目
    public Lost(String lostItem, String lostPlace, int year, int month, int day)
    {
        this.lostItem = lostItem;
        this.lostPlace = lostPlace;
        lostTime = LocalDate.of(year, month, day);
    }

    public String getLostPlace() {
        return lostPlace;
    }

    public void setLostPlace(String lostPlace) {
        this.lostPlace = lostPlace;
    }

    public LocalDate getLostTime() {
        return lostTime;
    }

    public void setLostTime(LocalDate lostTime) {
        this.lostTime = lostTime;
    }

    public String getLostItem() {
        return lostItem;
    }

    public void setLostItem(String lostItem) {
        this.lostItem = lostItem;
    }


    @Override
    public int compareTo(Lost that){
        return this.lostTime.compareTo(that.lostTime);
    }

    @Override
    public String toString() {
        return "Lost{" +
                "lostPlace='" + lostPlace + '\'' +
                ", lostTime=" + lostTime +
                ", lostItem='" + lostItem + '\'' +
                '}';
    }
}