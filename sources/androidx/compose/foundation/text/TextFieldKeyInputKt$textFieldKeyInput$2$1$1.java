package androidx.compose.foundation.text;

import android.view.KeyEvent;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class TextFieldKeyInputKt$textFieldKeyInput$2$1$1 extends FunctionReferenceImpl implements ed.l<androidx.compose.ui.input.key.c, Boolean> {
    public TextFieldKeyInputKt$textFieldKeyInput$2$1$1(Object obj) {
        super(1, obj, TextFieldKeyInput.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0);
    }

    @NotNull
    public final Boolean e(@NotNull KeyEvent keyEvent) {
        return Boolean.valueOf(((TextFieldKeyInput) this.receiver).p(keyEvent));
    }

    @Override // ed.l
    public /* synthetic */ Boolean invoke(androidx.compose.ui.input.key.c cVar) {
        return e(cVar.f102100a);
    }
}
