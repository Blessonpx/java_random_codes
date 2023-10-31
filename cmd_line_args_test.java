class cmd_line_args_test{
  public static void main(String[] args){
    if(args.length>0){
      for (String x:args){
        System.out.println(x);
      }
    }else{
      System.out.println("No Arguments Provided");
    }
  }
}