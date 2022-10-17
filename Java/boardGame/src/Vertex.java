public class Vertex {

    /**
     * Vertex node class
     * Member Variables: number, color, and pi
     * - number: identity of the vertex
     * - color: the color of the vertex
     * - pi: predecessor vertex
     * **/

    private int number;
    private int color;
    private int pi;

    // constructors
    public Vertex() {
        this.number = 0;
        this.color = 0;
        this.pi = -1;
    }

    public Vertex(int number, int color, int pi) {
        this.number = number;
        this.color = color;
        this.pi = pi;
    }

    //getters and setters
    public void setNumber(int number) {
        this.number = number;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setPi(int pi) {
        this.pi = pi;
    }

    public int getNumber() {
        return this.number;
    }

    public int getColor() {
        return this.color;
    }

    public int getPi() {
        return this.pi;
    }

    // printing

}
