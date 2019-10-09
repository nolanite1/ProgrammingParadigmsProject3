// Sailesh Sai Sirigineedi
// Auto class
// 9/27/19
public class Auto{
    private String description;
    private int x = 0;
    private int y = 0;
    private GasTank gasTank;
    private Engine engine;
    public Auto(String description, int maxFuelCapacity, Engine engine){
        if(description.length() == 0){
            this.description = "Generic auto";
        }
        else{
            this.description = description;
        }
        if(engine == null){
            this.engine = new Engine("",0,0);
        }
        else{
            this.engine = engine;
        }
        this.gasTank = new GasTank(maxFuelCapacity);
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public double getFuelLevel(){
        return this.gasTank.getLevel();
    }
    public int getMPG(){
        return this.engine.getMpg();
    }
    public int getMaxSpeed(){
        return this.engine.getMaxSpeed();
    }
    public String getDescription(){
        return this.description + " (engine: " +  this.engine.getDescription() + "), fuel: " + String.format("%.2f",this.getFuelLevel()) + "/" + this.gasTank.getCapacity() + ",location: (" + this.getX() + "," + this.getY() + ")";
    }
    public void fillUp(){
        this.gasTank.setLevel(this.gasTank.getCapacity());
    }
    public double drive(int distance, double xRatio, double yRatio){
        double gallonsUsed = distance / (double) this.getMPG();
        if(gallonsUsed > this.getFuelLevel()){
            distance = (int) (this.getFuelLevel() * this.getMPG());
            gallonsUsed = this.getFuelLevel();
            System.out.println("Ran out of gas after driving " + distance + " miles.");
        }
        double factor = distance / Math.sqrt((xRatio*xRatio) + (yRatio*yRatio));
        double distanceX = factor * xRatio;
        double distanceY = factor * yRatio;
        this.x+=distanceX;
        this.y+=distanceY;
        double currentLevel = this.getFuelLevel() - gallonsUsed;
        this.gasTank.setLevel(currentLevel);
        return (double) distance;
    }

}
