package Lesson1.task2;

public class Rectangle {
    private Double height;
    private Double width;
    Rectangle(){
        this.height = 5.0;
        this.width = 3.0;
    }
    Rectangle(Double height, Double width){
        this.height = height;
        this.width = width;
    }
    public void setHeight(Double height){
        this.height = height;
    }
    public Double getHeight(){
        return height;
    }
    public void setWidth(Double width){
        this.width = width;
    }
    public Double getWidth(){
        return width;
    }
    public Double calculateArea(Double height, Double width){
        return height*width;
    }
    public Double calculatePerimeter(Double height, Double width){
        return 2*(height+width);
    }
}
