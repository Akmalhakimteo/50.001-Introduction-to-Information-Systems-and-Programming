package sat;

import immutable.EmptyImList;
import immutable.ImList;
import sat.env.Bool;
import sat.env.Environment;
import sat.formula.Clause;
import sat.formula.Formula;
import sat.formula.Literal;
import sat.formula.PosLiteral;

import java.util.HashSet;
import java.util.Iterator;

/**
 * A simple DPLL SAT solver. See http://en.wikipedia.org/wiki/DPLL_algorithm
 */
public class SATSolver {

    /**
     * Solve the problem using a simple version of DPLL with backtracking and
     * unit propagation. The returned environment binds literals of class
     * bool.Variable rather than the special literals used in clausification of
     * class clausal.Literal, so that clients can more readily use it.
     *
     * @return an environment for which the problem evaluates to Bool.TRUE, or
     * null if no such environment exists.
     */
    public static Environment solve(Formula formula) {
        // TODO: implement this.
        //throw new RuntimeException("not yet implemented.");
        if (formula.getSize() == 0) return new Environment();
        else {
            Environment env = new Environment();
            ImList<Clause> clauses = formula.getClauses();
            return solve(clauses, env);
        }

    }

    /**
     * Takes a partial assignment of variables to values, and recursively
     * searches for a complete satisfying assignment.
     *
     * @param clauses formula in conjunctive normal form
     * @param env     assignment of some or all variables in clauses to true or
     *                false values.
     * @return an environment for which all the clauses evaluate to Bool.TRUE,
     * or null if no such environment exists.
     */
    public static Clause smallestClause(ImList<Clause> clauses) {
        if (clauses.first().isUnit()) return clauses.first();
        Clause smallest = clauses.first();
        for (Clause thisClause : clauses) {
            if (thisClause.size() < smallest.size()) {
                smallest = thisClause;
            }
        }
        return smallest;
    }


    private static Environment solve(ImList<Clause> clauses, Environment env) {

//        while (smallest.size() == 1) {
//            Literal newLiteral = smallest.chooseLiteral();
//            if (newLiteral instanceof PosLiteral) env.putTrue(newLiteral.getVariable());
//            else env.putFalse(newLiteral.getVariable());
//            clauses = substitute(clauses, newLiteral);
//            smallest = smallestClause(clauses);
//        }
        if (clauses.size() == 0) return env;
        Clause smallest = smallestClause(clauses);
        if (smallest.isEmpty()) return null;

        Literal newLiteral = smallest.chooseLiteral();
        Literal neg = newLiteral.getNegation();
        if (newLiteral instanceof PosLiteral) env = env.putTrue(newLiteral.getVariable());
        else env = env.putFalse(neg.getVariable());

        ImList<Clause> newClauses = substitute(clauses, newLiteral);
        Environment result = solve(newClauses, env);

        if (result == null) {
            if (smallest.size() == 1) return null;
            else {
                if (neg instanceof PosLiteral) env = env.putTrue(neg.getVariable());
                else env = env.putFalse(newLiteral.getVariable());
                newClauses = substitute(clauses, neg);
                return solve(newClauses, env);
            }
        }
        return result;
    }


    /**
     * given a clause list and literal, produce a new list resulting from
     * setting that literal to true
     *
     * @param clauses , a list of clauses
     * @param l       , a literal to set to true
     * @return a new list of clauses resulting from setting l to true
     */
    private static ImList<Clause> substitute(ImList<Clause> clauses, Literal l) {
        ImList<Clause> newClause = new EmptyImList<>();
        for (Clause c : clauses) {
            if (c.contains(l) || c.contains(l.getNegation())) {
                Clause reduced = c.reduce(l);
                if (reduced != null) {
                    newClause = newClause.add(reduced);
                }
            } else {
                newClause = newClause.add(c);
            }
        }
        return newClause;
    }

}