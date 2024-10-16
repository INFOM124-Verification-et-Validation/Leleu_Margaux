package nl.tudelft.jpacman.npc.ghost;

import nl.tudelft.jpacman.board.BasicUnit;
import nl.tudelft.jpacman.npc.Ghost;
import nl.tudelft.jpacman.sprite.PacManSprites;
import nl.tudelft.jpacman.ghost.Clyde;
import nl.tudelft.jpacman.sprite.SpriteStore;
import org.junit.jupiter.api.BeforeEach;


public class ClydeTest {
    PacManSprites SPRITE_STORE = new PacManSprites();
    GhostFactory factory= new GhostFactory(SPRITE_STORE);
    Clyde clyde= factory.createClyde();




}
