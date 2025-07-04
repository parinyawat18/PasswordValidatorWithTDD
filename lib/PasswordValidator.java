package lib;

public class PasswordValidator {

    /**  
     * คุณจะต้องเขียน Javadoc ที่สมบูรณ์ที่นี่ในอนาคต
     * เพื่ออธิบายกฎการทำงานของเมธอด
     *@param password String ที่ต้องการตรวจสอบ
    @return password PasswordStrength INVALID; 
   */
    public static  PasswordStrength validate(String password) { // Function Type ให้เป็น PasswordStrength      
        if(password==null|| password.length()<8)
        return PasswordStrength.INVALID;

        boolean hasLower = false ;
        boolean hasUpper = false ;
        //boolean Letter = false ;//
        boolean Special = false ;
        boolean Digit = false ;
        for (char c : password.toCharArray()){
            if(Character.isLowerCase(c))
            hasLower = true ;
            else if(Character.isUpperCase(c))
            hasUpper = true ;
            else if(Character.isDigit(c))
            Digit = true ;
            else Special = true;
        }
        if(hasLower && hasUpper  && Digit && Special ) return PasswordStrength.STRONG;
        if(hasLower && !hasUpper) return PasswordStrength.WEAK;

        else if (hasLower && hasUpper || Digit) return PasswordStrength.MEDIUM;

    

        return PasswordStrength.INVALID ; 

        // ส่วนของ Implementation ที่คุณต้องเขียน
        // 
        
        
        

    }
}
