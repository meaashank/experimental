package com.android.launcher3.allapps.search;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.widget.TextView;
import com.android.launcher3.ExtendedEditText;
import com.android.launcher3.Launcher;
import com.android.launcher3.Utilities;
import com.android.launcher3.util.ComponentKey;
import com.android.launcher3.util.PackageManagerHelper;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class AllAppsSearchBarController implements TextWatcher, TextView.OnEditorActionListener, ExtendedEditText.OnBackKeyListener {
    protected Callbacks mCb;
    protected ExtendedEditText mInput;
    protected Launcher mLauncher;
    protected String mQuery;
    protected SearchAlgorithm mSearchAlgorithm;

    public interface Callbacks {
        void clearSearchResult();

        void onSearchResult(String str, ArrayList<ComponentKey> arrayList);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        String string = editable.toString();
        this.mQuery = string;
        if (string.isEmpty()) {
            this.mSearchAlgorithm.cancel(true);
            this.mCb.clearSearchResult();
        } else {
            this.mSearchAlgorithm.cancel(false);
            this.mSearchAlgorithm.doSearch(this.mQuery, this.mCb);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    public void focusSearchField() {
        this.mInput.showKeyboard();
    }

    public final void initialize(SearchAlgorithm searchAlgorithm, ExtendedEditText extendedEditText, Launcher launcher, Callbacks callbacks) {
        this.mCb = callbacks;
        this.mLauncher = launcher;
        this.mInput = extendedEditText;
        extendedEditText.addTextChangedListener(this);
        this.mInput.setOnEditorActionListener(this);
        this.mInput.setOnBackKeyListener(this);
        this.mSearchAlgorithm = searchAlgorithm;
    }

    public boolean isSearchFieldFocused() {
        return this.mInput.isFocused();
    }

    @Override // com.android.launcher3.ExtendedEditText.OnBackKeyListener
    public boolean onBackKey() {
        if (!Utilities.trim(this.mInput.getEditableText().toString()).isEmpty()) {
            return false;
        }
        reset();
        return true;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 3) {
            return false;
        }
        String string = textView.getText().toString();
        if (string.isEmpty()) {
            return false;
        }
        Launcher launcher = this.mLauncher;
        return launcher.startActivitySafely(textView, PackageManagerHelper.getMarketSearchIntent(launcher, string), null);
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    public void refreshSearchResult() {
        if (TextUtils.isEmpty(this.mQuery)) {
            return;
        }
        this.mSearchAlgorithm.cancel(false);
        this.mSearchAlgorithm.doSearch(this.mQuery, this.mCb);
    }

    public void reset() {
        this.mCb.clearSearchResult();
        this.mInput.reset();
        this.mQuery = null;
    }

    public void setVisibility(int i10) {
        this.mInput.setVisibility(i10);
    }
}
