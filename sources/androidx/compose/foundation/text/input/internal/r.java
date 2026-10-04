package androidx.compose.foundation.text.input.internal;

import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.C2474m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nComposeInputMethodManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeInputMethodManager.android.kt\nandroidx/compose/foundation/text/input/internal/ComposeInputMethodManagerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,217:1\n1#2:218\n*E\n"})
public abstract class r implements InterfaceC1802q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final View f94116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public InputMethodManager f94117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C2474m0 f94118c;

    public r(@NotNull View view) {
        this.f94116a = view;
        this.f94118c = new C2474m0(view);
    }

    @Override // androidx.compose.foundation.text.input.internal.InterfaceC1802q
    public void a(int i10, int i11, int i12, int i13) {
        l().updateSelection(this.f94116a, i10, i11, i12, i13);
    }

    @Override // androidx.compose.foundation.text.input.internal.InterfaceC1802q
    public void b() {
        l().restartInput(this.f94116a);
    }

    @Override // androidx.compose.foundation.text.input.internal.InterfaceC1802q
    public void c() {
        this.f94118c.a();
    }

    @Override // androidx.compose.foundation.text.input.internal.InterfaceC1802q
    public void d(@NotNull CursorAnchorInfo cursorAnchorInfo) {
        l().updateCursorAnchorInfo(this.f94116a, cursorAnchorInfo);
    }

    @Override // androidx.compose.foundation.text.input.internal.InterfaceC1802q
    public void e(int i10, @NotNull ExtractedText extractedText) {
        l().updateExtractedText(this.f94116a, i10, extractedText);
    }

    @Override // androidx.compose.foundation.text.input.internal.InterfaceC1802q
    public void f() {
        this.f94118c.b();
    }

    @Override // androidx.compose.foundation.text.input.internal.InterfaceC1802q
    public void g() {
    }

    @Override // androidx.compose.foundation.text.input.internal.InterfaceC1802q
    public void h() {
    }

    @Override // androidx.compose.foundation.text.input.internal.InterfaceC1802q
    public void i() {
    }

    public final InputMethodManager j() {
        Object systemService = this.f94116a.getContext().getSystemService(G7.a.f45348f);
        kotlin.jvm.internal.G.n(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        return (InputMethodManager) systemService;
    }

    @NotNull
    public final View k() {
        return this.f94116a;
    }

    @NotNull
    public final InputMethodManager l() {
        InputMethodManager inputMethodManager = this.f94117b;
        if (inputMethodManager != null) {
            return inputMethodManager;
        }
        InputMethodManager inputMethodManagerJ = j();
        this.f94117b = inputMethodManagerJ;
        return inputMethodManagerJ;
    }
}
