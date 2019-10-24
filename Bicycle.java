class Bicycle{
  private String name;
  private String color;
  private int distance = 0;
  
  Bicycle(String name, String color){
    this.name = name;
    this.color = color;
  }
  
  public void printData() {
    System.out.println("Name: " + this.name);
    System.out.println("Color: " + this.color);
    System.out.println("Distance: " + this.distance + "km");
  }
  
  public void run(int distance){
    this.distance = distance;
    System.out.println("Moving " + distance + "km " + "...");
    System.out.println("Distance: " + distance + "km");
  }
}

