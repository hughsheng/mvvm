package com.example.mvvmlibrary.base.fragment;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.mvvmlibrary.util.AlertDialogUtils;
import com.google.android.material.snackbar.Snackbar;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * created by tl
 * created at 2020/8/12
 */
public abstract class BaseFragment extends Fragment {

    protected AlertDialog loadingDialog;
    protected View rootView;
    protected FragmentManager childFragmentManager;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (null != rootView) {
            ViewGroup parent = (ViewGroup) rootView.getParent();
            if (null != parent) {
                parent.removeView(rootView);
            }
        } else {
            rootView = inflater.inflate(getLayoutID(), container, false);
        }
        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        childFragmentManager = getChildFragmentManager();
        init();
    }

    protected abstract int getLayoutID();

    protected abstract void init();

    public void showToastTip(int resId) {
        String txt = getString(resId);
        showToastTip(txt);
    }

    public void showToastTip(String message) {
        Toast toast = Toast.makeText(getContext(), message, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }

    public void showSnackBarTip(String message) {
        Snackbar.make(rootView, message, Snackbar.LENGTH_SHORT).show();
    }

    public void showSnackBarTip(int resId) {
        Snackbar.make(rootView, resId, Snackbar.LENGTH_SHORT).show();
    }

    public void showLoading(FragmentManager manager) {
        hideLoading();
        loadingDialog = AlertDialogUtils.showLoading(getContext(), null, null);
    }

    public void showLoadingWithStatus(FragmentManager manager, String status) {
        hideLoading();
        loadingDialog = AlertDialogUtils.showLoading(getContext(), null, status);
    }

    public void hideLoading() {
        if (loadingDialog != null) {
            loadingDialog.dismiss();
            loadingDialog = null;
        }
    }
}
