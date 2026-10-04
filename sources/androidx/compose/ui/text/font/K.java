package androidx.compose.ui.text.font;

import androidx.activity.C1477d;
import androidx.compose.animation.C1571b;
import androidx.compose.runtime.InterfaceC1924k0;
import androidx.compose.runtime.R0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k0.InterfaceC4814e;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 1)
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final K f104537a = new K();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f104538b = 0;

    @InterfaceC1924k0
    public interface a {
        float a(@Nullable InterfaceC4814e interfaceC4814e);

        @NotNull
        String b();

        boolean c();
    }

    @InterfaceC1924k0
    public static final class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f104539a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f104540b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f104541c;

        public b(@NotNull String str, float f10) {
            this.f104539a = str;
            this.f104540b = f10;
        }

        @Override // androidx.compose.ui.text.font.K.a
        public float a(@Nullable InterfaceC4814e interfaceC4814e) {
            return this.f104540b;
        }

        @Override // androidx.compose.ui.text.font.K.a
        @NotNull
        public String b() {
            return this.f104539a;
        }

        @Override // androidx.compose.ui.text.font.K.a
        public boolean c() {
            return this.f104541c;
        }

        public final float d() {
            return this.f104540b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.G.g(this.f104539a, bVar.f104539a) && this.f104540b == bVar.f104540b;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f104540b) + (this.f104539a.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("FontVariation.Setting(axisName='");
            sb2.append(this.f104539a);
            sb2.append("', value=");
            return C1571b.a(sb2, this.f104540b, ')');
        }
    }

    @InterfaceC1924k0
    public static final class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f104542a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f104543b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f104544c;

        public c(@NotNull String str, int i10) {
            this.f104542a = str;
            this.f104543b = i10;
        }

        @Override // androidx.compose.ui.text.font.K.a
        public float a(@Nullable InterfaceC4814e interfaceC4814e) {
            return this.f104543b;
        }

        @Override // androidx.compose.ui.text.font.K.a
        @NotNull
        public String b() {
            return this.f104542a;
        }

        @Override // androidx.compose.ui.text.font.K.a
        public boolean c() {
            return this.f104544c;
        }

        public final int d() {
            return this.f104543b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.G.g(this.f104542a, cVar.f104542a) && this.f104543b == cVar.f104543b;
        }

        public int hashCode() {
            return (this.f104542a.hashCode() * 31) + this.f104543b;
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder("FontVariation.Setting(axisName='");
            sb2.append(this.f104542a);
            sb2.append("', value=");
            return C1477d.a(sb2, this.f104543b, ')');
        }
    }

    @kotlin.jvm.internal.V({"SMAP\nFontVariation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontVariation.kt\nandroidx/compose/ui/text/font/FontVariation$SettingTextUnit\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,373:1\n1#2:374\n*E\n"})
    @InterfaceC1924k0
    public static final class d implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f104545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f104546b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f104547c;

        public /* synthetic */ d(String str, long j10, C4969v c4969v) {
            this(str, j10);
        }

        @Override // androidx.compose.ui.text.font.K.a
        public float a(@Nullable InterfaceC4814e interfaceC4814e) {
            if (interfaceC4814e == null) {
                throw new IllegalArgumentException("density must not be null");
            }
            return interfaceC4814e.m0() * k0.B.n(this.f104546b);
        }

        @Override // androidx.compose.ui.text.font.K.a
        @NotNull
        public String b() {
            return this.f104545a;
        }

        @Override // androidx.compose.ui.text.font.K.a
        public boolean c() {
            return this.f104547c;
        }

        public final long d() {
            return this.f104546b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return kotlin.jvm.internal.G.g(this.f104545a, dVar.f104545a) && k0.B.j(this.f104546b, dVar.f104546b);
        }

        public int hashCode() {
            return k0.B.o(this.f104546b) + (this.f104545a.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "FontVariation.Setting(axisName='" + this.f104545a + "', value=" + ((Object) k0.B.u(this.f104546b)) + ')';
        }

        public d(String str, long j10) {
            this.f104545a = str;
            this.f104546b = j10;
            this.f104547c = true;
        }
    }

    @kotlin.jvm.internal.V({"SMAP\nFontVariation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontVariation.kt\nandroidx/compose/ui/text/font/FontVariation$Settings\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,373:1\n10783#2:374\n11008#2,3:375\n11011#2,3:385\n361#3,7:378\n76#4:388\n96#4,5:389\n101#5,2:394\n33#5,6:396\n103#5:402\n*S KotlinDebug\n*F\n+ 1 FontVariation.kt\nandroidx/compose/ui/text/font/FontVariation$Settings\n*L\n52#1:374\n52#1:375,3\n52#1:385,3\n52#1:378,7\n53#1:388\n53#1:389,5\n60#1:394,2\n60#1:396,6\n60#1:402\n*E\n"})
    @InterfaceC1924k0
    public static final class e {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f104548c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final List<a> f104549a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f104550b;

        public e(@NotNull a... aVarArr) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            boolean z10 = false;
            for (a aVar : aVarArr) {
                String strB = aVar.b();
                Object arrayList = linkedHashMap.get(strB);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(strB, arrayList);
                }
                ((List) arrayList).add(aVar);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                if (list.size() != 1) {
                    throw new IllegalArgumentException(R0.a(androidx.activity.result.i.a("'", str, "' must be unique. Actual [ ["), kotlin.collections.U.r3(list, null, null, null, 0, null, null, 63, null), ']').toString());
                }
                kotlin.collections.N.s0(arrayList2, list);
            }
            ArrayList arrayList3 = new ArrayList(arrayList2);
            this.f104549a = arrayList3;
            int size = arrayList3.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                if (((a) arrayList3.get(i10)).c()) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            this.f104550b = z10;
        }

        public final boolean a() {
            return this.f104550b;
        }

        @NotNull
        public final List<a> b() {
            return this.f104549a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && kotlin.jvm.internal.G.g(this.f104549a, ((e) obj).f104549a);
        }

        public int hashCode() {
            return this.f104549a.hashCode();
        }
    }

    @NotNull
    public final a a(@NotNull String str, float f10) {
        if (str.length() == 4) {
            return new b(str, f10);
        }
        throw new IllegalArgumentException(("Name must be exactly four characters. Actual: '" + str + '\'').toString());
    }

    @NotNull
    public final e b(@NotNull L l10, int i10, @NotNull a... aVarArr) {
        kotlin.jvm.internal.W w10 = new kotlin.jvm.internal.W(3);
        w10.a(g(l10.f104572a));
        w10.a(d(i10));
        w10.b(aVarArr);
        return new e((a[]) w10.f217912a.toArray(new a[w10.f217912a.size()]));
    }

    @NotNull
    public final a c(int i10) {
        if (-1000 > i10 || i10 >= 1001) {
            throw new IllegalArgumentException("'GRAD' must be in -1000..1000");
        }
        return new c("GRAD", i10);
    }

    @NotNull
    public final a d(float f10) {
        if (0.0f <= f10 && f10 <= 1.0f) {
            return new b("ital", f10);
        }
        throw new IllegalArgumentException(("'ital' must be in 0.0f..1.0f. Actual: " + f10).toString());
    }

    @NotNull
    public final a e(long j10) {
        if (k0.B.q(j10)) {
            return new d("opsz", j10);
        }
        throw new IllegalArgumentException("'opsz' must be provided in sp units");
    }

    @NotNull
    public final a f(float f10) {
        if (-90.0f <= f10 && f10 <= 90.0f) {
            return new b("slnt", f10);
        }
        throw new IllegalArgumentException(("'slnt' must be in -90f..90f. Actual: " + f10).toString());
    }

    @NotNull
    public final a g(int i10) {
        if (1 > i10 || i10 >= 1001) {
            throw new IllegalArgumentException(android.support.v4.media.c.a("'wght' value must be in [1, 1000]. Actual: ", i10).toString());
        }
        return new c("wght", i10);
    }

    @NotNull
    public final a h(float f10) {
        if (f10 > 0.0f) {
            return new b("wdth", f10);
        }
        throw new IllegalArgumentException(("'wdth' must be strictly > 0.0f. Actual: " + f10).toString());
    }
}
