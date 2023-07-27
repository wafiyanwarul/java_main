package practicumpbo.variable;

/**
 *
 * @author ACER A515-45-R3RR
 */
public class Processor {

    private String series;

    public Processor(String series) {
        setSeries(series);
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }
}

class Main {

    public static void main(String[] args) {
        Processor[] processors = new Processor[3];
        processors[0] = new Processor("Core i3");
        processors[1] = new Processor("Core i5");
        processors[2] = new Processor("Core i7");

        for (Processor processor : processors) {
            System.out.println(processor.getSeries());
        }
    }
}
