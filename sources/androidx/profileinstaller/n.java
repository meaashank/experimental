package androidx.profileinstaller;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import e.T;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
@T(19)
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f116219a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f116220b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f116221c = 4;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f116222d = 6;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f116223e = 7;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f116224f = {112, 114, 111, 0};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f116225g = {112, 114, 109, 0};

    public static void A(@NonNull InputStream inputStream) throws IOException {
        f.h(inputStream);
        int iG = (int) f.g(inputStream, 1);
        if (iG == 6 || iG == 7) {
            return;
        }
        while (iG > 0) {
            f.j(inputStream);
            for (int iG2 = (int) f.g(inputStream, 1); iG2 > 0; iG2--) {
                f.h(inputStream);
            }
            iG--;
        }
    }

    public static boolean B(@NonNull OutputStream outputStream, @NonNull byte[] bArr, @NonNull e[] eVarArr) throws IOException {
        if (Arrays.equals(bArr, p.f116251a)) {
            O(outputStream, eVarArr);
            return true;
        }
        if (Arrays.equals(bArr, p.f116252b)) {
            M(outputStream, eVarArr);
            return true;
        }
        if (Arrays.equals(bArr, p.f116254d)) {
            K(outputStream, eVarArr);
            return true;
        }
        if (Arrays.equals(bArr, p.f116253c)) {
            L(outputStream, eVarArr);
            return true;
        }
        if (!Arrays.equals(bArr, p.f116255e)) {
            return false;
        }
        J(outputStream, eVarArr);
        return true;
    }

    public static void C(@NonNull OutputStream outputStream, @NonNull e eVar) throws IOException {
        int[] iArr = eVar.f116172h;
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = iArr[i10];
            f.p(outputStream, i12 - i11);
            i10++;
            i11 = i12;
        }
    }

    public static r D(@NonNull e[] eVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            f.p(byteArrayOutputStream, eVarArr.length);
            int i10 = 2;
            for (e eVar : eVarArr) {
                f.o(byteArrayOutputStream, eVar.f116167c, 4);
                f.o(byteArrayOutputStream, eVar.f116168d, 4);
                f.o(byteArrayOutputStream, eVar.f116171g, 4);
                String strJ = j(eVar.f116165a, eVar.f116166b, p.f116251a);
                int iK = f.k(strJ);
                f.p(byteArrayOutputStream, iK);
                i10 = i10 + 14 + iK;
                f.n(byteArrayOutputStream, strJ);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i10 == byteArray.length) {
                r rVar = new r(FileSectionType.DEX_FILES, i10, byteArray, false);
                byteArrayOutputStream.close();
                return rVar;
            }
            throw new IllegalStateException("Expected size " + i10 + ", does not match actual size " + byteArray.length);
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void E(@NonNull OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(f116224f);
        outputStream.write(bArr);
    }

    public static void F(@NonNull OutputStream outputStream, @NonNull e eVar) throws IOException {
        I(outputStream, eVar);
        C(outputStream, eVar);
        H(outputStream, eVar);
    }

    public static void G(@NonNull OutputStream outputStream, @NonNull e eVar, @NonNull String str) throws IOException {
        f.p(outputStream, f.k(str));
        f.p(outputStream, eVar.f116169e);
        f.o(outputStream, eVar.f116170f, 4);
        f.o(outputStream, eVar.f116167c, 4);
        f.o(outputStream, eVar.f116171g, 4);
        f.n(outputStream, str);
    }

    public static void H(@NonNull OutputStream outputStream, @NonNull e eVar) throws IOException {
        byte[] bArr = new byte[k(eVar.f116171g)];
        for (Map.Entry<Integer, Integer> entry : eVar.f116173i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            if ((iIntValue2 & 2) != 0) {
                z(bArr, 2, iIntValue, eVar);
            }
            if ((iIntValue2 & 4) != 0) {
                z(bArr, 4, iIntValue, eVar);
            }
        }
        outputStream.write(bArr);
    }

    public static void I(@NonNull OutputStream outputStream, @NonNull e eVar) throws IOException {
        int i10 = 0;
        for (Map.Entry<Integer, Integer> entry : eVar.f116173i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                f.p(outputStream, iIntValue - i10);
                f.p(outputStream, 0);
                i10 = iIntValue;
            }
        }
    }

    public static void J(@NonNull OutputStream outputStream, @NonNull e[] eVarArr) throws IOException {
        f.p(outputStream, eVarArr.length);
        for (e eVar : eVarArr) {
            String strJ = j(eVar.f116165a, eVar.f116166b, p.f116255e);
            f.p(outputStream, f.k(strJ));
            f.p(outputStream, eVar.f116173i.size());
            f.p(outputStream, eVar.f116172h.length);
            f.o(outputStream, eVar.f116167c, 4);
            f.n(outputStream, strJ);
            Iterator<Integer> it = eVar.f116173i.keySet().iterator();
            while (it.hasNext()) {
                f.p(outputStream, it.next().intValue());
            }
            for (int i10 : eVar.f116172h) {
                f.p(outputStream, i10);
            }
        }
    }

    public static void K(@NonNull OutputStream outputStream, @NonNull e[] eVarArr) throws IOException {
        f.r(outputStream, eVarArr.length);
        for (e eVar : eVarArr) {
            int size = eVar.f116173i.size() * 4;
            String strJ = j(eVar.f116165a, eVar.f116166b, p.f116254d);
            f.p(outputStream, f.k(strJ));
            f.p(outputStream, eVar.f116172h.length);
            f.o(outputStream, size, 4);
            f.o(outputStream, eVar.f116167c, 4);
            f.n(outputStream, strJ);
            Iterator<Integer> it = eVar.f116173i.keySet().iterator();
            while (it.hasNext()) {
                f.p(outputStream, it.next().intValue());
                f.p(outputStream, 0);
            }
            for (int i10 : eVar.f116172h) {
                f.p(outputStream, i10);
            }
        }
    }

    public static void L(@NonNull OutputStream outputStream, @NonNull e[] eVarArr) throws IOException {
        byte[] bArrB = b(eVarArr, p.f116253c);
        f.r(outputStream, eVarArr.length);
        f.m(outputStream, bArrB);
    }

    public static void M(@NonNull OutputStream outputStream, @NonNull e[] eVarArr) throws IOException {
        byte[] bArrB = b(eVarArr, p.f116252b);
        f.r(outputStream, eVarArr.length);
        f.m(outputStream, bArrB);
    }

    public static void N(@NonNull OutputStream outputStream, @NonNull e[] eVarArr) throws IOException {
        O(outputStream, eVarArr);
    }

    public static void O(@NonNull OutputStream outputStream, @NonNull e[] eVarArr) throws IOException {
        int length;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(D(eVarArr));
        arrayList.add(c(eVarArr));
        arrayList.add(d(eVarArr));
        long length2 = ((long) p.f116251a.length) + ((long) f116224f.length) + 4 + ((long) (arrayList.size() * 16));
        f.o(outputStream, arrayList.size(), 4);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            r rVar = (r) arrayList.get(i10);
            f.o(outputStream, rVar.f116260a.getValue(), 4);
            f.o(outputStream, length2, 4);
            if (rVar.f116263d) {
                byte[] bArr = rVar.f116262c;
                long length3 = bArr.length;
                byte[] bArrB = f.b(bArr);
                arrayList2.add(bArrB);
                f.o(outputStream, bArrB.length, 4);
                f.o(outputStream, length3, 4);
                length = bArrB.length;
            } else {
                arrayList2.add(rVar.f116262c);
                f.o(outputStream, rVar.f116262c.length, 4);
                f.o(outputStream, 0L, 4);
                length = rVar.f116262c.length;
            }
            length2 += (long) length;
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            outputStream.write((byte[]) arrayList2.get(i11));
        }
    }

    public static int a(@NonNull e eVar) {
        Iterator<Map.Entry<Integer, Integer>> it = eVar.f116173i.entrySet().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue |= it.next().getValue().intValue();
        }
        return iIntValue;
    }

    @NonNull
    public static byte[] b(@NonNull e[] eVarArr, @NonNull byte[] bArr) throws IOException {
        int i10 = 0;
        int iK = 0;
        for (e eVar : eVarArr) {
            iK += k(eVar.f116171g) + (eVar.f116169e * 2) + f.k(j(eVar.f116165a, eVar.f116166b, bArr)) + 16 + eVar.f116170f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(iK);
        if (Arrays.equals(bArr, p.f116253c)) {
            int length = eVarArr.length;
            while (i10 < length) {
                e eVar2 = eVarArr[i10];
                G(byteArrayOutputStream, eVar2, j(eVar2.f116165a, eVar2.f116166b, bArr));
                F(byteArrayOutputStream, eVar2);
                i10++;
            }
        } else {
            for (e eVar3 : eVarArr) {
                G(byteArrayOutputStream, eVar3, j(eVar3.f116165a, eVar3.f116166b, bArr));
            }
            int length2 = eVarArr.length;
            while (i10 < length2) {
                F(byteArrayOutputStream, eVarArr[i10]);
                i10++;
            }
        }
        if (byteArrayOutputStream.size() == iK) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + iK);
    }

    public static r c(@NonNull e[] eVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        for (int i11 = 0; i11 < eVarArr.length; i11++) {
            try {
                e eVar = eVarArr[i11];
                f.p(byteArrayOutputStream, i11);
                f.p(byteArrayOutputStream, eVar.f116169e);
                i10 = i10 + 4 + (eVar.f116169e * 2);
                C(byteArrayOutputStream, eVar);
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i10 == byteArray.length) {
            r rVar = new r(FileSectionType.CLASSES, i10, byteArray, true);
            byteArrayOutputStream.close();
            return rVar;
        }
        throw new IllegalStateException("Expected size " + i10 + ", does not match actual size " + byteArray.length);
    }

    public static r d(@NonNull e[] eVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        for (int i11 = 0; i11 < eVarArr.length; i11++) {
            try {
                e eVar = eVarArr[i11];
                int iA = a(eVar);
                byte[] bArrE = e(eVar);
                byte[] bArrF = f(eVar);
                f.p(byteArrayOutputStream, i11);
                int length = bArrE.length + 2 + bArrF.length;
                f.o(byteArrayOutputStream, length, 4);
                f.p(byteArrayOutputStream, iA);
                byteArrayOutputStream.write(bArrE);
                byteArrayOutputStream.write(bArrF);
                i10 = i10 + 6 + length;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i10 == byteArray.length) {
            r rVar = new r(FileSectionType.METHODS, i10, byteArray, true);
            byteArrayOutputStream.close();
            return rVar;
        }
        throw new IllegalStateException("Expected size " + i10 + ", does not match actual size " + byteArray.length);
    }

    public static byte[] e(@NonNull e eVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            H(byteArrayOutputStream, eVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static byte[] f(@NonNull e eVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            I(byteArrayOutputStream, eVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @NonNull
    public static String g(@NonNull String str, @NonNull String str2) {
        return "!".equals(str2) ? str.replace(com.prism.gaia.server.accounts.b.f166434b0, "!") : com.prism.gaia.server.accounts.b.f166434b0.equals(str2) ? str.replace("!", com.prism.gaia.server.accounts.b.f166434b0) : str;
    }

    @NonNull
    public static String h(@NonNull String str) {
        int iIndexOf = str.indexOf("!");
        if (iIndexOf < 0) {
            iIndexOf = str.indexOf(com.prism.gaia.server.accounts.b.f166434b0);
        }
        return iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
    }

    @Nullable
    public static e i(@NonNull e[] eVarArr, @NonNull String str) {
        if (eVarArr.length <= 0) {
            return null;
        }
        String strH = h(str);
        for (int i10 = 0; i10 < eVarArr.length; i10++) {
            if (eVarArr[i10].f116166b.equals(strH)) {
                return eVarArr[i10];
            }
        }
        return null;
    }

    @NonNull
    public static String j(@NonNull String str, @NonNull String str2, @NonNull byte[] bArr) {
        String strA = p.a(bArr);
        if (str.length() <= 0) {
            return g(str2, strA);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(com.prism.gaia.server.accounts.b.f166434b0)) {
            return g(str2, strA);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        StringBuilder sbA = androidx.compose.runtime.changelist.a.a(str);
        sbA.append(p.a(bArr));
        sbA.append(str2);
        return sbA.toString();
    }

    public static int k(int i10) {
        return y(i10 * 2) / 8;
    }

    public static int l(int i10, int i11, int i12) {
        if (i10 == 1) {
            throw new IllegalStateException("HOT methods are not stored in the bitmap");
        }
        if (i10 == 2) {
            return i11;
        }
        if (i10 == 4) {
            return i11 + i12;
        }
        throw new IllegalStateException(android.support.v4.media.c.a("Unexpected flag: ", i10));
    }

    public static int[] m(@NonNull InputStream inputStream, int i10) throws IOException {
        int[] iArr = new int[i10];
        int iG = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iG += (int) f.g(inputStream, 2);
            iArr[i11] = iG;
        }
        return iArr;
    }

    public static int n(@NonNull BitSet bitSet, int i10, int i11) {
        int i12 = bitSet.get(i10) ? 2 : 0;
        return bitSet.get(i10 + i11) ? i12 | 4 : i12;
    }

    public static byte[] o(@NonNull InputStream inputStream, @NonNull byte[] bArr) throws IOException {
        if (Arrays.equals(bArr, f.d(inputStream, bArr.length))) {
            return f.d(inputStream, p.f116252b.length);
        }
        throw new IllegalStateException("Invalid magic");
    }

    public static void p(@NonNull InputStream inputStream, @NonNull e eVar) throws IOException {
        int iAvailable = inputStream.available() - eVar.f116170f;
        int iG = 0;
        while (inputStream.available() > iAvailable) {
            iG += (int) f.g(inputStream, 2);
            eVar.f116173i.put(Integer.valueOf(iG), 1);
            for (int iG2 = (int) f.g(inputStream, 2); iG2 > 0; iG2--) {
                A(inputStream);
            }
        }
        if (inputStream.available() != iAvailable) {
            throw new IllegalStateException("Read too much data during profile line parse");
        }
    }

    @NonNull
    public static e[] q(@NonNull InputStream inputStream, @NonNull byte[] bArr, @NonNull byte[] bArr2, e[] eVarArr) throws IOException {
        if (Arrays.equals(bArr, p.f116256f)) {
            if (Arrays.equals(p.f116251a, bArr2)) {
                throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            return r(inputStream, bArr, eVarArr);
        }
        if (Arrays.equals(bArr, p.f116257g)) {
            return t(inputStream, bArr2, eVarArr);
        }
        throw new IllegalStateException("Unsupported meta version");
    }

    @NonNull
    public static e[] r(@NonNull InputStream inputStream, @NonNull byte[] bArr, e[] eVarArr) throws IOException {
        if (!Arrays.equals(bArr, p.f116256f)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iG = (int) f.g(inputStream, 1);
        byte[] bArrE = f.e(inputStream, (int) f.g(inputStream, 4), (int) f.g(inputStream, 4));
        if (inputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrE);
        try {
            e[] eVarArrS = s(byteArrayInputStream, iG, eVarArr);
            byteArrayInputStream.close();
            return eVarArrS;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @NonNull
    public static e[] s(@NonNull InputStream inputStream, int i10, e[] eVarArr) throws IOException {
        if (inputStream.available() == 0) {
            return new e[0];
        }
        if (i10 != eVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i10];
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int iG = (int) f.g(inputStream, 2);
            iArr[i11] = (int) f.g(inputStream, 2);
            strArr[i11] = f.f(inputStream, iG);
        }
        for (int i12 = 0; i12 < i10; i12++) {
            e eVar = eVarArr[i12];
            if (!eVar.f116166b.equals(strArr[i12])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i13 = iArr[i12];
            eVar.f116169e = i13;
            eVar.f116172h = m(inputStream, i13);
        }
        return eVarArr;
    }

    @NonNull
    public static e[] t(@NonNull InputStream inputStream, @NonNull byte[] bArr, e[] eVarArr) throws IOException {
        int iG = (int) f.g(inputStream, 2);
        byte[] bArrE = f.e(inputStream, (int) f.g(inputStream, 4), (int) f.g(inputStream, 4));
        if (inputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrE);
        try {
            e[] eVarArrU = u(byteArrayInputStream, bArr, iG, eVarArr);
            byteArrayInputStream.close();
            return eVarArrU;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @NonNull
    public static e[] u(@NonNull InputStream inputStream, @NonNull byte[] bArr, int i10, e[] eVarArr) throws IOException {
        if (inputStream.available() == 0) {
            return new e[0];
        }
        if (i10 != eVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i11 = 0; i11 < i10; i11++) {
            f.h(inputStream);
            String strF = f.f(inputStream, (int) f.g(inputStream, 2));
            long jG = f.g(inputStream, 4);
            int iG = (int) f.g(inputStream, 2);
            e eVarI = i(eVarArr, strF);
            if (eVarI == null) {
                throw new IllegalStateException("Missing profile key: ".concat(strF));
            }
            eVarI.f116168d = jG;
            int[] iArrM = m(inputStream, iG);
            if (Arrays.equals(bArr, p.f116255e)) {
                eVarI.f116169e = iG;
                eVarI.f116172h = iArrM;
            }
        }
        return eVarArr;
    }

    public static void v(@NonNull InputStream inputStream, @NonNull e eVar) throws IOException {
        BitSet bitSetValueOf = BitSet.valueOf(f.d(inputStream, f.a(eVar.f116171g * 2)));
        int i10 = 0;
        while (true) {
            int i11 = eVar.f116171g;
            if (i10 >= i11) {
                return;
            }
            int iN = n(bitSetValueOf, i10, i11);
            if (iN != 0) {
                Integer num = eVar.f116173i.get(Integer.valueOf(i10));
                if (num == null) {
                    num = 0;
                }
                eVar.f116173i.put(Integer.valueOf(i10), Integer.valueOf(iN | num.intValue()));
            }
            i10++;
        }
    }

    @NonNull
    public static e[] w(@NonNull InputStream inputStream, @NonNull byte[] bArr, @NonNull String str) throws IOException {
        if (!Arrays.equals(bArr, p.f116252b)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iG = (int) f.g(inputStream, 1);
        byte[] bArrE = f.e(inputStream, (int) f.g(inputStream, 4), (int) f.g(inputStream, 4));
        if (inputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrE);
        try {
            e[] eVarArrX = x(byteArrayInputStream, str, iG);
            byteArrayInputStream.close();
            return eVarArrX;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @NonNull
    public static e[] x(@NonNull InputStream inputStream, @NonNull String str, int i10) throws IOException {
        if (inputStream.available() == 0) {
            return new e[0];
        }
        e[] eVarArr = new e[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int iG = (int) f.g(inputStream, 2);
            int iG2 = (int) f.g(inputStream, 2);
            eVarArr[i11] = new e(str, f.f(inputStream, iG), f.g(inputStream, 4), 0L, iG2, (int) f.g(inputStream, 4), (int) f.g(inputStream, 4), new int[iG2], new TreeMap());
        }
        for (int i12 = 0; i12 < i10; i12++) {
            e eVar = eVarArr[i12];
            p(inputStream, eVar);
            eVar.f116172h = m(inputStream, eVar.f116169e);
            v(inputStream, eVar);
        }
        return eVarArr;
    }

    public static int y(int i10) {
        return (i10 + 7) & (-8);
    }

    public static void z(@NonNull byte[] bArr, int i10, int i11, @NonNull e eVar) {
        int iL = l(i10, i11, eVar.f116171g);
        int i12 = iL / 8;
        bArr[i12] = (byte) ((1 << (iL % 8)) | bArr[i12]);
    }
}
