package nl.tudelft.jpacman.npc.ghost;


import nl.tudelft.jpacman.board.BoardFactory;
import nl.tudelft.jpacman.board.Direction;
import nl.tudelft.jpacman.level.LevelFactory;
import nl.tudelft.jpacman.npc.Ghost;
import nl.tudelft.jpacman.npc.ghost.GhostFactory;
import nl.tudelft.jpacman.sprite.PacManSprites;
import nl.tudelft.jpacman.npc.ghost.Clyde;
import nl.tudelft.jpacman.sprite.SpriteStore;
import nl.tudelft.jpacman.level.MapParser;
import org.junit.jupiter.api.BeforeEach;

import java.util.EnumMap;
import java.util.Map;


public class ClydeTest {
    private MapParser parser;
    @BeforeEach
    void setUp() {
        PacManSprites sprites = new PacManSprites();
        parser = new MapParser(new LevelFactory(sprites, new GhostFactory(
            sprites)), new BoardFactory(sprites));
//        parser.parseMap()
    }
}
