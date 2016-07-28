package org.mercycorps.translationcards;

import org.mercycorps.translationcards.activity.addTranslation.SummaryActivityTest;

import dagger.Component;

@Component(dependencies = {TestBaseComponent.class})
public interface TestActivityInjectorComponent {

    void inject(SummaryActivityTest activity);
}