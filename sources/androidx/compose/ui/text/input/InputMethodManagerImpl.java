package androidx.compose.ui.text.input;

import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.C2474m0;
import ed.InterfaceC4376a;
import kotlin.InterfaceC4982o;
import kotlin.LazyThreadSafetyMode;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC4982o(message = "Only exists to support the legacy TextInputService APIs. It is not used by any Compose code. A copy of this class in foundation is used by the legacy BasicTextField.")
@androidx.compose.runtime.internal.r(parameters = 0)
public final class InputMethodManagerImpl implements InterfaceC2351u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f104705d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final View f104706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final kotlin.G f104707b = kotlin.I.c(LazyThreadSafetyMode.NONE, new InterfaceC4376a<InputMethodManager>() { // from class: androidx.compose.ui.text.input.InputMethodManagerImpl$imm$2
        {
            super(0);
        }

        @Override // ed.InterfaceC4376a
        @NotNull
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final InputMethodManager invoke() {
            Object systemService = this.f104709d.f104706a.getContext().getSystemService(G7.a.f45348f);
            kotlin.jvm.internal.G.n(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            return (InputMethodManager) systemService;
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C2474m0 f104708c;

    public InputMethodManagerImpl(@NotNull View view) {
        this.f104706a = view;
        this.f104708c = new C2474m0(view);
    }

    @Override // androidx.compose.ui.text.input.InterfaceC2351u
    public void a(int i10, int i11, int i12, int i13) {
        h().updateSelection(this.f104706a, i10, i11, i12, i13);
    }

    @Override // androidx.compose.ui.text.input.InterfaceC2351u
    public void b() {
        h().restartInput(this.f104706a);
    }

    @Override // androidx.compose.ui.text.input.InterfaceC2351u
    public void c() {
        this.f104708c.a();
    }

    @Override // androidx.compose.ui.text.input.InterfaceC2351u
    public void d(@NotNull CursorAnchorInfo cursorAnchorInfo) {
        h().updateCursorAnchorInfo(this.f104706a, cursorAnchorInfo);
    }

    @Override // androidx.compose.ui.text.input.InterfaceC2351u
    public void e(int i10, @NotNull ExtractedText extractedText) {
        h().updateExtractedText(this.f104706a, i10, extractedText);
    }

    @Override // androidx.compose.ui.text.input.InterfaceC2351u
    public void f() {
        this.f104708c.b();
    }

    public final InputMethodManager h() {
        return (InputMethodManager) this.f104707b.getValue();
    }

    @Override // androidx.compose.ui.text.input.InterfaceC2351u
    public boolean isActive() {
        return h().isActive(this.f104706a);
    }
}
