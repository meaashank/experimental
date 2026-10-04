package androidx.compose.ui.focus;

import androidx.compose.ui.focus.FocusRequester;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class FocusPropertiesImpl implements v {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f100577l = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f100578a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public FocusRequester f100579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public FocusRequester f100580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public FocusRequester f100581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public FocusRequester f100582e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public FocusRequester f100583f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public FocusRequester f100584g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public FocusRequester f100585h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public FocusRequester f100586i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public ed.l<? super C1989d, FocusRequester> f100587j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public ed.l<? super C1989d, FocusRequester> f100588k;

    public FocusPropertiesImpl() {
        FocusRequester.a aVar = FocusRequester.f100591b;
        aVar.getClass();
        this.f100579b = FocusRequester.f100593d;
        aVar.getClass();
        this.f100580c = FocusRequester.f100593d;
        aVar.getClass();
        this.f100581d = FocusRequester.f100593d;
        aVar.getClass();
        this.f100582e = FocusRequester.f100593d;
        aVar.getClass();
        this.f100583f = FocusRequester.f100593d;
        aVar.getClass();
        this.f100584g = FocusRequester.f100593d;
        aVar.getClass();
        this.f100585h = FocusRequester.f100593d;
        aVar.getClass();
        this.f100586i = FocusRequester.f100593d;
        this.f100587j = new ed.l<C1989d, FocusRequester>() { // from class: androidx.compose.ui.focus.FocusPropertiesImpl$enter$1
            @NotNull
            public final FocusRequester e(int i10) {
                FocusRequester.f100591b.getClass();
                return FocusRequester.f100593d;
            }

            @Override // ed.l
            public /* synthetic */ FocusRequester invoke(C1989d c1989d) {
                return e(c1989d.f100660a);
            }
        };
        this.f100588k = new ed.l<C1989d, FocusRequester>() { // from class: androidx.compose.ui.focus.FocusPropertiesImpl$exit$1
            @NotNull
            public final FocusRequester e(int i10) {
                FocusRequester.f100591b.getClass();
                return FocusRequester.f100593d;
            }

            @Override // ed.l
            public /* synthetic */ FocusRequester invoke(C1989d c1989d) {
                return e(c1989d.f100660a);
            }
        };
    }

    public static /* synthetic */ void a() {
    }

    public static /* synthetic */ void w() {
    }

    @Override // androidx.compose.ui.focus.v
    @NotNull
    public FocusRequester b() {
        return this.f100585h;
    }

    @Override // androidx.compose.ui.focus.v
    @NotNull
    public FocusRequester c() {
        return this.f100584g;
    }

    @Override // androidx.compose.ui.focus.v
    @NotNull
    public FocusRequester d() {
        return this.f100583f;
    }

    @Override // androidx.compose.ui.focus.v
    public void e(@NotNull ed.l<? super C1989d, FocusRequester> lVar) {
        this.f100587j = lVar;
    }

    @Override // androidx.compose.ui.focus.v
    @NotNull
    public FocusRequester f() {
        return this.f100581d;
    }

    @Override // androidx.compose.ui.focus.v
    @NotNull
    public ed.l<C1989d, FocusRequester> g() {
        return this.f100588k;
    }

    @Override // androidx.compose.ui.focus.v
    @NotNull
    public FocusRequester getNext() {
        return this.f100579b;
    }

    @Override // androidx.compose.ui.focus.v
    public void h(@NotNull FocusRequester focusRequester) {
        this.f100581d = focusRequester;
    }

    @Override // androidx.compose.ui.focus.v
    @NotNull
    public FocusRequester i() {
        return this.f100582e;
    }

    @Override // androidx.compose.ui.focus.v
    public void j(boolean z10) {
        this.f100578a = z10;
    }

    @Override // androidx.compose.ui.focus.v
    public void k(@NotNull FocusRequester focusRequester) {
        this.f100582e = focusRequester;
    }

    @Override // androidx.compose.ui.focus.v
    public void l(@NotNull FocusRequester focusRequester) {
        this.f100585h = focusRequester;
    }

    @Override // androidx.compose.ui.focus.v
    @NotNull
    public FocusRequester m() {
        return this.f100580c;
    }

    @Override // androidx.compose.ui.focus.v
    public void n(@NotNull FocusRequester focusRequester) {
        this.f100580c = focusRequester;
    }

    @Override // androidx.compose.ui.focus.v
    @NotNull
    public FocusRequester o() {
        return this.f100586i;
    }

    @Override // androidx.compose.ui.focus.v
    @NotNull
    public ed.l<C1989d, FocusRequester> p() {
        return this.f100587j;
    }

    @Override // androidx.compose.ui.focus.v
    public void q(@NotNull FocusRequester focusRequester) {
        this.f100586i = focusRequester;
    }

    @Override // androidx.compose.ui.focus.v
    public void r(@NotNull FocusRequester focusRequester) {
        this.f100583f = focusRequester;
    }

    @Override // androidx.compose.ui.focus.v
    public void s(@NotNull FocusRequester focusRequester) {
        this.f100584g = focusRequester;
    }

    @Override // androidx.compose.ui.focus.v
    public boolean t() {
        return this.f100578a;
    }

    @Override // androidx.compose.ui.focus.v
    public void u(@NotNull ed.l<? super C1989d, FocusRequester> lVar) {
        this.f100588k = lVar;
    }

    @Override // androidx.compose.ui.focus.v
    public void v(@NotNull FocusRequester focusRequester) {
        this.f100579b = focusRequester;
    }
}
