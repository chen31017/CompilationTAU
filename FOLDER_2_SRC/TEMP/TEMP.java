/***********/
/* PACKAGE */
/***********/
package TEMP;

/*******************/
/* GENERAL IMPORTS */
/*******************/

/*******************/
/* PROJECT IMPORTS */

/*******************/

public class TEMP {
    private int serial = 0;

    public TEMP(int serial) {
        this.serial = serial;
    }

    public int getSerialNumber() {
        return serial;
    }

    public String toString() {
        return "TEMP_"+Integer.toString(serial);
    }
}
