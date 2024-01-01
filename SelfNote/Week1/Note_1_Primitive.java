public class Note_1_Primitive {
    public static void main(String[] args) throws Exception {

//------------------------------------------------[8 Primitive]---------------------------------------------------------------------
        
        // 4 for storing whole number

        byte myByte = 12; // -128 to 127

        short myShort = 1234; // -32,768 to 32,657 barely use them
        
        int myInt = 2837; // -2,147,483,648 to 2,147,483,647
        
        long myLong = 335121323123l; // Very High Number //Need to put 'l' at the end because the default number is int.

        // 2 for storing decimal number

        float myFloat = 6.3f; // about 6 deciaml digits , need to 'f' because default is float

        double myDouble = 45.213456; // about 15 deciaml digits.

        // 1 for true or false
        
        boolean myBoolean = false;
        boolean moreThan1000 = (myInt > 1000);

        // 1 for storing single character
        char myChar = 'W';


    }
}
