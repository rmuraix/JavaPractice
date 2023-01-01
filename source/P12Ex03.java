public class P12Ex03 {

    public static void main(String[] args) {
        int[][] score = { { 97, 91, 38 }, { 8, 49, 96 }, { 89, 95, 80 }, { 74, 69, 89 }, { 88, 92, 41 }, { 82, 47, 44 },
                { 89, 32, 93 } };
        String[] name = { "����", "���", "����", "�c��", "����", "�l�c", "����"};        
        String[] subject = { "���w", "�p��", "����"};    
        Student[] students = new Student[name.length];
        // ���k�I�u�W�F�N�g�𐶐�
        for (int i = 0; i < 7; i++) {
            students[i] = new Student(name[i], score[i][0], score[i][1], score[i][2]);
        }
        // �Ȗڂ��Ƃ̍��v�����߂�
        int mathSum = 0;
        int englishSum = 0;
        int japaneseSum = 0;
        for (int i = 0; i < students.length; i++) {
            mathSum += students[i].getMath();
            englishSum += students[i].getEnglish();
            japaneseSum += students[i].getjapanese();
        }
        // �Ȗڂ��Ƃ̕��ς����߂�
        double mathAve = (double) mathSum / name.length;
        double englishAve = (double) englishSum / name.length;
        double japaneseAve = (double) japaneseSum / name.length;
        // ���ϓ_���o��
        System.out.println(subject[0] + "�̕��ϓ_��" + (double)Math.round(10 * mathAve)/10);
        System.out.println(subject[1] + "�̕��ϓ_��" + (double)Math.round(10 * englishAve)/10);
        System.out.println(subject[2] + "�̕��ϓ_��" + (double)Math.round(10 * japaneseAve)/10);
        System.out.println("");

        // ���k���Ƃ̕��ς����߂�
        for (int i = 0; i < students.length; i++) {
            Double ave = students[i].getAverage();
            System.out.println(students[i].getName() + "�̕��ϓ_��" + (double)Math.round(10 * ave)/10 ) ;
        }

    }
}
