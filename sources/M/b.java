package M;

import androidx.activity.C1477d;
import androidx.compose.runtime.internal.r;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@r(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f58780b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f58781a;

    public b() {
        this(0, 1, null);
    }

    public static b c(b bVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = bVar.f58781a;
        }
        bVar.getClass();
        return new b(i10);
    }

    public final int a() {
        return this.f58781a;
    }

    @NotNull
    public final b b(int i10) {
        return new b(i10);
    }

    public final int d() {
        return this.f58781a;
    }

    public final void e(int i10) {
        this.f58781a += i10;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f58781a == ((b) obj).f58781a;
    }

    public final void f(int i10) {
        this.f58781a = i10;
    }

    public int hashCode() {
        return this.f58781a;
    }

    @NotNull
    public String toString() {
        return C1477d.a(new StringBuilder("DeltaCounter(count="), this.f58781a, ')');
    }

    public b(int i10) {
        this.f58781a = i10;
    }

    public /* synthetic */ b(int i10, int i11, C4969v c4969v) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
