/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dwarve;


import present.ForBadChildPresent;
import present.Present;
/**
 *
 * @author Admin
 */
public class DwarveForBadChild extends DwarveForCreatePresent{
    
    public static DwarveForBadChild uniqueDwarveForBadChild;
    
    private DwarveForBadChild () {}
    
    public static DwarveForBadChild getDwarve() {
        if (uniqueDwarveForBadChild == null) {
            uniqueDwarveForBadChild = new DwarveForBadChild();
        }
        return uniqueDwarveForBadChild;
    }
    
    @Override
    protected Present createPresent(String type) {
        if (type.equals(behavior.BehaviorCONST.BAD))
            return new ForBadChildPresent();
        else return null;
    }
}
