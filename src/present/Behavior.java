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
class Behavior {
    public String findOut() {
      int rand = (int)(Math.random()*3);
      String behavior = null;
      if (rand == 1) behavior = "Gift for a perfect child";
      else {
            if (rand == 2) behavior = "Gift for an obedient child";
            else behavior = "Gift for a disobedient child";
      }
      return behavior;
    }
}
