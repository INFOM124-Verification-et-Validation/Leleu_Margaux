package com.gildedrose;

class GildedRose {
    Item[] items;
    static final String BACKSTAGE= "Backstage passes to a TAFKAL80ETC concert";
    static final String SULFURAS="Sulfuras, Hand of Ragnaros";
    static final String BRIE="Aged Brie";

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (!items[i].name.equals(BRIE)
                    && !items[i].name.equals(BACKSTAGE)) {
                if (items[i].quality > 0 && !items[i].name.equals(SULFURAS)) {
                        items[i].quality = items[i].quality - 1;
                    }

            } else {
                if (items[i].quality < 50) {
                    items[i].quality = items[i].quality + 1;

                    if (items[i].name.equals(BACKSTAGE)) {
                        if (items[i].sellIn < 11 && items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }


                        if (items[i].sellIn < 6 && items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }

                    }
                }
            }

            if (!items[i].name.equals(SULFURAS)) {
                items[i].sellIn = items[i].sellIn - 1;
            }

            if (items[i].sellIn < 0) {
                if (!items[i].name.equals(BRIE)) {
                    if (!items[i].name.equals(BACKSTAGE)) {
                        if (items[i].quality > 0 && !items[i].name.equals(SULFURAS)) {
                                items[i].quality = items[i].quality - 1;
                            }

                    } else {
                        items[i].quality = 0;
                    }
                } else {
                    if (items[i].quality < 50) {
                        items[i].quality = items[i].quality + 1;
                    }
                }
            }
        }

    }
}
