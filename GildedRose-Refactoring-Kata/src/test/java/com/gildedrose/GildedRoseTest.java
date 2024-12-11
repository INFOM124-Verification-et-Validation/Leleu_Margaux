package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GildedRoseTest {

    @Test
    void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }

    @Test
    void testAgedBrie(){
        Item[] items=new Item[]{ new Item("Aged Brie",2,0)};
        GildedRose app=new GildedRose(items);
        app.updateQuality();
        assertTrue(app.items[0].quality>0);
        assertEquals(1, app.items[0].sellIn);
    }

    @Test
    void testSulfuras(){
        Item[] items=new Item[]{new Item("Sulfuras, Hand of Ragnaros",5,80)};
        GildedRose app=new GildedRose(items);
        app.updateQuality();
        assertEquals(5,items[0].sellIn);
        assertFalse(items[0].quality>80);
        assertEquals(80,items[0].quality);
    }

    @Test
    void testBackstageCloseToDate(){
        Item[] items=new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert",6,10)};
        GildedRose app=new GildedRose(items);
        app.updateQuality();
        assertEquals(12,items[0].quality);
        assertEquals(5,items[0].sellIn);
        app.updateQuality();
        assertEquals(15,items[0].quality);
        assertEquals(4,items[0].sellIn);
    }

    @Test
    void testBackstageFarFromDate(){
        Item[] items=new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert",20,10)};
        GildedRose app=new GildedRose(items);
        app.updateQuality();
        assertEquals(11,items[0].quality);
        assertEquals(19,items[0].sellIn);
    }

    @Test
    void testBackstageAfterDate(){
        Item[] items=new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert",0,10)};
        GildedRose app=new GildedRose(items);
        app.updateQuality();
        assertEquals(0,items[0].quality);
        assertEquals(-1,items[0].sellIn);
    }

}
