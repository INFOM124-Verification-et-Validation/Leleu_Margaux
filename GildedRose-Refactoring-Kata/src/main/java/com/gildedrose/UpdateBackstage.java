package com.gildedrose;

public class UpdateBackstage {
    public UpdateBackstage(){}
    public void updateQualityBackstage(Item item){
        if(item.sellIn>10){
            item.quality+=1;
        }
        else if (item.sellIn>5) {
            item.quality+=2;
        }
    }
}
