package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import android.util.Base64;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.mbridge.msdk.foundation.tools.q0;
import com.prism.gaia.download.j;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import org.apache.http.HttpStatus;
import org.objectweb.asm.Opcodes;

/* JADX INFO: loaded from: classes5.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f154276a = {99, 124, 119, 123, 242, 107, 111, Opcodes.MULTIANEWARRAY, 48, 1, 103, 43, f3.d.f200563l, 215, Opcodes.LOOKUPSWITCH, 118, 202, 130, 201, 125, 250, 89, 71, 240, Opcodes.LRETURN, 212, Opcodes.IF_ICMPGE, Opcodes.DRETURN, 156, Opcodes.IF_ICMPLE, 114, 192, Opcodes.INVOKESPECIAL, 253, Opcodes.I2S, 38, 54, 63, 247, 204, 52, 165, 229, 241, 113, 216, 49, 21, 4, 199, 35, 195, 24, 150, 5, 154, 7, 18, 128, 226, 235, 39, 178, 117, 9, 131, 44, 26, 27, 110, 90, 160, 82, 59, 214, Opcodes.PUTSTATIC, 41, 227, 47, 132, 83, 209, 0, 237, 32, 252, Opcodes.RETURN, 91, 106, 203, 190, 57, 74, 76, 88, 207, 208, 239, Opcodes.TABLESWITCH, 251, 67, 77, 51, Opcodes.I2L, 69, f3.d.f200561j, 2, 127, 80, 60, Opcodes.IF_ICMPEQ, Opcodes.JSR, 81, Opcodes.IF_ICMPGT, 64, Opcodes.D2L, Opcodes.I2C, 157, 56, 245, Opcodes.NEWARRAY, Opcodes.INVOKEVIRTUAL, DefaultImageHeaderParser.f139853j, 33, 16, 255, 243, 210, HttpStatus.SC_RESET_CONTENT, 12, 19, 236, 95, Opcodes.DCMPL, 68, 23, j.b.f164765r0, Opcodes.GOTO, 126, 61, 100, 93, 25, 115, 96, 129, 79, 220, 34, 42, Opcodes.D2F, Opcodes.L2I, 70, 238, Opcodes.INVOKESTATIC, 20, 222, 94, 11, 219, 224, 50, 58, 10, 73, 6, 36, 92, 194, 211, Opcodes.IRETURN, 98, Opcodes.I2B, Opcodes.FCMPL, 228, 121, 231, 200, 55, 109, Opcodes.F2D, 213, 78, Opcodes.RET, 108, 86, 244, 234, 101, 122, Opcodes.FRETURN, 8, Opcodes.INVOKEDYNAMIC, 120, 37, 46, 28, Opcodes.IF_ACMPNE, Opcodes.GETFIELD, 198, 232, 221, 116, 31, 75, 189, Opcodes.F2I, 138, 112, 62, Opcodes.PUTFIELD, 102, 72, 3, 246, 14, 97, 53, 87, Opcodes.INVOKEINTERFACE, 134, 193, 29, 158, 225, 248, Opcodes.DCMPG, 17, 105, DefaultImageHeaderParser.f139854k, Opcodes.D2I, Opcodes.LCMP, 155, 30, 135, 233, 206, 85, 40, 223, Opcodes.F2L, Opcodes.IF_ICMPLT, Opcodes.L2F, 13, Opcodes.ATHROW, 230, 66, 104, 65, 153, 45, 15, Opcodes.ARETURN, 84, Opcodes.NEW, 22};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[][] f154277b;

    public h(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, Object obj, List<Object> list) {
        if (obj == null) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("886"))) {
            return a(obj, list);
        }
        if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("887"))) {
            return f(obj, list);
        }
        if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("888"))) {
            return e(obj, list);
        }
        if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("889"))) {
            return h(obj, list);
        }
        if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("890"))) {
            return b(obj, list);
        }
        if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("891"))) {
            return c(obj, list);
        }
        if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("892"))) {
            return i(obj, list);
        }
        if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("893"))) {
            return g(obj, list);
        }
        if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("894"))) {
            return d(obj, list);
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a c(Object obj, List<Object> list) {
        if (obj == null || !(obj instanceof String) || list == null || list.size() != 1) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        byte[] bArrDecode = Base64.decode(obj.toString(), 10);
        if (bArrDecode.length < 16) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        if (bArrDecode.length > 16) {
            bArrDecode = Arrays.copyOf(bArrDecode, 16);
        }
        int i10 = Integer.parseInt(list.get(0).toString()) % 8;
        for (int i11 = 0; i11 < 16; i11++) {
            int i12 = bArrDecode[i11] & 255;
            bArrDecode[i11] = (byte) ((i12 >>> (8 - i10)) | (i12 << i10));
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Base64.encodeToString(bArrDecode, 10));
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a d(Object obj, List<Object> list) {
        if (obj == null || !(obj instanceof String) || list == null || list.size() != 1) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        byte[] bArrDecode = Base64.decode(obj.toString(), 10);
        if (bArrDecode.length < 16) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        if (bArrDecode.length > 16) {
            bArrDecode = Arrays.copyOf(bArrDecode, 16);
        }
        int i10 = ((Integer.parseInt(list.get(0).toString()) % 128) * 2) + 1;
        for (int i11 = 0; i11 < 16; i11++) {
            bArrDecode[i11] = (byte) (bArrDecode[i11] * i10);
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Base64.encodeToString(bArrDecode, 10));
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a e(Object obj, List<Object> list) {
        if (obj == null || !(obj instanceof String) || list == null || list.size() != 1) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        byte[] bArrDecode = Base64.decode(obj.toString(), 10);
        if (bArrDecode.length < 16) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        if (bArrDecode.length > 16) {
            bArrDecode = Arrays.copyOf(bArrDecode, 16);
        }
        int i10 = Integer.parseInt(list.get(0).toString()) % 16;
        if (i10 > 0) {
            byte[] bArrCopyOf = Arrays.copyOf(bArrDecode, 16);
            for (int i11 = 0; i11 < 16; i11++) {
                bArrDecode[i11] = bArrCopyOf[(i11 + i10) % 16];
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Base64.encodeToString(bArrDecode, 10));
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a f(Object obj, List<Object> list) {
        if (obj == null || !(obj instanceof String) || list == null || list.size() != 1) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        byte[] bArrDecode = Base64.decode(obj.toString(), 10);
        if (bArrDecode.length < 16) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        if (bArrDecode.length > 16) {
            bArrDecode = Arrays.copyOf(bArrDecode, 16);
        }
        for (int i10 = 0; i10 < 16; i10++) {
            bArrDecode[i10] = (byte) this.f154276a[bArrDecode[i10] & 255];
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Base64.encodeToString(bArrDecode, 10));
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a g(Object obj, List<Object> list) {
        if (obj != null && (obj instanceof String) && list != null) {
            if (list.size() == 1) {
                byte[] bArrDecode = Base64.decode(obj.toString(), 10);
                if (bArrDecode.length < 16) {
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
                }
                if (bArrDecode.length > 16) {
                    bArrDecode = Arrays.copyOf(bArrDecode, 16);
                }
                int i10 = Integer.parseInt(list.get(0).toString()) % 16;
                int i11 = i10 != 0 ? i10 : 1;
                for (int i12 = 0; i12 < 16; i12 += 2) {
                    int i13 = (i12 + i11) % 16;
                    byte b10 = bArrDecode[i12];
                    bArrDecode[i12] = bArrDecode[i13];
                    bArrDecode[i13] = b10;
                }
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Base64.encodeToString(bArrDecode, 10));
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a h(Object obj, List<Object> list) {
        if (obj == null || !(obj instanceof String) || list == null || list.size() != 1) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        byte[] bArrDecode = Base64.decode(obj.toString(), 10);
        if (bArrDecode.length < 16) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        if (bArrDecode.length > 16) {
            bArrDecode = Arrays.copyOf(bArrDecode, 16);
        }
        for (int i10 = 0; i10 < 16; i10++) {
            bArrDecode[i10] = (byte) (bArrDecode[i10] ^ ((byte) Integer.parseInt(list.get(0).toString())));
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Base64.encodeToString(bArrDecode, 10));
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a i(Object obj, List<Object> list) {
        if (obj == null || !(obj instanceof String) || list == null || list.size() != 1) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        byte[] bArrDecode = Base64.decode(obj.toString(), 10);
        if (bArrDecode.length < 16) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        if (bArrDecode.length > 16) {
            bArrDecode = Arrays.copyOf(bArrDecode, 16);
        }
        int i10 = 0;
        while (i10 < 16) {
            int i11 = i10 + 1;
            bArrDecode[i10] = (byte) (bArrDecode[i10] ^ bArrDecode[i11 % 16]);
            i10 = i11;
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Base64.encodeToString(bArrDecode, 10));
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        return TextUtils.isEmpty(str) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.c() : b(str) ? b(str, obj, list) : com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    private void a(String str) {
        this.f154277b = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 16, 16);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            for (int i10 = 0; i10 < 16; i10++) {
                System.arraycopy(messageDigest.digest((str + "_round_" + i10).getBytes(StandardCharsets.UTF_8)), 0, this.f154277b[i10], 0, 16);
            }
        } catch (Exception e10) {
            q0.b("OperatorEnMethod", e10.getMessage());
        }
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(Object obj, List<Object> list) {
        if (obj != null && (obj instanceof String) && list != null && list.size() == 1) {
            String string = obj.toString();
            byte[] bArrDecode = Base64.decode(string, 10);
            if (bArrDecode.length < 16) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
            }
            if (bArrDecode.length > 16) {
                bArrDecode = Arrays.copyOf(bArrDecode, 16);
            }
            a(string);
            byte[] bArr = this.f154277b[Integer.parseInt(list.get(0).toString()) % 16];
            for (int i10 = 0; i10 < 16; i10++) {
                bArrDecode[i10] = (byte) (bArrDecode[i10] ^ bArr[i10]);
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Base64.encodeToString(bArrDecode, 10));
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(Object obj, List<Object> list) {
        if (obj != null && (obj instanceof String) && list != null && list.size() == 1) {
            byte[] bArrDecode = Base64.decode(obj.toString(), 10);
            if (bArrDecode.length < 16) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
            }
            if (bArrDecode.length > 16) {
                bArrDecode = Arrays.copyOf(bArrDecode, 16);
            }
            for (int i10 = 0; i10 < 16; i10++) {
                bArrDecode[i10] = (byte) (Integer.parseInt(list.get(0).toString()) + bArrDecode[i10]);
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Base64.encodeToString(bArrDecode, 10));
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
    }

    private boolean b(String str) {
        return str.equals(com.mbridge.msdk.config.component.common.util.c.c("886")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("887")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("888")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("889")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("890")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("891")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("892")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("893")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("894"));
    }
}
