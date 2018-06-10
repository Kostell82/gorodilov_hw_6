package gorodilov;

public abstract class Animal extends Main
{
     int runmeters;
     int swimmeters;
     double jumpmeters;

    public Animal(int runmeters, int swimmeters, double jumpmeters) {
        this.runmeters = runmeters;
        this.swimmeters = swimmeters;
        this.jumpmeters = jumpmeters;
    }

    abstract boolean Run();
    abstract boolean Swim();
    abstract boolean Jump();
}
