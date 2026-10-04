package androidx.compose.foundation.content.internal;

import androidx.compose.foundation.content.e;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class d extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final e f88960c;

    public d(@NotNull e eVar) {
        this.f88960c = eVar;
    }

    public static d e(d dVar, e eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            eVar = dVar.f88960c;
        }
        dVar.getClass();
        return new d(eVar);
    }

    @Override // androidx.compose.foundation.content.internal.c
    @NotNull
    public e a() {
        return this.f88960c;
    }

    @NotNull
    public final e c() {
        return this.f88960c;
    }

    @NotNull
    public final d d(@NotNull e eVar) {
        return new d(eVar);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && G.g(this.f88960c, ((d) obj).f88960c);
    }

    public int hashCode() {
        return this.f88960c.hashCode();
    }

    @NotNull
    public String toString() {
        return "ReceiveContentConfigurationImpl(receiveContentListener=" + this.f88960c + ')';
    }
}
