package com.example.mvvmdemo.home.data;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import javax.inject.Inject;

import kotlin.Suppress;

/**
 * created by tl
 * created at 2020/8/17
 */
public class MainViewModuleFactory implements ViewModelProvider.Factory{

    private MainRepository mainRepository;

    @Inject
    public MainViewModuleFactory(MainRepository mainRepository) {
        this.mainRepository = mainRepository;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {

        return (T) new MainViewModel(mainRepository);
    }
}
