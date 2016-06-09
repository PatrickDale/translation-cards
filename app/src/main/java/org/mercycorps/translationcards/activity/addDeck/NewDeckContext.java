package org.mercycorps.translationcards.activity.addDeck;

import org.mercycorps.translationcards.MainApplication;
import org.mercycorps.translationcards.data.Deck;
import org.mercycorps.translationcards.data.Dictionary;
import org.mercycorps.translationcards.service.DeckService;

import java.io.Serializable;
import java.util.Date;

public class NewDeckContext implements Serializable {
    private static final String NO_VALUE = "";
    private static final String ENGLISH_ISO = "eng";

    private Deck deck;
    private String languagesInput;
    private boolean isEdit;

    public NewDeckContext(){
        this(new Deck(NO_VALUE, "", NO_VALUE, new Date().getTime(), false, ENGLISH_ISO), NO_VALUE, false);
    }

    public NewDeckContext(Deck deck, String languagesInput, boolean isEdit) {
        this.deck = deck;
        this.languagesInput = languagesInput;
        this.isEdit = isEdit;
    }

    public void setSourceLanguageIso(String sourceLanguageIso) {
        deck.setSourceLanguageIso(sourceLanguageIso);
    }
    public void setDeckTitle(String deckTitle) {
        deck.setLabel(deckTitle);
    }

    public String getDeckLabel() {
        return deck.getLabel();
    }

    public String getLanguagesInput() {
        return languagesInput;
    }

    public void updateLanguagesInput(String input) {
        languagesInput = input;
    }

    public boolean getIsEditFlag() {
        return isEdit;
    }

    public String getAuthor() {
        return deck.getAuthor();
    }

    public void setAuthor(String author) {
        deck.setAuthor(author);
    }

    public String getDeckInformation(){ return deck.getDeckInformation(); }

    public boolean isDeckLocked(){
        return this.deck.isLocked();
    }

    public Deck getDeck() {
        return deck;
    }
}
