package inheritance.problem5MultiLevel;

public class MultiLevel {

    public MultiLevel() {
        System.out.println("Multilevel");
    }

    public static void main(String[] args) {
        SubLevel subLevel=new SubLevel();
    }

}

class Level extends MultiLevel
{
    public Level() {
        System.out.println("Level");
    }
}
class SubLevel extends Level
{
    SubLevel()
    {
        System.out.println("Sublevel");
    }

}
