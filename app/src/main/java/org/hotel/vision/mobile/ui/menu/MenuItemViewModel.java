package org.hotel.vision.mobile.ui.menu;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MenuItemViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public MenuItemViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Menu Item Fragment for custom control.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
