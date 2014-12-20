/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package present;

/**
 *
 * @author Admin
 */

public class ToPresent {
    
    public static void main(String[] args) {
        Present present;
        Behavior behavior = new Behavior();
        String children[] = {"Roma", "Sasha"};
        String behaviorResult = null;
        for (int i = 0; i < 2; i++) {
            behaviorResult = behavior.findOut();
            if (behaviorResult.equals("Gift for a disobedient child")) {
                present = DwarveForBadChildSingleton.getDwarve().
                        giveDeservedPresent(behaviorResult);
                System.out.println(children[i] + " take " + present.getName());
            }
            else {
                present = DwarveForGoodChildSingleton.getDwarve().
                        giveDeservedPresent(behaviorResult);
                System.out.println(children[i] + " take " + present.getName());
            }
            System.out.println();
        }
                      
    }
}

