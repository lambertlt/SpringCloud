package springcloud.bean;

import java.util.Scanner;

/***
 * @author lambert
 * @date 2022-12-07
 * @explain
 ***/
public class Grade {
    public static void main(String[] args) {
        calc();
    }

    public static Integer calc() {
        // 成绩
        Integer N1 = 0; // 有效成绩个数
        Integer N2 = 0; // 成绩个数
        Integer sum = 0; // 成绩总和
        Double av = 0.; // 平均数
        N1 = 0;
        N2 = 0;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 100; i++) {
            System.out.println("请输入学生成绩：Number " + N1);
            int grade = scan.nextInt();
            if (grade > 0 && grade < 100) {
                N1++;
                N2++;
                sum += grade;
            } else {
                N2++;
            }
        }
        scan.close();
        av = Double.valueOf(sum / N1);
        System.out.println("总分数：" + sum + "，平均数：" + av);
        return -1;
    }
}
