package inteligenciaartificial.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;


public class TraduccionExactaDePythonAJava {


    public static void add_word_to_chain(HashMap<String, ArrayList<String>> chain, String state, String word) {
        if (chain.get(state) == null) {
            chain.put(state, new ArrayList<String>());
        }
        chain.get(state).add(word);
    }

    public static String create_initial_state(int state_parts) {
            String initial_state = "";
            for (int i = 0; i < state_parts; i++) {
                initial_state += "<<START-SENTENCE>>";
            }
            return initial_state;
        }

    public static HashMap<String, ArrayList<String>> create_multipart_state_chain(ArrayList<String> sentences, int state_parts) {
        HashMap<String, ArrayList<String>> chain = new HashMap<String, ArrayList<String>>();

        for (String sentence : sentences) {
            String state = create_initial_state(state_parts);
            ArrayList<String> word_list = new ArrayList<String>(Arrays.asList(sentence.split(" ")));

            for (int i = 0; i < word_list.size(); i++) {

                add_word_to_chain(chain, state, word_list.get(i));

                state = compose_multipart_state(state_parts, new ArrayList<String>(word_list.subList(Math.max(0, i - state_parts + 1), i + 1)));
            }

            add_word_to_chain(chain, state, "<<STOP-SENTENCE>>");
        }

        return chain;
    }

    public static String create_sentence(HashMap<String, ArrayList<String>> chain, int state_parts) {
        String state = create_initial_state(state_parts);
        String word = "";
        ArrayList<String> word_list = new ArrayList<String>();
        while (true) {
            word = chain.get(state).get(new Random().nextInt(chain.get(state).size()));
            if (word == "<<STOP-SENTENCE>>") {
                break;
            }

            word_list.add(word);

            state = compose_multipart_state(state_parts, new ArrayList<String>(word_list.subList(Math.max(word_list.size() - state_parts, 0), word_list.size())));
        }


        return String.join(" ", word_list);
    }

    public static String compose_multipart_state(int state_parts, ArrayList<String> parts_list) {
        String state = "";

        for (int i = 0; i < state_parts - parts_list.size(); i++) {
            state += "<<START-SENTENCE>>";
        }
        for (String part : parts_list) {
            state += "<<" + part + ">>";
        }

        return state;
    }


    public static boolean is_new_sentence(ArrayList<String> sentences, String new_sentence) {
        boolean esRepetida = false;

        for (String sentence : sentences) {
            if (sentence.equals(new_sentence)) {
                esRepetida = true;
            }
        }

        return !esRepetida;
    }


    public static ArrayList<String> read_sentences_from_a_file(String file_name) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(file_name)));
        ArrayList<String> sentences = new ArrayList<String>();

        String linea="";
        while (linea != null) {
            linea = bufferedReader.readLine();
            if (linea !=  null) {
                sentences.add(linea);
            }
        }
        bufferedReader.close();

        return sentences;
    }

    public static void main(String[] args) {
        try {
            ArrayList<String> sentences = read_sentences_from_a_file("C:\\Users\\marco\\Desktop\\Workspace\\DAM\\DAM2\\JumiYincanas\\inteligenciaArtificial\\textos\\Star_wars.txt");

            HashMap<String, ArrayList<String>> chain = create_multipart_state_chain(sentences, 3);


            int num_new_sentences = 0;
            ArrayList<String> new_sentences = new ArrayList<String>();
            while (num_new_sentences < 100) {
                String new_sentence = create_sentence(chain, 3);

                if (is_new_sentence(sentences, new_sentence)) {
                    if (is_new_sentence(new_sentences, new_sentence)) {
                        num_new_sentences++;
                        new_sentences.add(new_sentence);
                    }
                }
            }


            Collections.sort(new_sentences);
            for (int i = 0; i < new_sentences.size(); i++) {
                System.out.println(i + 1 + ". " + new_sentences.get(i));
            }


        } catch (IOException e) {

            e.printStackTrace();
        }
        
    }
}