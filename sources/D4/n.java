package d4;

import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@V({"SMAP\nStringBuilderExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringBuilderExtensions.kt\ncom/cookiegames/smartcookie/extensions/StringBuilderExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,115:1\n1#2:116\n*E\n"})
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char f194730a = ' ';

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String f194731b = "";

    public static final boolean a(@NotNull StringBuilder sb2, char c10) {
        G.p(sb2, "<this>");
        return b(sb2, c10) > -1;
    }

    public static final int b(@NotNull StringBuilder sb2, char c10) {
        G.p(sb2, "<this>");
        int length = sb2.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (sb2.charAt(i10) == c10) {
                return i10;
            }
        }
        return -1;
    }

    public static final void c(@NotNull StringBuilder sb2, @NotNull String toReplace, @NotNull String replacement) {
        G.p(sb2, "<this>");
        G.p(toReplace, "toReplace");
        G.p(replacement, "replacement");
        int iIndexOf = sb2.indexOf(toReplace);
        if (iIndexOf >= 0) {
            sb2.replace(iIndexOf, toReplace.length() + iIndexOf, replacement);
        }
    }

    public static final void d(@NotNull StringBuilder sb2, char c10, char c11) {
        G.p(sb2, "<this>");
        int iB = b(sb2, c10);
        if (iB >= 0) {
            sb2.setCharAt(iB, c11);
        }
    }

    public static final void e(@NotNull StringBuilder sb2) {
        G.p(sb2, "<this>");
        int i10 = 0;
        for (int length = sb2.length() - 1; -1 < length && sb2.charAt(length) == ' '; length--) {
            i10++;
        }
        if (i10 > 0) {
            sb2.setLength(sb2.length() - i10);
        }
        int length2 = sb2.length();
        int i11 = 0;
        for (int i12 = 0; i12 < length2 && sb2.charAt(i12) == ' '; i12++) {
            i11++;
        }
        if (i11 > 0) {
            sb2.replace(0, i11, "");
        }
    }

    public static final boolean f(@NotNull StringBuilder sb2, @NotNull String equal) {
        G.p(sb2, "<this>");
        G.p(equal, "equal");
        int length = sb2.length();
        if (length != equal.length()) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10++) {
            if (sb2.charAt(i10) != equal.charAt(i10)) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final StringBuilder g(@NotNull StringBuilder sb2, int i10, int i11) {
        G.p(sb2, "<this>");
        if (i11 <= i10) {
            throw new IllegalArgumentException("End must be greater than start.");
        }
        sb2.substring(i10, i11);
        StringBuilder sb3 = new StringBuilder(sb2);
        sb3.setLength(i11);
        sb3.replace(0, i10, "");
        return sb3;
    }
}
