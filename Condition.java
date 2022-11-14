
    /**
     * Created by students on 28/09/22.
     */
    public class Condition {
        private int id;
        private String name;
        private int age;
        private double length;
        private double weight;
        private double PA;


        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public double getPA() {
            return PA;
        }

        public void setPA(double PA) {
            this.PA = PA;
        }

        public Condition(int id, String name, int age, double length,
                         double weight,
                         double PA) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.length = length;
            this.weight = weight;
            this.PA = PA;

        }

    }


