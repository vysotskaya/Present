/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package drive;

import behavior.Behavior;
import behavior.BehaviorCONST;
import present.Present;
import dwarve.*;

public class ToPresent {
    
    public static void main(String[] args) {
        Present present;
        Behavior behavior = new Behavior();
        String children[] = {"Roma", "Sasha"};
        String behaviorResult = null;
        for (int i = 0; i < children.length; i++) {
            behaviorResult = behavior.findOut();
            if (behaviorResult.equals(BehaviorCONST.BAD)) {
                present = DwarveForBadChild.getDwarve().
                        giveDeservedPresent(behaviorResult);
                System.out.println(children[i] + " take " + present);
            }
            else {
                present = DwarveForGoodChild.getDwarve().
                        giveDeservedPresent(behaviorResult);
                System.out.println(children[i] + " take " + present);
            }
            System.out.println();
        }
                      
    }
}

