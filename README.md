# SingTest
- For the behaviour I designed five interfaces: Talkable, Swimmable, Flyable, 
  Walkable and Singable
- Duck implements Talkable and make its own sound, and implements Swimmable
- Rooster implements Talkable and make its own sound; instead of modeling, we could    
  have a boolean flag `isRooster` in Chicken
- Chicken implements Talkable and make its own sound, and does not implement Flyable
- Parrot is having a `neighbor` property, and mimics the neighbor's talk behavior;
- Fish implements Swimmable;
- Shark and ClownFish has two enum properties: `size` and `color`; Shark has a 
  #eat(Fish) method, ClownFish has a #joke() method;
- Caterpillar has a #grow() method which returns a Butterfly object;
- When counting, check if the `Animal` object `instanceof` an interface;
- If I will design this as a RESTful API:
  1: The five interfaces will turn into five boolean flags in the model
  2: All animals could be queried like `GET /animals`
  3: Specific types can be queried like `GET /animals?type=Dolphin` or `GET 
    /animals?walkable=1`
