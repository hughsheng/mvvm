package com.example.mvvmlibrary.base;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import com.example.mvvmlibrary.util.AlertDialogUtils;
import com.google.android.material.snackbar.Snackbar;

/**
 * created by tl
 * created at 2020/8/18
 */
public abstract class BaseActivity extends AppCompatActivity {

    private AlertDialog loadingDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    protected View getRootView() {
        return ((ViewGroup) findViewById(android.R.id.content)).getChildAt(0);
    }

    protected abstract int getLayoutID();

    protected abstract void init();

    public void showToastTip(int resId) {
        String txt = getString(resId);
        showToastTip(txt);
    }

    public void showToastTip(String message) {
        Toast toast = Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }

    public void showSnackBarTip(String message) {
        Snackbar.make(getRootView(), message, Snackbar.LENGTH_SHORT).show();
    }

    public void showSnackBarTip(int resId) {
        Snackbar.make(getRootView(), resId, Snackbar.LENGTH_SHORT).show();
    }

    public void showLoading(FragmentManager manager) {
        hideLoading();
        loadingDialog = AlertDialogUtils.showLoading(this, null, null);
    }

    public void showLoadingWithStatus(FragmentManager manager, String status) {
        hideLoading();
        loadingDialog = AlertDialogUtils.showLoading(this, null, status);
    }

    public void hideLoading() {
        if (loadingDialog != null) {
            loadingDialog.dismiss();
            loadingDialog = null;
        }
    }
}
