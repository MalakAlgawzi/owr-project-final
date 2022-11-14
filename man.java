public class man extends Condition {
    public double sr;
public  double IBW2;


    public man(int id, String name, int age, double length, double weight, double PA,double X1, double Y1,
               double Z1, double R1 ,double Q1) {
        super(id, name, age, length, weight, PA);
        this.sr = sr;
        this.IBW2 = IBW2;



        double BML;
        double sum;
        double IBW;
        double water;
///////////////////////////////////////////////////////
        BML = weight / (length * length);
        System.out.println("BML=" + BML);
        if (BML < 18.5) {
            System.out.println("under weight....");
            System.out.println("--------------------------------------|");

        } else if (BML >= 18.5 && BML <= 24.5) {
            System.out.println(" normal.....");
            System.out.println("--------------------------------------|");

        } else if (BML > 24.6 && BML <= 29.9) {
            System.out.println("over weight");
            System.out.println("--------------------------------------|");

        }
        if (BML >= 30) {

            System.out.println("odesity...........");
        }
        //  X1 , Y1 , Z1 ,R1
      //  double X1=66.5; double Y1=13.8; double Z1=5; double R1 =6.76; double Q1=50;

        sum = X1 + (Y1 * weight) + (Z1 * length) - (R1* age);
        System.out.println("**************************************|");
        System.out.println("--------------------------------|");
        System.out.println(" |الأحتياج اليومي للسعرات الحراريه=  "+sum);
        System.out.println("**************************************|");

        System.out.println("SUN=" + sum);
        System.out.println("--------------------------------|");
        System.out.println("**************************************|");

        System.out.println("sun1=" + sum * PA);
        System.out.println("الأحتياج اليومي للسعرات الحراريه بعد معدل النشاط  ");
        System.out.println("--------------------------------|");
        System.out.println("**************************************|");

        IBW = (((length * 100) - 154) * 0.9) + Q1;
        System.out.println("**************************************|");
        System.out.println("الوزن المثالي : ");
        System.out.println("IBW=" + IBW);
        System.out.println("--------------------------------|");
        water = weight * 35;
        System.out.println("**************************************|");
        System.out.println("الأحتياج اليومي للماء : ");
        System.out.println("water=" + water / 1000);
        System.out.println("--------------------------------|");
        System.out.println("**************************************|");

    }

//        sr=66.5+(13.8*weight)+(5*length)-(6.76*age);
//        IBW2=((length-154)*0.9)+50;
    }

