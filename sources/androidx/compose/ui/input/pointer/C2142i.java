package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.collection.C1531f0;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nInternalPointerEvent.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InternalPointerEvent.android.kt\nandroidx/compose/ui/input/pointer/InternalPointerEvent\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,39:1\n116#2,2:40\n33#2,6:42\n118#2:48\n*S KotlinDebug\n*F\n+ 1 InternalPointerEvent.android.kt\nandroidx/compose/ui/input/pointer/InternalPointerEvent\n*L\n33#1:40,2\n33#1:42,6\n33#1:48\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C2142i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f102293d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final C1531f0<A> f102294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final C f102295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f102296c;

    public C2142i(@NotNull C1531f0<A> c1531f0, @NotNull C c10) {
        this.f102294a = c1531f0;
        this.f102295b = c10;
    }

    public final boolean a(long j10) {
        D d10;
        List<D> list = this.f102295b.f102166b;
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                d10 = null;
                break;
            }
            d10 = list.get(i10);
            if (z.d(d10.f102171a, j10)) {
                break;
            }
            i10++;
        }
        D d11 = d10;
        if (d11 != null) {
            return d11.f102178h;
        }
        return false;
    }

    @NotNull
    public final C1531f0<A> b() {
        return this.f102294a;
    }

    @NotNull
    public final MotionEvent c() {
        return this.f102295b.f102167c;
    }

    @NotNull
    public final C d() {
        return this.f102295b;
    }

    public final boolean e() {
        return this.f102296c;
    }

    public final void f(boolean z10) {
        this.f102296c = z10;
    }
}
