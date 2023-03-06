package CH4;

public class CH4_EX4 {
    String title;
    String author;

    public CH4_EX4(String t){ // 생성자
        title = t;
        author = "작자미상";
    }

    public CH4_EX4(String t, String a) { // 생성자
        title = t;
        author = a;
    }

    public static void main(String[] args){
        // 생성자 CH4_EX4(String t, String a) 호출
        CH4_EX4 littlePrince = new CH4_EX4("어린왕자", "생텍쥐페리");

        // 생성자 CH4_EX4(String t) 호출
        CH4_EX4 loveStory = new CH4_EX4("춘향전");

        System.out.println(littlePrince.title + " " + littlePrince.author);
        System.out.println(loveStory.title + " " + loveStory.author);
    }
}
