package ad;

import kotlin.InterfaceC4887e0;
import kotlin.collections.C4875q;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: ad.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@V({"SMAP\nBase64.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Base64.kt\nkotlin/io/encoding/Base64Kt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,844:1\n14135#2,3:845\n14135#2,3:848\n*S KotlinDebug\n*F\n+ 1 Base64.kt\nkotlin/io/encoding/Base64Kt\n*L\n786#1:845,3\n802#1:848,3\n*E\n"})
public final class C1471b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final byte[] f84824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final int[] f84825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final byte[] f84826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final int[] f84827d;

    static {
        byte[] bArr = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, t1.b.f238921d6};
        f84824a = bArr;
        int[] iArr = new int[256];
        C4875q.T1(iArr, -1, 0, 0, 6, null);
        iArr[61] = -2;
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            iArr[bArr[i11]] = i12;
            i11++;
            i12++;
        }
        f84825b = iArr;
        byte[] bArr2 = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
        f84826c = bArr2;
        int[] iArr2 = new int[256];
        C4875q.T1(iArr2, -1, 0, 0, 6, null);
        iArr2[61] = -2;
        int length2 = bArr2.length;
        int i13 = 0;
        while (i10 < length2) {
            iArr2[bArr2[i10]] = i13;
            i10++;
            i13++;
        }
        f84827d = iArr2;
    }

    @InterfaceC4887e0(version = "1.8")
    public static final boolean e(int i10) {
        if (i10 < 0) {
            return false;
        }
        int[] iArr = f84825b;
        return i10 < iArr.length && iArr[i10] != -1;
    }
}
