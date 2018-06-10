package gorodilov;

public class Dog extends Animal
{
    public Dog(int runmeters, int swimmeters, double jumpmeters) {
        super(runmeters, swimmeters, jumpmeters);
    }


        boolean Run () {
        if (runmeters > 500) return false;
        return true;
        }

        boolean Swim () {
        if (swimmeters > 10) return false;
        return true;
        }

        boolean Jump () {
        if (jumpmeters > 0.5) return false;
        return true;

        }
}
