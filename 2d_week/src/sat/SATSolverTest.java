//first trial
//package sat;
//
//
///*
//import static org.junit.Assert.*;
//import org.junit.Test;
//*/
//
//import java.io.BufferedReader;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.PrintWriter;
//import sat.env.*;
//import sat.formula.*;
//import java.nio.file.*;
//import immutable.EmptyImList;
//import immutable.ImList;
//import java.util.stream.Stream;
//import sat.SATSolver;
//
//public class SATSolverTest {
//    Literal a = PosLiteral.make("a");
//    Literal b = PosLiteral.make("b");
//    Literal c = PosLiteral.make("c");
//    Literal na = a.getNegation();
//    Literal nb = b.getNegation();
//    Literal nc = c.getNegation();
//
//
//
//
//	// TODO: add the main method that reads the .cnf file and calls SATSolver.solve to determine the satisfiability
//
//    public static void main(String[] args) {
//        Formula formula = new Formula();
//        int variables = 0;
//        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\akmal\\OneDrive\\Desktop\\SUTD\\TERM 4\\2d new\\Project-2D-starting\\sampleCNF\\sat2.cnf"))) {
//            String line;
//            while ((line = br.readLine()) != null) {
//                 if (line.trim().isEmpty()) {
//                            continue;
//                        }
//                if (!(line.substring(0,1).equals("p")) && !(line.substring(0,1).equals("c"))) {
//                    Clause clause = new Clause();
//                    for (String linesplit : line.split("\\s+")) {
//                        if (!linesplit.equals("0")) {
//                            if (linesplit.substring(0, 1).equals("-"))
//                                clause = clause.add(NegLiteral.make(linesplit.substring(1)));
//                            else
//                                clause = clause.add(PosLiteral.make(linesplit));
//                        }
//                    }
//                    formula = formula.addClause(clause);
//                }
//                else if (line.substring(0,1).equals("p")) {
//                    String[] linesplit = line.split("\\s+");
//                    variables = Integer.parseInt(linesplit[2]);
//                }
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        Environment env;
//        System.out.println("SAT solver starts!!!");
//        long started = System.nanoTime();
//        env = SATSolver.solve(formula);
//        long time = System.nanoTime();
//        long timeTaken= time - started;
//        System.out.println("Time:" + timeTaken/1000000.0 + "ms");
//        if (env == null) {
//            System.out.println("not satisfiable");
//        }
//        else {
//            System.out.println("satisfiable\n"+env);
//            try {
//                PrintWriter out = new PrintWriter(new FileWriter("C:\\Users\\akmal\\OneDrive\\Desktop\\SUTD\\TERM 4\\2d new\\Project-2D-starting\\sampleCNF\\unsat2.cnf"));
//                for (int varnum = 1; varnum <= variables; varnum++) {
//                    Bool bool = env.get(new Variable(Integer.toString(varnum)));
//                    if (bool == Bool.TRUE) {
//                        out.println(Integer.toString(varnum) + ":TRUE");
//                    }
//                    else {
//                        out.println(Integer.toString(varnum) + ":FALSE");
//                    }
//                }
//                out.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//    public void testSATSolver1(){
//    	// (a v b)
//    	Environment e = SATSolver.solve(makeFm(makeCl(a,b))	);
///*
//    	assertTrue( "one of the literals should be set to true",
//    			Bool.TRUE == e.get(a.getVariable())
//    			|| Bool.TRUE == e.get(b.getVariable())	);
//*/
//    }
//
//
//    public void testSATSolver2(){
//    	// (~a)
//    	Environment e = SATSolver.solve(makeFm(makeCl(na)));
///*
//    	assertEquals( Bool.FALSE, e.get(na.getVariable()));
//*/
//    }
//
//    private static Formula makeFm(Clause... e) {
//        Formula f = new Formula();
//        for (Clause c : e) {
//            f = f.addClause(c);
//        }
//        return f;
//    }
//
//    private static Clause makeCl(Literal... e) {
//        Clause c = new Clause();
//        for (Literal l : e) {
//            c = c.add(l);
//        }
//        return c;
//    }
//
//
//
//}


//NEXTCODE
//package sat;
//
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.FileReader;
//import java.io.IOException;
//import java.io.OutputStreamWriter;
//import java.io.Writer;
//import java.util.*;
//
//import sat.env.*;
//import sat.formula.*;
//
//
//public class SATSolverTest {
//    Literal a = PosLiteral.make("a");
//    Literal b = PosLiteral.make("b");
//    Literal c = PosLiteral.make("c");
//    Literal na = a.getNegation();
//    Literal nb = b.getNegation();
//    Literal nc = c.getNegation();
//
//
//    public static void main(String[] args) throws FileNotFoundException{
//
//        String filename = "sat1.cnf";
//
//        File file = new File("C:\\Users\\akmal\\OneDrive\\Desktop\\SUTD\\TERM 4\\Project-2D\\Project-2D-starting\\sampleCNF\\" + filename);
//
//        Formula newFormula = new Formula();
//        BufferedReader br = new BufferedReader(new FileReader(file));
//
//        String st;
//
//        int i = 0;
//        try {
//            System.out.println("Parsing file and creating Formula instance...");
//
////          Reading the file
//            while ((st = br.readLine()) != null){
//                String[] splitted = st.split("\\s+"); // Split by whitespace
//                if (splitted[0].equals("c") || splitted[0].equals("p") || splitted[0].equals("")){
//
//                    continue;
//
//                }
//
//                else {
//
//                    Literal a;
//
//                    Clause newClause = new Clause();
//                    for (String s: splitted){
//
//                        if (Integer.parseInt(s) < 0){
//
////                          Substring it to change -1 to 1
//                            String s_input = s.substring(1, s.length());
//
////                          Convert 1 to ~1 using a Negliteral method
//                            a = NegLiteral.make(s_input);
//
//                        }
//
//                        else if (Integer.parseInt(s) > 0) {
//                            a = PosLiteral.make(s);
//                        }
//
//
//                        else {
//                            continue;
//                        }
//
//                        newClause = newClause.add(a);
//
//                    }
////                    System.out.println(newClause);
//                    if (newClause != null){
//                        newFormula = newFormula.addClause(newClause);
//                    }
//
//
//                }
//
//            }}catch(IOException ioe){
//
//            System.out.println(ioe);
//        }
//
//        System.out.println("SAT solver starts!!!");
//        long started = System.nanoTime();
//
////        System.out.println(newFormula);
//        Environment output = SATSolver.solve(newFormula);
//
//        long time = System.nanoTime();
//        long timeTaken = time - started;
//        System.out.println("Time: " + timeTaken/1000000.0 + "ms");
//
//
//        if (output == null){
//
//            System.out.println("Unsatisfiable!");
//        }
//
//        else{
//            System.out.println("Satisfiable!");
//
////            Writing to BoolAssignment.txt
//
//            System.out.println("File writing in process...");
////            TODO: Clean a file completely each time I write.
//
//            try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\akmal\\OneDrive\\Desktop\\SUTD\\TERM 4\\Project-2D\\Project-2D-starting\\sampleCNF\\readme.txt", false), "utf-8")))
//
//            {
//                String line = "Filename: " + filename + "\n";
//                writer.write(line);
//
//                } catch(IOException ioe) {
//
//                System.out.println(ioe);
//
//            }
//
////            TODO: Clean a file completely each time I write.
//        try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\akmal\\OneDrive\\Desktop\\SUTD\\TERM 4\\Project-2D\\Project-2D-starting\\sampleCNF\\readme.txt", true), "utf-8")))
//
//        {
//            String string_output = output.toString();
//            string_output  = string_output.substring(string_output.indexOf("[") + 1, string_output.indexOf("]"));
//            String[] output_split = string_output.split(",");
//
//            for (String s: output_split){
//
//                String[] small_split = s.split("\\-\\>");
//                String part1 = small_split[0].trim();
//                String part2 = small_split[1].trim();
//                String line = part1 + ":" +  part2 + "\n";
//                writer.write(line);
//            }
//
//
//        }catch(IOException ioe) {
//
//            System.out.println(ioe);
//
//        }
//            System.out.println("File written!");
//        }
//
//
//    }
//
//
//
//
//
//    public void testSATSolver1(){
//        // (a v b)
//        Environment e = SATSolver.solve(makeFm(makeCl(a,b))	);
//    }
//
//
//    public void testSATSolver2(){
//        // (~a)
//        Environment e = SATSolver.solve(makeFm(makeCl(na)));
//    }
//
//    private static Formula makeFm(Clause... e) {
//        Formula f = new Formula();
//        for (Clause c : e) {
//            f = f.addClause(c);
//        }
//        return f;
//    }
//
//    private static Clause makeCl(Literal... e) {
//        Clause c = new Clause();
//        for (Literal l : e) {
//            c = c.add(l);
//        }
//        return c;
//    }
//
//}
package sat;

import immutable.EmptyImList;
import immutable.ImList;
import sat.env.Environment;
import sat.env.Variable;
import sat.formula.*;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SATSolverTest {
    private static Pattern clauseGrabbingPattern = Pattern.compile("((-?[1-9][0-9]*)\\s?)+(?=0)?", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
    private static Pattern clauseGeneratorPattern = Pattern.compile("((-?[1-9][0-9]*)(?=\\s)?)", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);

    public static Clause convertClauseStringToClause(String clauseString) {
        Matcher matcher = clauseGeneratorPattern.matcher(clauseString);
        Clause newClause = new Clause();
        while (matcher.find()) {
            String variableString = matcher.group();
            Literal newLiteral;
            if (variableString.charAt(0) == '-') {
                newLiteral = NegLiteral.make(variableString.substring(1));
            } else {
                newLiteral = PosLiteral.make(variableString);
            }
            newClause = newClause.add(newLiteral);
        }
        return newClause;
    }

    public static Formula createFormulaFromBigString(String bigString) {
        Formula f = new Formula();
        Matcher matcher = clauseGrabbingPattern.matcher(bigString);
        while (matcher.find()) {
            f = f.addClause(convertClauseStringToClause(matcher.group()));
        }
        return f;
    }

    public static Formula parseCNFFile(File sourceFile) throws IOException {
        FileReader fileReader = new FileReader(sourceFile);
        BufferedReader reader = new BufferedReader(fileReader);
        StringBuilder sb = new StringBuilder();
        String line;
        boolean seen_p_yet = false;
        while((line = reader.readLine()) != null){
            if(line.isEmpty()){
                continue;
            }
            if(line.charAt(0) == 'p' || line.charAt(0) == 'c'){
                seen_p_yet = true;
            }else if(seen_p_yet){
                sb.append(line);
                sb.append(" ");
            }
        }
        String bigFatString = sb.toString();
        return createFormulaFromBigString(bigFatString);
    }



    public static String envToString(Environment env){
        Pattern envPattern = Pattern.compile("(\\d+)->(TRUE|FALSE)");
        Matcher matcher = envPattern.matcher(env.toString());
        SortedMap<Integer, String> result = new TreeMap<Integer, String>() ;
        while(matcher.find()){
            result.put(Integer.valueOf(matcher.group(1)), matcher.group(2));
        }
        return result.entrySet().stream().map(e -> e.getKey().toString() + ":" + e.getValue().toString()).reduce("", (a,b) -> a+"\n"+b).trim();
    }

    public static void dumpOutFileInSameDirectoryAsFile(String dump, File baseFile) throws IOException {
        Path path = Paths.get(baseFile.getAbsolutePath());
        File outFile = path.getParent().resolve("BoolAssignment.txt").toFile();
        FileWriter writer = new FileWriter(outFile);
        writer.write(dump);
        writer.close();
    }
    public static void main(String[] args) {
		try {
			File cnf = new File("C:\\Users\\akmal\\OneDrive\\Desktop\\2d-demo_kept_test_case\\unsat3Large.cnf");
			Formula result = SATSolverTest.parseCNFFile(cnf);
			System.out.println(result);
			System.out.println("SAT solver starts!!!");
			long started = System.nanoTime();
			Environment env = SATSolver.solve(result);
			long end_timing = System.nanoTime();
			long timeTaken = end_timing - started;
			if(env==null) {
				System.out.println("not satisfiable");
			}
			else {
				System.out.println("satisfiable");
			}
			System.out.println("Time: " + timeTaken/1000000.0 + "ms.");
			System.out.println(env);
			SATSolverTest.dumpOutFileInSameDirectoryAsFile(envToString(env),cnf);
		} catch(IOException ex){
			if( ex instanceof FileNotFoundException) {
				System.err.println("File not found");
			}
			else {
				System.err.println("File found");
			}
			
		}
	}
}

