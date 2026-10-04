package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.C1837v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nEditCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditCommand.kt\nandroidx/compose/foundation/text/input/internal/EditCommandKt\n+ 2 MathUtils.kt\nandroidx/compose/foundation/text/input/internal/MathUtilsKt\n*L\n1#1,304:1\n27#2,3:305\n36#2,4:308\n*S KotlinDebug\n*F\n+ 1 EditCommand.kt\nandroidx/compose/foundation/text/input/internal/EditCommandKt\n*L\n156#1:305,3\n161#1:308,4\n*E\n"})
public final class H {
    public static final void a(@NotNull I i10) {
        if (i10.p()) {
            i10.d(i10.f93726f, i10.f93727g);
            return;
        }
        if (i10.j() != -1) {
            if (i10.j() != 0) {
                i10.d(C1837v.b(i10.f93721a.toString(), i10.j()), i10.j());
            }
        } else {
            int i11 = i10.f93723c;
            int i12 = i10.f93724d;
            i10.v(i11, i11);
            i10.d(i11, i12);
        }
    }

    public static final void b(@NotNull I i10, @NotNull String str, int i11) {
        if (i10.p()) {
            i10.q(i10.f93726f, i10.f93727g, str);
        } else {
            i10.q(i10.f93723c, i10.f93724d, str);
        }
        int iK = md.u.K(i11 > 0 ? (r0 + i11) - 1 : (i10.j() + i11) - str.length(), 0, i10.f93721a.c());
        i10.v(iK, iK);
    }

    public static final void c(@NotNull I i10) {
        i10.q(0, i10.f93721a.c(), "");
    }

    public static final void d(@NotNull I i10, int i11, int i12) {
        if (i11 < 0 || i12 < 0) {
            throw new IllegalArgumentException(androidx.collection.M0.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", i11, " and ", i12, " respectively.").toString());
        }
        int i13 = i10.f93724d;
        int iC = i13 + i12;
        if (((i12 ^ iC) & (i13 ^ iC)) < 0) {
            iC = i10.f93721a.c();
        }
        i10.d(i10.f93724d, Math.min(iC, i10.f93721a.c()));
        int i14 = i10.f93723c;
        int i15 = i14 - i11;
        if (((i11 ^ i14) & (i14 ^ i15)) < 0) {
            i15 = 0;
        }
        i10.d(Math.max(0, i15), i10.f93723c);
    }

    public static final void e(@NotNull I i10, int i11, int i12) {
        if (i11 < 0 || i12 < 0) {
            throw new IllegalArgumentException(androidx.collection.M0.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", i11, " and ", i12, " respectively.").toString());
        }
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            if (i14 < i11) {
                int i16 = i15 + 1;
                int i17 = i10.f93723c;
                if (i17 <= i16) {
                    i15 = i17;
                    break;
                } else {
                    i15 = g(i10.f93721a.b((i17 - i16) + (-1)), i10.f93721a.b(i10.f93723c - i16)) ? i15 + 2 : i16;
                    i14++;
                }
            } else {
                break;
            }
        }
        int iC = 0;
        while (true) {
            if (i13 >= i12) {
                break;
            }
            int i18 = iC + 1;
            if (i10.f93724d + i18 >= i10.f93721a.c()) {
                iC = i10.f93721a.c() - i10.f93724d;
                break;
            } else {
                iC = g(i10.f93721a.b((i10.f93724d + i18) + (-1)), i10.f93721a.b(i10.f93724d + i18)) ? iC + 2 : i18;
                i13++;
            }
        }
        int i19 = i10.f93724d;
        i10.d(i19, iC + i19);
        int i20 = i10.f93723c;
        i10.d(i20 - i15, i20);
    }

    public static final void f(@NotNull I i10) {
        i10.c();
    }

    public static final boolean g(char c10, char c11) {
        return Character.isHighSurrogate(c10) && Character.isLowSurrogate(c11);
    }

    public static final void h(@NotNull I i10, int i11) {
        if (i10.j() == -1) {
            int i12 = i10.f93723c;
            i10.v(i12, i12);
        }
        int i13 = i10.f93723c;
        String string = i10.f93721a.toString();
        int i14 = 0;
        if (i11 <= 0) {
            int i15 = -i11;
            while (i14 < i15) {
                int iB = C1837v.b(string, i13);
                if (iB == -1) {
                    break;
                }
                i14++;
                i13 = iB;
            }
        } else {
            while (i14 < i11) {
                int iA = C1837v.a(string, i13);
                if (iA == -1) {
                    break;
                }
                i14++;
                i13 = iA;
            }
        }
        i10.v(i13, i13);
    }

    public static final void i(@NotNull I i10, int i11, int i12) {
        if (i10.p()) {
            i10.c();
        }
        int iK = md.u.K(i11, 0, i10.f93721a.c());
        int iK2 = md.u.K(i12, 0, i10.f93721a.c());
        if (iK != iK2) {
            if (iK < iK2) {
                i10.r(iK, iK2);
            } else {
                i10.r(iK2, iK);
            }
        }
    }

    public static final void j(@NotNull I i10, @NotNull String str, int i11) {
        if (i10.p()) {
            int i12 = i10.f93726f;
            i10.q(i12, i10.f93727g, str);
            if (str.length() > 0) {
                i10.r(i12, str.length() + i12);
            }
        } else {
            int i13 = i10.f93723c;
            i10.q(i13, i10.f93724d, str);
            if (str.length() > 0) {
                i10.r(i13, str.length() + i13);
            }
        }
        int iK = md.u.K(i11 > 0 ? (r0 + i11) - 1 : (i10.j() + i11) - str.length(), 0, i10.f93721a.c());
        i10.v(iK, iK);
    }
}
