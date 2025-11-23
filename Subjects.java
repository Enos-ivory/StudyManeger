package studyManeger;


public class Subjects {
    private String name;
    private int time;
    private String info;

    public Subjects(String name, int time, String info) {
        this.name = name;
        this.time = time;
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Subjects{" +
                "name='" + name + '\'' +
                ", time=" + time +
                ", info='" + info + '\'' +
                '}';
    }
}
