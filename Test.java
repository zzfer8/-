package pack3;
import java.util.Scanner;
public class Test {
	static final double z1 = 0.03;
    static final double z2 = 0.1;

    public static void main(String[] arg) {
        Doctor[] x = new Doctor[2];
        for (int e = 0; e < 2; e++) {
            x[e] = new Doctor();
            while (true) {
                try {
                    System.out.println("����������");
                    Scanner name = new Scanner(System.in);
                    String p =name.nextLine();
                    x[e].setName(p);
                    if (p.matches("[^a-z]"))
                        throw new  aException();
                    break;
                }
                catch (aException w){
                    System.out.println("����������");
                }
            }
            System.out.println("�������Ա�");
            Scanner sex = new Scanner(System.in);
            x[e].setSex(sex.nextLine());
            while (true) {
                try {
                    System.out.println("����������");
                    Scanner age = new Scanner(System.in);
                    x[e].setAge(age.nextInt());
                    break;
                } catch (Exception q) {
                    System.out.println("�������ֵ��������������");
                }
            }
            while (true) {
                try {
                    System.out.println("������ѧ��");
                    Scanner fees = new Scanner(System.in);
                    x[e].setFees(fees.nextDouble());
                    break;
                } catch (Exception q) {
                    System.out.println("�������ֵ��������������");
                }
            }
            System.out.println("�����빤��");
            Scanner roll = new Scanner(System.in);
            x[e].setRoll(roll.nextDouble());
            System.out.println(x[e]);
        }
        for (int j = 0; j < 2; j++) {
            System.out.println("=======================================================================================");
            System.out.println(x[j]);
            a:
            while (true) {
                System.out.println("������������Ҫ�ĵĹ��ܴ��룬1:��ѯѧ��(ÿѧ��),2:��ѯ����(ÿ��),3:��������˰,4:�˳�ϵͳ");
                Scanner i = new Scanner(System.in);
                int u = i.nextInt();
                switch (u) {
                    case 1:
                        System.out.println("��ѧ��ѧ��Ϊ:" + x[j].CheckTuition());
                        break;
                    case 2:
                        System.out.println("ÿ��нˮ(˰ǰ)Ϊ:" + x[j].QuerySalary());
                        if ((9 * x[j].QuerySalary() - 2 * x[j].CheckTuition())>0 && (9 * x[j].QuerySalary() - 2 * x[j].CheckTuition())<=36000){
                            System.out.println("ÿ��нˮ(˰��)Ϊ:" + ((9 * x[j].QuerySalary() - ((9 * x[j].QuerySalary() - 2 * x[j].CheckTuition()) * z1 )) / 9));
                        }
                        else if ((9 * x[j].QuerySalary() - 2 * x[j].CheckTuition())>36000 && (9 * x[j].QuerySalary() - 2 * x[j].CheckTuition())<144000) {
                            System.out.println("ÿ��нˮ(˰��)Ϊ:" + ((9 * x[j].QuerySalary() - ((9 * x[j].QuerySalary() - 2 * x[j].CheckTuition()) * z2 - 2520)) / 9));
                        }
                        break;
                    case 3:
                        if ((9 * x[j].QuerySalary() - 2 * x[j].CheckTuition())>0 && (9 * x[j].QuerySalary() - 2 * x[j].CheckTuition())<=36000){
                            System.out.println("��������˰(ÿ��)Ϊ:" + ((9 * x[j].QuerySalary() - 2 * x[j].CheckTuition()) * z1));
                        }
                        else if ((9 * x[j].QuerySalary() - 2 * x[j].CheckTuition())>36000 && (9 * x[j].QuerySalary() - 2 * x[j].CheckTuition())<144000) {
                            System.out.println("��������˰(ÿ��)Ϊ:" + ((9 * x[j].QuerySalary() - 2 * x[j].CheckTuition()) * z2 - 2520));
                        }
                        break;
                    case 4:
                        break a;
                    default:
                        System.out.println("������Ĵ�����������������");
                }
            }
        }
        System.out.println("лл����ʹ�ã�bye!");
    }
}



