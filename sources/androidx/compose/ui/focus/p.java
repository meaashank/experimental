package androidx.compose.ui.focus;

import kotlin.InterfaceC4982o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC4982o(message = "Use FocusProperties instead")
@androidx.compose.runtime.internal.r(parameters = 0)
public final class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f100665b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final v f100666a;

    public p(@NotNull v vVar) {
        this.f100666a = vVar;
    }

    @NotNull
    public final FocusRequester a() {
        return this.f100666a.i();
    }

    @NotNull
    public final FocusRequester b() {
        return this.f100666a.o();
    }

    @NotNull
    public final FocusRequester c() {
        return this.f100666a.d();
    }

    @NotNull
    public final FocusRequester d() {
        return this.f100666a.getNext();
    }

    @NotNull
    public final FocusRequester e() {
        return this.f100666a.m();
    }

    @NotNull
    public final FocusRequester f() {
        return this.f100666a.c();
    }

    @NotNull
    public final FocusRequester g() {
        return this.f100666a.b();
    }

    @NotNull
    public final FocusRequester h() {
        return this.f100666a.f();
    }

    public final void i(@NotNull FocusRequester focusRequester) {
        this.f100666a.k(focusRequester);
    }

    public final void j(@NotNull FocusRequester focusRequester) {
        this.f100666a.q(focusRequester);
    }

    public final void k(@NotNull FocusRequester focusRequester) {
        this.f100666a.r(focusRequester);
    }

    public final void l(@NotNull FocusRequester focusRequester) {
        this.f100666a.v(focusRequester);
    }

    public final void m(@NotNull FocusRequester focusRequester) {
        this.f100666a.n(focusRequester);
    }

    public final void n(@NotNull FocusRequester focusRequester) {
        this.f100666a.s(focusRequester);
    }

    public final void o(@NotNull FocusRequester focusRequester) {
        this.f100666a.l(focusRequester);
    }

    public final void p(@NotNull FocusRequester focusRequester) {
        this.f100666a.h(focusRequester);
    }

    public p() {
        this(new FocusPropertiesImpl());
    }
}
