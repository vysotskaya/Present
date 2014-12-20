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
class ForPerfectChildPresent extends Present {

    public ForPerfectChildPresent() {
//        presentName = "Подарок для идеального ребёнка";
//        card = "Музыкальная открытка со снеговиками";
//        chocolate = "Молочный шоколад с орешками";
//        bike = "Горный велосипед";
        
        presentName = "Gift for a perfect child";
        card = "Musical card with snowmen";
        chocolate = "Milk chocolate with nuts";
        bike = "Mountain bicycle";

        //contents.add("Подарок для идеального ребёнка");
        contents.add("Gift for a perfect child");
    }
    @Override
    public void drawingCard() {
        //System.out.println("Гномы делают музыкальную открытку и рисуют на ней снеговиков.");
        System.out.println("Dwarves make musical card and draw  snowmen on it.");
    }
    @Override
    public void cookingChocolate() {
        //System.out.println("Гномы варят молочный шоколад и добавляют орешки.");
        System.out.println("Dwarves cook milk chocolate and add nuts.");
    }
    @Override
    public void packing() {
        //System.out.println("Гномы cкладывают подарок в блестящую коробку.");
        System.out.println("Dwarves fold gift in brilliant box.");
    }

    @Override
    public void decorating() {
        System.out.println("Dwarves decorated mountain bicycle.");
    }

}

