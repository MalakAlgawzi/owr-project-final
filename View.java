
    import java.util.Scanner;

    /**
     * Created by students on 28/09/22.
     */
    public class View {

        Controller c;
        Scanner in;

        public View() {
            c = new Controller();
            in = new Scanner(System.in);
        }

        public void start() {

//            System.out.println("ذكر أم أنثى ");
//            System.out.println("1.أنثى _ 2.ذكر ");
//            int o=in.nextInt();
//            switch (o)
//            {
//                case 1:
//                    double  X=665; double Y=9.56; double Z=1.85; double R =4.68 ;double Q=45.5;
//                    add( X,  Y , Z , R,Q);
//                    break;
//                case 2:
//                    double X1=66.5; double Y1=13.8; double Z1=5; double R1 =6.76; double Q1=50;
//                    add(X1 ,Y1 ,Z1, R1,Q1);
//
//                    break;
//            }

//           ;
//            women w1=new women(id,  name,  age,  length,  weight,  PA);
//            man w=new man( id,  name,  age,  length,  weight,  PA);

            System.out.println("___________________________________|");
            System.out.println("  Clinic System nutrition          |");
            System.out.println("___________________________________|");
            while (true) {
                System.out.println("1: Add New Condition\t\t2:View All Condition\n" +
                        "3:Search for  Condition\t\t0: Exit 4:readFileCondition\t\t");
                System.out.println("--------------------------------------|");
                System.out.println("--------------------------------------|");

                int choice = in.nextInt();
                switch (choice) {
                    case 1:
                     //   add( X,  Y,  Z,  R , Q);
                    {
                        System.out.println("ذكر أم أنثى ");
                        System.out.println("1.أنثى _ 2.ذكر ");
                        int o=in.nextInt();
                        switch (o)
                        {
                            case 1:
                                double  X=665; double Y=9.56; double Z=1.85; double R =4.68 ;double Q=45.5;
                                add( X,  Y , Z , R,Q);
                                break;
                            case 2:
                                double X1=66.5; double Y1=13.8; double Z1=5; double R1 =6.76; double Q1=50;
                                add(X1 ,Y1 ,Z1, R1,Q1);

                                break;
                        }
                    }
                        break;
                    case 2:
                        view();
                        break;
                    case 3:
                        find();
                        break;
                    case 0:
                        System.exit(0);
                    case 4:
                        c.readConditionFile();
                        break;

                }
            }
        }

        public void add(  double X, double Y, double Z, double R ,double Q) {
            Scanner in=new Scanner(System.in);



            System.out.println("ID Name Age length weight PA");
            System.out.println("--------------------------------|");
            System.out.println("enter id:");
            int id = in.nextInt();
            System.out.println("--------------------------------|");

            System.out.println("enter name:");
            String name = in.next();
            System.out.println("--------------------------------|");

            System.out.println("enter age:");
            int age = in.nextInt();
            System.out.println("--------------------------------|");

            System.out.println("enter length:");
            double length = in.nextDouble();
            System.out.println("--------------------------------|");


            System.out.println("enter weight:");
            double weight = in.nextDouble();
            System.out.println("--------------------------------|");

            System.out.println("enter PA");
            double PA = in.nextDouble();
            System.out.println("--------------------------------|");

            women w1;
            man w;
            if (X==665)
                w1=new women(id,  name,  age,  length,  weight,  PA , X,  Y,  Z,  R,Q);
            else
               w=new man( id,  name,  age,  length,  weight,  PA , X,  Y,  Z,  R,Q) ;
//            int id = in.nextInt();
//            String name = in.next();
//            int age = in.nextInt();
//            double length = in.nextDouble();
//            double weight = in.nextDouble();
//            double PA = in.nextDouble();

            /////////////////////////////////////

//            double BML;
//            double sum;
//            double IBW;
//            double water;
/////////////////////////////////////////////////////////
//            BML = weight / (length * length);
//            System.out.println("BML=" + BML);
//            if (BML < 18.5) {
//                System.out.println("under weight....");
//            } else if (BML >= 18.5 && BML <= 24.5) {
//                System.out.println(" normal.....");
//            } else if (BML > 24.6 && BML <= 29.9) {
//                System.out.println("over weight");
//            }
//            if (BML >= 30) {
//
//                System.out.println("odesity...........");
//            }
//            sum = 665 + (9.56 * weight) + (1.85 * length) - (4.68 * age);
//            System.out.println("--------------------------------|");
//            System.out.println("SUN=" + sum);
//            System.out.println("--------------------------------|");
//            System.out.println("sun1=" + sum * PA);
//            System.out.println("--------------------------------|");
//            IBW = (((length * 100) - 154) * 0.9) + 45.5;
//            System.out.println("IBW=" + IBW);
//            System.out.println("--------------------------------|");
//            water = weight * 35;
//            System.out.println("water=" + water / 1000);
//            System.out.println("--------------------------------|");

            /////////////////////////////////////////////////

//            int id = in.nextInt();
//            String name = in.next();
//            int age = in.nextInt();
//            double length = in.nextDouble();
//            double weight = in.nextDouble();
//            double PA = in.nextDouble();
            boolean added = this.c.addNewCondition(id, name, age, length, weight,
                    PA);
            //, sum, IBW, water, BML  );
            if (added) {
                System.out.println("added successfully");
            } else {
                System.out.println("too much students");
            }

        }




        public void view()
        {
            Condition[]all=c.viewAllCondition();
            System.out.println("ID Name Age length weight PA");

            for (int i = 0; i <all.length ; i++) {
                if (all[i]!=null)
                    System.out.println(all[i].getId()+"\t"
                            +all[i].getName()+"\t"+all[i].getAge()
                            +"\t"+all[i].getLength() +"\t"+all[i].getWeight() +"\t"+all[i].getPA());
            }

        }
        public void find()
        {
            System.out.println("input Condition ID");
            int id=in.nextInt();
            Condition s= c.searchForCondition(id);
            if (s!=null)
            {
                System.out.println("ID Name Age length weight PA");
                System.out.println(s.getId()+"\t"
                        +s.getName()+"\t"+s.getAge()
                        +"\t"+s.getLength() +"\t"+s.getWeight() +"\t"+s.getPA());
            }
            else
                System.out.println("no Condition with this ID");
        }
    }


