package com.jparkie.aizoban.views;

import com.jparkie.aizoban.views.base.BaseContextView;
import com.jparkie.aizoban.views.base.BaseToolbarView;

public interface SettingsView extends BaseContextView, BaseToolbarView {
    public void toastClearedFavourite();

    public void toastClearedRecent();

    public void toastClearedImageCache();
}
