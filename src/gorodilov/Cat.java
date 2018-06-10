package gorodilov;

 class Cat extends Animal
{
    public Cat(int runmeters, int swimmeters, double jumpmeters) {
        super(runmeters, swimmeters, jumpmeters);
    }



   boolean Run ()
   {
       if (runmeters > 200) return false;
       return true;
    }

    boolean Swim ()
    {
        if (swimmeters > 0) return false;
        return true;
    }

    boolean Jump ()
    {
        if (jumpmeters > 2) return false;
        return true;

    }
}

