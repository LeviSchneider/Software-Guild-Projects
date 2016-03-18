
import com.tsg.interfaceexamples.Ball;
import com.tsg.interfaceexamples.Colorable;
import com.tsg.interfaceexamples.DebugLogging;
import com.tsg.interfaceexamples.Debuggable;
import com.tsg.interfaceexamples.MyDebugLogger;
import com.tsg.interfaceexamples.MyDebuggableClass;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author apprentice
 */
public class App {
    public static void main(String[] args) {
        Colorable ball = new Ball();
        
        ball.setColor("purple");
        
        ((Ball)ball).bounce();
        
        //Colorable things = new Colorable();
        
        Debuggable debugThis = new MyDebuggableClass();
        
        debugThis.displayStatus("All is well");
        debugThis.displayError("ALL is burning!!");
        
        Debuggable debugMe = new MyDebugLogger();
        
        debugMe.displayError("This is bad");
        ((DebugLogging)debugMe).displayStatus("234");
        ((DebugLogging)debugMe).logError("This really should work");
        
        ((Colorable)debugMe).getColor();
        
        runColorable((Colorable)debugMe);
    }
    
    public static void runColorable(Colorable thisGuy)
    {
        thisGuy.setColor("green");
        System.out.println(thisGuy.getColor());
    }
}
