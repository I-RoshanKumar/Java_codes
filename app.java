import java.awt.*;
import java.applet.*;
public class app extends Applet{
    public void init(){
        Checkbox ch1= new Checkbox("Marathi");
        Checkbox ch2= new Checkbox("Hindi");

        CheckboxGroup chkgrp = new CheckboxGroup();
        Checkbox chkRed,chkkBlue,chkYellow;

        chkRed = new Checkbox("Red",chkgrp,false);
        chkkBlue = new Checkbox("Blue",chkgrp,false);
        chkYellow = new Checkbox("Yellow",chkgrp,false);

        add(chkRed);
        add(chkkBlue);
        add(chkYellow);
        
    }
}
