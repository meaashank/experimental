package com.bytedance.sdk.component.Mm.NOt;

import Ib.b;
import android.text.TextUtils;
import com.bytedance.sdk.component.NOt.ZRu.Ht;
import com.bytedance.sdk.component.NOt.ZRu.Vor;
import com.bytedance.sdk.component.NOt.ZRu.ZH;
import com.bytedance.sdk.component.NOt.ZRu.edo;
import com.bytedance.sdk.component.NOt.ZRu.oK;
import com.bytedance.sdk.component.NOt.ZRu.sAl;
import com.bytedance.sdk.component.NOt.ZRu.yBV;
import com.bytedance.sdk.component.utils.lp;
import com.prism.commons.utils.C3843g;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class uR extends mZ {
    edo ZRu;

    public uR(ZH zh) {
        super(zh);
        this.ZRu = null;
    }

    private byte[] TFq(String str) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream;
        GZIPOutputStream gZIPOutputStream2 = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        byte[] byteArray = new byte[0];
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                try {
                    gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                } catch (IOException e10) {
                    e = e10;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                gZIPOutputStream.write(str.getBytes(C3843g.f162098b));
                try {
                    gZIPOutputStream.close();
                } catch (IOException e11) {
                    lp.ZRu("PostExecutor", e11.toString());
                }
                byteArray = byteArrayOutputStream.toByteArray();
            } catch (IOException e12) {
                e = e12;
                gZIPOutputStream2 = gZIPOutputStream;
                lp.ZRu("PostExecutor", e.toString());
                if (gZIPOutputStream2 != null) {
                    try {
                        gZIPOutputStream2.close();
                    } catch (IOException e13) {
                        lp.ZRu("PostExecutor", e13.toString());
                    }
                }
                if (byteArrayOutputStream != null) {
                    byteArray = byteArrayOutputStream.toByteArray();
                }
                return byteArray;
            } catch (Throwable th2) {
                th = th2;
                gZIPOutputStream2 = gZIPOutputStream;
                if (gZIPOutputStream2 != null) {
                    try {
                        gZIPOutputStream2.close();
                    } catch (IOException e14) {
                        lp.ZRu("PostExecutor", e14.toString());
                    }
                }
                if (byteArrayOutputStream == null) {
                    throw th;
                }
                byteArrayOutputStream.toByteArray();
                try {
                    byteArrayOutputStream.close();
                    throw th;
                } catch (IOException e15) {
                    lp.ZRu("PostExecutor", e15.toString());
                    throw th;
                }
            }
        } catch (IOException e16) {
            e = e16;
            byteArrayOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
        }
        try {
            byteArrayOutputStream.close();
        } catch (IOException e17) {
            lp.ZRu("PostExecutor", e17.toString());
        }
        return byteArray;
    }

    public void uR(String str) {
        if (TextUtils.isEmpty(str)) {
            str = b.f53002g;
        }
        this.ZRu = edo.ZRu(Vor.ZRu("application/json; charset=utf-8"), str);
    }

    public void ZRu(JSONObject jSONObject) {
        String string;
        if (jSONObject != null) {
            string = jSONObject.toString();
        } else {
            string = b.f53002g;
        }
        this.ZRu = edo.ZRu(Vor.ZRu("application/json; charset=utf-8"), string);
    }

    public edo uR() {
        return this.ZRu;
    }

    public void ZRu(String str, byte[] bArr) {
        this.ZRu = edo.ZRu(Vor.ZRu(str), bArr);
    }

    public void ZRu(final com.bytedance.sdk.component.Mm.ZRu.ZRu zRu) {
        try {
            sAl.ZRu zRu2 = new sAl.ZRu();
            if (TextUtils.isEmpty(this.FA)) {
                zRu.ZRu(this, new IOException("Url is Empty"));
                return;
            }
            if (!TextUtils.isEmpty(this.TFq)) {
                zRu2.ZRu(this.TFq);
            }
            int i10 = this.Ht;
            if (i10 > 0) {
                zRu2.ZRu(i10);
            }
            zRu2.NOt(this.FA);
            if (this.ZRu == null) {
                if (zRu != null) {
                    zRu.ZRu(this, new IOException("RequestBody is null, content type is not support!!"));
                }
            } else {
                ZRu(zRu2);
                zRu2.ZRu((Object) mZ());
                this.mZ.ZRu(zRu2.ZRu(this.ZRu).NOt()).ZRu(new com.bytedance.sdk.component.NOt.ZRu.mZ() { // from class: com.bytedance.sdk.component.Mm.NOt.uR.1
                    @Override // com.bytedance.sdk.component.NOt.ZRu.mZ
                    public void ZRu(com.bytedance.sdk.component.NOt.ZRu.NOt nOt, IOException iOException) {
                        com.bytedance.sdk.component.Mm.ZRu.ZRu zRu3 = zRu;
                        if (zRu3 != null) {
                            zRu3.ZRu(uR.this, iOException);
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v5, types: [com.bytedance.sdk.component.NOt.ZRu.Ht] */
                    /* JADX WARN: Type inference failed for: r13v6, types: [com.bytedance.sdk.component.Mm.ZRu.ZRu] */
                    /* JADX WARN: Type inference failed for: r1v0 */
                    /* JADX WARN: Type inference failed for: r1v1 */
                    /* JADX WARN: Type inference failed for: r1v8 */
                    /* JADX WARN: Type inference failed for: r2v0 */
                    /* JADX WARN: Type inference failed for: r2v1, types: [com.bytedance.sdk.component.Mm.NOt] */
                    /* JADX WARN: Type inference failed for: r2v10, types: [com.bytedance.sdk.component.Mm.NOt] */
                    /* JADX WARN: Type inference failed for: r2v12 */
                    /* JADX WARN: Type inference failed for: r2v13, types: [int] */
                    /* JADX WARN: Type inference failed for: r2v15 */
                    /* JADX WARN: Type inference failed for: r2v16 */
                    /* JADX WARN: Type inference failed for: r2v17 */
                    /* JADX WARN: Type inference failed for: r2v18 */
                    /* JADX WARN: Type inference failed for: r2v19 */
                    /* JADX WARN: Type inference failed for: r2v5 */
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // com.bytedance.sdk.component.NOt.ZRu.mZ
                    public void ZRu(com.bytedance.sdk.component.NOt.ZRu.NOt nOt, oK oKVar) throws IOException {
                        Throwable th;
                        ?? r22;
                        HashMap map;
                        ?? nOt2;
                        com.bytedance.sdk.component.Mm.ZRu.ZRu zRu3 = zRu;
                        if (zRu3 != null) {
                            if (oKVar == null) {
                                zRu3.ZRu(uR.this, new IOException("No response"));
                                return;
                            }
                            ?? r12 = 0;
                            IOException iOException = null;
                            try {
                                map = new HashMap();
                                ?? Mm = oKVar.Mm();
                                if (Mm != 0) {
                                    nOt2 = 0;
                                    while (nOt2 < Mm.ZRu()) {
                                        String strZRu = Mm.ZRu(nOt2);
                                        String strNOt = Mm.NOt(nOt2);
                                        map.put(strZRu, strNOt);
                                        if (strZRu != null && strZRu.equalsIgnoreCase("content-type")) {
                                            map.put("content-type", strNOt == null ? "" : strNOt.toLowerCase());
                                        }
                                        nOt2++;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                            try {
                                if (com.bytedance.sdk.component.Mm.uR.ZRu.ZRu(map)) {
                                    byte[] bArrUR = oKVar.Ht().uR();
                                    com.bytedance.sdk.component.Mm.NOt nOt3 = new com.bytedance.sdk.component.Mm.NOt(oKVar.uR(), oKVar.mZ(), oKVar.TFq(), map, null, oKVar.NOt(), oKVar.ZRu());
                                    nOt3.ZRu(bArrUR);
                                    nOt2 = nOt3;
                                } else if (uR.this.Vor) {
                                    byte[] bArrUR2 = oKVar.Ht().uR();
                                    uR uRVar = uR.this;
                                    com.bytedance.sdk.component.Mm.NOt nOt4 = new com.bytedance.sdk.component.Mm.NOt(oKVar.uR(), oKVar.mZ(), oKVar.TFq(), map, new String(bArrUR2, uRVar.ZRu(uRVar.ZRu(oKVar.Ht()))), oKVar.NOt(), oKVar.ZRu());
                                    nOt4.ZRu(bArrUR2);
                                    nOt2 = nOt4;
                                } else {
                                    nOt2 = new com.bytedance.sdk.component.Mm.NOt(oKVar.uR(), oKVar.mZ(), oKVar.TFq(), map, oKVar.Ht().NOt(), oKVar.NOt(), oKVar.ZRu());
                                }
                                uR.this.ZRu((com.bytedance.sdk.component.Mm.NOt) nOt2, oKVar);
                                r22 = nOt2;
                            } catch (Throwable th3) {
                                th = th3;
                                r12 = nOt2;
                                r22 = r12;
                                iOException = new IOException(th);
                            }
                            if (r22 != 0) {
                                zRu.ZRu(uR.this, r22);
                                return;
                            }
                            com.bytedance.sdk.component.Mm.ZRu.ZRu zRu4 = zRu;
                            if (zRu4 instanceof com.bytedance.sdk.component.Mm.ZRu.NOt) {
                                com.bytedance.sdk.component.Mm.ZRu.NOt nOt5 = (com.bytedance.sdk.component.Mm.ZRu.NOt) zRu4;
                                uR uRVar2 = uR.this;
                                if (iOException == null) {
                                    iOException = new IOException("Unexpected exception");
                                }
                                nOt5.ZRu(uRVar2, iOException, new com.bytedance.sdk.component.Mm.NOt(oKVar.uR(), oKVar.mZ(), oKVar.TFq(), null, null, oKVar.NOt(), oKVar.ZRu()));
                                return;
                            }
                            uR uRVar3 = uR.this;
                            if (iOException == null) {
                                iOException = new IOException("Unexpected exception");
                            }
                            zRu4.ZRu(uRVar3, iOException);
                        }
                    }
                });
            }
        } catch (Throwable th) {
            zRu.ZRu(this, new IOException(th.getMessage()));
        }
    }

    public com.bytedance.sdk.component.Mm.NOt ZRu() {
        com.bytedance.sdk.component.Mm.NOt nOt;
        try {
            sAl.ZRu zRu = new sAl.ZRu();
            if (TextUtils.isEmpty(this.FA)) {
                return new com.bytedance.sdk.component.Mm.NOt(false, 5000, "URL_NULL_MSG", null, "URL_NULL_BODY", 1L, 1L);
            }
            zRu.NOt(this.FA);
            if (this.ZRu == null) {
                return new com.bytedance.sdk.component.Mm.NOt(false, 5000, "BODY_NULL_MSG", null, "BODY_NULL_BODY", 1L, 1L);
            }
            ZRu(zRu);
            zRu.ZRu((Object) mZ());
            oK oKVarNOt = this.mZ.ZRu(zRu.ZRu(this.ZRu).NOt()).NOt();
            if (oKVarNOt == null) {
                return null;
            }
            HashMap map = new HashMap();
            Ht htMm = oKVarNOt.Mm();
            if (htMm != null) {
                for (int i10 = 0; i10 < htMm.ZRu(); i10++) {
                    String strZRu = htMm.ZRu(i10);
                    String strNOt = htMm.NOt(i10);
                    map.put(strZRu, strNOt);
                    if (strZRu != null && strZRu.equalsIgnoreCase("content-type")) {
                        map.put("content-type", strNOt == null ? "" : strNOt.toLowerCase());
                    }
                }
            }
            if (com.bytedance.sdk.component.Mm.uR.ZRu.ZRu(map)) {
                byte[] bArrUR = oKVarNOt.Ht().uR();
                nOt = new com.bytedance.sdk.component.Mm.NOt(oKVarNOt.uR(), oKVarNOt.mZ(), oKVarNOt.TFq(), map, null, oKVarNOt.NOt(), oKVarNOt.ZRu());
                nOt.ZRu(bArrUR);
            } else if (this.Vor) {
                byte[] bArrUR2 = oKVarNOt.Ht().uR();
                nOt = new com.bytedance.sdk.component.Mm.NOt(oKVarNOt.uR(), oKVarNOt.mZ(), oKVarNOt.TFq(), map, new String(bArrUR2, ZRu(ZRu(oKVarNOt.Ht()))), oKVarNOt.NOt(), oKVarNOt.ZRu());
                nOt.ZRu(bArrUR2);
            } else {
                nOt = new com.bytedance.sdk.component.Mm.NOt(oKVarNOt.uR(), oKVarNOt.mZ(), oKVarNOt.TFq(), map, oKVarNOt.Ht().NOt(), oKVarNOt.NOt(), oKVarNOt.ZRu());
            }
            ZRu(nOt, oKVarNOt);
            return nOt;
        } catch (Throwable th) {
            return new com.bytedance.sdk.component.Mm.NOt(false, 5001, th.getMessage(), null, "BODY_NULL_BODY", 1L, 1L);
        }
    }

    public void ZRu(String str, boolean z10) {
        if (z10) {
            ZRu("application/json; charset=utf-8", TFq(str));
            NOt("Content-Encoding", "gzip");
        } else {
            uR(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Charset ZRu(Vor vor) {
        try {
            return vor != null ? vor.ZRu(com.bytedance.sdk.component.NOt.ZRu.NOt.Vor.ZRu) : com.bytedance.sdk.component.NOt.ZRu.NOt.Vor.ZRu;
        } catch (Exception unused) {
            return com.bytedance.sdk.component.NOt.ZRu.NOt.Vor.ZRu;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Vor ZRu(yBV ybv) {
        try {
            return ybv.TFq();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ZRu(com.bytedance.sdk.component.Mm.NOt nOt, oK oKVar) {
        if (nOt == null || oKVar == null) {
            return;
        }
        nOt.ZRu(oKVar.Vor());
    }
}
