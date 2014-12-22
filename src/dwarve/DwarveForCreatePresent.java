/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dwarve;

import present.Present;

/**
 *
 * @author Admin
 */
abstract class DwarveForCreatePresent {

    public Present giveDeservedPresent (String type) {
        Present present;
        
        present = createPresent(type);
        
        present.creating();
        present.drawingCard();
        present.cookingChocolate();
        present.decorating();
        present.packing(); 
        
        return present;
    }
    protected abstract Present createPresent (String type);
}
