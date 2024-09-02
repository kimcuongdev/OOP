public class vector {
    double x;
    double y;
    double z;
    public vector(double x, double y, double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public vector add(vector that){
        return new vector(this.x + that.x, this.y + that.y, this.z + that.z);
    }
    public vector sub(vector that){
        return new vector(this.x - that.x, this.y - that.y, this.z - that.z);
    }
    public vector mul(double k){
        return new vector(k * this.x, k * this.y, k * this.z);
    }
    public double pro(vector that){
        return this.x * that.x + this.y * that.y + this.z * that.z;
    }
    public void display(vector this){
        System.out.println(this.x + " " + this.y + " " + this.z);
    }
}
