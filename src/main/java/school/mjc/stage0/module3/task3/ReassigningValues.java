package school.mjc.stage0.module3.task3;

public class ReassigningValues {
    public static void main(String[] args) {
        int first = 1, second = 10, third = 100;
        System.out.println(first + "\n" + second + "\n" + third);
        int linkToFirst = first = 15, linkToSecond = second = 6, lintToThird = third = 4;
        System.out.println(linkToFirst + "\n" + linkToSecond + "\n" + lintToThird);
        System.out.println(first + "\n" + second + "\n" + third);
    }
}
