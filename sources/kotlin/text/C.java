package kotlin.text;

import kotlin.DeprecationLevel;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4887e0;
import kotlin.InterfaceC4982o;
import kotlin.L0;
import kotlin.NotImplementedError;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public class C extends B {
    @InterfaceC4887e0(version = "1.4")
    @kotlin.C
    @Xc.f
    public static final StringBuilder A0(StringBuilder sb2, boolean z10) {
        kotlin.jvm.internal.G.p(sb2, "<this>");
        sb2.append(z10);
        sb2.append('\n');
        return sb2;
    }

    @InterfaceC4887e0(version = "1.4")
    @kotlin.C
    @Xc.f
    public static final StringBuilder B0(StringBuilder sb2, char[] value) {
        kotlin.jvm.internal.G.p(sb2, "<this>");
        kotlin.jvm.internal.G.p(value, "value");
        sb2.append(value);
        sb2.append('\n');
        return sb2;
    }

    @InterfaceC4887e0(version = "1.1")
    @Xc.f
    public static final String C0(int i10, ed.l<? super StringBuilder, L0> builderAction) {
        kotlin.jvm.internal.G.p(builderAction, "builderAction");
        StringBuilder sb2 = new StringBuilder(i10);
        builderAction.invoke(sb2);
        return sb2.toString();
    }

    @Xc.f
    public static final String D0(ed.l<? super StringBuilder, L0> builderAction) {
        kotlin.jvm.internal.G.p(builderAction, "builderAction");
        StringBuilder sb2 = new StringBuilder();
        builderAction.invoke(sb2);
        return sb2.toString();
    }

    @kotlin.C
    @InterfaceC4982o(level = DeprecationLevel.WARNING, message = "Use append(value: Any?) instead", replaceWith = @InterfaceC4852c0(expression = "append(value = obj)", imports = {}))
    @Xc.f
    public static final StringBuilder r0(StringBuilder sb2, Object obj) {
        kotlin.jvm.internal.G.p(sb2, "<this>");
        sb2.append(obj);
        return sb2;
    }

    @kotlin.C
    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "Use appendRange instead.", replaceWith = @InterfaceC4852c0(expression = "this.appendRange(str, offset, offset + len)", imports = {}))
    @Xc.f
    public static final StringBuilder s0(StringBuilder sb2, char[] str, int i10, int i11) {
        kotlin.jvm.internal.G.p(sb2, "<this>");
        kotlin.jvm.internal.G.p(str, "str");
        throw new NotImplementedError(null, 1, null);
    }

    @kotlin.C
    @NotNull
    public static final StringBuilder t0(@NotNull StringBuilder sb2, @NotNull Object... value) {
        kotlin.jvm.internal.G.p(sb2, "<this>");
        kotlin.jvm.internal.G.p(value, "value");
        for (Object obj : value) {
            sb2.append(obj);
        }
        return sb2;
    }

    @kotlin.C
    @NotNull
    public static final StringBuilder u0(@NotNull StringBuilder sb2, @NotNull String... value) {
        kotlin.jvm.internal.G.p(sb2, "<this>");
        kotlin.jvm.internal.G.p(value, "value");
        for (String str : value) {
            sb2.append(str);
        }
        return sb2;
    }

    @InterfaceC4887e0(version = "1.4")
    @kotlin.C
    @Xc.f
    public static final StringBuilder v0(StringBuilder sb2) {
        kotlin.jvm.internal.G.p(sb2, "<this>");
        sb2.append('\n');
        return sb2;
    }

    @InterfaceC4887e0(version = "1.4")
    @kotlin.C
    @Xc.f
    public static final StringBuilder w0(StringBuilder sb2, char c10) {
        kotlin.jvm.internal.G.p(sb2, "<this>");
        sb2.append(c10);
        sb2.append('\n');
        return sb2;
    }

    @InterfaceC4887e0(version = "1.4")
    @kotlin.C
    @Xc.f
    public static final StringBuilder x0(StringBuilder sb2, CharSequence charSequence) {
        kotlin.jvm.internal.G.p(sb2, "<this>");
        sb2.append(charSequence);
        sb2.append('\n');
        return sb2;
    }

    @InterfaceC4887e0(version = "1.4")
    @kotlin.C
    @Xc.f
    public static final StringBuilder y0(StringBuilder sb2, Object obj) {
        kotlin.jvm.internal.G.p(sb2, "<this>");
        sb2.append(obj);
        sb2.append('\n');
        return sb2;
    }

    @InterfaceC4887e0(version = "1.4")
    @kotlin.C
    @Xc.f
    public static final StringBuilder z0(StringBuilder sb2, String str) {
        kotlin.jvm.internal.G.p(sb2, "<this>");
        sb2.append(str);
        sb2.append('\n');
        return sb2;
    }
}
