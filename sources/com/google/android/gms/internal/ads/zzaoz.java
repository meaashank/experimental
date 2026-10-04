package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaoz implements zzanz {
    private final XmlPullParserFactory zzi;
    private static final Pattern zzc = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern zzd = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern zze = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final Pattern zza = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern zzb = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    private static final Pattern zzf = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    private static final Pattern zzg = Pattern.compile("^(\\d+) (\\d+)$");
    private static final zzaox zzh = new zzaox(30.0f, 1, 1);

    public zzaoz() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.zzi = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    private static String[] zzc(String str) {
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return new String[0];
        }
        String str2 = zzfm.zza;
        return strTrim.split("\\s+", -1);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:198:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0388 A[Catch: zzanv -> 0x03dc, TryCatch #3 {zzanv -> 0x03dc, blocks: (B:172:0x02ef, B:174:0x030a, B:177:0x0320, B:179:0x0326, B:181:0x032c, B:202:0x0362, B:207:0x038b, B:209:0x0391, B:210:0x039a, B:203:0x0366, B:204:0x0383, B:205:0x0384, B:206:0x0388, B:211:0x039b, B:212:0x039c, B:213:0x03b9, B:176:0x0313, B:214:0x03ba, B:215:0x03db), top: B:237:0x02ef }] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0391 A[Catch: zzanv -> 0x03dc, TryCatch #3 {zzanv -> 0x03dc, blocks: (B:172:0x02ef, B:174:0x030a, B:177:0x0320, B:179:0x0326, B:181:0x032c, B:202:0x0362, B:207:0x038b, B:209:0x0391, B:210:0x039a, B:203:0x0366, B:204:0x0383, B:205:0x0384, B:206:0x0388, B:211:0x039b, B:212:0x039c, B:213:0x03b9, B:176:0x0313, B:214:0x03ba, B:215:0x03db), top: B:237:0x02ef }] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x039a A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r10v38 */
    /* JADX WARN: Type inference failed for: r10v39 */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r10v41 */
    /* JADX WARN: Type inference failed for: r10v42 */
    /* JADX WARN: Type inference failed for: r10v43 */
    /* JADX WARN: Type inference failed for: r10v44 */
    /* JADX WARN: Type inference failed for: r10v45 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r6v46 */
    /* JADX WARN: Type inference failed for: r6v48 */
    /* JADX WARN: Type inference failed for: r6v49 */
    /* JADX WARN: Type inference failed for: r6v51 */
    /* JADX WARN: Type inference failed for: r6v52 */
    /* JADX WARN: Type inference failed for: r6v53 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r6v90 */
    /* JADX WARN: Type inference failed for: r6v91 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.zzapc zzd(org.xmlpull.v1.XmlPullParser r17, com.google.android.gms.internal.ads.zzapc r18) {
        /*
            Method dump skipped, instruction units count: 1222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaoz.zzd(org.xmlpull.v1.XmlPullParser, com.google.android.gms.internal.ads.zzapc):com.google.android.gms.internal.ads.zzapc");
    }

    private static zzapc zze(@Nullable zzapc zzapcVar) {
        return zzapcVar == null ? new zzapc() : zzapcVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.text.Layout.Alignment zzf(java.lang.String r5) {
        /*
            java.lang.String r5 = com.google.android.gms.internal.ads.zzgts.zza(r5)
            int r0 = r5.hashCode()
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -1364013995: goto L38;
                case 100571: goto L2e;
                case 3317767: goto L24;
                case 108511772: goto L1a;
                case 109757538: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L42
        L10:
            java.lang.String r0 = "start"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = r4
            goto L43
        L1a:
            java.lang.String r0 = "right"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = r3
            goto L43
        L24:
            java.lang.String r0 = "left"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = 0
            goto L43
        L2e:
            java.lang.String r0 = "end"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = r2
            goto L43
        L38:
            java.lang.String r0 = "center"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = r1
            goto L43
        L42:
            r5 = -1
        L43:
            if (r5 == 0) goto L55
            if (r5 == r4) goto L55
            if (r5 == r3) goto L52
            if (r5 == r2) goto L52
            if (r5 == r1) goto L4f
            r5 = 0
            return r5
        L4f:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_CENTER
            return r5
        L52:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            return r5
        L55:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_NORMAL
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaoz.zzf(java.lang.String):android.text.Layout$Alignment");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static long zzg(java.lang.String r13, com.google.android.gms.internal.ads.zzaox r14) throws com.google.android.gms.internal.ads.zzanv {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaoz.zzg(java.lang.String, com.google.android.gms.internal.ads.zzaox):long");
    }

    @Override // com.google.android.gms.internal.ads.zzanz
    public final void zza(byte[] bArr, int i10, int i11, zzany zzanyVar, zzdu zzduVar) {
        zzant.zza(zzb(bArr, i10, i11), zzanyVar, zzduVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:52|(1:(5:55|435|59|67|(0)(0))(1:56))(1:58)|57|435|59|67|(0)(0)) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0311 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TRY_LEAVE, TryCatch #16 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:23:0x009b, B:25:0x00a3, B:29:0x00b9, B:31:0x00d4, B:33:0x00de, B:34:0x00e2, B:36:0x00ee, B:37:0x00f2, B:67:0x016c, B:85:0x01c7, B:88:0x01db, B:90:0x01e1, B:92:0x01e9, B:94:0x01f1, B:96:0x01f9, B:98:0x0201, B:100:0x0209, B:102:0x020f, B:104:0x0217, B:106:0x021f, B:108:0x0225, B:110:0x022b, B:112:0x0231, B:114:0x0239, B:117:0x0242, B:420:0x0767, B:118:0x0270, B:120:0x0276, B:122:0x027f, B:124:0x028e, B:126:0x029b, B:128:0x02b1, B:130:0x02b7, B:288:0x0569, B:133:0x02c2, B:136:0x02ce, B:272:0x0519, B:139:0x02ec, B:141:0x02f4, B:143:0x02fc, B:145:0x0304, B:150:0x0311, B:153:0x032a, B:155:0x0330, B:157:0x033d, B:179:0x03a4, B:181:0x03aa, B:183:0x03b0, B:185:0x03b8, B:187:0x03be, B:190:0x03d1, B:192:0x03d7, B:194:0x03e4, B:214:0x0459, B:216:0x0461, B:218:0x0467, B:220:0x046f, B:222:0x0475, B:242:0x04bb, B:244:0x04c3, B:270:0x050c, B:195:0x03ef, B:196:0x03f0, B:197:0x03f1, B:198:0x03fe, B:201:0x0406, B:204:0x0414, B:206:0x041a, B:208:0x0425, B:209:0x0439, B:210:0x043a, B:211:0x043b, B:212:0x0448, B:159:0x0346, B:160:0x0347, B:161:0x0348, B:163:0x0353, B:166:0x035d, B:169:0x0366, B:171:0x036c, B:173:0x0377, B:174:0x0389, B:175:0x038a, B:176:0x038b, B:177:0x0393, B:275:0x052c, B:277:0x0539, B:279:0x0544, B:281:0x054a, B:283:0x0556, B:293:0x0583, B:296:0x05a6, B:354:0x067f, B:332:0x0636, B:335:0x063f, B:395:0x06fa, B:342:0x0652, B:345:0x065c, B:349:0x066a, B:352:0x0671, B:353:0x0678, B:359:0x0696, B:363:0x06a2, B:367:0x06ab, B:375:0x06bd, B:378:0x06c6, B:382:0x06d1, B:384:0x06dd, B:386:0x06e2, B:70:0x0179, B:72:0x0185, B:75:0x018e, B:77:0x0194, B:79:0x019f, B:80:0x01ab, B:81:0x01ac, B:82:0x01ad, B:41:0x010e, B:43:0x011a, B:46:0x0126, B:48:0x012c, B:50:0x0133, B:52:0x0139, B:59:0x014e, B:66:0x0164, B:62:0x015b, B:65:0x0163, B:400:0x071c, B:402:0x0729, B:405:0x072d, B:407:0x0737, B:409:0x0741, B:413:0x0749, B:411:0x0746, B:416:0x075e, B:419:0x0764, B:425:0x0783), top: B:454:0x0008, inners: #0, #5, #9, #11, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03aa A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TryCatch #16 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:23:0x009b, B:25:0x00a3, B:29:0x00b9, B:31:0x00d4, B:33:0x00de, B:34:0x00e2, B:36:0x00ee, B:37:0x00f2, B:67:0x016c, B:85:0x01c7, B:88:0x01db, B:90:0x01e1, B:92:0x01e9, B:94:0x01f1, B:96:0x01f9, B:98:0x0201, B:100:0x0209, B:102:0x020f, B:104:0x0217, B:106:0x021f, B:108:0x0225, B:110:0x022b, B:112:0x0231, B:114:0x0239, B:117:0x0242, B:420:0x0767, B:118:0x0270, B:120:0x0276, B:122:0x027f, B:124:0x028e, B:126:0x029b, B:128:0x02b1, B:130:0x02b7, B:288:0x0569, B:133:0x02c2, B:136:0x02ce, B:272:0x0519, B:139:0x02ec, B:141:0x02f4, B:143:0x02fc, B:145:0x0304, B:150:0x0311, B:153:0x032a, B:155:0x0330, B:157:0x033d, B:179:0x03a4, B:181:0x03aa, B:183:0x03b0, B:185:0x03b8, B:187:0x03be, B:190:0x03d1, B:192:0x03d7, B:194:0x03e4, B:214:0x0459, B:216:0x0461, B:218:0x0467, B:220:0x046f, B:222:0x0475, B:242:0x04bb, B:244:0x04c3, B:270:0x050c, B:195:0x03ef, B:196:0x03f0, B:197:0x03f1, B:198:0x03fe, B:201:0x0406, B:204:0x0414, B:206:0x041a, B:208:0x0425, B:209:0x0439, B:210:0x043a, B:211:0x043b, B:212:0x0448, B:159:0x0346, B:160:0x0347, B:161:0x0348, B:163:0x0353, B:166:0x035d, B:169:0x0366, B:171:0x036c, B:173:0x0377, B:174:0x0389, B:175:0x038a, B:176:0x038b, B:177:0x0393, B:275:0x052c, B:277:0x0539, B:279:0x0544, B:281:0x054a, B:283:0x0556, B:293:0x0583, B:296:0x05a6, B:354:0x067f, B:332:0x0636, B:335:0x063f, B:395:0x06fa, B:342:0x0652, B:345:0x065c, B:349:0x066a, B:352:0x0671, B:353:0x0678, B:359:0x0696, B:363:0x06a2, B:367:0x06ab, B:375:0x06bd, B:378:0x06c6, B:382:0x06d1, B:384:0x06dd, B:386:0x06e2, B:70:0x0179, B:72:0x0185, B:75:0x018e, B:77:0x0194, B:79:0x019f, B:80:0x01ab, B:81:0x01ac, B:82:0x01ad, B:41:0x010e, B:43:0x011a, B:46:0x0126, B:48:0x012c, B:50:0x0133, B:52:0x0139, B:59:0x014e, B:66:0x0164, B:62:0x015b, B:65:0x0163, B:400:0x071c, B:402:0x0729, B:405:0x072d, B:407:0x0737, B:409:0x0741, B:413:0x0749, B:411:0x0746, B:416:0x075e, B:419:0x0764, B:425:0x0783), top: B:454:0x0008, inners: #0, #5, #9, #11, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03be A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TRY_LEAVE, TryCatch #16 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:23:0x009b, B:25:0x00a3, B:29:0x00b9, B:31:0x00d4, B:33:0x00de, B:34:0x00e2, B:36:0x00ee, B:37:0x00f2, B:67:0x016c, B:85:0x01c7, B:88:0x01db, B:90:0x01e1, B:92:0x01e9, B:94:0x01f1, B:96:0x01f9, B:98:0x0201, B:100:0x0209, B:102:0x020f, B:104:0x0217, B:106:0x021f, B:108:0x0225, B:110:0x022b, B:112:0x0231, B:114:0x0239, B:117:0x0242, B:420:0x0767, B:118:0x0270, B:120:0x0276, B:122:0x027f, B:124:0x028e, B:126:0x029b, B:128:0x02b1, B:130:0x02b7, B:288:0x0569, B:133:0x02c2, B:136:0x02ce, B:272:0x0519, B:139:0x02ec, B:141:0x02f4, B:143:0x02fc, B:145:0x0304, B:150:0x0311, B:153:0x032a, B:155:0x0330, B:157:0x033d, B:179:0x03a4, B:181:0x03aa, B:183:0x03b0, B:185:0x03b8, B:187:0x03be, B:190:0x03d1, B:192:0x03d7, B:194:0x03e4, B:214:0x0459, B:216:0x0461, B:218:0x0467, B:220:0x046f, B:222:0x0475, B:242:0x04bb, B:244:0x04c3, B:270:0x050c, B:195:0x03ef, B:196:0x03f0, B:197:0x03f1, B:198:0x03fe, B:201:0x0406, B:204:0x0414, B:206:0x041a, B:208:0x0425, B:209:0x0439, B:210:0x043a, B:211:0x043b, B:212:0x0448, B:159:0x0346, B:160:0x0347, B:161:0x0348, B:163:0x0353, B:166:0x035d, B:169:0x0366, B:171:0x036c, B:173:0x0377, B:174:0x0389, B:175:0x038a, B:176:0x038b, B:177:0x0393, B:275:0x052c, B:277:0x0539, B:279:0x0544, B:281:0x054a, B:283:0x0556, B:293:0x0583, B:296:0x05a6, B:354:0x067f, B:332:0x0636, B:335:0x063f, B:395:0x06fa, B:342:0x0652, B:345:0x065c, B:349:0x066a, B:352:0x0671, B:353:0x0678, B:359:0x0696, B:363:0x06a2, B:367:0x06ab, B:375:0x06bd, B:378:0x06c6, B:382:0x06d1, B:384:0x06dd, B:386:0x06e2, B:70:0x0179, B:72:0x0185, B:75:0x018e, B:77:0x0194, B:79:0x019f, B:80:0x01ab, B:81:0x01ac, B:82:0x01ad, B:41:0x010e, B:43:0x011a, B:46:0x0126, B:48:0x012c, B:50:0x0133, B:52:0x0139, B:59:0x014e, B:66:0x0164, B:62:0x015b, B:65:0x0163, B:400:0x071c, B:402:0x0729, B:405:0x072d, B:407:0x0737, B:409:0x0741, B:413:0x0749, B:411:0x0746, B:416:0x075e, B:419:0x0764, B:425:0x0783), top: B:454:0x0008, inners: #0, #5, #9, #11, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0461 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TryCatch #16 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:23:0x009b, B:25:0x00a3, B:29:0x00b9, B:31:0x00d4, B:33:0x00de, B:34:0x00e2, B:36:0x00ee, B:37:0x00f2, B:67:0x016c, B:85:0x01c7, B:88:0x01db, B:90:0x01e1, B:92:0x01e9, B:94:0x01f1, B:96:0x01f9, B:98:0x0201, B:100:0x0209, B:102:0x020f, B:104:0x0217, B:106:0x021f, B:108:0x0225, B:110:0x022b, B:112:0x0231, B:114:0x0239, B:117:0x0242, B:420:0x0767, B:118:0x0270, B:120:0x0276, B:122:0x027f, B:124:0x028e, B:126:0x029b, B:128:0x02b1, B:130:0x02b7, B:288:0x0569, B:133:0x02c2, B:136:0x02ce, B:272:0x0519, B:139:0x02ec, B:141:0x02f4, B:143:0x02fc, B:145:0x0304, B:150:0x0311, B:153:0x032a, B:155:0x0330, B:157:0x033d, B:179:0x03a4, B:181:0x03aa, B:183:0x03b0, B:185:0x03b8, B:187:0x03be, B:190:0x03d1, B:192:0x03d7, B:194:0x03e4, B:214:0x0459, B:216:0x0461, B:218:0x0467, B:220:0x046f, B:222:0x0475, B:242:0x04bb, B:244:0x04c3, B:270:0x050c, B:195:0x03ef, B:196:0x03f0, B:197:0x03f1, B:198:0x03fe, B:201:0x0406, B:204:0x0414, B:206:0x041a, B:208:0x0425, B:209:0x0439, B:210:0x043a, B:211:0x043b, B:212:0x0448, B:159:0x0346, B:160:0x0347, B:161:0x0348, B:163:0x0353, B:166:0x035d, B:169:0x0366, B:171:0x036c, B:173:0x0377, B:174:0x0389, B:175:0x038a, B:176:0x038b, B:177:0x0393, B:275:0x052c, B:277:0x0539, B:279:0x0544, B:281:0x054a, B:283:0x0556, B:293:0x0583, B:296:0x05a6, B:354:0x067f, B:332:0x0636, B:335:0x063f, B:395:0x06fa, B:342:0x0652, B:345:0x065c, B:349:0x066a, B:352:0x0671, B:353:0x0678, B:359:0x0696, B:363:0x06a2, B:367:0x06ab, B:375:0x06bd, B:378:0x06c6, B:382:0x06d1, B:384:0x06dd, B:386:0x06e2, B:70:0x0179, B:72:0x0185, B:75:0x018e, B:77:0x0194, B:79:0x019f, B:80:0x01ab, B:81:0x01ac, B:82:0x01ad, B:41:0x010e, B:43:0x011a, B:46:0x0126, B:48:0x012c, B:50:0x0133, B:52:0x0139, B:59:0x014e, B:66:0x0164, B:62:0x015b, B:65:0x0163, B:400:0x071c, B:402:0x0729, B:405:0x072d, B:407:0x0737, B:409:0x0741, B:413:0x0749, B:411:0x0746, B:416:0x075e, B:419:0x0764, B:425:0x0783), top: B:454:0x0008, inners: #0, #5, #9, #11, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0475 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TRY_LEAVE, TryCatch #16 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:23:0x009b, B:25:0x00a3, B:29:0x00b9, B:31:0x00d4, B:33:0x00de, B:34:0x00e2, B:36:0x00ee, B:37:0x00f2, B:67:0x016c, B:85:0x01c7, B:88:0x01db, B:90:0x01e1, B:92:0x01e9, B:94:0x01f1, B:96:0x01f9, B:98:0x0201, B:100:0x0209, B:102:0x020f, B:104:0x0217, B:106:0x021f, B:108:0x0225, B:110:0x022b, B:112:0x0231, B:114:0x0239, B:117:0x0242, B:420:0x0767, B:118:0x0270, B:120:0x0276, B:122:0x027f, B:124:0x028e, B:126:0x029b, B:128:0x02b1, B:130:0x02b7, B:288:0x0569, B:133:0x02c2, B:136:0x02ce, B:272:0x0519, B:139:0x02ec, B:141:0x02f4, B:143:0x02fc, B:145:0x0304, B:150:0x0311, B:153:0x032a, B:155:0x0330, B:157:0x033d, B:179:0x03a4, B:181:0x03aa, B:183:0x03b0, B:185:0x03b8, B:187:0x03be, B:190:0x03d1, B:192:0x03d7, B:194:0x03e4, B:214:0x0459, B:216:0x0461, B:218:0x0467, B:220:0x046f, B:222:0x0475, B:242:0x04bb, B:244:0x04c3, B:270:0x050c, B:195:0x03ef, B:196:0x03f0, B:197:0x03f1, B:198:0x03fe, B:201:0x0406, B:204:0x0414, B:206:0x041a, B:208:0x0425, B:209:0x0439, B:210:0x043a, B:211:0x043b, B:212:0x0448, B:159:0x0346, B:160:0x0347, B:161:0x0348, B:163:0x0353, B:166:0x035d, B:169:0x0366, B:171:0x036c, B:173:0x0377, B:174:0x0389, B:175:0x038a, B:176:0x038b, B:177:0x0393, B:275:0x052c, B:277:0x0539, B:279:0x0544, B:281:0x054a, B:283:0x0556, B:293:0x0583, B:296:0x05a6, B:354:0x067f, B:332:0x0636, B:335:0x063f, B:395:0x06fa, B:342:0x0652, B:345:0x065c, B:349:0x066a, B:352:0x0671, B:353:0x0678, B:359:0x0696, B:363:0x06a2, B:367:0x06ab, B:375:0x06bd, B:378:0x06c6, B:382:0x06d1, B:384:0x06dd, B:386:0x06e2, B:70:0x0179, B:72:0x0185, B:75:0x018e, B:77:0x0194, B:79:0x019f, B:80:0x01ab, B:81:0x01ac, B:82:0x01ad, B:41:0x010e, B:43:0x011a, B:46:0x0126, B:48:0x012c, B:50:0x0133, B:52:0x0139, B:59:0x014e, B:66:0x0164, B:62:0x015b, B:65:0x0163, B:400:0x071c, B:402:0x0729, B:405:0x072d, B:407:0x0737, B:409:0x0741, B:413:0x0749, B:411:0x0746, B:416:0x075e, B:419:0x0764, B:425:0x0783), top: B:454:0x0008, inners: #0, #5, #9, #11, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x04c3 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TRY_LEAVE, TryCatch #16 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:23:0x009b, B:25:0x00a3, B:29:0x00b9, B:31:0x00d4, B:33:0x00de, B:34:0x00e2, B:36:0x00ee, B:37:0x00f2, B:67:0x016c, B:85:0x01c7, B:88:0x01db, B:90:0x01e1, B:92:0x01e9, B:94:0x01f1, B:96:0x01f9, B:98:0x0201, B:100:0x0209, B:102:0x020f, B:104:0x0217, B:106:0x021f, B:108:0x0225, B:110:0x022b, B:112:0x0231, B:114:0x0239, B:117:0x0242, B:420:0x0767, B:118:0x0270, B:120:0x0276, B:122:0x027f, B:124:0x028e, B:126:0x029b, B:128:0x02b1, B:130:0x02b7, B:288:0x0569, B:133:0x02c2, B:136:0x02ce, B:272:0x0519, B:139:0x02ec, B:141:0x02f4, B:143:0x02fc, B:145:0x0304, B:150:0x0311, B:153:0x032a, B:155:0x0330, B:157:0x033d, B:179:0x03a4, B:181:0x03aa, B:183:0x03b0, B:185:0x03b8, B:187:0x03be, B:190:0x03d1, B:192:0x03d7, B:194:0x03e4, B:214:0x0459, B:216:0x0461, B:218:0x0467, B:220:0x046f, B:222:0x0475, B:242:0x04bb, B:244:0x04c3, B:270:0x050c, B:195:0x03ef, B:196:0x03f0, B:197:0x03f1, B:198:0x03fe, B:201:0x0406, B:204:0x0414, B:206:0x041a, B:208:0x0425, B:209:0x0439, B:210:0x043a, B:211:0x043b, B:212:0x0448, B:159:0x0346, B:160:0x0347, B:161:0x0348, B:163:0x0353, B:166:0x035d, B:169:0x0366, B:171:0x036c, B:173:0x0377, B:174:0x0389, B:175:0x038a, B:176:0x038b, B:177:0x0393, B:275:0x052c, B:277:0x0539, B:279:0x0544, B:281:0x054a, B:283:0x0556, B:293:0x0583, B:296:0x05a6, B:354:0x067f, B:332:0x0636, B:335:0x063f, B:395:0x06fa, B:342:0x0652, B:345:0x065c, B:349:0x066a, B:352:0x0671, B:353:0x0678, B:359:0x0696, B:363:0x06a2, B:367:0x06ab, B:375:0x06bd, B:378:0x06c6, B:382:0x06d1, B:384:0x06dd, B:386:0x06e2, B:70:0x0179, B:72:0x0185, B:75:0x018e, B:77:0x0194, B:79:0x019f, B:80:0x01ab, B:81:0x01ac, B:82:0x01ad, B:41:0x010e, B:43:0x011a, B:46:0x0126, B:48:0x012c, B:50:0x0133, B:52:0x0139, B:59:0x014e, B:66:0x0164, B:62:0x015b, B:65:0x0163, B:400:0x071c, B:402:0x0729, B:405:0x072d, B:407:0x0737, B:409:0x0741, B:413:0x0749, B:411:0x0746, B:416:0x075e, B:419:0x0764, B:425:0x0783), top: B:454:0x0008, inners: #0, #5, #9, #11, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0575 A[LOOP:1: B:120:0x0276->B:291:0x0575, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x06e2 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, zzanv -> 0x06e6, TRY_LEAVE, TryCatch #8 {zzanv -> 0x06e6, blocks: (B:384:0x06dd, B:386:0x06e2), top: B:441:0x06dd }] */
    /* JADX WARN: Removed duplicated region for block: B:473:0x056f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0179 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TryCatch #16 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:23:0x009b, B:25:0x00a3, B:29:0x00b9, B:31:0x00d4, B:33:0x00de, B:34:0x00e2, B:36:0x00ee, B:37:0x00f2, B:67:0x016c, B:85:0x01c7, B:88:0x01db, B:90:0x01e1, B:92:0x01e9, B:94:0x01f1, B:96:0x01f9, B:98:0x0201, B:100:0x0209, B:102:0x020f, B:104:0x0217, B:106:0x021f, B:108:0x0225, B:110:0x022b, B:112:0x0231, B:114:0x0239, B:117:0x0242, B:420:0x0767, B:118:0x0270, B:120:0x0276, B:122:0x027f, B:124:0x028e, B:126:0x029b, B:128:0x02b1, B:130:0x02b7, B:288:0x0569, B:133:0x02c2, B:136:0x02ce, B:272:0x0519, B:139:0x02ec, B:141:0x02f4, B:143:0x02fc, B:145:0x0304, B:150:0x0311, B:153:0x032a, B:155:0x0330, B:157:0x033d, B:179:0x03a4, B:181:0x03aa, B:183:0x03b0, B:185:0x03b8, B:187:0x03be, B:190:0x03d1, B:192:0x03d7, B:194:0x03e4, B:214:0x0459, B:216:0x0461, B:218:0x0467, B:220:0x046f, B:222:0x0475, B:242:0x04bb, B:244:0x04c3, B:270:0x050c, B:195:0x03ef, B:196:0x03f0, B:197:0x03f1, B:198:0x03fe, B:201:0x0406, B:204:0x0414, B:206:0x041a, B:208:0x0425, B:209:0x0439, B:210:0x043a, B:211:0x043b, B:212:0x0448, B:159:0x0346, B:160:0x0347, B:161:0x0348, B:163:0x0353, B:166:0x035d, B:169:0x0366, B:171:0x036c, B:173:0x0377, B:174:0x0389, B:175:0x038a, B:176:0x038b, B:177:0x0393, B:275:0x052c, B:277:0x0539, B:279:0x0544, B:281:0x054a, B:283:0x0556, B:293:0x0583, B:296:0x05a6, B:354:0x067f, B:332:0x0636, B:335:0x063f, B:395:0x06fa, B:342:0x0652, B:345:0x065c, B:349:0x066a, B:352:0x0671, B:353:0x0678, B:359:0x0696, B:363:0x06a2, B:367:0x06ab, B:375:0x06bd, B:378:0x06c6, B:382:0x06d1, B:384:0x06dd, B:386:0x06e2, B:70:0x0179, B:72:0x0185, B:75:0x018e, B:77:0x0194, B:79:0x019f, B:80:0x01ab, B:81:0x01ac, B:82:0x01ad, B:41:0x010e, B:43:0x011a, B:46:0x0126, B:48:0x012c, B:50:0x0133, B:52:0x0139, B:59:0x014e, B:66:0x0164, B:62:0x015b, B:65:0x0163, B:400:0x071c, B:402:0x0729, B:405:0x072d, B:407:0x0737, B:409:0x0741, B:413:0x0749, B:411:0x0746, B:416:0x075e, B:419:0x0764, B:425:0x0783), top: B:454:0x0008, inners: #0, #5, #9, #11, #15 }] */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v73, types: [com.google.android.gms.internal.ads.zzapa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v75 */
    /* JADX WARN: Type inference failed for: r10v5, types: [com.google.android.gms.internal.ads.zzaoy] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v10 */
    /* JADX WARN: Type inference failed for: r17v16 */
    /* JADX WARN: Type inference failed for: r17v17 */
    /* JADX WARN: Type inference failed for: r17v18 */
    /* JADX WARN: Type inference failed for: r17v19 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v20 */
    /* JADX WARN: Type inference failed for: r17v21 */
    /* JADX WARN: Type inference failed for: r17v22 */
    /* JADX WARN: Type inference failed for: r17v23 */
    /* JADX WARN: Type inference failed for: r17v24 */
    /* JADX WARN: Type inference failed for: r17v25 */
    /* JADX WARN: Type inference failed for: r17v26 */
    /* JADX WARN: Type inference failed for: r17v27 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r49v1, types: [com.google.android.gms.internal.ads.zzapc, java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.zzanu zzb(byte[] r47, int r48, int r49) {
        /*
            Method dump skipped, instruction units count: 1966
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaoz.zzb(byte[], int, int):com.google.android.gms.internal.ads.zzanu");
    }
}
