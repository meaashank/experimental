package com.android.launcher3.databinding;

import D2.b;
import D2.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public final class HiderDialogAccountRemoveBinding implements b {

    @NonNull
    public final TextView accountRmGone;

    @NonNull
    public final TextView accountRmNote;

    @NonNull
    public final TextView accountRmStays;

    @NonNull
    public final TextView accountRmWhere;

    @NonNull
    private final ScrollView rootView;

    private HiderDialogAccountRemoveBinding(@NonNull ScrollView scrollView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.rootView = scrollView;
        this.accountRmGone = textView;
        this.accountRmNote = textView2;
        this.accountRmStays = textView3;
        this.accountRmWhere = textView4;
    }

    @NonNull
    public static HiderDialogAccountRemoveBinding bind(@NonNull View view) {
        int i10 = R.id.account_rm_gone;
        TextView textView = (TextView) c.a(view, R.id.account_rm_gone);
        if (textView != null) {
            i10 = R.id.account_rm_note;
            TextView textView2 = (TextView) c.a(view, R.id.account_rm_note);
            if (textView2 != null) {
                i10 = R.id.account_rm_stays;
                TextView textView3 = (TextView) c.a(view, R.id.account_rm_stays);
                if (textView3 != null) {
                    i10 = R.id.account_rm_where;
                    TextView textView4 = (TextView) c.a(view, R.id.account_rm_where);
                    if (textView4 != null) {
                        return new HiderDialogAccountRemoveBinding((ScrollView) view, textView, textView2, textView3, textView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static HiderDialogAccountRemoveBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static HiderDialogAccountRemoveBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.hider_dialog_account_remove, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // D2.b
    @NonNull
    public ScrollView getRoot() {
        return this.rootView;
    }
}
