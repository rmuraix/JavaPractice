public class P12Ex03 {

    public static void main(String[] args) {
        int[][] score = { { 97, 91, 38 }, { 8, 49, 96 }, { 89, 95, 80 }, { 74, 69, 89 }, { 88, 92, 41 }, { 82, 47, 44 },
                { 89, 32, 93 } };
        String[] name = { "麻生", "川崎", "佐藤", "田中", "中村", "浜田", "八代"};        
        String[] subject = { "数学", "英語", "国語"};    
        Student[] students = new Student[name.length];
        // 生徒オブジェクトを生成
        for (int i = 0; i < 7; i++) {
            students[i] = new Student(name[i], score[i][0], score[i][1], score[i][2]);
        }
        // 科目ごとの合計を求める
        int mathSum = 0;
        int englishSum = 0;
        int japaneseSum = 0;
        for (int i = 0; i < students.length; i++) {
            mathSum += students[i].getMath();
            englishSum += students[i].getEnglish();
            japaneseSum += students[i].getjapanese();
        }
        // 科目ごとの平均を求める
        double mathAve = (double) mathSum / name.length;
        double englishAve = (double) englishSum / name.length;
        double japaneseAve = (double) japaneseSum / name.length;
        // 平均点を出力
        System.out.println(subject[0] + "の平均点は" + (double)Math.round(10 * mathAve)/10);
        System.out.println(subject[1] + "の平均点は" + (double)Math.round(10 * englishAve)/10);
        System.out.println(subject[2] + "の平均点は" + (double)Math.round(10 * japaneseAve)/10);
        System.out.println("");

        // 生徒ごとの平均を求める
        for (int i = 0; i < students.length; i++) {
            Double ave = students[i].getAverage();
            System.out.println(students[i].getName() + "の平均点は" + (double)Math.round(10 * ave)/10 ) ;
        }

    }
}
