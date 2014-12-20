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
class DwarveForGoodChildSingleton extends DwarveForCreatePresent{
    
    public static DwarveForGoodChildSingleton uniqueRoomForGoodChildSingleton;
    
    private DwarveForGoodChildSingleton () {}
    
    public static DwarveForGoodChildSingleton getDwarve() {
        if (uniqueRoomForGoodChildSingleton == null) {
            uniqueRoomForGoodChildSingleton = new DwarveForGoodChildSingleton();
        }
        return uniqueRoomForGoodChildSingleton;
    }
    
    @Override
    protected Present createPresent(String type) {
        if (type.equals("Gift for an obedient child"))
             return new ForGoodChildPresent();
        if (type.equals("Gift for a perfect child"))
             return new ForPerfectChildPresent();
        else return null;
             

    }
}
