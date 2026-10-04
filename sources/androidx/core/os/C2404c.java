package androidx.core.os;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.core.os.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@e.T(21)
public final class C2404c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C2404c f111289a = new C2404c();

    @dd.o
    public static final void a(@NotNull Bundle bundle, @NotNull String str, @Nullable Size size) {
        bundle.putSize(str, size);
    }

    @dd.o
    public static final void b(@NotNull Bundle bundle, @NotNull String str, @Nullable SizeF sizeF) {
        bundle.putSizeF(str, sizeF);
    }
}
