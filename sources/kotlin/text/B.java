package kotlin.text;

import java.io.IOException;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4887e0;
import kotlin.InterfaceC4982o;
import kotlin.InterfaceC4984p;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@kotlin.jvm.internal.V({"SMAP\nStringBuilderJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringBuilderJVM.kt\nkotlin/text/StringsKt__StringBuilderJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,437:1\n1#2:438\n*E\n"})
public class B extends A {
    @InterfaceC4887e0(version = "1.9")
    @kotlin.C
    @Xc.f
    public static final StringBuilder C(StringBuilder sb2, byte b10) {
        kotlin.jvm.internal.G.p(sb2, "<this>");
        sb2.append((int) b10);
        return sb2;
    }

    @InterfaceC4887e0(version = "1.9")
    @kotlin.C
    @Xc.f
    public static final StringBuilder D(StringBuilder sb2, short s10) {
        kotlin.jvm.internal.G.p(sb2, "<this>");
        sb2.append((int) s10);
        return sb2;
    }

    @InterfaceC4887e0(version = "1.4")
    @kotlin.C
    @Xc.f
    public static final StringBuilder E(StringBuilder sb2, byte b10) {
        kotlin.jvm.internal.G.p(sb2, "<this>");
        sb2.append((int) b10);
        sb2.append('\n');
        return sb2;
    }

    @InterfaceC4887e0(version = "1.4")
    @kotlin.C
    @Xc.f
    public static final StringBuilder F(StringBuilder sb2, double d10) {
        kotlin.jvm.internal.G.p(sb2, "<this>");
        sb2.append(d10);
        sb2.append('\n');
        return sb2;
    }

    @InterfaceC4887e0(version = "1.4")
    @kotlin.C
    @Xc.f
    public static final StringBuilder G(StringBuilder sb2, float f10) {
        kotlin.jvm.internal.G.p(sb2, "<this>");
        sb2.append(f10);
        sb2.append('\n');
        return sb2;
    }

    @InterfaceC4887e0(version = "1.4")
    @kotlin.C
    @Xc.f
    public static final StringBuilder H(StringBuilder sb2, int i10) {
        kotlin.jvm.internal.G.p(sb2, "<this>");
        sb2.append(i10);
        sb2.append('\n');
        return sb2;
    }

    @InterfaceC4887e0(version = "1.4")
    @kotlin.C
    @Xc.f
    public static final StringBuilder I(StringBuilder sb2, long j10) {
        kotlin.jvm.internal.G.p(sb2, "<this>");
        sb2.append(j10);
        sb2.append('\n');
        return sb2;
    }

    @InterfaceC4887e0(version = "1.4")
    @kotlin.C
    @Xc.f
    public static final StringBuilder J(StringBuilder sb2, StringBuffer stringBuffer) {
        kotlin.jvm.internal.G.p(sb2, "<this>");
        sb2.append(stringBuffer);
        sb2.append('\n');
        return sb2;
    }

    @InterfaceC4887e0(version = "1.4")
    @kotlin.C
    @Xc.f
    public static final StringBuilder K(StringBuilder sb2, StringBuilder sb3) {
        kotlin.jvm.internal.G.p(sb2, "<this>");
        sb2.append((CharSequence) sb3);
        sb2.append('\n');
        return sb2;
    }

    @InterfaceC4887e0(version = "1.4")
    @kotlin.C
    @Xc.f
    public static final StringBuilder L(StringBuilder sb2, short s10) {
        kotlin.jvm.internal.G.p(sb2, "<this>");
        sb2.append((int) s10);
        sb2.append('\n');
        return sb2;
    }

    @InterfaceC4887e0(version = "1.4")
    @kotlin.C
    @Xc.f
    public static final StringBuilder M(StringBuilder sb2, CharSequence value, int i10, int i11) {
        kotlin.jvm.internal.G.p(sb2, "<this>");
        kotlin.jvm.internal.G.p(value, "value");
        sb2.append(value, i10, i11);
        return sb2;
    }

    @InterfaceC4887e0(version = "1.4")
    @kotlin.C
    @Xc.f
    public static final StringBuilder N(StringBuilder sb2, char[] value, int i10, int i11) {
        kotlin.jvm.internal.G.p(sb2, "<this>");
        kotlin.jvm.internal.G.p(value, "value");
        sb2.append(value, i10, i11 - i10);
        return sb2;
    }

    @InterfaceC4982o(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @InterfaceC4852c0(expression = "appendLine()", imports = {}))
    @InterfaceC4984p(errorSince = "2.1", warningSince = "1.4")
    @NotNull
    public static final Appendable O(@NotNull Appendable appendable) throws IOException {
        kotlin.jvm.internal.G.p(appendable, "<this>");
        Appendable appendableAppend = appendable.append(V.f218282b);
        kotlin.jvm.internal.G.o(appendableAppend, "append(...)");
        return appendableAppend;
    }

    @InterfaceC4982o(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @InterfaceC4852c0(expression = "appendLine(value)", imports = {}))
    @InterfaceC4984p(errorSince = "2.1", warningSince = "1.4")
    @Xc.f
    public static final Appendable P(Appendable appendable, char c10) throws IOException {
        kotlin.jvm.internal.G.p(appendable, "<this>");
        Appendable appendableAppend = appendable.append(c10);
        kotlin.jvm.internal.G.o(appendableAppend, "append(...)");
        return O(appendableAppend);
    }

    @InterfaceC4982o(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @InterfaceC4852c0(expression = "appendLine(value)", imports = {}))
    @InterfaceC4984p(errorSince = "2.1", warningSince = "1.4")
    @Xc.f
    public static final Appendable Q(Appendable appendable, CharSequence charSequence) throws IOException {
        kotlin.jvm.internal.G.p(appendable, "<this>");
        Appendable appendableAppend = appendable.append(charSequence);
        kotlin.jvm.internal.G.o(appendableAppend, "append(...)");
        return O(appendableAppend);
    }

    @InterfaceC4982o(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @InterfaceC4852c0(expression = "appendLine()", imports = {}))
    @InterfaceC4984p(errorSince = "2.1", warningSince = "1.4")
    @NotNull
    public static final StringBuilder R(@NotNull StringBuilder sb2) {
        kotlin.jvm.internal.G.p(sb2, "<this>");
        sb2.append(V.f218282b);
        return sb2;
    }

    @InterfaceC4982o(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @InterfaceC4852c0(expression = "appendLine(value)", imports = {}))
    @InterfaceC4984p(errorSince = "2.1", warningSince = "1.4")
    @Xc.f
    public static final StringBuilder S(StringBuilder sb2, byte b10) {
        kotlin.jvm.internal.G.p(sb2, "<this>");
        sb2.append((int) b10);
        R(sb2);
        return sb2;
    }

    @InterfaceC4982o(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @InterfaceC4852c0(expression = "appendLine(value)", imports = {}))
    @InterfaceC4984p(errorSince = "2.1", warningSince = "1.4")
    @Xc.f
    public static final StringBuilder T(StringBuilder sb2, char c10) {
        kotlin.jvm.internal.G.p(sb2, "<this>");
        sb2.append(c10);
        R(sb2);
        return sb2;
    }

    @InterfaceC4982o(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @InterfaceC4852c0(expression = "appendLine(value)", imports = {}))
    @InterfaceC4984p(errorSince = "2.1", warningSince = "1.4")
    @Xc.f
    public static final StringBuilder U(StringBuilder sb2, double d10) {
        kotlin.jvm.internal.G.p(sb2, "<this>");
        sb2.append(d10);
        R(sb2);
        return sb2;
    }

    @InterfaceC4982o(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @InterfaceC4852c0(expression = "appendLine(value)", imports = {}))
    @InterfaceC4984p(errorSince = "2.1", warningSince = "1.4")
    @Xc.f
    public static final StringBuilder V(StringBuilder sb2, float f10) {
        kotlin.jvm.internal.G.p(sb2, "<this>");
        sb2.append(f10);
        R(sb2);
        return sb2;
    }

    @InterfaceC4982o(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @InterfaceC4852c0(expression = "appendLine(value)", imports = {}))
    @InterfaceC4984p(errorSince = "2.1", warningSince = "1.4")
    @Xc.f
    public static final StringBuilder W(StringBuilder sb2, int i10) {
        kotlin.jvm.internal.G.p(sb2, "<this>");
        sb2.append(i10);
        R(sb2);
        return sb2;
    }

    @InterfaceC4982o(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @InterfaceC4852c0(expression = "appendLine(value)", imports = {}))
    @InterfaceC4984p(errorSince = "2.1", warningSince = "1.4")
    @Xc.f
    public static final StringBuilder X(StringBuilder sb2, long j10) {
        kotlin.jvm.internal.G.p(sb2, "<this>");
        sb2.append(j10);
        R(sb2);
        return sb2;
    }

    @InterfaceC4982o(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @InterfaceC4852c0(expression = "appendLine(value)", imports = {}))
    @InterfaceC4984p(errorSince = "2.1", warningSince = "1.4")
    @Xc.f
    public static final StringBuilder Y(StringBuilder sb2, CharSequence charSequence) {
        kotlin.jvm.internal.G.p(sb2, "<this>");
        sb2.append(charSequence);
        R(sb2);
        return sb2;
    }

    @InterfaceC4982o(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @InterfaceC4852c0(expression = "appendLine(value)", imports = {}))
    @InterfaceC4984p(errorSince = "2.1", warningSince = "1.4")
    @Xc.f
    public static final StringBuilder Z(StringBuilder sb2, Object obj) {
        kotlin.jvm.internal.G.p(sb2, "<this>");
        sb2.append(obj);
        R(sb2);
        return sb2;
    }

    @InterfaceC4982o(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @InterfaceC4852c0(expression = "appendLine(value)", imports = {}))
    @InterfaceC4984p(errorSince = "2.1", warningSince = "1.4")
    @Xc.f
    public static final StringBuilder a0(StringBuilder sb2, String str) {
        kotlin.jvm.internal.G.p(sb2, "<this>");
        sb2.append(str);
        R(sb2);
        return sb2;
    }

    @InterfaceC4982o(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @InterfaceC4852c0(expression = "appendLine(value)", imports = {}))
    @InterfaceC4984p(errorSince = "2.1", warningSince = "1.4")
    @Xc.f
    public static final StringBuilder b0(StringBuilder sb2, StringBuffer stringBuffer) {
        kotlin.jvm.internal.G.p(sb2, "<this>");
        sb2.append(stringBuffer);
        R(sb2);
        return sb2;
    }

    @InterfaceC4982o(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @InterfaceC4852c0(expression = "appendLine(value)", imports = {}))
    @InterfaceC4984p(errorSince = "2.1", warningSince = "1.4")
    @Xc.f
    public static final StringBuilder c0(StringBuilder sb2, StringBuilder sb3) {
        kotlin.jvm.internal.G.p(sb2, "<this>");
        sb2.append((CharSequence) sb3);
        R(sb2);
        return sb2;
    }

    @InterfaceC4982o(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @InterfaceC4852c0(expression = "appendLine(value)", imports = {}))
    @InterfaceC4984p(errorSince = "2.1", warningSince = "1.4")
    @Xc.f
    public static final StringBuilder d0(StringBuilder sb2, short s10) {
        kotlin.jvm.internal.G.p(sb2, "<this>");
        sb2.append((int) s10);
        R(sb2);
        return sb2;
    }

    @InterfaceC4982o(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @InterfaceC4852c0(expression = "appendLine(value)", imports = {}))
    @InterfaceC4984p(errorSince = "2.1", warningSince = "1.4")
    @Xc.f
    public static final StringBuilder e0(StringBuilder sb2, boolean z10) {
        kotlin.jvm.internal.G.p(sb2, "<this>");
        sb2.append(z10);
        R(sb2);
        return sb2;
    }

    @InterfaceC4982o(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @InterfaceC4852c0(expression = "appendLine(value)", imports = {}))
    @InterfaceC4984p(errorSince = "2.1", warningSince = "1.4")
    @Xc.f
    public static final StringBuilder f0(StringBuilder sb2, char[] value) {
        kotlin.jvm.internal.G.p(sb2, "<this>");
        kotlin.jvm.internal.G.p(value, "value");
        sb2.append(value);
        R(sb2);
        return sb2;
    }

    @InterfaceC4887e0(version = "1.3")
    @kotlin.C
    @NotNull
    public static StringBuilder g0(@NotNull StringBuilder sb2) {
        kotlin.jvm.internal.G.p(sb2, "<this>");
        sb2.setLength(0);
        return sb2;
    }

    @InterfaceC4887e0(version = "1.4")
    @kotlin.C
    @Xc.f
    public static final StringBuilder h0(StringBuilder sb2, int i10) {
        kotlin.jvm.internal.G.p(sb2, "<this>");
        StringBuilder sbDeleteCharAt = sb2.deleteCharAt(i10);
        kotlin.jvm.internal.G.o(sbDeleteCharAt, "deleteCharAt(...)");
        return sbDeleteCharAt;
    }

    @InterfaceC4887e0(version = "1.4")
    @kotlin.C
    @Xc.f
    public static final StringBuilder i0(StringBuilder sb2, int i10, int i11) {
        kotlin.jvm.internal.G.p(sb2, "<this>");
        StringBuilder sbDelete = sb2.delete(i10, i11);
        kotlin.jvm.internal.G.o(sbDelete, "delete(...)");
        return sbDelete;
    }

    @InterfaceC4887e0(version = "1.9")
    @kotlin.C
    @Xc.f
    public static final StringBuilder j0(StringBuilder sb2, int i10, byte b10) {
        kotlin.jvm.internal.G.p(sb2, "<this>");
        StringBuilder sbInsert = sb2.insert(i10, (int) b10);
        kotlin.jvm.internal.G.o(sbInsert, "insert(...)");
        return sbInsert;
    }

    @InterfaceC4887e0(version = "1.9")
    @kotlin.C
    @Xc.f
    public static final StringBuilder k0(StringBuilder sb2, int i10, short s10) {
        kotlin.jvm.internal.G.p(sb2, "<this>");
        StringBuilder sbInsert = sb2.insert(i10, (int) s10);
        kotlin.jvm.internal.G.o(sbInsert, "insert(...)");
        return sbInsert;
    }

    @InterfaceC4887e0(version = "1.4")
    @kotlin.C
    @Xc.f
    public static final StringBuilder l0(StringBuilder sb2, int i10, CharSequence value, int i11, int i12) {
        kotlin.jvm.internal.G.p(sb2, "<this>");
        kotlin.jvm.internal.G.p(value, "value");
        StringBuilder sbInsert = sb2.insert(i10, value, i11, i12);
        kotlin.jvm.internal.G.o(sbInsert, "insert(...)");
        return sbInsert;
    }

    @InterfaceC4887e0(version = "1.4")
    @kotlin.C
    @Xc.f
    public static final StringBuilder m0(StringBuilder sb2, int i10, char[] value, int i11, int i12) {
        kotlin.jvm.internal.G.p(sb2, "<this>");
        kotlin.jvm.internal.G.p(value, "value");
        StringBuilder sbInsert = sb2.insert(i10, value, i11, i12 - i11);
        kotlin.jvm.internal.G.o(sbInsert, "insert(...)");
        return sbInsert;
    }

    @Xc.f
    public static final void n0(StringBuilder sb2, int i10, char c10) {
        kotlin.jvm.internal.G.p(sb2, "<this>");
        sb2.setCharAt(i10, c10);
    }

    @InterfaceC4887e0(version = "1.4")
    @kotlin.C
    @Xc.f
    public static final StringBuilder o0(StringBuilder sb2, int i10, int i11, String value) {
        kotlin.jvm.internal.G.p(sb2, "<this>");
        kotlin.jvm.internal.G.p(value, "value");
        StringBuilder sbReplace = sb2.replace(i10, i11, value);
        kotlin.jvm.internal.G.o(sbReplace, "replace(...)");
        return sbReplace;
    }

    @InterfaceC4887e0(version = "1.4")
    @Xc.f
    public static final void p0(StringBuilder sb2, char[] destination, int i10, int i11, int i12) {
        kotlin.jvm.internal.G.p(sb2, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        sb2.getChars(i11, i12, destination, i10);
    }

    public static /* synthetic */ void q0(StringBuilder sb2, char[] destination, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = sb2.length();
        }
        kotlin.jvm.internal.G.p(sb2, "<this>");
        kotlin.jvm.internal.G.p(destination, "destination");
        sb2.getChars(i11, i12, destination, i10);
    }
}
