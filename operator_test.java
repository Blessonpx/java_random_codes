class operator_test{
  public static void main(String[] args){
    boolean x=true, y=false;
    System.out.println(x&&y);
    System.out.println(x||y);
    System.out.println(!x);
    String s="Not Null";
    // Example of short circuiting 
    // no handler exception due to s.lenght even if s is null
    if (s!=null && s.length()>0)
      System.out.println("String is not null and not empty");
    else
      System.out.println("Null String");
}
}