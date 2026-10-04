package androidx.compose.foundation.text.input.internal;

import ed.InterfaceC4376a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$1 extends Lambda implements InterfaceC4376a<String> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TransformedTextFieldState f93665d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$1(TransformedTextFieldState transformedTextFieldState) {
        super(0);
        this.f93665d = transformedTextFieldState;
    }

    @Override // ed.InterfaceC4376a
    @NotNull
    public final String invoke() {
        return "createInputConnection(value=\"" + ((Object) this.f93665d.p()) + "\")";
    }
}
