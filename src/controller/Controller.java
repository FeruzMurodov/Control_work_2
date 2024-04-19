package controller;

import model.Model;
import view.View;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Controller {
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void start() throws IOException {
        model.makeListFromFile(view.getPath());
        int amount = model.getAmountWord();
        view.printAmountOfWords(amount);
        String longestWord = model.getLongestWord();
        view.printLongestWord(longestWord);
        if (view.inviteToLookMap()){
            HashMap<String, Integer> frequentOfWords = model.getFrequency();
            view.printFrequencyOfWords(frequentOfWords);
        }

    }

    public boolean getBoolean(){
        return view.inviteToContinue();
    }
}
