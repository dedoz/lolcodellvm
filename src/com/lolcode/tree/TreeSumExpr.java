package com.lolcode.tree;

/**
 * Created with IntelliJ IDEA.
 * User: miha
 * Date: 7/12/13
 * Time: 4:31 PM
 */

/**
 * Handles summation expressions. </br>{@code SUM OF VAR1 an VAR2}</br>
 * Consists of two TreeExpression for lhs and rhs respectively.
 */
public class TreeSumExpr extends TreeBinaryExpr {

    @Override
    public void accept(BaseASTVisitor v) {
//        v.visit(this);
    }
}
