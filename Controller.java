import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
     * Created by students on 28/09/22.
     */
    public class Controller {
//        Scanner in=new Scanner(System.in);
//    int id = in.nextInt();
//                String name = in.next();
//            int age = in.nextInt();
//            double length = in.nextDouble();
//            double weight = in.nextDouble();
//            double PA = in.nextDouble();
//            women w1=new women(id,  name,  age,  length,  weight,  PA);
//        man w=new man( id,  name,  age,  length,  weight,  PA);
        private Condition[] allController;
        private int numOfCondition;

        public Controller() {
            allController=new Condition[10];
            numOfCondition=0;
            readConditionFile();
        }
        public boolean addNewCondition(int id, String name, int age, double length,
                                     double weight,
                                     double PA)
        {
            if (numOfCondition<allController.length) {
                Condition s = new Condition( id,  name,  age,  length,
                 weight, PA);
                allController[numOfCondition] = s;
                numOfCondition++;
                return true;
            }
            else
            {
                return false;
            }
        }
        public Condition[]viewAllCondition()
        {
            return allController;
        }
        public Condition searchForCondition(int id)
        {
            boolean found=false;
            int i=0;
            while (!found&&i<allController.length)
            {
                if (allController[i]!=null)
                {
                    if (allController[i].getId()==id)
                        found=true;
                    else i++;

                }
                else i++;
            }
            if (i<allController.length)
                return allController[i];
            else return null;
        }

        public void readConditionFile()
        {

            try {
                Scanner in= new Scanner(new File("C:\\condition\\cn.txt"));
               // System.out.println(in.hasNext());
                while (in.hasNext())
                {
                    int id= in.nextInt();
                    String name=in.next();
                    int age=in.nextInt();
                    double length=in.nextDouble();
                    double weight=in.nextDouble();
                    double PA=in.nextDouble();

                    addNewCondition( id,  name,  age,  length,
                     weight,
                     PA)   ;
                }
                in.close();

            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(null,"Error in reading file "+e.getMessage());        }
        }


    }


