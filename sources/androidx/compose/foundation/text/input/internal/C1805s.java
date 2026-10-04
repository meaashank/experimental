package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nComposeInputMethodManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeInputMethodManager.android.kt\nandroidx/compose/foundation/text/input/internal/ComposeInputMethodManagerImplApi21\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,217:1\n1#2:218\n*E\n"})
public class C1805s extends r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public BaseInputConnection f94119d;

    public C1805s(@NotNull View view) {
        super(view);
    }

    @Override // androidx.compose.foundation.text.input.internal.InterfaceC1802q
    public void sendKeyEvent(@NotNull KeyEvent keyEvent) {
        BaseInputConnection baseInputConnection = this.f94119d;
        if (baseInputConnection == null) {
            baseInputConnection = new BaseInputConnection(this.f94116a, false);
            this.f94119d = baseInputConnection;
        }
        baseInputConnection.sendKeyEvent(keyEvent);
    }
}
