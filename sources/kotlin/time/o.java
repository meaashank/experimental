package kotlin.time;

import kotlin.L0;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@V({"SMAP\nDuration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Duration.kt\nkotlin/time/FractionalParser\n+ 2 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n1#1,1613:1\n1351#1,14:1614\n1351#1,14:1628\n1656#2,3:1642\n*S KotlinDebug\n*F\n+ 1 Duration.kt\nkotlin/time/FractionalParser\n*L\n1343#1:1614,14\n1344#1:1628,14\n1345#1:1642,3\n*E\n"})
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final o f218442a = new o();

    public final long a(@NotNull String value, int i10, @NotNull ed.l<? super Integer, L0> callback) {
        char cCharAt;
        char cCharAt2;
        kotlin.jvm.internal.G.p(value, "value");
        kotlin.jvm.internal.G.p(callback, "callback");
        int iMin = Math.min(i10 + 6, value.length());
        int i11 = i10;
        int i12 = 0;
        while (i11 < iMin && '0' <= (cCharAt2 = value.charAt(i11)) && cCharAt2 < ':') {
            i12 = (cCharAt2 - '0') + (i12 << 3) + (i12 << 1);
            i11++;
        }
        for (int i13 = 0; i13 < 6 - (i11 - i10); i13++) {
            i12 = (i12 << 1) + (i12 << 3);
        }
        int iMin2 = Math.min(i11 + 9, value.length());
        int i14 = 0;
        int i15 = i11;
        while (i15 < iMin2) {
            char cCharAt3 = value.charAt(i15);
            if ('0' > cCharAt3 || cCharAt3 >= ':') {
                break;
            }
            i14 = (cCharAt3 - '0') + (i14 << 3) + (i14 << 1);
            i15++;
        }
        for (int i16 = 0; i16 < 9 - (i15 - i11); i16++) {
            i14 = (i14 << 1) + (i14 << 3);
        }
        while (i15 < value.length() && '0' <= (cCharAt = value.charAt(i15)) && cCharAt < ':') {
            i15++;
        }
        callback.invoke(Integer.valueOf(i15));
        return (((long) i12) * ((long) 1000000000)) + ((long) i14);
    }

    public final int b(String str, int i10, int i11, ed.l<? super Integer, L0> lVar) {
        int iMin = Math.min(i10 + i11, str.length());
        int i12 = i10;
        int i13 = 0;
        while (i12 < iMin) {
            char cCharAt = str.charAt(i12);
            if ('0' > cCharAt || cCharAt >= ':') {
                break;
            }
            i13 = (cCharAt - '0') + (i13 << 3) + (i13 << 1);
            i12++;
        }
        for (int i14 = 0; i14 < i11 - (i12 - i10); i14++) {
            i13 = (i13 << 3) + (i13 << 1);
        }
        lVar.invoke(Integer.valueOf(i12));
        return i13;
    }
}
