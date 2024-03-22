package baseball;

public class BaseBallTeam {
    // フィールド
    private String name;
    private int win;
    private int lose;
    private int draw;

    // コンストラクタ
    public BaseBallTeam() {
    }

    // 引数ありコンストラクタ
    public BaseBallTeam(String name, int win, int lose, int draw) {
//        System.out.println("初期化時に引数ありコンストラクタが呼ばれました");
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    public double getRate(int win,int lose) {
        double rate = (double)win /(win + lose);
        return rate;
    }

    public void report() {
        double rate = getRate(this.win, this.lose);
        System.out.println(this.name + " の2022年の成績は " + this.win + "勝 " + this.lose + "敗 " + this.draw + "分、勝率は " + rate + "です。");
    }

}
