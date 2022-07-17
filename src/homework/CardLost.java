package homework;

public class CardLost extends Lost{
    private String name;//一卡通名字
    private String id;//一卡通id
    public CardLost(String lostItem, String lostPlace, int year, int month, int day, String name, String id)
    {
        super(lostItem, lostPlace, year, month, day);
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "CardLost{" +"lostPlace='" + super.getLostPlace() + '\'' +
                ", lostTime=" + super.getLostTime() +
                ", lostItem='" + super.getLostItem() + '\'' +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}