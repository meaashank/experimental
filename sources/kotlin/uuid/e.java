package kotlin.uuid;

import com.google.common.base.Ascii;
import ed.q;
import kotlin.KotlinNothingValueException;
import kotlin.L0;
import kotlin.collections.B;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import kotlin.text.C5017i;
import okio.h0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@V({"SMAP\nUuid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Uuid.kt\nkotlin/uuid/UuidKt__UuidKt\n+ 2 HexExtensions.kt\nkotlin/text/HexExtensionsKt\n*L\n1#1,1056:1\n897#1,5:1057\n902#1:1071\n889#1,2:1072\n903#1:1074\n904#1:1081\n889#1,2:1082\n905#1:1084\n906#1:1091\n889#1,2:1092\n907#1:1094\n908#1:1101\n889#1,2:1102\n909#1:1104\n911#1,3:1111\n897#1,5:1114\n902#1:1128\n889#1,2:1129\n903#1:1131\n904#1:1138\n889#1,2:1139\n905#1:1141\n906#1:1148\n889#1,2:1149\n907#1:1151\n908#1:1158\n889#1,2:1159\n909#1:1161\n911#1,3:1168\n889#1,2:1180\n889#1,2:1191\n889#1,2:1202\n889#1,2:1213\n943#1:1224\n944#1:1234\n945#1:1241\n943#1:1242\n944#1:1252\n945#1:1259\n1201#2,3:1062\n1229#2,5:1065\n1205#2:1070\n1229#2,5:1075\n1205#2:1080\n1229#2,5:1085\n1205#2:1090\n1229#2,5:1095\n1205#2:1100\n1229#2,5:1105\n1205#2:1110\n1201#2,3:1119\n1229#2,5:1122\n1205#2:1127\n1229#2,5:1132\n1205#2:1137\n1229#2,5:1142\n1205#2:1147\n1229#2,5:1152\n1205#2:1157\n1229#2,5:1162\n1205#2:1167\n1201#2,3:1171\n1229#2,5:1174\n1205#2:1179\n1201#2,3:1182\n1229#2,5:1185\n1205#2:1190\n1201#2,3:1193\n1229#2,5:1196\n1205#2:1201\n1201#2,3:1204\n1229#2,5:1207\n1205#2:1212\n1201#2,3:1215\n1229#2,5:1218\n1205#2:1223\n1201#2,3:1225\n1229#2,5:1228\n1205#2:1233\n1229#2,5:1235\n1205#2:1240\n1201#2,3:1243\n1229#2,5:1246\n1205#2:1251\n1229#2,5:1253\n1205#2:1258\n1201#2,3:1260\n1229#2,5:1263\n1205#2:1268\n1201#2,3:1269\n1229#2,5:1272\n1205#2:1277\n*S KotlinDebug\n*F\n+ 1 Uuid.kt\nkotlin/uuid/UuidKt__UuidKt\n*L\n873#1:1057,5\n873#1:1071\n873#1:1072,2\n873#1:1074\n873#1:1081\n873#1:1082,2\n873#1:1084\n873#1:1091\n873#1:1092,2\n873#1:1094\n873#1:1101\n873#1:1102,2\n873#1:1104\n873#1:1111,3\n880#1:1114,5\n880#1:1128\n880#1:1129,2\n880#1:1131\n880#1:1138\n880#1:1139,2\n880#1:1141\n880#1:1148\n880#1:1149,2\n880#1:1151\n880#1:1158\n880#1:1159,2\n880#1:1161\n880#1:1168,3\n902#1:1180,2\n904#1:1191,2\n906#1:1202,2\n908#1:1213,2\n925#1:1224\n925#1:1234\n925#1:1241\n932#1:1242\n932#1:1252\n932#1:1259\n873#1:1062,3\n873#1:1065,5\n873#1:1070\n873#1:1075,5\n873#1:1080\n873#1:1085,5\n873#1:1090\n873#1:1095,5\n873#1:1100\n873#1:1105,5\n873#1:1110\n880#1:1119,3\n880#1:1122,5\n880#1:1127\n880#1:1132,5\n880#1:1137\n880#1:1142,5\n880#1:1147\n880#1:1152,5\n880#1:1157\n880#1:1162,5\n880#1:1167\n901#1:1171,3\n901#1:1174,5\n901#1:1179\n903#1:1182,3\n903#1:1185,5\n903#1:1190\n905#1:1193,3\n905#1:1196,5\n905#1:1201\n907#1:1204,3\n907#1:1207,5\n907#1:1212\n909#1:1215,3\n909#1:1218,5\n909#1:1223\n925#1:1225,3\n925#1:1228,5\n925#1:1233\n925#1:1235,5\n925#1:1240\n932#1:1243,3\n932#1:1246,5\n932#1:1251\n932#1:1253,5\n932#1:1258\n943#1:1260,3\n943#1:1263,5\n943#1:1268\n944#1:1269,3\n944#1:1272,5\n944#1:1277\n*E\n"})
public class e extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f218486a = 32;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f218487b = 36;

    @a
    @NotNull
    public static final Uuid A(@NotNull String hexString) {
        G.p(hexString, "hexString");
        int i10 = 0;
        long j10 = 0;
        while (true) {
            if (i10 >= 16) {
                long j11 = 0;
                for (int i11 = 16; i11 < 32; i11++) {
                    long j12 = j11 << 4;
                    char cCharAt = hexString.charAt(i11);
                    if ((cCharAt >>> '\b') != 0 || C5017i.f218350f[cCharAt] < 0) {
                        G(hexString, "a hexadecimal digit", i11);
                        throw null;
                    }
                    j11 = j12 | C5017i.f218350f[cCharAt];
                }
                return Uuid.f218475c.b(j10, j11);
            }
            long j13 = j10 << 4;
            char cCharAt2 = hexString.charAt(i10);
            if ((cCharAt2 >>> '\b') != 0 || C5017i.f218350f[cCharAt2] < 0) {
                break;
            }
            j10 = j13 | C5017i.f218350f[cCharAt2];
            i10++;
        }
        G(hexString, "a hexadecimal digit", i10);
        throw null;
    }

    @a
    @NotNull
    public static final Uuid B(@NotNull String hexString, @NotNull q onError) {
        G.p(hexString, "hexString");
        G.p(onError, "onError");
        int i10 = 0;
        long j10 = 0;
        while (true) {
            if (i10 >= 16) {
                long j11 = 0;
                for (int i11 = 16; i11 < 32; i11++) {
                    long j12 = j11 << 4;
                    char cCharAt = hexString.charAt(i11);
                    if ((cCharAt >>> '\b') != 0 || C5017i.f218350f[cCharAt] < 0) {
                        onError.invoke(hexString, "a hexadecimal digit", Integer.valueOf(i11));
                        throw new KotlinNothingValueException();
                    }
                    j11 = j12 | C5017i.f218350f[cCharAt];
                }
                return Uuid.f218475c.b(j10, j11);
            }
            long j13 = j10 << 4;
            char cCharAt2 = hexString.charAt(i10);
            if ((cCharAt2 >>> '\b') != 0 || C5017i.f218350f[cCharAt2] < 0) {
                break;
            }
            j10 = j13 | C5017i.f218350f[cCharAt2];
            i10++;
        }
        onError.invoke(hexString, "a hexadecimal digit", Integer.valueOf(i10));
        throw new KotlinNothingValueException();
    }

    @a
    @NotNull
    public static final Uuid C(@NotNull String hexDashString) {
        G.p(hexDashString, "hexDashString");
        long j10 = 0;
        for (int i10 = 0; i10 < 8; i10++) {
            long j11 = j10 << 4;
            char cCharAt = hexDashString.charAt(i10);
            if ((cCharAt >>> '\b') != 0 || C5017i.f218350f[cCharAt] < 0) {
                G(hexDashString, "a hexadecimal digit", i10);
                throw null;
            }
            j10 = j11 | C5017i.f218350f[cCharAt];
        }
        if (hexDashString.charAt(8) != '-') {
            G(hexDashString, "'-' (hyphen)", 8);
            throw null;
        }
        long j12 = 0;
        for (int i11 = 9; i11 < 13; i11++) {
            long j13 = j12 << 4;
            char cCharAt2 = hexDashString.charAt(i11);
            if ((cCharAt2 >>> '\b') != 0 || C5017i.f218350f[cCharAt2] < 0) {
                G(hexDashString, "a hexadecimal digit", i11);
                throw null;
            }
            j12 = j13 | C5017i.f218350f[cCharAt2];
        }
        if (hexDashString.charAt(13) != '-') {
            G(hexDashString, "'-' (hyphen)", 13);
            throw null;
        }
        long j14 = 0;
        for (int i12 = 14; i12 < 18; i12++) {
            long j15 = j14 << 4;
            char cCharAt3 = hexDashString.charAt(i12);
            if ((cCharAt3 >>> '\b') != 0 || C5017i.f218350f[cCharAt3] < 0) {
                G(hexDashString, "a hexadecimal digit", i12);
                throw null;
            }
            j14 = j15 | C5017i.f218350f[cCharAt3];
        }
        if (hexDashString.charAt(18) != '-') {
            G(hexDashString, "'-' (hyphen)", 18);
            throw null;
        }
        long j16 = 0;
        for (int i13 = 19; i13 < 23; i13++) {
            long j17 = j16 << 4;
            char cCharAt4 = hexDashString.charAt(i13);
            if ((cCharAt4 >>> '\b') != 0 || C5017i.f218350f[cCharAt4] < 0) {
                G(hexDashString, "a hexadecimal digit", i13);
                throw null;
            }
            j16 = j17 | C5017i.f218350f[cCharAt4];
        }
        if (hexDashString.charAt(23) != '-') {
            G(hexDashString, "'-' (hyphen)", 23);
            throw null;
        }
        long j18 = 0;
        for (int i14 = 24; i14 < 36; i14++) {
            long j19 = j18 << 4;
            char cCharAt5 = hexDashString.charAt(i14);
            if ((cCharAt5 >>> '\b') != 0 || C5017i.f218350f[cCharAt5] < 0) {
                G(hexDashString, "a hexadecimal digit", i14);
                throw null;
            }
            j18 = j19 | C5017i.f218350f[cCharAt5];
        }
        return Uuid.f218475c.b((j10 << 32) | (j12 << 16) | j14, (j16 << 48) | j18);
    }

    @a
    @NotNull
    public static final Uuid D(@NotNull String hexDashString, @NotNull q onError) {
        G.p(hexDashString, "hexDashString");
        G.p(onError, "onError");
        long j10 = 0;
        for (int i10 = 0; i10 < 8; i10++) {
            long j11 = j10 << 4;
            char cCharAt = hexDashString.charAt(i10);
            if ((cCharAt >>> '\b') != 0 || C5017i.f218350f[cCharAt] < 0) {
                onError.invoke(hexDashString, "a hexadecimal digit", Integer.valueOf(i10));
                throw new KotlinNothingValueException();
            }
            j10 = j11 | C5017i.f218350f[cCharAt];
        }
        if (hexDashString.charAt(8) != '-') {
            onError.invoke(hexDashString, "'-' (hyphen)", 8);
        }
        long j12 = 0;
        for (int i11 = 9; i11 < 13; i11++) {
            long j13 = j12 << 4;
            char cCharAt2 = hexDashString.charAt(i11);
            if ((cCharAt2 >>> '\b') != 0 || C5017i.f218350f[cCharAt2] < 0) {
                onError.invoke(hexDashString, "a hexadecimal digit", Integer.valueOf(i11));
                throw new KotlinNothingValueException();
            }
            j12 = j13 | C5017i.f218350f[cCharAt2];
        }
        if (hexDashString.charAt(13) != '-') {
            onError.invoke(hexDashString, "'-' (hyphen)", 13);
        }
        long j14 = 0;
        for (int i12 = 14; i12 < 18; i12++) {
            long j15 = j14 << 4;
            char cCharAt3 = hexDashString.charAt(i12);
            if ((cCharAt3 >>> '\b') != 0 || C5017i.f218350f[cCharAt3] < 0) {
                onError.invoke(hexDashString, "a hexadecimal digit", Integer.valueOf(i12));
                throw new KotlinNothingValueException();
            }
            j14 = j15 | C5017i.f218350f[cCharAt3];
        }
        if (hexDashString.charAt(18) != '-') {
            onError.invoke(hexDashString, "'-' (hyphen)", 18);
        }
        long j16 = 0;
        for (int i13 = 19; i13 < 23; i13++) {
            long j17 = j16 << 4;
            char cCharAt4 = hexDashString.charAt(i13);
            if ((cCharAt4 >>> '\b') != 0 || C5017i.f218350f[cCharAt4] < 0) {
                onError.invoke(hexDashString, "a hexadecimal digit", Integer.valueOf(i13));
                throw new KotlinNothingValueException();
            }
            j16 = j17 | C5017i.f218350f[cCharAt4];
        }
        if (hexDashString.charAt(23) != '-') {
            onError.invoke(hexDashString, "'-' (hyphen)", 23);
        }
        long j18 = 0;
        for (int i14 = 24; i14 < 36; i14++) {
            long j19 = j18 << 4;
            char cCharAt5 = hexDashString.charAt(i14);
            if ((cCharAt5 >>> '\b') != 0 || C5017i.f218350f[cCharAt5] < 0) {
                onError.invoke(hexDashString, "a hexadecimal digit", Integer.valueOf(i14));
                throw new KotlinNothingValueException();
            }
            j18 = j19 | C5017i.f218350f[cCharAt5];
        }
        return Uuid.f218475c.b((j10 << 32) | (j12 << 16) | j14, (j16 << 48) | j18);
    }

    @a
    @Nullable
    public static final Uuid E(@NotNull String hexDashString) {
        G.p(hexDashString, "hexDashString");
        long j10 = 0;
        for (int i10 = 0; i10 < 8; i10++) {
            long j11 = j10 << 4;
            char cCharAt = hexDashString.charAt(i10);
            if ((cCharAt >>> '\b') != 0 || C5017i.f218350f[cCharAt] < 0) {
                return null;
            }
            j10 = j11 | C5017i.f218350f[cCharAt];
        }
        if (hexDashString.charAt(8) != '-') {
            return null;
        }
        long j12 = 0;
        for (int i11 = 9; i11 < 13; i11++) {
            long j13 = j12 << 4;
            char cCharAt2 = hexDashString.charAt(i11);
            if ((cCharAt2 >>> '\b') != 0 || C5017i.f218350f[cCharAt2] < 0) {
                return null;
            }
            j12 = j13 | C5017i.f218350f[cCharAt2];
        }
        if (hexDashString.charAt(13) != '-') {
            return null;
        }
        long j14 = 0;
        for (int i12 = 14; i12 < 18; i12++) {
            long j15 = j14 << 4;
            char cCharAt3 = hexDashString.charAt(i12);
            if ((cCharAt3 >>> '\b') != 0 || C5017i.f218350f[cCharAt3] < 0) {
                return null;
            }
            j14 = j15 | C5017i.f218350f[cCharAt3];
        }
        if (hexDashString.charAt(18) != '-') {
            return null;
        }
        long j16 = 0;
        for (int i13 = 19; i13 < 23; i13++) {
            long j17 = j16 << 4;
            char cCharAt4 = hexDashString.charAt(i13);
            if ((cCharAt4 >>> '\b') != 0 || C5017i.f218350f[cCharAt4] < 0) {
                return null;
            }
            j16 = j17 | C5017i.f218350f[cCharAt4];
        }
        if (hexDashString.charAt(23) != '-') {
            return null;
        }
        long j18 = 0;
        for (int i14 = 24; i14 < 36; i14++) {
            long j19 = j18 << 4;
            char cCharAt5 = hexDashString.charAt(i14);
            if ((cCharAt5 >>> '\b') != 0 || C5017i.f218350f[cCharAt5] < 0) {
                return null;
            }
            j18 = j19 | C5017i.f218350f[cCharAt5];
        }
        return Uuid.f218475c.b((j10 << 32) | (j12 << 16) | j14, (j16 << 48) | j18);
    }

    @a
    @Nullable
    public static final Uuid F(@NotNull String hexString) {
        G.p(hexString, "hexString");
        int i10 = 0;
        long j10 = 0;
        while (true) {
            if (i10 >= 16) {
                long j11 = 0;
                for (int i11 = 16; i11 < 32; i11++) {
                    long j12 = j11 << 4;
                    char cCharAt = hexString.charAt(i11);
                    if ((cCharAt >>> '\b') != 0 || C5017i.f218350f[cCharAt] < 0) {
                        return null;
                    }
                    j11 = j12 | C5017i.f218350f[cCharAt];
                }
                return Uuid.f218475c.b(j10, j11);
            }
            long j13 = j10 << 4;
            char cCharAt2 = hexString.charAt(i10);
            if ((cCharAt2 >>> '\b') != 0 || C5017i.f218350f[cCharAt2] < 0) {
                break;
            }
            j10 = j13 | C5017i.f218350f[cCharAt2];
            i10++;
        }
        return null;
    }

    @NotNull
    public static final Void G(@NotNull String inputString, @NotNull String errorDescription, int i10) {
        G.p(inputString, "inputString");
        G.p(errorDescription, "errorDescription");
        StringBuilder sbA = androidx.constraintlayout.widget.e.a("Expected ", errorDescription, " at index ", i10, ", but was '");
        sbA.append(inputString.charAt(i10));
        sbA.append('\'');
        throw new IllegalArgumentException(sbA.toString());
    }

    @a
    public static final void s(long j10, @NotNull byte[] dst, int i10, int i11, int i12) {
        G.p(dst, "dst");
        int i13 = 7 - i11;
        int i14 = 8 - i12;
        if (i14 > i13) {
            return;
        }
        while (true) {
            int i15 = C5017i.o()[(int) ((j10 >> (i13 << 3)) & 255)];
            int i16 = i10 + 1;
            dst[i10] = (byte) (i15 >> 8);
            i10 += 2;
            dst[i16] = (byte) i15;
            if (i13 == i14) {
                return;
            } else {
                i13--;
            }
        }
    }

    public static final long t(@NotNull byte[] bArr, int i10) {
        G.p(bArr, "<this>");
        return (((long) bArr[i10 + 7]) & 255) | ((((long) bArr[i10]) & 255) << 56) | ((((long) bArr[i10 + 1]) & 255) << 48) | ((((long) bArr[i10 + 2]) & 255) << 40) | ((((long) bArr[i10 + 3]) & 255) << 32) | ((((long) bArr[i10 + 4]) & 255) << 24) | ((((long) bArr[i10 + 5]) & 255) << 16) | ((((long) bArr[i10 + 6]) & 255) << 8);
    }

    @a
    @NotNull
    public static final Uuid u() {
        byte[] bArr = new byte[16];
        d.h(bArr);
        return z(bArr);
    }

    public static final void v(@NotNull byte[] bArr, int i10, long j10) {
        G.p(bArr, "<this>");
        int i11 = 7;
        while (-1 < i11) {
            bArr[i10] = (byte) (j10 >> (i11 << 3));
            i11--;
            i10++;
        }
    }

    public static final String w(String str, int i10) {
        if (str.length() <= i10) {
            return str;
        }
        String strSubstring = str.substring(0, i10);
        G.o(strSubstring, "substring(...)");
        return strSubstring.concat("...");
    }

    public static final String x(byte[] bArr, int i10) {
        return B.yh(bArr, null, "[", "]", i10, null, null, 49, null);
    }

    public static final void y(@NotNull String str, int i10, @NotNull q<? super String, ? super String, ? super Integer, L0> onError) {
        G.p(str, "<this>");
        G.p(onError, "onError");
        if (str.charAt(i10) != '-') {
            onError.invoke(str, "'-' (hyphen)", Integer.valueOf(i10));
        }
    }

    @a
    @NotNull
    public static final Uuid z(@NotNull byte[] randomBytes) {
        G.p(randomBytes, "randomBytes");
        byte b10 = (byte) (randomBytes[6] & Ascii.SI);
        randomBytes[6] = b10;
        randomBytes[6] = (byte) (b10 | 64);
        byte b11 = (byte) (randomBytes[8] & h0.f225962a);
        randomBytes[8] = b11;
        randomBytes[8] = (byte) (b11 | 128);
        return Uuid.f218475c.a(randomBytes);
    }
}
