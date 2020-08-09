package banglacelander;
import java.util.Scanner;

public class Calender {

    public static void main(String[] args) {
        int date, month, year;
        String name = null;
        String ch, YY;
        String ddd = null, ZZ = "বঙ্গাব্দ";
        char[] arr;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Date Month Year : ");
        date = sc.nextInt();
        month = sc.nextInt();
        year = sc.nextInt();
        if (month >= 4 && month <= 12) {
            year = year - 593;
        } else {
            year = year - 1 - 593;
        }

        if (month == 4) {

            if (date < 14) {
                month = 12;
                name = "চৈত্র";
                date = date + 14 + 3;
            } else if (date >= 14) {
                month = 1;
                name = "বৈশাখ";
                date = date - 14 + 1;
            }

        } else if (month == 5) {

            if (date < 15) {
                month = 1;
                name = "বৈশাখ";
                date = date + 15 + 2;
            } else if (date >= 15) {
                month = 2;
                name = "জৈষ্ট্য";
                date = date - 15 + 1;
            }

        } else if (month == 6) {
            if (date < 15) {
                month = 2;
                name = "জৈষ্ট্য";
                date = date + 15 + 2;
            } else if (date >= 15) {
                month = 3;
                name = "আষাঢ়";
                date = date - 15 + 1;
            }
        } else if (month == 7) {

            if (date < 16) {
                month = 3;
                name = "আষাঢ়";
                date = date + 16;
            } else if (date >= 16) {
                month = 4;
                name = "শ্রাবণ";
                date = date - 16 + 1;
            }
        } else if (month == 8) {

            if (date < 16) {
                month = 4;
                name = "শ্রাবণ";
                date = date + 16;
            } else if (date >= 16) {
                month = 5;
                name = "ভাদ্র";
                date = date - 16 + 1;
            }
        } else if (month == 9) {

            if (date < 16) {
                month = 5;
                name = "ভাদ্র";
                date = date + 16;
            } else if (date >= 16) {
                month = 6;
                name = "আশ্বিন";
                date = date - 16 + 1;
            }
        } else if (month == 10) {

            if (date < 16) {
                month = 6;
                name = "আশ্বিন";
                date = date + 15;
            } else if (date >= 16) {
                month = 7;
                name = "কার্তিক";
                date = date - 16 + 1;
            }
        } else if (month == 11) {

            if (date < 15) {
                month = 7;
                name = "কার্তিক";
                date = date + 15 + 1;
            } else if (date >= 15) {
                month = 8;
                name = "অগ্রাহায়ন";
                date = date - 15 + 1;
            }

        } else if (month == 12) {

            if (date < 15) {
                month = 8;
                name = "অগ্রাহায়ন";
                date = date + 15 + 1;
            } else if (date >= 15) {
                month = 9;
                name = "পৌষ";
                date = date - 15 + 1;
            }
        } else if (month == 1) {

            if (date < 14) {
                month = 9;
                name = "পৌষ";
                date = date + 14 + 3;
            } else if (date >= 14) {
                month = 10;
                name = "মাঘ";
                date = date - 14 + 1;
            }

        } else if (month == 2) {

            if (date < 13) {
                month = 10;
                name = "মাঘ";
                date = date + 13 + 5;
            } else if (date >= 13) {
                month = 11;
                name = "ফাল্গু্ণ";
                date = date - 13 + 1;
            }
        } else if (month == 3) {
            if (date < 15) {
                month = 11;
                name = "ফাল্গু্ণ";
                date = date + 15 + 2;
            } else if (date >= 15) {
                month = 12;
                name = "চৈত্র";
                date = date - 15 + 1;
            }
        }
        if (date == 1) {
            ch = "লা";
        } else if (date == 2 || date == 3) {
            ch = "রা";
        } else if (date == 4) {
            ch = "ঠা";
        } else if ((date >= 5) && (date <= 18)) {
            ch = "ই";
        } else {
            ch = "শে";
        }
        arr = ("" + year).toCharArray();
        // cout<<date<<"  "<<name<<"  "<<"( Month Number="<<month<<")"<<"  "<<year<<endl;
        for (int i = 0; i < 4; i++) {
            if (arr[i] == '0') {
                arr[i] = '০';
            } else if (arr[i] == '1') {
                arr[i] = '১';
            } else if (arr[i] == '2') {
                arr[i] = '২';
            } else if (arr[i] == '3') {
                arr[i] = '৩';
            } else if (arr[i] == '4') {
                arr[i] = '৪';
            } else if (arr[i] == '5') {
                arr[i] = '৫';
            } else if (arr[i] == '6') {
                arr[i] = '৬';
            } else if (arr[i] == '7') {
                arr[i] = '৭';
            } else if (arr[i] == '8') {
                arr[i] = '৮';
            } else if (arr[i] == '9') {
                arr[i] = '৯';
            }
        }
        if (date == 1) {
            ddd = "১";
        } else if (date == 2) {
            ddd = "২";
        } else if (date == 3) {
            ddd = "৩";
        } else if (date == 4) {
            ddd = "৪";
        } else if (date == 5) {
            ddd = "৫";
        } else if (date == 6) {
            ddd = "৬";
        } else if (date == 7) {
            ddd = "৭";
        } else if (date == 8) {
            ddd = "৮";
        } else if (date == 9) {
            ddd = "৯";
        } else if (date == 10) {
            ddd = "১০";
        } else if (date == 11) {
            ddd = "১১";
        } else if (date == 12) {
            ddd = "১২";
        } else if (date == 13) {
            ddd = "১৩";
        } else if (date == 14) {
            ddd = "১৪";
        } else if (date == 15) {
            ddd = "১৫";
        } else if (date == 16) {
            ddd = "১৬";
        } else if (date == 17) {
            ddd = "১৭";
        } else if (date == 18) {
            ddd = "১৮";
        } else if (date == 19) {
            ddd = "১৯";
        } else if (date == 20) {
            ddd = "২০";
        } else if (date == 21) {
            ddd = "২১";
        } else if (date == 22) {
            ddd = "২২";
        } else if (date == 23) {
            ddd = "২৩";
        } else if (date == 24) {
            ddd = "২৪";
        } else if (date == 25) {
            ddd = "২৫";
        } else if (date == 26) {
            ddd = "২৬";
        } else if (date == 27) {
            ddd = "২৭";
        } else if (date == 28) {
            ddd = "২৮";
        } else if (date == 29) {
            ddd = "২৯";
        } else if (date == 30) {
            ddd = "৩০";
        } else if (date == 31) {
            ddd = "৩১";
        }
        YY = String.valueOf(arr);
        
        System.out.println("Output Date Month Year: "+ddd + "" + ch + " " + name + " " + YY + "" + ZZ);
        System.out.println();
    }
}

/*******************************
 
Enter a Date Month Year : 09 08 2020
Output Date Month Year: ২৫শে শ্রাবণ ১৪২৭বঙ্গাব্দ

* ******************************/
