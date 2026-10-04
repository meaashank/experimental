package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.C1836u;
import androidx.compose.foundation.text.selection.l;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f95002a = a.f95003a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f95003a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public static final r f95004b = new m();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public static final r f95005c = new n();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public static final r f95006d = new o();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public static final r f95007e = new p();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public static final r f95008f = new q();

        /* JADX INFO: renamed from: androidx.compose.foundation.text.selection.r$a$a, reason: collision with other inner class name */
        public static final class C0222a implements InterfaceC1831b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0222a f95009a = new C0222a();

            @Override // androidx.compose.foundation.text.selection.InterfaceC1831b
            public final long a(@NotNull k kVar, int i10) {
                return C1836u.c(kVar.c(), i10);
            }
        }

        public static final class b implements InterfaceC1831b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f95010a = new b();

            @Override // androidx.compose.foundation.text.selection.InterfaceC1831b
            public final long a(@NotNull k kVar, int i10) {
                return kVar.f94993f.f104309b.I(i10);
            }
        }

        public static l a(u uVar) {
            return SelectionAdjustmentKt.e(uVar, b.f95010a);
        }

        public static l b(u uVar) {
            return SelectionAdjustmentKt.e(uVar, C0222a.f95009a);
        }

        public static final l f(u uVar) {
            return SelectionAdjustmentKt.h(f95004b.a(uVar), uVar);
        }

        public static final l g(u uVar) {
            l.a aVar;
            l.a aVarL;
            l.a aVar2;
            l.a aVar3;
            l lVarE = uVar.e();
            if (lVarE == null) {
                return f95006d.a(uVar);
            }
            if (uVar.a()) {
                aVar = lVarE.f94995a;
                aVarL = SelectionAdjustmentKt.l(uVar, uVar.h(), aVar);
                aVar3 = lVarE.f94996b;
                aVar2 = aVarL;
            } else {
                aVar = lVarE.f94996b;
                aVarL = SelectionAdjustmentKt.l(uVar, uVar.g(), aVar);
                aVar2 = lVarE.f94995a;
                aVar3 = aVarL;
            }
            if (G.g(aVarL, aVar)) {
                return lVarE;
            }
            return SelectionAdjustmentKt.h(new l(aVar2, aVar3, uVar.d() == CrossStatus.CROSSED || (uVar.d() == CrossStatus.COLLAPSED && aVar2.f95000b > aVar3.f95000b)), uVar);
        }

        public static final l h(u uVar) {
            return new l(uVar.h().a(uVar.h().f94990c), uVar.g().a(uVar.g().f94991d), uVar.d() == CrossStatus.CROSSED);
        }

        public static final l i(u uVar) {
            return SelectionAdjustmentKt.e(uVar, C0222a.f95009a);
        }

        public static final l j(u uVar) {
            return SelectionAdjustmentKt.e(uVar, b.f95010a);
        }

        @NotNull
        public final r k() {
            return f95005c;
        }

        @NotNull
        public final r l() {
            return f95008f;
        }

        @NotNull
        public final r m() {
            return f95004b;
        }

        @NotNull
        public final r n() {
            return f95007e;
        }

        @NotNull
        public final r o() {
            return f95006d;
        }
    }

    @NotNull
    l a(@NotNull u uVar);
}
