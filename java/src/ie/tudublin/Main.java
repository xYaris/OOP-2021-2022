package ie.tudublin;



public class Main
{
    public static void helloProcessing()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new HelloProcessing());
    }

    public static void bugZap()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new BugZap());
    }

    public static void loops()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Loops());
    }

    public static void arrays()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Arrays());
    }

    public static void audio1()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Audio1());
    }

<<<<<<< HEAD
<<<<<<< HEAD
    public static void life()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Life());
    }
    
=======
=======
    public static void audio2()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Audio2());
    }

>>>>>>> 0e4ccf8c75afbd2fba88b712508569ab5bba12ee
    public static void colorfulLife()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new ColorfulLife());
    }
>>>>>>> 016e3f4695348f106069e871a5a87a3625b05bb1

    public void cat()
    {
        System.out.println("Hello world");

        Animal misty = new Animal("Misty");
        Animal lucy = new Animal("Lucy");

        lucy = misty;
        misty.setName("Tara");

        System.out.println(misty);
        System.out.println(lucy);

        
        Cat cat = new Cat("Ginger");

        while(cat.getNumLives() > 0)
        {
            cat.kill();
        }
        cat.kill();

    }
    public static void main(String[] args)
    {
        audio2();

        // Tara Misty
        // Tara Tara
        
    }
}