class output_test{
  public static void main(String[] args){
    int x=100,y=10;
    float z = (float)Math.PI;
    System.out.format("Output x=%d & y=%d",x,y);
    System.out.format("z=%f",z);
    System.out.format("z=%.2f",z);
    System.out.format("z=%5.2f",z);
    System.out.format("z=%05.2f",z);
  }
}