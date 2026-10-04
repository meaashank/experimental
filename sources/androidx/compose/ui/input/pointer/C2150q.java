package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.collection.C1531f0;
import androidx.core.text.BidiFormatter;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nPointerEvent.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerEvent.android.kt\nandroidx/compose/ui/input/pointer/PointerEvent\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,202:1\n33#2,6:203\n33#2,6:209\n*S KotlinDebug\n*F\n+ 1 PointerEvent.android.kt\nandroidx/compose/ui/input/pointer/PointerEvent\n*L\n72#1:203,6\n97#1:209,6\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C2150q {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f102317f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<A> f102318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final C2142i f102319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f102320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f102321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f102322e;

    public C2150q(@NotNull List<A> list, @Nullable C2142i c2142i) {
        this.f102318a = list;
        this.f102319b = c2142i;
        MotionEvent motionEventH = h();
        this.f102320c = motionEventH != null ? motionEventH.getButtonState() : 0;
        MotionEvent motionEventH2 = h();
        this.f102321d = motionEventH2 != null ? motionEventH2.getMetaState() : 0;
        this.f102322e = a();
    }

    public final int a() {
        MotionEvent motionEventH = h();
        if (motionEventH == null) {
            List<A> list = this.f102318a;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                A a10 = list.get(i10);
                if (r.e(a10)) {
                    C2152t.f102323b.getClass();
                    return C2152t.f102326e;
                }
                if (r.c(a10)) {
                    C2152t.f102323b.getClass();
                    return C2152t.f102325d;
                }
            }
            C2152t.f102323b.getClass();
            return C2152t.f102327f;
        }
        int actionMasked = motionEventH.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    switch (actionMasked) {
                        case 5:
                            break;
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            C2152t.f102323b.getClass();
                            return C2152t.f102330i;
                        case 9:
                            C2152t.f102323b.getClass();
                            return C2152t.f102328g;
                        case 10:
                            C2152t.f102323b.getClass();
                            return C2152t.f102329h;
                        default:
                            C2152t.f102323b.getClass();
                            return C2152t.f102324c;
                    }
                }
                C2152t.f102323b.getClass();
                return C2152t.f102327f;
            }
            C2152t.f102323b.getClass();
            return C2152t.f102326e;
        }
        C2152t.f102323b.getClass();
        return C2152t.f102325d;
    }

    @NotNull
    public final List<A> b() {
        return this.f102318a;
    }

    @NotNull
    public final C2150q c(@NotNull List<A> list, @Nullable MotionEvent motionEvent) {
        C2150q c2150q = this;
        if (motionEvent == null) {
            return new C2150q(list, null);
        }
        if (motionEvent.equals(c2150q.h())) {
            return new C2150q(list, c2150q.f102319b);
        }
        C1531f0 c1531f0 = new C1531f0(list.size());
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            A a10 = list.get(i10);
            c1531f0.m(a10.f102146a, a10);
            long j10 = a10.f102146a;
            long j11 = a10.f102147b;
            long j12 = a10.f102148c;
            boolean z10 = a10.f102149d;
            int i11 = size;
            float f10 = a10.f102150e;
            int i12 = a10.f102154i;
            C2142i c2142i = c2150q.f102319b;
            arrayList.add(new D(j10, j11, j12, j12, z10, f10, i12, c2142i != null && c2142i.a(j10), null, 0L, 0L, BidiFormatter.a.f111332f, null));
            i10++;
            c2150q = this;
            size = i11;
        }
        return new C2150q(list, new C2142i(c1531f0, new C(motionEvent.getEventTime(), arrayList, motionEvent)));
    }

    public final int d() {
        return this.f102320c;
    }

    @NotNull
    public final List<A> e() {
        return this.f102318a;
    }

    @Nullable
    public final C2142i f() {
        return this.f102319b;
    }

    public final int g() {
        return this.f102321d;
    }

    @Nullable
    public final MotionEvent h() {
        C2142i c2142i = this.f102319b;
        if (c2142i != null) {
            return c2142i.f102295b.f102167c;
        }
        return null;
    }

    public final int i() {
        return this.f102322e;
    }

    public final void j(int i10) {
        this.f102322e = i10;
    }

    public C2150q(@NotNull List<A> list) {
        this(list, null);
    }
}
