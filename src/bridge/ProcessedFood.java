package bridge;
abstract class ProcessedFood {
    protected Task task1;
    protected Task task2;

    protected ProcessedFood(Task task1, Task task2)
    {
        this.task1 = task1;
        this.task2 = task2;
    }

    abstract public void manufacture();
}