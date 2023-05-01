package base;

public class Day16 {

    //특정한 문자를 대문자로 바꾸기
    public String solution5(String my_string, String alp) {
        return my_string.replace(alp, alp.toUpperCase());
    }

    //A 강조하기
    public String solution4(String myString) {
        StringBuilder sb = new StringBuilder(myString);
        for (int i = 0; i < myString.length(); ++i) {
            if (myString.charAt(i) == 'a') sb.setCharAt(i, 'A');
            else if (myString.charAt(i) == 'A') continue;
            else {
                char[] arr = Character.toString(myString.charAt(i)).toLowerCase().toCharArray();
                sb.setCharAt(i, arr[0]);
            }
        }
        return sb.toString();
    }

    //배열에서 문자열 대소문자 변환하기
    public String[] solution3(String[] strArr) {
        for (int i=0; i<strArr.length; ++i) {
            if (i%2==0) strArr[i] = strArr[i].toLowerCase();
            else strArr[i] = strArr[i].toUpperCase();
        }
        return strArr;
    }

    //소문자로 바꾸기
    public String solution2(String myString) {
        return myString.toLowerCase();
    }

    //대문자로 바꾸기
    public String solution1(String myString) {
        return myString.toUpperCase();
    }
}
