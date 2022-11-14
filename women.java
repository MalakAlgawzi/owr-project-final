public class women extends Condition {


    public women(int id, String name, int age, double length, double weight, double PA,double X, double Y, double Z, double R ,double Q) {
        super(id, name, age, length, weight, PA);


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
        //  X , Y , Z ,R
    //    double X=665; double Y=9.56; double Z=1.85; double R =4.68; double Q=45.5;

        sum = X + (Y * weight) + (Z * length) - (R* age);
        System.out.println("**************************************|");
        System.out.println(" |الأحتياج اليومي للسعرات الحراريه=  "+sum);
        System.out.println("--------------------------------------|");
        System.out.println("**************************************|");

        System.out.println("sun1=" + sum * PA);
        System.out.println("**************************************|");
        System.out.println("الأحتياج اليومي للسعرات الحراريه بعد معدل النشاط  ");
        System.out.println("--------------------------------------|");
        IBW = (((length * 100) - 154) * 0.9) + Q;
        System.out.println("**************************************|");
        System.out.println("الوزن المثالي : ");
        System.out.println("IBW=" + IBW);
        System.out.println("--------------------------------------|");
        water = weight * 35;
        System.out.println("**************************************|");
        System.out.println("الأحتياج اليومي للماء : ");
        System.out.println("water=" + water / 1000);
        System.out.println("--------------------------------------|");
        System.out.println("**************************************|");

    }
}