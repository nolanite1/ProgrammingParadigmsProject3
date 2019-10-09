// Sailesh Sai Sirigineedi
// Gas Tank class
// 9/27/19
public class GasTank{
    private int capacity;
    private double level;
    public GasTank(int capacity){
        if(capacity > 0){
            this.capacity = capacity;
        }
        else{
            this.capacity = 0;
        }
        this.level = 0;
    }
    public int getCapacity(){
        return this.capacity;
    }
    public double getLevel(){
        return this.level;
    }
    public void setLevel(double levelIn){
        if(levelIn < 0){
            this.level = 0;
        }
        else if(levelIn > this.capacity){
            this.level = this.capacity;
        }
        else{
            this.level = levelIn;
        }
    }
}

