package school.management.system;public class Teacher {


    /*
     * This class is responsible for keeping the track
     * of teacher's name, id, salary
     *
     *
     */
    public class Teacher {

        private int id;
        private String name;
        private int salary;


        /*
        * created a new Teacher object.
        * @param name name of the teacher
        * @param salary salary of the teacher
        * */

        public Teacher(int id, String name, int salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        /*
        * return the id
        * */

        public int getId(){
           return id;
        }

        /*
         * return the name of the teacher
         * */

        public String getName() {
            return name;
        }

        /*
         * return the salary of the teacher
         * */

        public int getSalary(){
            return salary;
        }

        public void setSalary(int salary) {
             this.salary = salary;t
        }

    }
}
