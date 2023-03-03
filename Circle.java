package BaiTapLab3.BaiTapLab4;

public class Circle {
    private Double radius;
    private String color;
    private Double area;

    public Circle( Double radius, String color,double area ) {
        this.radius = radius;
        this.color = color;
        this.area = area;
    }

    public Double getRadius() {
        return radius;
    }

    public Double setRadius( Double radius ){
        return this.radius= radius;
    }

    public String getColor(){
        return color;
    }

    public String setColor(String color){
        return this.color= color;
    }

    public Double getArea() {
        return area;
    }

    public String toString(){
        return radius+","+ color+", "+ area; 
    }
}



