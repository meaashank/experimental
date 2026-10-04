package com.bytedance.sdk.component.NOt.ZRu.NOt;

import android.support.v4.media.d;
import android.support.v4.media.i;
import androidx.compose.ui.graphics.vector.f;
import com.google.common.base.Ascii;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class uR implements Serializable, Comparable<uR> {
    transient String Ht;
    transient int TFq;
    final byte[] uR;
    static final char[] ZRu = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', f.f101687s, 'b', f.f101679k, 'd', 'e', 'f'};
    public static final Charset NOt = Charset.forName("UTF-8");
    public static final uR mZ = ZRu(new byte[0]);

    public uR(byte[] bArr) {
        this.uR = bArr;
    }

    public static uR ZRu(byte... bArr) {
        if (bArr != null) {
            return new uR((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public String NOt() {
        byte[] bArr = this.uR;
        char[] cArr = new char[bArr.length * 2];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = ZRu;
            cArr[i10] = cArr2[(b10 >> 4) & 15];
            i10 += 2;
            cArr[i11] = cArr2[b10 & Ascii.SI];
        }
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uR) {
            uR uRVar = (uR) obj;
            int iMZ = uRVar.mZ();
            byte[] bArr = this.uR;
            if (iMZ == bArr.length && uRVar.ZRu(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.TFq;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = Arrays.hashCode(this.uR);
        this.TFq = iHashCode;
        return iHashCode;
    }

    public int mZ() {
        return this.uR.length;
    }

    public String toString() {
        if (this.uR.length == 0) {
            return "[size=0]";
        }
        String strZRu = ZRu();
        int iZRu = ZRu(strZRu, 64);
        if (iZRu != -1) {
            String strReplace = strZRu.substring(0, iZRu).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
            if (iZRu >= strZRu.length()) {
                return i.a("[text=", strReplace, "]");
            }
            return "[size=" + this.uR.length + " text=" + strReplace + "…]";
        }
        if (this.uR.length <= 64) {
            return "[hex=" + NOt() + "]";
        }
        return "[size=" + this.uR.length + " hex=" + ZRu(0, 64).NOt() + "…]";
    }

    public byte[] uR() {
        return (byte[]) this.uR.clone();
    }

    public String ZRu() {
        String str = this.Ht;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.uR, NOt);
        this.Ht = str2;
        return str2;
    }

    public uR ZRu(int i10, int i11) {
        if (i10 >= 0) {
            byte[] bArr = this.uR;
            if (i11 > bArr.length) {
                throw new IllegalArgumentException(d.a(new StringBuilder("endIndex > length("), this.uR.length, ")"));
            }
            int i12 = i11 - i10;
            if (i12 >= 0) {
                if (i10 == 0 && i11 == bArr.length) {
                    return this;
                }
                byte[] bArr2 = new byte[i12];
                System.arraycopy(bArr, i10, bArr2, 0, i12);
                return new uR(bArr2);
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    public byte ZRu(int i10) {
        return this.uR[i10];
    }

    public boolean ZRu(int i10, uR uRVar, int i11, int i12) {
        return uRVar.ZRu(i11, this.uR, i10, i12);
    }

    public boolean ZRu(int i10, byte[] bArr, int i11, int i12) {
        if (i10 < 0) {
            return false;
        }
        byte[] bArr2 = this.uR;
        return i10 <= bArr2.length - i12 && i11 >= 0 && i11 <= bArr.length - i12 && Vor.ZRu(bArr2, i10, bArr, i11, i12);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
    public int compareTo(uR uRVar) {
        int iMZ = mZ();
        int iMZ2 = uRVar.mZ();
        int iMin = Math.min(iMZ, iMZ2);
        for (int i10 = 0; i10 < iMin; i10++) {
            int iZRu = ZRu(i10) & 255;
            int iZRu2 = uRVar.ZRu(i10) & 255;
            if (iZRu != iZRu2) {
                return iZRu < iZRu2 ? -1 : 1;
            }
        }
        if (iMZ == iMZ2) {
            return 0;
        }
        return iMZ < iMZ2 ? -1 : 1;
    }

    public static int ZRu(String str, int i10) {
        int length = str.length();
        int iCharCount = 0;
        int i11 = 0;
        while (iCharCount < length) {
            if (i11 == i10) {
                return iCharCount;
            }
            int iCodePointAt = str.codePointAt(iCharCount);
            if ((Character.isISOControl(iCodePointAt) && iCodePointAt != 10 && iCodePointAt != 13) || iCodePointAt == 65533) {
                return -1;
            }
            i11++;
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.length();
    }
}
