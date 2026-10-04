package kotlin.text;

import java.io.IOException;
import kotlin.InterfaceC4887e0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlin.text.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C5028u {
    @kotlin.C
    @NotNull
    public static final <T extends Appendable> T a(@NotNull T t10, @NotNull CharSequence... value) throws IOException {
        kotlin.jvm.internal.G.p(t10, "<this>");
        kotlin.jvm.internal.G.p(value, "value");
        for (CharSequence charSequence : value) {
            t10.append(charSequence);
        }
        return t10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void b(@NotNull Appendable appendable, T t10, @Nullable ed.l<? super T, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.G.p(appendable, "<this>");
        if (lVar != null) {
            appendable.append(lVar.invoke(t10));
            return;
        }
        if (t10 == 0 ? true : t10 instanceof CharSequence) {
            appendable.append((CharSequence) t10);
        } else if (t10 instanceof Character) {
            appendable.append(((Character) t10).charValue());
        } else {
            appendable.append(t10.toString());
        }
    }

    @InterfaceC4887e0(version = "1.4")
    @kotlin.C
    @Xc.f
    public static final Appendable c(Appendable appendable) {
        kotlin.jvm.internal.G.p(appendable, "<this>");
        return appendable.append('\n');
    }

    @InterfaceC4887e0(version = "1.4")
    @kotlin.C
    @Xc.f
    public static final Appendable d(Appendable appendable, char c10) {
        kotlin.jvm.internal.G.p(appendable, "<this>");
        return appendable.append(c10).append('\n');
    }

    @InterfaceC4887e0(version = "1.4")
    @kotlin.C
    @Xc.f
    public static final Appendable e(Appendable appendable, CharSequence charSequence) {
        kotlin.jvm.internal.G.p(appendable, "<this>");
        return appendable.append(charSequence).append('\n');
    }

    @InterfaceC4887e0(version = "1.4")
    @kotlin.C
    @NotNull
    public static final <T extends Appendable> T f(@NotNull T t10, @NotNull CharSequence value, int i10, int i11) {
        kotlin.jvm.internal.G.p(t10, "<this>");
        kotlin.jvm.internal.G.p(value, "value");
        T t11 = (T) t10.append(value, i10, i11);
        kotlin.jvm.internal.G.n(t11, "null cannot be cast to non-null type T of kotlin.text.StringsKt__AppendableKt.appendRange");
        return t11;
    }
}
