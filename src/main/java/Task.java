abstract public class Task {
    protected String description;
    protected boolean isDone;

    public Task(String description) throws MurphyException {
        String trimmed = description.trim();
        if (trimmed.isEmpty()) {
            throw new MurphyException("Description for task cannot be empty!");
        }
        this.description = description;
        this.isDone = false;
    }

    public String getStatusIcon() {
        return (isDone ? "X" : " "); // mark done task with X
    }

    public void mark() {
        this.isDone = true;
    }

    public void unmark() {
        this.isDone = false;
    }

    @Override
    public String toString() {
        return "[" + this.getStatusIcon() + "]" + " " + this.description;
    }
}