package androidx.compose.foundation.text.input.internal.selection;

import ed.InterfaceC4376a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class TextFieldSelectionState$TextFieldTextDragObserver$onDrag$1 extends Lambda implements InterfaceC4376a<String> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f94182d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$TextFieldTextDragObserver$onDrag$1(long j10) {
        super(0);
        this.f94182d = j10;
    }

    @Override // ed.InterfaceC4376a
    @NotNull
    public final String invoke() {
        return "Touch.onDrag at " + ((Object) P.g.y(this.f94182d));
    }
}
