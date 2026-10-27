package Homework4;

public class ArrayHomework1 {
    public static void main(String[] args) {
        // Խնդիր 1 — Հաշվել տվյալ թվի հանդիպումների քանակը
        int[] numbers1 = {6, 3, 8, 6, 1, 9, 6, 4, 2, 6};
        int n = 6;
        int count1 = 0;
        for (int i = 0; i < numbers1.length; i++) {
            if (numbers1[i] == n) {
                count1++;
            }
        }
        System.out.println("count of " + n + ":" + count1);
// Խնդիր 2 — Շրջել զանգվածի էլեմենտների հերթականությունը
        int[] numbers2 = {1, 5, 8, 3, 9, 2, 7, 4, 6, 10};
        for (int i = 0; i < numbers2.length / 2; ++i) {
            int a = numbers2[i];
            numbers2[i] = numbers2[numbers2.length - 1 - i];
            numbers2[numbers2.length - 1 - i] = a;
        }
        for (int i = 0; i < numbers2.length; i++) {
            System.out.print(numbers2[i] + " ");
        }
        System.out.println();
// Խնդիր 3 — Հաշվել կրկնվող թվերի քանակը
        int[] numbers3 = {3, 6, 8, 3, 9, 6, 2, 3, 5, 6};
        int repeatCount = 0;
        int num = 0;
        for (int i = 0; i < numbers3.length; i++) {
            boolean beforeSeen = false;
            for (int j = 0; j < i; j++) {
                if (numbers3[j] == numbers3[i]) {
                    beforeSeen = true;
                    break;
                }
            }
            if (beforeSeen) continue;
            for (int j = i+1; j <numbers3.length ; j++) {
                if (numbers3[j]==numbers3[i]){
                   repeatCount++;
                    break;
                }
            }
        }
        // Խնդիր 4 — Հաշվել ձայնավորների քանակը

        System.out.println("Repeated numbers count"+":"+ repeatCount);
        {char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ'};

        int count =0;
        for (char c:chars){
            if (c=='ա'|| c=='ե'||c=='է'||c=='ը'||c=='ի'||c=='ո'||c=='օ'||c=='ո'||c=='ւ'){
                count++;
            }
        }
                System.out.println("Vowels count "+": "+ count);

    }
    }}









