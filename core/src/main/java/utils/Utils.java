/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package utils;

public class Utils{

    static public boolean isAllPositiveNumber(String... str) {
        boolean flag = true;
        StringUtils stringUtils = new StringUtils();

        for (String temp : str) {
            flag = stringUtils.isPositiveNumber(temp);
            if(flag == false){
                return false;
            }
        }

        return flag;
    }
}
