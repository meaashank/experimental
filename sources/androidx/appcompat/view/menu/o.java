package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public interface o {

    public interface a {
        boolean a(@NonNull h hVar);

        void onCloseMenu(@NonNull h hVar, boolean z10);
    }

    boolean collapseItemActionView(h hVar, k kVar);

    boolean expandItemActionView(h hVar, k kVar);

    boolean flagActionItems();

    int getId();

    p getMenuView(ViewGroup viewGroup);

    void initForMenu(Context context, h hVar);

    void onCloseMenu(h hVar, boolean z10);

    void onRestoreInstanceState(Parcelable parcelable);

    Parcelable onSaveInstanceState();

    boolean onSubMenuSelected(t tVar);

    void setCallback(a aVar);

    void updateMenuView(boolean z10);
}
