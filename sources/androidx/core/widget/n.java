package androidx.core.widget;

import android.view.View;
import android.widget.PopupMenu;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class n {
    @Nullable
    public static View.OnTouchListener a(@NonNull Object obj) {
        return ((PopupMenu) obj).getDragToOpenListener();
    }
}
