package lesson15List.practice.Task4;

public class Storage<T> {
    private T filed;

    public Storage() {
        this.filed = null;
    }
    public Storage(T filed) {
        this.filed = filed;
    }

    public T getFiled() {
        return filed;
    }

    public void setFiled(T filed) {
        this.filed = filed;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "filed=" + filed +
                '}';
    }
}
