public class Vector {
    int x;
    int y;
    boolean isFinal;
    UnsupportedOperationException vectorIsFinal =new UnsupportedOperationException("This vector is final");
    static Vector ZERO = new Vector(0,0,true);
    static Vector ONE = new Vector(1,1,true);
    static Vector HUNDRED = new Vector(100,100,true);

    public Vector(int x) {
        this.x = x;
        y = 0;
        this.isFinal = false;
    }

    public Vector(int x, int y) {
        this.x = x;
        this.y = y;
        this.isFinal = false;
    }

    public Vector(int x, boolean isFinal) {
        this.x = x;
        y = 0;
        this.isFinal = isFinal;
    }

    public Vector(int x, int y, boolean isFinal) {
        this.x = x;
        this.y = y;
        this.isFinal = isFinal;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (isFinal) {
            throw vectorIsFinal;
        }
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if (isFinal) {
            throw vectorIsFinal;
        }
        this.y = y;
    }

    public void set(int x, int y) {
        if (isFinal) {
            throw vectorIsFinal;
        }
        this.x = x;
        this.y = y;
    }

    public Vector add(Vector v) {
        return new Vector(this.x + v.x, this.y + v.y);
    }

    public Vector sub(Vector v) {
        return new Vector(this.x - v.x, this.y - v.y);
    }
    public Vector sumAll(Vector ... v){
        if (v.length==0){
            return ZERO;
        }
        Vector result = new Vector(0, 0);
        for (Vector vector : v) {
            result = result.add(vector);
        }
        return result;
    }
}
