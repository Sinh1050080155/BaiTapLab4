package BaiTapLab3.BaiTapLab4;

public class Cylinder extends Circle{
  
    private Double height;
    public Double volume;
public Cylinder(Double radius, String color, Double area, Double height){
        super(radius, color, area);
        this.height = height;   
    }
    
    public Double getHeight(double h) {
        return height;
    }
    public Double setHeight() {
        return this.height;
    }
    public Double getVolume(){
        return getArea()*height;
    }  
    
  
    
}
