package kotlin.text;

import androidx.collection.N0;
import androidx.compose.foundation.text.C1758e;
import kotlin.InterfaceC4887e0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlin.text.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@kotlin.jvm.internal.V({"SMAP\nChar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Char.kt\nkotlin/text/CharsKt__CharKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,339:1\n1#2:340\n*E\n"})
public class C5012d extends C5011c {
    @InterfaceC4887e0(version = "1.5")
    public static final char D(int i10) {
        if (i10 < 0 || i10 >= 10) {
            throw new IllegalArgumentException(N0.a("Int ", i10, " is not a decimal digit"));
        }
        return (char) (i10 + 48);
    }

    @InterfaceC4887e0(version = "1.5")
    public static final char E(int i10, int i11) {
        if (2 > i11 || i11 >= 37) {
            throw new IllegalArgumentException(N0.a("Invalid radix: ", i11, ". Valid radix values are in range 2..36"));
        }
        if (i10 < 0 || i10 >= i11) {
            throw new IllegalArgumentException(C1758e.a("Digit ", i10, " does not represent a valid digit in radix ", i11));
        }
        return (char) (i10 < 10 ? i10 + 48 : ((char) (i10 + 65)) - '\n');
    }

    @InterfaceC4887e0(version = "1.5")
    public static final int F(char c10) {
        int iDigit = Character.digit((int) c10, 10);
        if (iDigit >= 0) {
            return iDigit;
        }
        throw new IllegalArgumentException("Char " + c10 + " is not a decimal digit");
    }

    @InterfaceC4887e0(version = "1.5")
    public static final int G(char c10, int i10) {
        Integer numI = I(c10, i10);
        if (numI != null) {
            return numI.intValue();
        }
        throw new IllegalArgumentException("Char " + c10 + " is not a digit in the given radix=" + i10);
    }

    @InterfaceC4887e0(version = "1.5")
    @Nullable
    public static final Integer H(char c10) {
        Integer numValueOf = Integer.valueOf(Character.digit((int) c10, 10));
        if (numValueOf.intValue() >= 0) {
            return numValueOf;
        }
        return null;
    }

    @InterfaceC4887e0(version = "1.5")
    @Nullable
    public static final Integer I(char c10, int i10) {
        C5011c.a(i10);
        Integer numValueOf = Integer.valueOf(Character.digit((int) c10, i10));
        if (numValueOf.intValue() >= 0) {
            return numValueOf;
        }
        return null;
    }

    public static final boolean J(char c10, char c11, boolean z10) {
        if (c10 == c11) {
            return true;
        }
        if (!z10) {
            return false;
        }
        char upperCase = Character.toUpperCase(c10);
        char upperCase2 = Character.toUpperCase(c11);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static /* synthetic */ boolean K(char c10, char c11, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return J(c10, c11, z10);
    }

    public static final boolean L(char c10) {
        return 55296 <= c10 && c10 < 57344;
    }

    @Xc.f
    public static final String M(char c10, String other) {
        kotlin.jvm.internal.G.p(other, "other");
        return c10 + other;
    }

    @InterfaceC4887e0(version = "1.5")
    @NotNull
    public static final String N(char c10) {
        return a0.a(c10);
    }
}
