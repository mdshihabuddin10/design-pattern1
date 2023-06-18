package bridge;
public class Bread extends ProcessedFood {
    public Bread(Task task1, Task task2) {
        super(task1, task2);
    }

    @Override
    public void manufacture()
    {
        System.out.print("Bread ");
        task1.perform();
        task2.perform();
    }
}
