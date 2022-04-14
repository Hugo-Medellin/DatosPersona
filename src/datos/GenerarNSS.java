package datos;

class AlphaNumericStringGenerator {
    static String getRandomString(){
        
        String theAlphaNumericS;
        StringBuilder builder;
        
        int i = 8;
        theAlphaNumericS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789"; 

        //create the StringBuffer
        builder = new StringBuilder(i); 

        for (int m = 0; m < i; m++) { 

            // generate numeric
            int myindex 
                = (int)(theAlphaNumericS.length() 
                        * Math.random()); 

            // add the characters
            builder.append(theAlphaNumericS 
                        .charAt(myindex)); 
        }
        return builder.toString();
    }
}