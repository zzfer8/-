package pack3;
import java.util.Scanner;
class Doctor implements Student, Teacher {
    private String name;
    private String sex;
    private int age;
    double fees;
    private double roll;

    Doctor(){

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public void setRoll(double roll) {
        this.roll = roll;
    }

    public void PayFees() {
        while (true) {
            Scanner x = new Scanner(System.in);
            double Fees = x.nextDouble();
            if (Fees - fees > 0) {
                System.out.println("�����������������½���");
            } else if (Fees - fees < 0) {
                System.out.println("�����������������½���");
            } else {
                System.out.println("���ѳɹ�����");
                break;
            }
        }
    }



    public double CheckTuition(){
        return fees;
    }

    public double PayRoll(){
        return roll;
    }
    public double QuerySalary() {
        return roll;
    }

    public String toString() {
        return "ѧ����ϢΪ{" + "����'" + name + ", �Ա�'" + sex + ", ����" + age + ", ѧ��(ÿѧ��)" + fees + ", ����(˰ǰÿ��)" + roll + '}';
    }
}





