public enum Status {

  // How enum bring initialized;
  // Step 1: normal class
  // Step 2: Someone "new this class object and place it into memory"

  ORDERD('O'), 
  SHIPPED('S'), 
  COMPLETED('C'),
  ;

  private char val;

  private Status(char val) {
    this.val = val;
  }




  
}
