package neko.task;
import java.time.LocalDateTime;

public class Event extends Task {
    private final LocalDateTime start, end;

    public Event(String name, LocalDateTime start, LocalDateTime end) {
        super(name);
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "[E]" + super.toString() +
                " (from: " + start.format(dateFormatter)
                + " to: " + end.format(dateFormatter) + ")";
    }

    @Override
    public String getTime() {
        return start.format(dateFormatter) + " | "
                + end.format(dateFormatter);
    }
}
