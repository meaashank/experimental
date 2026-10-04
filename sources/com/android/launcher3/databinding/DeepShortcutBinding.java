package com.android.launcher3.databinding;

import D2.b;
import D2.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.launcher3.shortcuts.DeepShortcutTextView;
import com.android.launcher3.shortcuts.DeepShortcutView;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public final class DeepShortcutBinding implements b {

    @NonNull
    public final DeepShortcutTextView bubbleText;

    @NonNull
    public final View divider;

    @NonNull
    public final View icon;

    @NonNull
    private final DeepShortcutView rootView;

    private DeepShortcutBinding(@NonNull DeepShortcutView deepShortcutView, @NonNull DeepShortcutTextView deepShortcutTextView, @NonNull View view, @NonNull View view2) {
        this.rootView = deepShortcutView;
        this.bubbleText = deepShortcutTextView;
        this.divider = view;
        this.icon = view2;
    }

    @NonNull
    public static DeepShortcutBinding bind(@NonNull View view) {
        int i10 = R.id.bubble_text;
        DeepShortcutTextView deepShortcutTextView = (DeepShortcutTextView) c.a(view, R.id.bubble_text);
        if (deepShortcutTextView != null) {
            i10 = R.id.divider;
            View viewA = c.a(view, R.id.divider);
            if (viewA != null) {
                i10 = R.id.icon;
                View viewA2 = c.a(view, R.id.icon);
                if (viewA2 != null) {
                    return new DeepShortcutBinding((DeepShortcutView) view, deepShortcutTextView, viewA, viewA2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @NonNull
    public static DeepShortcutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static DeepShortcutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.deep_shortcut, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // D2.b
    @NonNull
    public DeepShortcutView getRoot() {
        return this.rootView;
    }
}
