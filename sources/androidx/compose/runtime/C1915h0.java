package androidx.compose.runtime;

import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.runtime.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/GroupSourceInformation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,4179:1\n1#2:4180\n832#3,8:4181\n822#3,7:4189\n93#4,2:4196\n33#4,4:4198\n95#4,2:4202\n38#4:4204\n97#4:4205\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/GroupSourceInformation\n*L\n767#1:4181,8\n784#1:4189,7\n794#1:4196,2\n794#1:4198,4\n794#1:4202,2\n794#1:4204\n794#1:4205\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class C1915h0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f99690g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f99691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public String f99692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f99693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public ArrayList<Object> f99694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f99695e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f99696f;

    public C1915h0(int i10, @Nullable String str, int i11) {
        this.f99691a = i10;
        this.f99692b = str;
        this.f99693c = i11;
    }

    public final void a(Object obj) {
        ArrayList<Object> arrayList = this.f99694d;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.f99694d = arrayList;
        arrayList.add(obj);
    }

    public final void b(@NotNull C1982y1 c1982y1, int i10, int i11) {
        C1889c c1889cL1;
        ArrayList<Object> arrayList = this.f99694d;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f99694d = arrayList;
        }
        int i12 = 0;
        if (i10 >= 0 && (c1889cL1 = c1982y1.L1(i10)) != null) {
            int size = arrayList.size();
            while (true) {
                if (i12 >= size) {
                    i12 = -1;
                    break;
                }
                Object obj = arrayList.get(i12);
                if (kotlin.jvm.internal.G.g(obj, c1889cL1) || ((obj instanceof C1915h0) && ((C1915h0) obj).k(c1889cL1))) {
                    break;
                } else {
                    i12++;
                }
            }
        }
        arrayList.add(i12, c1982y1.E(i11));
    }

    public final void c(int i10) {
        this.f99695e = true;
        this.f99696f = i10;
    }

    public final void d(int i10) {
        l().c(i10);
    }

    public final boolean e() {
        return this.f99695e;
    }

    public final int f() {
        return this.f99696f;
    }

    public final int g() {
        return this.f99693c;
    }

    @Nullable
    public final ArrayList<Object> h() {
        return this.f99694d;
    }

    public final int i() {
        return this.f99691a;
    }

    @Nullable
    public final String j() {
        return this.f99692b;
    }

    public final boolean k(C1889c c1889c) {
        ArrayList<Object> arrayList = this.f99694d;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = arrayList.get(i10);
                if (kotlin.jvm.internal.G.g(obj, c1889c)) {
                    return true;
                }
                if ((obj instanceof C1915h0) && ((C1915h0) obj).k(c1889c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final C1915h0 l() {
        Object obj;
        C1915h0 c1915h0L;
        ArrayList<Object> arrayList = this.f99694d;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                obj = arrayList.get(size);
                if ((obj instanceof C1915h0) && !((C1915h0) obj).f99695e) {
                    break;
                }
            }
            obj = null;
        } else {
            obj = null;
        }
        C1915h0 c1915h0 = obj instanceof C1915h0 ? (C1915h0) obj : null;
        return (c1915h0 == null || (c1915h0L = c1915h0.l()) == null) ? this : c1915h0L;
    }

    public final boolean m(@NotNull C1889c c1889c) {
        ArrayList<Object> arrayList = this.f99694d;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Object obj = arrayList.get(size);
                if (obj instanceof C1889c) {
                    if (kotlin.jvm.internal.G.g(obj, c1889c)) {
                        arrayList.remove(size);
                    }
                } else if ((obj instanceof C1915h0) && !((C1915h0) obj).m(c1889c)) {
                    arrayList.remove(size);
                }
            }
            if (arrayList.isEmpty()) {
                this.f99694d = null;
                return false;
            }
        }
        return true;
    }

    public final void n(@NotNull C1973v1 c1973v1, int i10) {
        l().a(c1973v1.h(i10));
    }

    public final void o(@NotNull C1982y1 c1982y1, int i10) {
        l().a(c1982y1.E(i10));
    }

    public final void p(boolean z10) {
        this.f99695e = z10;
    }

    public final void q(int i10) {
        this.f99696f = i10;
    }

    public final void r(@Nullable ArrayList<Object> arrayList) {
        this.f99694d = arrayList;
    }

    public final void s(@Nullable String str) {
        this.f99692b = str;
    }

    public final void t(int i10, @NotNull String str, int i11) {
        l().a(new C1915h0(i10, str, i11));
    }
}
