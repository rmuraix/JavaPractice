public class Calendar {
    int gantan;
    int[] mon = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    String[] week = {
            "“ú—j“ú",
            "Œ—j“ú", 
            "‰Î—j“ú", 
            "…—j“ú", 
            "–Ø—j“ú", 
            "‹à—j“ú", 
            "“y—j“ú"
    };

    public static void main(String[] args) {
        Calendar c;
        // ˆø”
        int year = Integer.parseInt(args[0]);
        int gantanNum = Integer.parseInt(args[1]);
        int month = Integer.parseInt(args[2]);
        int day = Integer.parseInt(args[3]);

        // ŠÈˆÕ‰[”N”»’è
        // ³Šm‚É‚Í@year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)
        if (year % 4 == 0) {
            c = new Calendar(gantanNum, true);
        } else {
            c = new Calendar(gantanNum, false);
        }

        System.out.println(month + "Œ" + day + "“ú‚Í" + c.wday(month, day));
        System.out.print("‚·‚È‚í‚¿");
        c.showWday(month, day);
        System.out.println(month + "Œ‚ÌƒJƒŒƒ“ƒ_[");
        c.showCalendar(month);
        System.out.println(year + "”N‚ÌƒJƒŒƒ“ƒ_[");
        c.showCalendar();
    }

    Calendar(int gantan, boolean leap) {
        this.gantan = gantan;
        if (leap)
            mon[2] = 29;
    }

    int numdays(int m, int d) {
        int sum = 0;
        for (int i = 1; i < m; i++) {
            sum += mon[i];
        }
        sum += d;
        return sum;
    }

    int wday(int m, int d) {
        return (numdays(m, d) - 1 + gantan) % 7;
    }

    void showWday(int m, int d) {
        System.out.println(week[wday(m, d)]);
    }

    void showCalendar(int m) {
        int k = wday(m, 1);
        for (int i = 0; i < k; i++)
            System.out.print(" ");
        for (int i = 1; i <= mon[m]; i++) {
            System.out.format("%3d", i);
            if (wday(m, i) == 6 && i < mon[m])
                System.out.println("");
        }
        System.out.println("");
        System.out.println("");
    }

    void showCalendar() {
        for (int m = 1; m < 13; m++) {
            System.out.println(" " + m + "Œ");
            showCalendar(m);
        }
    }
}