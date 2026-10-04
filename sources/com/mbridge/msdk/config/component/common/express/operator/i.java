package com.mbridge.msdk.config.component.common.express.operator;

import G0.F;
import android.text.TextUtils;
import android.util.Base64;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.prism.gaia.download.j;
import e.T;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;
import org.apache.http.HttpStatus;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes5.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f154278a = {99, 124, 119, 123, 242, 107, 111, Opcodes.MULTIANEWARRAY, 48, 1, 103, 43, f3.d.f200563l, 215, Opcodes.LOOKUPSWITCH, 118, 202, 130, 201, 125, 250, 89, 71, 240, Opcodes.LRETURN, 212, Opcodes.IF_ICMPGE, Opcodes.DRETURN, 156, Opcodes.IF_ICMPLE, 114, 192, Opcodes.INVOKESPECIAL, 253, Opcodes.I2S, 38, 54, 63, 247, 204, 52, 165, 229, 241, 113, 216, 49, 21, 4, 199, 35, 195, 24, 150, 5, 154, 7, 18, 128, 226, 235, 39, 178, 117, 9, 131, 44, 26, 27, 110, 90, 160, 82, 59, 214, Opcodes.PUTSTATIC, 41, 227, 47, 132, 83, 209, 0, 237, 32, 252, Opcodes.RETURN, 91, 106, 203, 190, 57, 74, 76, 88, 207, 208, 239, Opcodes.TABLESWITCH, 251, 67, 77, 51, Opcodes.I2L, 69, f3.d.f200561j, 2, 127, 80, 60, Opcodes.IF_ICMPEQ, Opcodes.JSR, 81, Opcodes.IF_ICMPGT, 64, Opcodes.D2L, Opcodes.I2C, 157, 56, 245, Opcodes.NEWARRAY, Opcodes.INVOKEVIRTUAL, DefaultImageHeaderParser.f139853j, 33, 16, 255, 243, 210, HttpStatus.SC_RESET_CONTENT, 12, 19, 236, 95, Opcodes.DCMPL, 68, 23, j.b.f164765r0, Opcodes.GOTO, 126, 61, 100, 93, 25, 115, 96, 129, 79, 220, 34, 42, Opcodes.D2F, Opcodes.L2I, 70, 238, Opcodes.INVOKESTATIC, 20, 222, 94, 11, 219, 224, 50, 58, 10, 73, 6, 36, 92, 194, 211, Opcodes.IRETURN, 98, Opcodes.I2B, Opcodes.FCMPL, 228, 121, 231, 200, 55, 109, Opcodes.F2D, 213, 78, Opcodes.RET, 108, 86, 244, 234, 101, 122, Opcodes.FRETURN, 8, Opcodes.INVOKEDYNAMIC, 120, 37, 46, 28, Opcodes.IF_ACMPNE, Opcodes.GETFIELD, 198, 232, 221, 116, 31, 75, 189, Opcodes.F2I, 138, 112, 62, Opcodes.PUTFIELD, 102, 72, 3, 246, 14, 97, 53, 87, Opcodes.INVOKEINTERFACE, 134, 193, 29, 158, 225, 248, Opcodes.DCMPG, 17, 105, DefaultImageHeaderParser.f139854k, Opcodes.D2I, Opcodes.LCMP, 155, 30, 135, 233, 206, 85, 40, 223, Opcodes.F2L, Opcodes.IF_ICMPLT, Opcodes.L2F, 13, Opcodes.ATHROW, 230, 66, 104, 65, 153, 45, 15, Opcodes.ARETURN, 84, Opcodes.NEW, 22};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[][] f154279b;

    public i(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
    }

    @T(api = 19)
    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, Object obj, List<Object> list) {
        JSONArray jSONArray;
        if (obj == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        if (list.size() <= 0 || list.size() > 2) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(obj);
        }
        Object obj2 = list.get(0);
        Object obj3 = list.size() == 2 ? list.get(1) : null;
        String str2 = "[{\"m\":9,\"p\":22},{\"m\":1,\"p\":1},{\"m\":5,\"p\":19},{\"m\":7,\"p\":0}]";
        if (obj3 instanceof String) {
            try {
                String str3 = (String) obj3;
                if (!TextUtils.isEmpty(str3)) {
                    str2 = str3;
                }
                jSONArray = new JSONArray(str2);
            } catch (JSONException unused) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(obj);
            }
        } else if (obj3 instanceof JSONArray) {
            jSONArray = (JSONArray) obj3;
        } else {
            try {
                jSONArray = new JSONArray("[{\"m\":9,\"p\":22},{\"m\":1,\"p\":1},{\"m\":5,\"p\":19},{\"m\":7,\"p\":0}]");
            } catch (JSONException unused2) {
                jSONArray = null;
            }
        }
        if (!(obj2 instanceof String)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(obj);
        }
        try {
            return str.equals(com.mbridge.msdk.config.component.common.util.c.c("895")) ? a((String) obj2, (String) obj, jSONArray) : com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        } catch (Exception e10) {
            q0.b("OperatorEncode", e10.getMessage());
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        return TextUtils.isEmpty(str) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.c() : str.equals(com.mbridge.msdk.config.component.common.util.c.c("895")) ? b(str, obj, list) : com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    @T(api = 19)
    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, String str2, JSONArray jSONArray) {
        String strA;
        a(str);
        byte[] bArrDecode = Base64.decode(str2, 10);
        byte[] bArr = new byte[16];
        try {
            System.arraycopy(MessageDigest.getInstance("SHA-256").digest(str.getBytes(StandardCharsets.UTF_8)), 0, bArr, 0, 16);
        } catch (NoSuchAlgorithmException unused) {
        }
        try {
            strA = v0.a(a(bArrDecode, bArr, jSONArray));
        } catch (Exception e10) {
            q0.b("OperatorEncode", e10.getMessage());
            strA = null;
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(strA);
    }

    private void a(String str) {
        this.f154279b = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 16, 16);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            for (int i10 = 0; i10 < 16; i10++) {
                System.arraycopy(messageDigest.digest((str + "_round_" + i10).getBytes(StandardCharsets.UTF_8)), 0, this.f154279b[i10], 0, 16);
            }
        } catch (Exception e10) {
            q0.b("OperatorEncode", e10.getMessage());
        }
    }

    private byte[] a(byte[] bArr, JSONArray jSONArray) {
        JSONObject jSONObjectOptJSONObject;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 16);
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
            String strOptString = jSONObjectOptJSONObject.optString(F.f40036b);
            strOptString.getClass();
            switch (strOptString) {
                case "1":
                    byte[] bArr2 = this.f154279b[jSONObjectOptJSONObject.optInt("p") % 16];
                    for (int i11 = 0; i11 < 16; i11++) {
                        bArrCopyOf[i11] = (byte) (bArrCopyOf[i11] ^ bArr2[i11]);
                    }
                    break;
                case "2":
                    for (int i12 = 0; i12 < 16; i12++) {
                        bArrCopyOf[i12] = (byte) this.f154278a[bArrCopyOf[i12] & 255];
                    }
                    break;
                case "3":
                    int iOptInt = jSONObjectOptJSONObject.optInt("p") % 16;
                    if (iOptInt > 0) {
                        byte[] bArrCopyOf2 = Arrays.copyOf(bArrCopyOf, 16);
                        for (int i13 = 0; i13 < 16; i13++) {
                            bArrCopyOf[i13] = bArrCopyOf2[(i13 + iOptInt) % 16];
                        }
                        break;
                    } else {
                        break;
                    }
                    break;
                case "4":
                    for (int i14 = 0; i14 < 16; i14++) {
                        bArrCopyOf[i14] = (byte) (bArrCopyOf[i14] ^ ((byte) jSONObjectOptJSONObject.optInt("p")));
                    }
                    break;
                case "5":
                    for (int i15 = 0; i15 < 16; i15++) {
                        bArrCopyOf[i15] = (byte) (jSONObjectOptJSONObject.optInt("p") + bArrCopyOf[i15]);
                    }
                    break;
                case "6":
                    int iOptInt2 = jSONObjectOptJSONObject.optInt("p") % 8;
                    for (int i16 = 0; i16 < 16; i16++) {
                        int i17 = bArrCopyOf[i16] & 255;
                        bArrCopyOf[i16] = (byte) ((i17 >>> (8 - iOptInt2)) | (i17 << iOptInt2));
                    }
                    break;
                case "7":
                    int i18 = 0;
                    while (i18 < 16) {
                        int i19 = i18 + 1;
                        bArrCopyOf[i18] = (byte) (bArrCopyOf[i18] ^ bArrCopyOf[i19 % 16]);
                        i18 = i19;
                    }
                    break;
                case "8":
                    int iOptInt3 = jSONObjectOptJSONObject.optInt("p") % 16;
                    int i20 = iOptInt3 != 0 ? iOptInt3 : 1;
                    for (int i21 = 0; i21 < 16; i21 += 2) {
                        int i22 = (i21 + i20) % 16;
                        byte b10 = bArrCopyOf[i21];
                        bArrCopyOf[i21] = bArrCopyOf[i22];
                        bArrCopyOf[i22] = b10;
                    }
                    break;
                case "9":
                    int iOptInt4 = ((jSONObjectOptJSONObject.optInt("p") % 128) * 2) + 1;
                    for (int i23 = 0; i23 < 16; i23++) {
                        bArrCopyOf[i23] = (byte) (bArrCopyOf[i23] * iOptInt4);
                    }
                    break;
            }
        }
        return bArrCopyOf;
    }

    public byte[] a(byte[] bArr, byte[] bArr2, JSONArray jSONArray) {
        if (bArr2.length == 16) {
            byte[] bArr3 = new byte[bArr.length];
            byte[] bArrCopyOf = Arrays.copyOf(bArr2, 16);
            for (int i10 = 0; i10 < bArr.length; i10 += 16) {
                byte[] bArrA = a(bArrCopyOf, jSONArray);
                int iMin = Math.min(16, bArr.length - i10);
                for (int i11 = 0; i11 < iMin; i11++) {
                    int i12 = i10 + i11;
                    bArr3[i12] = (byte) (bArr[i12] ^ bArrA[i11]);
                }
                for (int i13 = 15; i13 >= 0; i13--) {
                    byte b10 = (byte) (bArrCopyOf[i13] + 1);
                    bArrCopyOf[i13] = b10;
                    if (b10 != 0) {
                        break;
                    }
                }
            }
            return bArr3;
        }
        throw new IllegalArgumentException("IV length must be 16 bytes");
    }
}
