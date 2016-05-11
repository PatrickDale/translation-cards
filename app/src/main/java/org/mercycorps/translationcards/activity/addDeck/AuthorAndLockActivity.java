package org.mercycorps.translationcards.activity.addDeck;

import org.mercycorps.translationcards.R;
import org.mercycorps.translationcards.activity.MyDecksActivity;

import butterknife.OnClick;

public class AuthorAndLockActivity extends AddDeckActivity{

    @Override
    public void inflateView() {
        setContentView(R.layout.activity_deck_author_and_lock);
    }

    @OnClick(R.id.deck_author_and_lock_next_label)
    protected void nextButtonClicked() {
        startNextActivity(this, ReviewAndSaveActivity.class);
    }

    @OnClick(R.id.deck_author_and_lock_back)
    public void backButtonClicked(){
        startNextActivity(this, EnterDeckDestinationLanguagesActivity.class);
    }


}