package androidx.compose.foundation.text.input.internal;

import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.C2474m0;
import ed.InterfaceC4376a;
import kotlin.LazyThreadSafetyMode;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.r(parameters = 0)
public final class InputMethodManagerImpl implements G0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f93728d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final View f93729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final kotlin.G f93730b = kotlin.I.c(LazyThreadSafetyMode.NONE, new InterfaceC4376a<InputMethodManager>() { // from class: androidx.compose.foundation.text.input.internal.InputMethodManagerImpl$imm$2
        {
            super(0);
        }

        @Override // ed.InterfaceC4376a
        @NotNull
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final InputMethodManager invoke() {
            Object systemService = this.f93732d.f93729a.getContext().getSystemService(G7.a.f45348f);
            kotlin.jvm.internal.G.n(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            return (InputMethodManager) systemService;
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C2474m0 f93731c;

    public InputMethodManagerImpl(@NotNull View view) {
        this.f93729a = view;
        this.f93731c = new C2474m0(view);
    }

    @Override // androidx.compose.foundation.text.input.internal.G0
    public void a(int i10, int i11, int i12, int i13) {
        i().updateSelection(this.f93729a, i10, i11, i12, i13);
    }

    @Override // androidx.compose.foundation.text.input.internal.G0
    public void b() {
        i().restartInput(this.f93729a);
    }

    @Override // androidx.compose.foundation.text.input.internal.G0
    public void c() {
        this.f93731c.a();
    }

    @Override // androidx.compose.foundation.text.input.internal.G0
    public void d(@NotNull CursorAnchorInfo cursorAnchorInfo) {
        i().updateCursorAnchorInfo(this.f93729a, cursorAnchorInfo);
    }

    @Override // androidx.compose.foundation.text.input.internal.G0
    public void e(int i10, @NotNull ExtractedText extractedText) {
        i().updateExtractedText(this.f93729a, i10, extractedText);
    }

    @Override // androidx.compose.foundation.text.input.internal.G0
    public void f() {
        this.f93731c.b();
    }

    @Override // androidx.compose.foundation.text.input.internal.G0
    public void g() {
        if (Build.VERSION.SDK_INT >= 34) {
            C1792l.f94105a.a(i(), this.f93729a);
        }
    }

    public final InputMethodManager i() {
        return (InputMethodManager) this.f93730b.getValue();
    }

    @Override // androidx.compose.foundation.text.input.internal.G0
    public boolean isActive() {
        return i().isActive(this.f93729a);
    }
}
