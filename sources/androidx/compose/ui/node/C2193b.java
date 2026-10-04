package androidx.compose.ui.node;

import androidx.compose.ui.focus.FocusProperties$CC;
import androidx.compose.ui.focus.FocusRequester;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.ui.node.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nNodeKind.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeKind.kt\nandroidx/compose/ui/node/CanFocusChecker\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,359:1\n66#2,9:360\n*S KotlinDebug\n*F\n+ 1 NodeKind.kt\nandroidx/compose/ui/node/CanFocusChecker\n*L\n342#1:360,9\n*E\n"})
public final class C2193b implements androidx.compose.ui.focus.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C2193b f103032a = new C2193b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public static Boolean f103033b;

    public final boolean a() {
        return f103033b != null;
    }

    @Override // androidx.compose.ui.focus.v
    public /* synthetic */ FocusRequester b() {
        return FocusProperties$CC.i(this);
    }

    @Override // androidx.compose.ui.focus.v
    public /* synthetic */ FocusRequester c() {
        return FocusProperties$CC.h(this);
    }

    @Override // androidx.compose.ui.focus.v
    public /* synthetic */ FocusRequester d() {
        return FocusProperties$CC.e(this);
    }

    @Override // androidx.compose.ui.focus.v
    public /* synthetic */ void e(ed.l lVar) {
    }

    @Override // androidx.compose.ui.focus.v
    public /* synthetic */ FocusRequester f() {
        return FocusProperties$CC.j(this);
    }

    @Override // androidx.compose.ui.focus.v
    public /* synthetic */ ed.l g() {
        return FocusProperties$CC.d(this);
    }

    @Override // androidx.compose.ui.focus.v
    public /* synthetic */ FocusRequester getNext() {
        return FocusProperties$CC.f(this);
    }

    @Override // androidx.compose.ui.focus.v
    public /* synthetic */ void h(FocusRequester focusRequester) {
    }

    @Override // androidx.compose.ui.focus.v
    public /* synthetic */ FocusRequester i() {
        return FocusProperties$CC.a(this);
    }

    @Override // androidx.compose.ui.focus.v
    public void j(boolean z10) {
        f103033b = Boolean.valueOf(z10);
    }

    @Override // androidx.compose.ui.focus.v
    public /* synthetic */ void k(FocusRequester focusRequester) {
    }

    @Override // androidx.compose.ui.focus.v
    public /* synthetic */ void l(FocusRequester focusRequester) {
    }

    @Override // androidx.compose.ui.focus.v
    public /* synthetic */ FocusRequester m() {
        return FocusProperties$CC.g(this);
    }

    @Override // androidx.compose.ui.focus.v
    public /* synthetic */ void n(FocusRequester focusRequester) {
    }

    @Override // androidx.compose.ui.focus.v
    public /* synthetic */ FocusRequester o() {
        return FocusProperties$CC.b(this);
    }

    @Override // androidx.compose.ui.focus.v
    public /* synthetic */ ed.l p() {
        return FocusProperties$CC.c(this);
    }

    @Override // androidx.compose.ui.focus.v
    public /* synthetic */ void q(FocusRequester focusRequester) {
    }

    @Override // androidx.compose.ui.focus.v
    public /* synthetic */ void r(FocusRequester focusRequester) {
    }

    @Override // androidx.compose.ui.focus.v
    public /* synthetic */ void s(FocusRequester focusRequester) {
    }

    @Override // androidx.compose.ui.focus.v
    public boolean t() {
        Boolean bool = f103033b;
        if (bool != null) {
            return bool.booleanValue();
        }
        W.a.h("canFocus is read before it is written");
        throw null;
    }

    @Override // androidx.compose.ui.focus.v
    public /* synthetic */ void u(ed.l lVar) {
    }

    @Override // androidx.compose.ui.focus.v
    public /* synthetic */ void v(FocusRequester focusRequester) {
    }

    public final void w() {
        f103033b = null;
    }
}
