import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import tester.*;
import javalib.impworld.*;
import java.awt.Color;
import javalib.worldimages.*;

//represent a card
class Card {
  int x;
  int y;
  int rank;
  String suit;
  Color color;
  boolean face;
  
  Card(int x, int y, int rank, String suit, Color color, boolean face) {
    this.x = x;
    this.y = y;
    this.rank = rank;
    this.suit = suit;
    this.color = color;
    this.face = face;
  }
  
  // to get the string of the rank of card
  String cardRank() {
    if (this.rank == 1) {
      return "A";
    } else if (this.rank == 11) {
      return "J";
    } else if (this.rank == 12) {
      return "Q";
    } else if (this.rank == 13) {
      return "K";
    }
    return Integer.toString(rank);
  }
  
  // if this card is the same as the given card
  boolean same(Card given) {
    return this.rank == given.rank
        && this.color == given.color;
  }

  //draw the card image onto the world image
  WorldImage draw() {
    if (this.face) {
      if (this.rank == 1) {
        return 
            new OverlayOffsetImage(new TextImage(this.cardRank(), 16,
                this.color), 17.0, 25.0,
                new OverlayOffsetImage(new TextImage(this.cardRank(), 
                    16, this.color), -17.0, -25.0,
                    new OverlayImage( new TextImage(this.suit, 33, this.color), 
                        new RectangleImage(50, 70, "outline", Color.black))));
      } else if (this.rank == 2) {
        return 
            new OverlayOffsetImage(new TextImage(this.cardRank(), 16, this.color), 17.0, 25.0,
                new OverlayOffsetImage(new TextImage(this.cardRank(),
                    16, this.color), -17.0, -25.0,
                    new OverlayOffsetImage( new TextImage(this.suit, 11, this.color), 0.0, 10.0,
                        new OverlayOffsetImage( new TextImage(this.suit, 11,
                            this.color), 0.0, -10.0,
                            new RectangleImage(50, 70, "outline", Color.black)))));
      } else if (this.rank == 3) {
        return 
            new OverlayOffsetImage(new TextImage(this.cardRank(), 16, this.color), 17.0, 25.0,
            new OverlayOffsetImage(new TextImage(this.cardRank(), 16, this.color), -17.0, -25.0,
            new OverlayOffsetImage( new TextImage(this.suit, 11, this.color), 0.0, 0.0,
            new OverlayOffsetImage( new TextImage(this.suit, 11, this.color), 0.0, 20.0,
            new OverlayOffsetImage( new TextImage(this.suit, 11, this.color), 0.0, -20.0,
            new RectangleImage(50, 70, "outline", Color.black))))));
      } else if (this.rank == 4) {
        return 
            new OverlayOffsetImage(new TextImage(this.cardRank(), 16, this.color), 17.0, 25.0,
            new OverlayOffsetImage(new TextImage(this.cardRank(), 16, this.color), -17.0, -25.0,
            new OverlayOffsetImage( new TextImage(this.suit, 11, this.color), 10.0, 15.0,
            new OverlayOffsetImage( new TextImage(this.suit, 11, this.color), 10.0, -15.0,
            new OverlayOffsetImage( new TextImage(this.suit, 11, this.color), -10.0, 15.0,
            new OverlayOffsetImage( new TextImage(this.suit, 11, this.color), -10.0, -15.0,
            new RectangleImage(50, 70, "outline", Color.black)))))));
      } else if (this.rank == 5) {
        return 
            new OverlayOffsetImage(new TextImage(this.cardRank(), 16, this.color), 17.0, 25.0,
            new OverlayOffsetImage(new TextImage(this.cardRank(), 16, this.color), -17.0, -25.0,
            new OverlayOffsetImage( new TextImage(this.suit, 11, this.color), 10.0, 15.0,
            new OverlayOffsetImage( new TextImage(this.suit, 11, this.color), 10.0, -15.0,
            new OverlayOffsetImage( new TextImage(this.suit, 11, this.color), -10.0, 15.0,
            new OverlayOffsetImage( new TextImage(this.suit, 11, this.color), -10.0, -15.0,
            new OverlayOffsetImage( new TextImage(this.suit, 11, this.color), 0, 0,
            new RectangleImage(50, 70, "outline", Color.black))))))));
      } else if (this.rank == 6) {
        return 
            new OverlayOffsetImage(new TextImage(this.cardRank(), 16, this.color), 17.0, 25.0,
            new OverlayOffsetImage(new TextImage(this.cardRank(), 16, this.color), -17.0, -25.0,
            new OverlayOffsetImage( new TextImage(this.suit, 11, this.color), 10.0, 17.0,
            new OverlayOffsetImage( new TextImage(this.suit, 11, this.color), 10.0, 0,
            new OverlayOffsetImage( new TextImage(this.suit, 11, this.color), 10, -17.0,
            new OverlayOffsetImage( new TextImage(this.suit, 11, this.color), -10.0, 17.0,
            new OverlayOffsetImage( new TextImage(this.suit, 11, this.color), -10.0, 0,
            new OverlayOffsetImage( new TextImage(this.suit, 11, this.color), -10, -17.0,
            new RectangleImage(50, 70, "outline", Color.black)))))))));
      } else if (this.rank == 7) {
        return 
            new OverlayOffsetImage(new TextImage(this.cardRank(), 16, this.color), 17.0, 25.0,
            new OverlayOffsetImage(new TextImage(this.cardRank(), 16, this.color), -17.0, -25.0,
            new OverlayOffsetImage( new TextImage(this.suit, 11, this.color), 10.0, 17.0,
            new OverlayOffsetImage( new TextImage(this.suit, 11, this.color), 10.0, 0,
            new OverlayOffsetImage( new TextImage(this.suit, 11, this.color), 10, -17.0,
            new OverlayOffsetImage( new TextImage(this.suit, 11, this.color), -10.0, 17.0,
            new OverlayOffsetImage( new TextImage(this.suit, 11, this.color), -10.0, 0,
            new OverlayOffsetImage( new TextImage(this.suit, 11, this.color), -10, -17.0,
            new OverlayOffsetImage( new TextImage(this.suit, 11, this.color), 0.0, 7.4,
            new RectangleImage(50, 70, "outline", Color.black))))))))));
      } else if (this.rank == 8) {
        return 
            new OverlayOffsetImage(new TextImage(this.cardRank(), 16, this.color), 17.0, 25.0,
            new OverlayOffsetImage(new TextImage(this.cardRank(), 16, this.color), -17.0, -25.0,
            new OverlayOffsetImage( new TextImage(this.suit, 11, this.color), 10.0, 17.0,
            new OverlayOffsetImage( new TextImage(this.suit, 11, this.color), 10.0, 0,
            new OverlayOffsetImage( new TextImage(this.suit, 11, this.color), 10, -17.0,
            new OverlayOffsetImage( new TextImage(this.suit, 11, this.color), -10.0, 17.0,
            new OverlayOffsetImage( new TextImage(this.suit, 11, this.color), -10.0, 0,
            new OverlayOffsetImage( new TextImage(this.suit, 11, this.color), -10, -17.0,
            new OverlayOffsetImage( new TextImage(this.suit, 11, this.color), 0.0, 7.4,
            new OverlayOffsetImage( new TextImage(this.suit, 11, this.color), 0.0, -7.4,
             new RectangleImage(50, 70, "outline", Color.black)))))))))));
      } else if (this.rank == 9) {
        return 
            new OverlayOffsetImage(new TextImage(this.cardRank(), 16, this.color), 20.0, 27.0,
            new OverlayOffsetImage(new TextImage(this.cardRank(), 16, this.color), -20.0, -27.0,
            new OverlayOffsetImage( new TextImage(this.suit, 11, this.color), 10.0, 24.0,
            new OverlayOffsetImage( new TextImage(this.suit, 11, this.color), 10.0, 8.0,
            new OverlayOffsetImage( new TextImage(this.suit, 11, this.color), 10.0, -8.0,
            new OverlayOffsetImage( new TextImage(this.suit, 11, this.color), 10.0, -24.0,
            new OverlayOffsetImage( new TextImage(this.suit, 11, this.color), -10.0, 24.0,
            new OverlayOffsetImage( new TextImage(this.suit, 11, this.color), -10.0, 8.0,
            new OverlayOffsetImage( new TextImage(this.suit, 11, this.color), -10.0, -8.0,
            new OverlayOffsetImage( new TextImage(this.suit, 11, this.color), -10.0, -24.0,
            new OverlayOffsetImage( new TextImage(this.suit, 11, this.color), 0, -0,
            new RectangleImage(50, 70, "outline", Color.black))))))))))));
      } else if (this.rank == 10) {
        return 
            new OverlayOffsetImage(new TextImage(this.cardRank(), 10, this.color), 20.0, 27.0,
            new OverlayOffsetImage(new TextImage(this.cardRank(), 10, this.color), -19.0, -27.0,
            new OverlayOffsetImage( new TextImage(this.suit, 11, this.color), 10.0, 24.0,
            new OverlayOffsetImage( new TextImage(this.suit, 11, this.color), 10.0, 8.0,
            new OverlayOffsetImage( new TextImage(this.suit, 11, this.color), 10.0, -8.0,
            new OverlayOffsetImage( new TextImage(this.suit, 11, this.color), 10.0, -24.0,
            new OverlayOffsetImage( new TextImage(this.suit, 11, this.color), -10.0, 24.0,
            new OverlayOffsetImage( new TextImage(this.suit, 11, this.color), -10.0, 8.0,
            new OverlayOffsetImage( new TextImage(this.suit, 11, this.color), -10.0, -8.0,
            new OverlayOffsetImage( new TextImage(this.suit, 11, this.color), -10.0, -24.0,
            new OverlayOffsetImage( new TextImage(this.suit, 11, this.color), 0, 14.0,
            new OverlayOffsetImage( new TextImage(this.suit, 11, this.color), 0, -14.0,
            new RectangleImage(50, 70, "outline", Color.black)))))))))))));
      } else {
        return 
            new OverlayOffsetImage(new TextImage(this.cardRank(), 16, this.color), 17.0, 25.0,
            new OverlayOffsetImage(new TextImage(this.cardRank(), 16, this.color), -17.0, -25.0,
            new OverlayOffsetImage( new TextImage(this.suit, 15, this.color), 10.0, 10.0,
            new OverlayOffsetImage( new TextImage(this.suit, 15, this.color), -10.0, -10.0,
            new RectangleImage(50, 70, "outline", Color.black)))));
      }
    }
    else {
      return 
          new RectangleImage(50, 70, "solid", Color.black);
    }
  }
}

// utility class for ArrayList<Card>
class Util {
  
  // shuffling the array list of cards
  void shuffling(ArrayList<Card> arr) {
    ArrayList<Posn> posList = new ArrayList<Posn>();
    for (Card elem : arr) {
      posList.add(new Posn(elem.x, elem.y));
    }
    
    Random rand = new Random();
    for (Card elem : arr) {
      int randPos = rand.nextInt(posList.size());
      elem.x = posList.get(randPos).x;
      elem.y = posList.get(randPos).y;
      posList.remove(randPos);
    }
  }
  
  // make the cards that haven't been guessed face down again, 
  // and keep the cards that have been guessed
  void renewCard(ArrayList<Card> arr) {
    for (Card elem : arr) {
      elem.face = false;
    }
  }
  
  // check if the two cards in the array list of cards are correctly guessed
  void check(ArrayList<Card> arr, Integer index1, Integer index2) {
    
    if (index1 != null && index2 != null && arr.get(index1).same(arr.get(index2))) {
      int i1 = index1;
      int i2 = index2;
      // make i2 minus 1 because when remove the first element, 
      // the index of the second element will move forward
      if (index1 < index2) {
        i2 -= 1;
      }
      arr.remove(i1);
      arr.remove(i2);
    }
  }
}

//represent the world program 
class Concentration extends World {
  
  // to check how may steps the user has used, the total steps the user can use is 200
  int step;
  
  // to count if there has been 2 cards that face up
  int count;
  
  // to keep track of the score of the list of card
  int score;
  
  // to represent the cards
  ArrayList<Card> listCards;
  
  // to give the users 2 second to remember the card
  int time;
  
  // the index of the first card that has been chosen to face up
  Integer index1;
  
  // the index of the second card that has been chosen to face up
  Integer index2;
  
  // to count how many second the user has used 
  int tick;

  Concentration( ArrayList<Card> listCards) {
    this.tick = 0;
    this.step = 0;
    this.score = 26;
    this.time = 0;
    this.count = 0;
    this.listCards = listCards;
  }

  //draw the worldScene 
  public WorldScene makeScene() {
    WorldScene backGround = new WorldScene(950, 600);
    for (Card c : listCards) {
      backGround.placeImageXY(c.draw(), c.x, c.y);
    }
    
    backGround.placeImageXY(new TextImage("Score so far:" 
        + Integer.toString(this.score), 15, Color.black), 75, 50);
    
    backGround.placeImageXY(new TextImage("Steps: " 
        + Integer.toString(this.step) + "/200", 15, Color.black), 200, 50);
    
    backGround.placeImageXY(new TextImage("Time: " 
        + Integer.toString(this.tick) + "s", 15, Color.black), 300, 50);
     
    backGround.placeImageXY(new TextImage("Press r to reset the game",
        15, Color.black), 500, 50);

    return backGround;
  }
  
  // draw the end scene of the world program
  public WorldScene lastScene() {
    WorldImage win = new TextImage("you win", 100, FontStyle.BOLD, Color.black);
    WorldImage lose = new TextImage("you lose", 100, FontStyle.BOLD, Color.black);
    WorldScene end = new WorldScene(950, 600);
    if (this.score == 0) {
      end.placeImageXY(win, 475, 300);
    } else if (this.step == 200) {
      end.placeImageXY(lose, 475, 300);
    } 
    return end;
  }
  
  // check the end status of the world program
  public WorldEnd worldEnds() {
    if (this.score == 0) {
      return new WorldEnd(true, this.lastScene());
    } else if (this.step == 200) {
      return new WorldEnd(true, this.lastScene());
    }
    return new WorldEnd(false, this.makeScene());
  }
  
  // reset the initial condition of the game
  void reset() {
    this.listCards = new ArrayList<Card>();
    for (int i = 0; i < 13; i ++) {
      this.listCards.add(new Card(40 + 70 * i, 150, i + 1, "♣", Color.black, false));
    }
    for (int i = 0; i < 13; i ++) {
      this.listCards.add(new Card(40 + 70 * i, 250, i + 1, "♦", Color.red, false));
    }
    for (int i = 0; i < 13; i ++) {
      this.listCards.add(new Card(40 + 70 * i, 350, i + 1, "♥", Color.red, false));
    }
    for (int i = 0; i < 13; i ++) {
      this.listCards.add(new Card(40 + 70 * i, 450, i + 1, "♠", Color.black, false));
    }
    Util util = new Util();
    util.shuffling(listCards);
  }
  
  // method that click the mouse to make the card face up
  public void onMouseClicked(Posn pos) {
    Posn cardClickPosn = this.cardPosn(pos);
    if (this.count == 0) {
      for (Card elem : listCards) {
        if (cardClickPosn.x == elem.x && cardClickPosn.y == elem.y && !elem.face) {
          elem.face = true;
          this.index1 = this.listCards.indexOf(elem);
          this.step ++;
          this.count ++;
        }
      }
    } else if (this.count == 1) {
      for (Card elem : listCards) {
        if (cardClickPosn.x == elem.x && cardClickPosn.y == elem.y && !elem.face) {
          elem.face = true;
          this.index2 = this.listCards.indexOf(elem);
          this.step ++;
          this.count ++;
        }
      }
    }
  }
  
  // to represent on key method
  // press "r" to reset the game
  public void onKeyEvent(String key) {
    if (key.equals("r")) {
      this.reset();
      this.count = 0;
      this.step = 0;
      this.time = 0;
      this.tick = 0;
      this.score = this.listCards.size() / 2;
      this.index1 = null;
      this.index2 = null;
    }
  }
  
  // when two cards are facing up, checking if the two cards are correct
  // giving the player 2 seconds to remember the cards,
  // then turn it down again.
  public void onTick() {
    this.tick ++;
    Util util = new Util();
    if (this.count == 2) {
      util.check(listCards, this.index1, this.index2);
      this.index1 = null;
      this.index2 = null;
      this.score = listCards.size() / 2;
      time ++;
    }
    if (this.time == 2) {
      util.renewCard(listCards);
      this.count = 0;
      this.time = 0;
    }
  }
  
  // check if the mouse click on the card
  Posn cardPosn(Posn pos) {
    for (Card elem : listCards) {
      if ((pos.x - elem.x >= 0 && pos.x - elem.x <= 25
          || pos.x - elem.x <= 0 && pos.x - elem.x >= -25)
          && (pos.y - elem.y >= 0 && pos.y - elem.y <= 35
          || pos.y - elem.y <= 0 && pos.y - elem.y >= -35)) {
        return new Posn(elem.x, elem.y);
      }
    }
    return new Posn(0, 0);
  }
}

class ExamplesConcentration {
  ArrayList<Card> cardList = new ArrayList<Card>();
  ArrayList<Card> cardList0;
  Card c1 = new Card(40, 250, 1, "♣", Color.black, true);
  Card c2 = new Card(110, 250, 11, "♦", Color.black, false);
  Card c3 = new Card(180, 250, 5, "♥", Color.black, true);
  Card c4 = new Card(40, 250, 11, "♣", Color.red, true);
  Card c5 = new Card(40, 350, 1, "♣", Color.black, true);
  Concentration world0;

  // the initial condition for test
  void initTest() {
    this.cardList0 = new ArrayList<Card>(Arrays.asList(new Card(40, 
        250, 1, "♣", Color.black, false),
        new Card(110, 250, 1, "♠", Color.black, false),
        new Card(180, 250, 10, "♣", Color.black, false),
        new Card(40, 250, 11, "♣", Color.black, false),
        new Card(40, 350, 10, "♥", Color.red, false)));
    this.world0 = new Concentration(this.cardList0);
  } 
  
  void testBigBang(Tester t) {
    Concentration world = new Concentration(this.cardList);
    world.reset();
    int worldWidth = 950;
    int worldHeight = 600;
    double tickRate = 1.0;
    world.bigBang(worldWidth, worldHeight, tickRate);
  }
  
  boolean testCardRank(Tester t) {
    return t.checkExpect(c1.cardRank(), "A")
        && t.checkExpect(c2.cardRank(), "J")
        && t.checkExpect(c3.cardRank(), "5");
  }
  
  boolean testdraw(Tester t) {
    return t.checkExpect(c1.draw(), 
        new OverlayOffsetImage(new TextImage(c1.cardRank(), 16, Color.black), 17.0, 25.0,
        new OverlayOffsetImage(new TextImage(c1.cardRank(), 16, Color.black), -17.0, -25.0,
        new OverlayImage( new TextImage("♣", 33, Color.black), 
        new RectangleImage(50, 70, "outline", Color.black)))))
        && t.checkExpect(c2.draw(), new RectangleImage(50, 70, "solid", Color.black))
        && t.checkExpect(c3.draw(), 
            new OverlayOffsetImage(new TextImage(c3.cardRank(), 16, Color.black), 17.0, 25.0,
            new OverlayOffsetImage(new TextImage(c3.cardRank(), 16, Color.black), -17.0, -25.0,
            new OverlayOffsetImage( new TextImage("♥", 11, Color.black), 10.0, 15.0,
            new OverlayOffsetImage( new TextImage("♥", 11, Color.black), 10.0, -15.0,
            new OverlayOffsetImage( new TextImage("♥", 11, Color.black), -10.0, 15.0,
            new OverlayOffsetImage( new TextImage("♥", 11, Color.black), -10.0, -15.0,
            new OverlayOffsetImage( new TextImage("♥", 11, Color.black), 0, 0,
            new RectangleImage(50, 70, "outline", Color.black)))))))));
            
  }
  
  void testSame(Tester t) {
    t.checkExpect(c1.same(c2), false);
    t.checkExpect(c1.same(c4), false);
    t.checkExpect(c1.same(c5), true);
  }
  
  void testMakeScene(Tester t) {
    initTest();
    WorldScene back = new WorldScene(950, 600);
    world0.makeScene();
    for (int i = 0; i < cardList0.size(); i ++) {
      back.placeImageXY(cardList0.get(i).draw(), cardList0.get(i).x, cardList0.get(i).y);
    }
    
    back.placeImageXY(new TextImage("Score so far:" 
        + Integer.toString(world0.score), 15, Color.black), 75, 50);
    
    back.placeImageXY(new TextImage("Steps: " 
        + Integer.toString(world0.step) + "/200", 15, Color.black), 200, 50);
    
    back.placeImageXY(new TextImage("Time: " 
        + Integer.toString(world0.tick) + "s", 15, Color.black), 300, 50);
     
    back.placeImageXY(new TextImage("Press r to reset the game", 
        15, Color.black), 500, 50);
    
    t.checkExpect(world0.makeScene(), back);
  }
  
  void testOnMouseClickedAndOnTick(Tester t) {
    initTest();
    world0.onMouseClicked(new Posn(0, 0));
    boolean test = false;
    for (int i = 0; i < cardList0.size(); i ++) {
      test = cardList0.get(i).face || test;
    }
    t.checkExpect(test, false);
    world0.onTick();
    t.checkExpect(world0.time, 0);
    t.checkExpect(world0.tick, 1);
    
    world0.onMouseClicked(new Posn(40, 250));
    for (int i = 0; i < cardList0.size(); i ++) {
      test = cardList0.get(i).face || test;
    }
    t.checkExpect(world0.listCards.get(0).face, true);
    t.checkExpect(test, true);
    t.checkExpect(world0.count, 2);
    t.checkExpect(cardList0.get(world0.index1).face, true);
    world0.onTick();
    t.checkExpect(world0.time, 1);
    t.checkExpect(world0.tick, 2);
    
    world0.onMouseClicked(new Posn(110, 250));
    t.checkExpect(world0.listCards.get(1).face, false);
    world0.count = 1;
    world0.onMouseClicked(new Posn(110, 250));
    t.checkExpect(world0.listCards.get(1).face, true);
  }
  
  void testOnTick(Tester t) {
    initTest();
    world0.onTick();
    t.checkExpect(world0.time, 0);
    t.checkExpect(world0.tick, 1);
    world0.index1 = 0;
    world0.index2 = 4;
    world0.count = 2;
    world0.onTick();
    t.checkExpect(world0.time, 1);
    t.checkExpect(world0.tick, 2);
    world0.onTick();
    t.checkExpect(world0.time, 0);
    t.checkExpect(world0.count, 0);
    t.checkExpect(world0.score, 2);
    world0.index1 = 0;
    world0.index2 = 1;
    world0.count = 2;
    world0.onTick();
    t.checkExpect(world0.score, 1);
  }
  
  void testCardPosn(Tester t) {
    initTest();
    t.checkExpect(world0.cardPosn(new Posn(0, 0)), new Posn(0, 0));
    t.checkExpect(world0.cardPosn(new Posn(30, 230)), new Posn(40, 250));
    t.checkExpect(world0.cardPosn(new Posn(50, 260)), new Posn(40, 250));
    t.checkExpect(world0.cardPosn(new Posn(30, 260)), new Posn(40, 250));
    t.checkExpect(world0.cardPosn(new Posn(50, 230)), new Posn(40, 250));
    t.checkExpect(world0.cardPosn(new Posn(900, 500)), new Posn(0, 0));
  }
  
  void testShuffling(Tester t) {
    initTest();
    Util util = new Util();
    ArrayList<Card> sample = cardList0;
    util.shuffling(cardList0);
    Random rand = new Random();
    int n = rand.nextInt(5);
    Posn pos1 = new Posn(sample.get(n).x, sample.get(n).y);
    Posn pos2 = new Posn(cardList0.get(n).x, cardList0.get(n).y);
    t.checkExpect(pos1, pos2);
  }
  
  void testRenewCard(Tester t) {
    initTest();
    cardList0.get(0).face = true;
    cardList0.get(2).face = true;
    Util util = new Util();
    util.renewCard(cardList0);
    cardList0.get(0).face = false;
    cardList0.get(2).face = false;
  }
  
  void testCheck(Tester t) {
    initTest();
    Util util = new Util();
    util.check(cardList0, 1, 2);
    t.checkExpect(cardList0.size(), 5);
    util.check(cardList0, 0, 1);
    t.checkExpect(cardList0.size(), 3);
    
    initTest();
    util.check(cardList0, 1, 0);
    t.checkExpect(cardList0.size(), 3);
  }
  
  void testOnKey(Tester t) {
    initTest();
    world0.count = 2;
    world0.tick = 4;
    world0.time = 2;
    world0.index1 = 2;
    world0.index2 = 3;
    
    world0.onKeyEvent("r");
    t.checkExpect(world0.listCards.size(), 52);
    t.checkExpect(world0.count, 0);
    t.checkExpect(world0.time, 0);
    t.checkExpect(world0.tick, 0);
    t.checkExpect(world0.score, 26);
    t.checkExpect(world0.index1, null);
    t.checkExpect(world0.index2, null);
  }
  
  void testReset(Tester t) {
    initTest();
    world0.reset();
    t.checkExpect(world0.listCards.size(), 52);
  }
  
  void testLastScene(Tester t) {
    initTest();
    WorldImage win = new TextImage("you win", 100, FontStyle.BOLD, Color.black);
    WorldImage lose = new TextImage("you lose", 100, FontStyle.BOLD, Color.black);
    WorldScene end1 = new WorldScene(950, 600);
    WorldScene end2 = new WorldScene(950, 600);
    end1.placeImageXY(win, 475, 300);
    end2.placeImageXY(lose, 475, 300);
    world0.score = 0;
    t.checkExpect(world0.lastScene(), end1);
    world0.score = 1; 
    world0.step = 200;
    t.checkExpect(world0.lastScene(), end2);
    
  }
  
  void testWorldEnds(Tester t) {
    initTest();
    t.checkExpect(world0.worldEnds(), new WorldEnd(false, world0.makeScene()));
    world0.score = 0;
    t.checkExpect(world0.worldEnds(), new WorldEnd(true, world0.lastScene()));
    world0.score = 1; 
    world0.step = 200;
    t.checkExpect(world0.worldEnds(), new WorldEnd(true, world0.lastScene()));
  }
}