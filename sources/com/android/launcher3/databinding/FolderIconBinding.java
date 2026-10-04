package com.android.launcher3.databinding;

import D2.b;
import D2.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.launcher3.folder.FolderIcon;
import com.android.launcher3.views.DoubleShadowBubbleTextView;
import com.app.hider.master.promax.R;

/* JADX INFO: loaded from: classes2.dex */
public final class FolderIconBinding implements b {

    @NonNull
    public final DoubleShadowBubbleTextView folderIconName;

    @NonNull
    private final FolderIcon rootView;

    private FolderIconBinding(@NonNull FolderIcon folderIcon, @NonNull DoubleShadowBubbleTextView doubleShadowBubbleTextView) {
        this.rootView = folderIcon;
        this.folderIconName = doubleShadowBubbleTextView;
    }

    @NonNull
    public static FolderIconBinding bind(@NonNull View view) {
        DoubleShadowBubbleTextView doubleShadowBubbleTextView = (DoubleShadowBubbleTextView) c.a(view, R.id.folder_icon_name);
        if (doubleShadowBubbleTextView != null) {
            return new FolderIconBinding((FolderIcon) view, doubleShadowBubbleTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.folder_icon_name)));
    }

    @NonNull
    public static FolderIconBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // D2.b
    @NonNull
    public View getRoot() {
        return this.rootView;
    }

    @NonNull
    public static FolderIconBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.folder_icon, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // D2.b
    @NonNull
    public FolderIcon getRoot() {
        return this.rootView;
    }
}
