package base;

public class Day23 {

    // 날짜 비교하기
    public int solution5(int[] date1, int[] date2) {
        int date_1 = Integer.parseInt(Integer.toString(date1[0])+Integer.toString(date1[1])+Integer.toString(date1[2]));
        int date_2 = Integer.parseInt(Integer.toString(date2[0])+Integer.toString(date2[1])+Integer.toString(date2[2]));

        return date_1 < date_2 ? 1 : 0;
    }
}
