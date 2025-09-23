// Create interface for showing any mathematical formula using method names FORMULA,and use in other multiple
// class

package programs;

interface FORMULA {
    void showFormula();  
}

class AreaOfSquare implements FORMULA {
    public void showFormula() {
        System.out.println("Area of Square = s^2");
    }
}

class Pythagoras implements FORMULA {
    public void showFormula() {
        System.out.println("Pythagoras Theorem: a^2 + b^2 = c^2");
    }
}

class QuadraticEquation implements FORMULA {
    public void showFormula() {
        System.out.println("Quadratic Equation: ax^2 + bx + c = 0");
    }
}

public class TwentyFive {
    public static void main(String[] args) {
        FORMULA f1 = new AreaOfSquare();
        FORMULA f2 = new Pythagoras();
        FORMULA f3 = new QuadraticEquation();

        f1.showFormula();
        f2.showFormula();
        f3.showFormula();
    }
}

