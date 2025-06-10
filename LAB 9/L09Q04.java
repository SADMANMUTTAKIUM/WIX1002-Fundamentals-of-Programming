// Base Dice Game class
abstract class DiceGame {
    protected int score;
    protected Random random;
    
    public DiceGame() {
        score = 0;
        random = new Random();
    }
    
    public abstract void playTurn();
    public abstract boolean hasWon();
    
    public int getScore() { return score; }
    
    protected int rollDice() {
        return random.nextInt(6) + 1;
    }
}

// First Dice Game - Roll two dice
class TwoDiceGame extends DiceGame {
    
    @Override
    public void playTurn() {
        int dice1, dice2;
        boolean canRollAgain = true;
        
        while (canRollAgain) {
            dice1 = rollDice();
            dice2 = rollDice();
            System.out.println("Rolled: " + dice1 + " and " + dice2);
            
            score += dice1 + dice2;
            System.out.println("Turn score: " + (dice1 + dice2) + ", Total: " + score);
            
            if (dice1 != dice2) {
                canRollAgain = false;
            } else {
                System.out.println("Both dice equal! Roll again!");
            }
        }
    }
    
    @Override
    public boolean hasWon() {
        return score >= 100;
    }
}

// Second Dice Game - Roll one dice
class OneDiceGame extends DiceGame {
    
    @Override
    public void playTurn() {
        int dice = rollDice();
        System.out.println("Rolled: " + dice);
        
        if (dice == 6) {
            System.out.println("Got 6! Roll again!");
            int secondDice = rollDice();
            System.out.println("Second roll: " + secondDice);
            
            if (secondDice == 6) {
                System.out.println("Second 6! No score this turn!");
                return; // No score added
            } else {
                int turnScore = dice + secondDice;
                if (score + turnScore > 100) {
                    System.out.println("Would exceed 100! No score this turn!");
                    return;
                }
                score += turnScore;
                System.out.println("Turn score: " + turnScore + ", Total: " + score);
            }
        } else {
            if (score + dice > 100) {
                System.out.println("Would exceed 100! No score this turn!");
                return;
            }
            score += dice;
            System.out.println("Turn score: " + dice + ", Total: " + score);
        }
    }
    
    @Override
    public boolean hasWon() {
        return score == 100;
    }
}

// ========================================
// TESTER CLASSES
// ========================================

class ShapeTester {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.inputSides();
        rect.computePerimeterArea();
        rect.display();
        
        System.out.println();
        
        Square square = new Square();
        square.inputSide();
        square.computePerimeterArea();
        square.display();
        
        System.out.println();
        
        Circle circle = new Circle();
        circle.inputDiameter();
        circle.computePerimeterArea();
        circle.display();
    }
}

class DiceGameTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Choose game: 1 (Two Dice) or 2 (One Dice): ");
        int choice = sc.nextInt();
        
        DiceGame game;
        if (choice == 1) {
            game = new TwoDiceGame();
            System.out.println("=== Two Dice Game Started ===");
        } else {
            game = new OneDiceGame();
            System.out.println("=== One Dice Game Started ===");
        }
        
        while (!game.hasWon()) {
            System.out.println("\nPress enter to roll...");
            sc.nextLine();
            if (sc.hasNextLine()) sc.nextLine();
            
            game.playTurn();
        }
        
        System.out.println("\n🎉 YOU WON! Final score: " + game.getScore());
    }
}