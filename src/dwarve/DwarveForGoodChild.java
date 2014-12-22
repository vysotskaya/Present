/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dwarve;

import present.ForGoodChildPresent;
import present.ForPerfectChildPresent;
import present.Present;
/**
 *
 * @author Admin
 */
public class DwarveForGoodChild extends DwarveForCreatePresent{
    
    public static DwarveForGoodChild uniqueDwarveForGoodChild;
    
    private DwarveForGoodChild () {}
    
    public static DwarveForGoodChild getDwarve() {
        if (uniqueDwarveForGoodChild == null) {
            uniqueDwarveForGoodChild = new DwarveForGoodChild();
        }
        return uniqueDwarveForGoodChild;
    }
    
    @Override
    protected Present createPresent(String type) {
        if (type.equals(behavior.BehaviorCONST.GOOD))
             return new ForGoodChildPresent();
        if (type.equals(behavior.BehaviorCONST.PERFECT))
             return new ForPerfectChildPresent();
        else return null;
             

    }
}
