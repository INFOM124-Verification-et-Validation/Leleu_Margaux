package com.gildedrose;

public class UpdateQualityFactory {
//    cette classe va redistribuer vers les autres classes selon le type
    static final String BACKSTAGE= "Backstage passes to a TAFKAL80ETC concert";
    static final String SULFURAS="Sulfuras, Hand of Ragnaros";
    static final String BRIE="Aged Brie";
    static final String CONJURED="Conjured";
    public void updateQualityFactory(Item item){
        switch (item.name) {
            case BACKSTAGE: {
                UpdateBackstage update = new UpdateBackstage();
                update.updateQualityBackstage(item);
                break;
            }
            case SULFURAS: {
                UpdateSulfuras update = new UpdateSulfuras();
                update.updateQualitySulfuras(item);

                break;
            }
            case BRIE: {
                UpdateBrie update = new UpdateBrie();
                update.updateQualityBrie(item);
                break;
            }
            case CONJURED: {
                UpdateConjured update = new UpdateConjured();
                update.updateQualityConjured(item);
                break;
            }
            default: {
                UpdateElse update = new UpdateElse();
                update.updateQualityElse(item);

                break;
            }
        }
    }
}
