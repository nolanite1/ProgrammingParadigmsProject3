// Sailesh Sai Sirigineedi
// Engine class
// 9/27/19
public class Engine{
    private String description;
    private int mpg;
    private int maxSpeed;
    public Engine(String description,int mpg, int maxSpeed) {
        if (mpg < 0) {
            this.mpg = 0;
        } else {
            this.mpg = mpg;
        }
        if (maxSpeed < 0) {
            this.maxSpeed = 0;
        } else {
            this.maxSpeed = maxSpeed;
        }
        if (description.length() == 0) {
            this.description = "Generic engine";
        } else {
            this.description = description;
        }
    }
    public String getDescription(){
        return this.description + " (MPG:" + this.mpg + ", Max Speed: " + this.maxSpeed + ")";
    }
    public int getMaxSpeed() {
        return this.maxSpeed;
    }
    public int getMpg() {
        return this.mpg;
    }
}


