package androidx.compose.foundation.content.internal;

import androidx.compose.foundation.content.e;
import androidx.compose.foundation.content.f;
import androidx.compose.runtime.internal.r;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 1)
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f88958a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f88959b = 0;

    public static final class a {
        public a() {
        }

        @NotNull
        public final c a(@NotNull e eVar) {
            return new d(eVar);
        }

        public a(C4969v c4969v) {
        }
    }

    @NotNull
    public abstract e a();

    public final boolean b(@NotNull f fVar) {
        return !G.g(a().c(fVar), fVar);
    }
}
