package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes5.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c f154280a;

    public j(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.f154280a = cVar;
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, Object obj, Object obj2) {
        try {
            if (com.mbridge.msdk.config.component.common.util.c.c("870").equals(str)) {
                return a(obj2);
            }
            if (com.mbridge.msdk.config.component.common.util.c.c("901").equals(str)) {
                return b(obj2);
            }
            File file = new File(String.valueOf(obj));
            if (!file.exists()) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
            }
            if (!com.mbridge.msdk.config.component.common.util.c.c("871").equals(str) && !com.mbridge.msdk.config.component.common.util.c.c("872").equals(str)) {
                if (com.mbridge.msdk.config.component.common.util.c.c("873").equals(str)) {
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Long.valueOf(file.length()));
                }
                if (com.mbridge.msdk.config.component.common.util.c.c("874").equals(str)) {
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a(file));
                }
                q0.b("OperatorFile", "Unknown file operation: " + str);
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Long.valueOf(file.lastModified()));
        } catch (Exception e10) {
            StringBuilder sbA = androidx.activity.result.i.a("Error handling file operation: ", str, U6.j.f68738d);
            sbA.append(e10.getMessage());
            q0.b("OperatorFile", sbA.toString(), e10);
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, Object obj2) {
        return TextUtils.isEmpty(str) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.c() : a(str) ? b(str, obj, obj2) : com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(java.lang.Object r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof java.util.List
            r1 = 0
            if (r0 == 0) goto L5c
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r0 = r5.get(r1)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r5.size()
            r2 = 1
            if (r1 <= r2) goto L1f
            java.lang.Object r5 = r5.get(r2)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            goto L21
        L1f:
            java.lang.String r5 = "1"
        L21:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L55
            java.lang.String r1 = "null"
            boolean r3 = r0.equalsIgnoreCase(r1)
            if (r3 == 0) goto L30
            goto L55
        L30:
            boolean r3 = android.text.TextUtils.isEmpty(r5)
            if (r3 != 0) goto L42
            boolean r1 = r5.equalsIgnoreCase(r1)
            if (r1 == 0) goto L3d
            goto L42
        L3d:
            int r5 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.Throwable -> L42
            goto L43
        L42:
            r5 = r2
        L43:
            if (r5 != r2) goto L4a
            java.lang.String r5 = com.mbridge.msdk.config.component.common.file.a.c(r0)
            goto L4e
        L4a:
            java.lang.String r5 = com.mbridge.msdk.config.component.common.file.a.g(r0)
        L4e:
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            r1 = r5 ^ 1
            goto L5c
        L55:
            java.lang.String r5 = ""
            com.mbridge.msdk.config.component.common.express.operator.parts.a r5 = com.mbridge.msdk.config.component.common.express.operator.parts.a.a(r5)
            return r5
        L5c:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            com.mbridge.msdk.config.component.common.express.operator.parts.a r5 = com.mbridge.msdk.config.component.common.express.operator.parts.a.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.config.component.common.express.operator.j.a(java.lang.Object):com.mbridge.msdk.config.component.common.express.operator.parts.a");
    }

    private String a(File file) {
        int i10;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bArr = new byte[8192];
            FileInputStream fileInputStream = new FileInputStream(file);
            while (true) {
                int i11 = fileInputStream.read(bArr);
                if (i11 == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, i11);
            }
            fileInputStream.close();
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : bArrDigest) {
                sb2.append(Integer.toString((b10 & 255) + 256, 16).substring(1));
            }
            return sb2.toString();
        } catch (Exception e10) {
            com.mbridge.msdk.config.component.common.express.node.m.a(e10, new StringBuilder("Calculate MD5 error: "), "OperatorFile");
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(java.lang.Object r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof java.util.List
            java.lang.String r1 = ""
            if (r0 == 0) goto L60
            java.util.List r6 = (java.util.List) r6
            r0 = 0
            java.lang.Object r0 = r6.get(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r2 = r6.size()
            r3 = 1
            if (r2 <= r3) goto L21
            java.lang.Object r6 = r6.get(r3)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            goto L23
        L21:
            java.lang.String r6 = "1"
        L23:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L67
            java.lang.String r2 = "null"
            boolean r4 = r0.equalsIgnoreCase(r2)
            if (r4 == 0) goto L32
            goto L67
        L32:
            boolean r4 = android.text.TextUtils.isEmpty(r6)
            if (r4 != 0) goto L44
            boolean r2 = r6.equalsIgnoreCase(r2)
            if (r2 == 0) goto L3f
            goto L44
        L3f:
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.Throwable -> L44
            goto L45
        L44:
            r6 = r3
        L45:
            if (r6 != r3) goto L62
            java.lang.String r6 = "template"
            java.lang.String r2 = "/"
            java.lang.String r6 = r6.concat(r2)
            java.lang.String r6 = r6.concat(r0)
            boolean r0 = com.mbridge.msdk.config.component.common.file.a.j(r6)
            if (r0 == 0) goto L60
            java.lang.String r0 = "assets://"
            java.lang.String r6 = r0.concat(r6)
            goto L6c
        L60:
            r6 = r1
            goto L6c
        L62:
            java.lang.String r6 = com.mbridge.msdk.config.component.common.file.a.g(r0)
            goto L6c
        L67:
            com.mbridge.msdk.config.component.common.express.operator.parts.a r6 = com.mbridge.msdk.config.component.common.express.operator.parts.a.a(r1)
            return r6
        L6c:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L73
            goto L74
        L73:
            r1 = r6
        L74:
            com.mbridge.msdk.config.component.common.express.operator.parts.a r6 = com.mbridge.msdk.config.component.common.express.operator.parts.a.a(r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.config.component.common.express.operator.j.b(java.lang.Object):com.mbridge.msdk.config.component.common.express.operator.parts.a");
    }

    private boolean a(String str) {
        return str.equals(com.mbridge.msdk.config.component.common.util.c.c("870")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("871")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("872")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("873")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("874")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("901"));
    }
}
