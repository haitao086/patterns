package patterns.behavior.interpreter;

public class Main {
    //Robert and John are male
    public static IExpression getMaleExpression(){
        IExpression robert = new TerminalExpression("Robert");
        IExpression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    //Julie is a married female
    public static IExpression getMarriedWomanExpression(){
        IExpression julie = new TerminalExpression("Julie");
        IExpression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        IExpression isMale = getMaleExpression();
        IExpression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married women? "
                + isMarriedWoman.interpret("Married Julie"));
    }

}
