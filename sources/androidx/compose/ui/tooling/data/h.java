package androidx.compose.ui.tooling.data;

import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f105378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f105379b;

    public h(int i10, @Nullable String str) {
        this.f105378a = i10;
        this.f105379b = str;
    }

    @Nullable
    public final String a() {
        return this.f105379b;
    }

    public final int b() {
        return this.f105378a;
    }

    public /* synthetic */ h(int i10, String str, int i11, C4969v c4969v) {
        this(i10, (i11 & 2) != 0 ? null : str);
    }
}
