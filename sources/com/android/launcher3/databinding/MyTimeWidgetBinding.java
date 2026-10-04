package com.android.launcher3.databinding;

import D2.b;
import D2.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextClock;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public final class MyTimeWidgetBinding implements b {

    @NonNull
    public final TextView appwidgetText;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextClock textClock;

    private MyTimeWidgetBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextClock textClock) {
        this.rootView = relativeLayout;
        this.appwidgetText = textView;
        this.textClock = textClock;
    }

    @NonNull
    public static MyTimeWidgetBinding bind(@NonNull View view) {
        int i10 = R.id.appwidget_text;
        TextView textView = (TextView) c.a(view, R.id.appwidget_text);
        if (textView != null) {
            i10 = R.id.textClock;
            TextClock textClock = (TextClock) c.a(view, R.id.textClock);
            if (textClock != null) {
                return new MyTimeWidgetBinding((RelativeLayout) view, textView, textClock);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static MyTimeWidgetBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static MyTimeWidgetBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.my_time_widget, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // D2.b
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
