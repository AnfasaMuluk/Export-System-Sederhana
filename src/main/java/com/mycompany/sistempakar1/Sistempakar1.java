package com.mycompany.sistempakar1;

import java.util.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Sistempakar1 {

    public static List<Rule> getKnowledge() throws FileNotFoundException, IOException
    {
        FileReader reader = new FileReader("C:\\Users\\USER\\Documents\\NetBeansProjects\\sistempakar1\\src\\main\\java\\com\\mycompany\\sistempakar1\\knowledge_base");
        BufferedReader bufferedReader = new BufferedReader(reader);
        List<Rule> rules = new ArrayList<>();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            //mengambil string bagian fact dulu baru conclussion
            rules.add(new Rule(
                    Arrays.asList(line.split("-")[0].split(",")), 
                    line.split("-")[1]));
        }
        
        bufferedReader.close();
        reader.close();
        return rules;
    }
   
    public static void main(String[] args) throws IOException {
        
        UI tampilan = new UI();
        tampilan.showQuestion();
        //initial facts, jawaban user
        Set<String> facts  = tampilan.getFacts();
        
        //get knowledge base
        List<Rule> rules = getKnowledge();
        
        // Apply forward chaining
        Set<String> inferedFacts = 
                InferenceForwardChaining.doForwardChaining(rules, facts);
        
        boolean aIsTrue = inferedFacts.contains("a");
        boolean bIsTrue = inferedFacts.contains("b");
        boolean cIsTrue = inferedFacts.contains("c");
        boolean dIsTrue = inferedFacts.contains("d");
        boolean eIsTrue = inferedFacts.contains("e");
        boolean fIsTrue = inferedFacts.contains("f");
        tampilan.showConclusions(aIsTrue, bIsTrue, cIsTrue, dIsTrue, eIsTrue, fIsTrue, facts, inferedFacts);
    }
    
}
