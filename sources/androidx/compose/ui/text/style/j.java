package androidx.compose.ui.text.style;

import androidx.compose.runtime.InterfaceC1924k0;
import androidx.compose.runtime.R0;
import androidx.compose.runtime.T1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.V;
import n0.C5237d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC1924k0
public final class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f105018c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f105022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f105017b = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final j f105019d = new j(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final j f105020e = new j(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final j f105021f = new j(2);

    @V({"SMAP\nTextDecoration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextDecoration.kt\nandroidx/compose/ui/text/style/TextDecoration$Companion\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,111:1\n256#2,3:112\n33#2,4:115\n259#2,2:119\n38#2:121\n261#2:122\n*S KotlinDebug\n*F\n+ 1 TextDecoration.kt\nandroidx/compose/ui/text/style/TextDecoration$Companion\n*L\n57#1:112,3\n57#1:115,4\n57#1:119,2\n57#1:121\n57#1:122\n*E\n"})
    public static final class a {
        public a() {
        }

        @T1
        public static /* synthetic */ void c() {
        }

        @T1
        public static /* synthetic */ void e() {
        }

        @T1
        public static /* synthetic */ void g() {
        }

        @NotNull
        public final j a(@NotNull List<j> list) {
            Integer numValueOf = 0;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                numValueOf = Integer.valueOf(numValueOf.intValue() | list.get(i10).f105022a);
            }
            return new j(numValueOf.intValue());
        }

        @NotNull
        public final j b() {
            return j.f105021f;
        }

        @NotNull
        public final j d() {
            return j.f105019d;
        }

        @NotNull
        public final j f() {
            return j.f105020e;
        }

        public a(C4969v c4969v) {
        }
    }

    public j(int i10) {
        this.f105022a = i10;
    }

    public final boolean d(@NotNull j jVar) {
        int i10 = this.f105022a;
        return (jVar.f105022a | i10) == i10;
    }

    public final int e() {
        return this.f105022a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && this.f105022a == ((j) obj).f105022a;
    }

    @NotNull
    public final j f(@NotNull j jVar) {
        return new j(jVar.f105022a | this.f105022a);
    }

    public int hashCode() {
        return this.f105022a;
    }

    @NotNull
    public String toString() {
        if (this.f105022a == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((this.f105022a & f105020e.f105022a) != 0) {
            arrayList.add("Underline");
        }
        if ((this.f105022a & f105021f.f105022a) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() != 1) {
            return R0.a(new StringBuilder("TextDecoration["), C5237d.q(arrayList, U6.j.f68738d, null, null, 0, null, null, 62, null), ']');
        }
        return "TextDecoration." + ((String) arrayList.get(0));
    }
}
