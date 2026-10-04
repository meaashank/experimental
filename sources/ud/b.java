package ud;

import androidx.activity.C1477d;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f239700a;

    public b() {
        this(0, 1, null);
    }

    public static b c(b bVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = bVar.f239700a;
        }
        bVar.getClass();
        return new b(i10);
    }

    public final int a() {
        return this.f239700a;
    }

    @NotNull
    public final b b(int i10) {
        return new b(i10);
    }

    public final int d() {
        return this.f239700a;
    }

    public final void e(int i10) {
        this.f239700a += i10;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f239700a == ((b) obj).f239700a;
    }

    public final void f(int i10) {
        this.f239700a = i10;
    }

    public int hashCode() {
        return this.f239700a;
    }

    @NotNull
    public String toString() {
        return C1477d.a(new StringBuilder("DeltaCounter(count="), this.f239700a, ')');
    }

    public b(int i10) {
        this.f239700a = i10;
    }

    public /* synthetic */ b(int i10, int i11, C4969v c4969v) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
