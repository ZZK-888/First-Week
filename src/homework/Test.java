package homework;

public class Test {
    public static void main(String[] args) {
        Lost[] testArray = new Lost[5];
        testArray[0] = new Lost("眼镜", "二教", 2022, 7, 3);
        testArray[1] = new Lost("篮球", "三教", 2022, 6, 3);
        testArray[2] = new BookLost("书", "四教", 2022, 7, 4,  "《java 核心卷》");
        testArray[3] = new CardLost("一卡通", "三教", 2022,5, 30,"三教楼下","张三");
        testArray[4] = new BookLost("书", "二教", 2022, 7, 6,"《算法》");

        Solution test = new Solution();

        System.out.println("排序前");
        show(testArray);
        System.out.println("排序后");
        test.sortLost(testArray);
        show(testArray);
        System.out.println("搜索的失物");
        Lost[] temp = test.selectByKeyword(testArray,"三教");
        show(temp);
    }
    public static void show(Lost[] a)
    {
        for (Lost x : a)
        {
            System.out.println(x.toString());
        }
    }
}