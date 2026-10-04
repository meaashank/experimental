package androidx.core.os;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public interface r {
    String a();

    Object b();

    @Nullable
    Locale c(@NonNull String[] strArr);

    @e.D(from = -1)
    int d(Locale locale);

    Locale get(int i10);

    boolean isEmpty();

    @e.D(from = 0)
    int size();
}
