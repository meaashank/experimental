package androidx.core.widget;

import android.widget.ListView;
import androidx.annotation.NonNull;
import e.S;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class m {
    @S(expression = "listView.canScrollList(direction)")
    @Deprecated
    public static boolean a(@NonNull ListView listView, int i10) {
        return listView.canScrollList(i10);
    }

    @S(expression = "listView.scrollListBy(y)")
    @Deprecated
    public static void b(@NonNull ListView listView, int i10) {
        listView.scrollListBy(i10);
    }
}
