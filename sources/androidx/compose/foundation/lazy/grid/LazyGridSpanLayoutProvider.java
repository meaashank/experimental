package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.foundation.lazy.layout.InterfaceC1730d;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.I;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nLazyGridSpanLayoutProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridSpanLayoutProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,246:1\n1#2:247\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class LazyGridSpanLayoutProvider {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f91343j = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final LazyGridIntervalContent f91344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ArrayList<a> f91345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f91346c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f91347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f91348e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f91349f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final List<Integer> f91350g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public List<C1722c> f91351h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f91352i;

    public static final class b implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f91355a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f91356b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f91357c;

        @Override // androidx.compose.foundation.lazy.grid.m
        public int a() {
            return f91356b;
        }

        @Override // androidx.compose.foundation.lazy.grid.m
        public int b() {
            return f91357c;
        }

        public void c(int i10) {
            f91356b = i10;
        }

        public void d(int i10) {
            f91357c = i10;
        }
    }

    @androidx.compose.runtime.internal.r(parameters = 0)
    public static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f91358c = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f91359a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final List<C1722c> f91360b;

        public c(int i10, @NotNull List<C1722c> list) {
            this.f91359a = i10;
            this.f91360b = list;
        }

        public final int a() {
            return this.f91359a;
        }

        @NotNull
        public final List<C1722c> b() {
            return this.f91360b;
        }
    }

    public LazyGridSpanLayoutProvider(@NotNull LazyGridIntervalContent lazyGridIntervalContent) {
        this.f91344a = lazyGridIntervalContent;
        ArrayList<a> arrayList = new ArrayList<>();
        int i10 = 0;
        arrayList.add(new a(i10, i10, 2, null));
        this.f91345b = arrayList;
        this.f91349f = -1;
        this.f91350g = new ArrayList();
        this.f91351h = EmptyList.f217510a;
    }

    public final int a() {
        return ((int) Math.sqrt((((double) f()) * 1.0d) / ((double) this.f91352i))) + 1;
    }

    public final List<C1722c> b(int i10) {
        if (i10 == this.f91351h.size()) {
            return this.f91351h;
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(new C1722c(F.a(1)));
        }
        this.f91351h = arrayList;
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider.c c(int r11) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider.c(int):androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$c");
    }

    public final int d(final int i10) {
        int i11 = 0;
        if (f() <= 0) {
            return 0;
        }
        if (i10 >= f()) {
            throw new IllegalArgumentException("ItemIndex > total count");
        }
        if (!this.f91344a.f91282d) {
            return i10 / this.f91352i;
        }
        int iZ = I.z(this.f91345b, 0, 0, new ed.l<a, Integer>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$getLineIndexOfItem$lowerBoundBucket$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // ed.l
            @NotNull
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(@NotNull LazyGridSpanLayoutProvider.a aVar) {
                return Integer.valueOf(aVar.f91353a - i10);
            }
        }, 3, null);
        int i12 = 2;
        if (iZ < 0) {
            iZ = (-iZ) - 2;
        }
        int iA = a() * iZ;
        int i13 = this.f91345b.get(iZ).f91353a;
        if (i13 > i10) {
            throw new IllegalArgumentException("currentItemIndex > itemIndex");
        }
        int i14 = 0;
        while (true) {
            if (i13 >= i10) {
                break;
            }
            int i15 = i13 + 1;
            int i16 = i(i13, this.f91352i - i14);
            i14 += i16;
            int i17 = this.f91352i;
            if (i14 >= i17) {
                if (i14 == i17) {
                    iA++;
                    i14 = 0;
                } else {
                    iA++;
                    i14 = i16;
                }
            }
            if (iA % a() == 0 && iA / a() >= this.f91345b.size()) {
                this.f91345b.add(new a(i15 - (i14 <= 0 ? 0 : 1), i11, i12, null));
            }
            i13 = i15;
        }
        return i(i10, this.f91352i - i14) + i14 > this.f91352i ? iA + 1 : iA;
    }

    public final int e() {
        return this.f91352i;
    }

    public final int f() {
        return this.f91344a.f91281c.f91547b;
    }

    public final void g() {
        this.f91345b.clear();
        int i10 = 0;
        this.f91345b.add(new a(i10, i10, 2, null));
        this.f91346c = 0;
        this.f91347d = 0;
        this.f91348e = 0;
        this.f91349f = -1;
        this.f91350g.clear();
    }

    public final void h(int i10) {
        if (i10 != this.f91352i) {
            this.f91352i = i10;
            g();
        }
    }

    public final int i(int i10, int i11) {
        b bVar = b.f91355a;
        bVar.getClass();
        b.f91356b = i11;
        b.f91357c = this.f91352i;
        InterfaceC1730d.a<C1726g> aVar = this.f91344a.f91281c.get(i10);
        return (int) aVar.f91817c.f91436b.invoke(bVar, Integer.valueOf(i10 - aVar.f91815a)).f91427a;
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f91353a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f91354b;

        public a(int i10, int i11) {
            this.f91353a = i10;
            this.f91354b = i11;
        }

        public final int a() {
            return this.f91353a;
        }

        public final int b() {
            return this.f91354b;
        }

        public /* synthetic */ a(int i10, int i11, int i12, C4969v c4969v) {
            this(i10, (i12 & 2) != 0 ? 0 : i11);
        }
    }
}
