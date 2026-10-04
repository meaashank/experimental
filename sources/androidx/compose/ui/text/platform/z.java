package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import androidx.compose.runtime.X1;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final X1<Object> f104947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final z f104948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Object f104949c;

    public z(@NotNull X1<? extends Object> x12, @Nullable z zVar) {
        this.f104947a = x12;
        this.f104948b = zVar;
        this.f104949c = x12.getValue();
    }

    @NotNull
    public final Object a() {
        return this.f104949c;
    }

    @NotNull
    public final Typeface b() {
        Object obj = this.f104949c;
        G.n(obj, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface) obj;
    }

    public final boolean c() {
        if (this.f104947a.getValue() != this.f104949c) {
            return true;
        }
        z zVar = this.f104948b;
        return zVar != null && zVar.c();
    }

    public /* synthetic */ z(X1 x12, z zVar, int i10, C4969v c4969v) {
        this(x12, (i10 & 2) != 0 ? null : zVar);
    }
}
