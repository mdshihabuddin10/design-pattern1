package bridge;
public class Chocolate extends ProcessedFood{
    public Chocolate(Task task1, Task task2)
    {
        super(task1, task2);
    }

    @Override
    public void manufacture()
    {
        System.out.print("Chocolate ");
        task1.perform();
        task2.perform();
    }
}
