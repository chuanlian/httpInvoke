package senior.thread;

public class Test {

    public void main(String[] args) {
        Circle outer = new Circle(9.5f);

        Circle.Draw draw = outer.new Draw();

        MyCla myCla = getMycla();
        myCla.getAge();


    }

    public MyCla getMycla() {
        return new MyCla();
    }

    class MyCla {
        private int age;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
