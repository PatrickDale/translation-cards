package org.mercycorps.translationcards.dagger;

import org.mercycorps.translationcards.activity.ImportActivity;
import org.mercycorps.translationcards.activity.MyDeckAdapterTest;
import org.mercycorps.translationcards.activity.MyDecksActivityTest;
import org.mercycorps.translationcards.activity.addDeck.EnterDeckSourceLanguageActivityTest;
import org.mercycorps.translationcards.activity.addDeck.LanguageSelectorActivityTest;
import org.mercycorps.translationcards.activity.addDeck.ReviewAndSaveActivityTest;
import org.mercycorps.translationcards.activity.addTranslation.RecordAudioActivityTest;
import org.mercycorps.translationcards.activity.addTranslation.SummaryActivityTest;
import org.mercycorps.translationcards.model.DeckTest;
import org.mercycorps.translationcards.view.TranslationCardItemTest;

import dagger.Component;

@PerApplication
@Component(modules = {MockMediaModule.class, MockServiceModule.class, MockRepositoryModule.class}, dependencies = ApplicationComponent.class)
public interface TestBaseComponent extends BaseComponent {
    void inject(SummaryActivityTest activity);
    void inject(RecordAudioActivityTest activity);
    void inject(TranslationCardItemTest activity);
    void inject(ImportActivity importActivity);
    void inject(ReviewAndSaveActivityTest reviewAndSaveActivity);
    void inject(EnterDeckSourceLanguageActivityTest enterDeckSourceLanguageActivity);
    void inject(LanguageSelectorActivityTest languageSelectorActivity);
    void inject(MyDecksActivityTest myDecksActivityTest);
    void inject(MyDeckAdapterTest myDeckAdapterTest);
    void inject(DeckTest deckTest);
}
