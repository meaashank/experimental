package androidx.compose.foundation.text.input.internal;

import android.view.View;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@e.T(34)
public class C1815x extends C1809u {
    public C1815x(@NotNull View view) {
        super(view);
    }

    @Override // androidx.compose.foundation.text.input.internal.r, androidx.compose.foundation.text.input.internal.InterfaceC1802q
    public void g() {
        l().startStylusHandwriting(this.f94116a);
    }

    @Override // androidx.compose.foundation.text.input.internal.r, androidx.compose.foundation.text.input.internal.InterfaceC1802q
    public void h() {
        l().acceptStylusHandwritingDelegation(this.f94116a);
    }

    @Override // androidx.compose.foundation.text.input.internal.r, androidx.compose.foundation.text.input.internal.InterfaceC1802q
    public void i() {
        l().prepareStylusHandwritingDelegation(this.f94116a);
    }
}
