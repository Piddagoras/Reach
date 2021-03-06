/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stats;

import java.util.ArrayList;

/**
 *
 * @author SinisteRing
 */
public class StatList {
    protected ArrayList<Stat> stats;
    
    // Default constructor.
    public StatList(){
        stats = new ArrayList();
    }
    // Constructor with prior ArrayList of stats.
    public StatList(ArrayList<Stat> stats){
        this.stats = stats;
    }
    
    // Getters:
    public ArrayList<Stat> getList(){
        return stats;
    }
    
    // Add a stat to the stat list priority-wise.
    public void add(Stat stat){
        for(Stat s : stats){
            if(s.getClass().equals(stat.getClass())){
                s.add(stat.getCurrent());
            }
        }
        stats.add(stat);
    }
}
