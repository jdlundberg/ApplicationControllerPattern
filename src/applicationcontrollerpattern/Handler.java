package applicationcontrollerpattern;

import java.util.ArrayList;

/**
 *
 * @author Jonathan
 */
public interface Handler {
    
    public void handleIt(Integer position, ArrayList<String>... lists);
    
}
