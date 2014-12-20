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
class DwarveForBadChildSingleton extends DwarveForCreatePresent{
    
    public static DwarveForBadChildSingleton uniqueRoomForBadChildSingleton;
    
    private DwarveForBadChildSingleton () {}
    
    public static DwarveForBadChildSingleton getDwarve() {
        if (uniqueRoomForBadChildSingleton == null) {
            uniqueRoomForBadChildSingleton = new DwarveForBadChildSingleton();
        }
        return uniqueRoomForBadChildSingleton;
    }
    
    @Override
    protected Present createPresent(String type) {
        if (type.equals("Gift for a disobedient child"))
            return new ForBadChildPresent();
        else return null;
    }
}
