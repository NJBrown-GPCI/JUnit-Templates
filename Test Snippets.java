      
   @Test   //test output from main
   public void testMain() throws Exception{
      String output = runMain();
      assertTrue("Doesn't contain SEARCHTEXT", output.contains("SEARCHTEXT"));
   }
     
   @Test   //test output from main
   public void testMainWithInput() throws Exception{
      String output = runMain("INPUT");
      assertTrue("Doesn't contain SEARCHTEXT for input INPUT", output.contains("SEARCHTEXT"));
   }
   
   @Test   //basic method
   public void testMethod() throws Exception{
      assertTrue("getThree() doesn't return 3", tester.getThree() == 3);
   }
   
   @Test   //array input
   public void testArray() throws Exception{
      assertTrue("getMax(new int[] {1,2,3}) doesn't return 3", tester.getMax(new int[] {1,2,3}) == 2);
   }

   @Test   //check number of methods
   public void testNumberOfMethods() throws Exception{
      Method[] s = TEMPLATE.class.getDeclaredMethods();   
      assertTrue("Not enough methods found.", s.length > 2);
   }
   
   //Run a void method and return output from stdout
   @Test
   public void testVoidMethod(String input){
         
       // set stdout
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      PrintStream ps = new PrintStream(baos);
      System.setOut(ps);
      
      //UPDATE THIS LINE
      tester.CHANGETOMETHODNAME(/* put arguments here */);
      String output = baos.toString();
      assertTrue("", output.contains("SEARCHTEXT")); 
   
   }