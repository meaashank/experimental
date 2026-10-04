package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.input.l;
import ed.p;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.text.F;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class TextFieldSelectionState$observeTextChanges$3 extends FunctionReferenceImpl implements p<l, CharSequence, Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TextFieldSelectionState$observeTextChanges$3 f94283a = new TextFieldSelectionState$observeTextChanges$3();

    public TextFieldSelectionState$observeTextChanges$3() {
        super(2, l.class, "contentEquals", "contentEquals(Ljava/lang/CharSequence;)Z", 0);
    }

    @Override // ed.p
    @NotNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(@NotNull l lVar, @NotNull CharSequence charSequence) {
        return Boolean.valueOf(F.Q1(lVar.f94358a, charSequence));
    }
}
