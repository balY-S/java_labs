package ru.mirea.lab4;

public class UnaryMinus implements Expression {
    private Expression expression;

    public UnaryMinus(Expression expression) {
        this.expression = expression;
    }

    @Override
    public int evaluate(int... vars) {
        return -expression.evaluate(vars);
    }

    @Override
    public String toString() {
        return "-(" + expression + ")";
    }
}