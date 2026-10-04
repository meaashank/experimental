package com.mbridge.msdk.foundation.download.download;

import android.webkit.URLUtil;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.same.task.a;
import com.mbridge.msdk.foundation.tools.a1;

/* JADX INFO: loaded from: classes5.dex */
public class DownLoadUtils {
    private static final int DOWNLOAD_CONNECTION_TIME_OUT = 20000;
    private static final int DOWNLOAD_READ_TIME_OUT = 30000;
    public static final String END_TAG = "<mbridgeloadend></mbridgeloadend>";
    private static final String TAG = "DownLoadUtils";

    public static void getSourceCodeFromNetUrl(final String str, final H5DownLoadManager.IOnDownLoadH5Source iOnDownLoadH5Source, final boolean z10) {
        try {
            if (!a1.a(str) && URLUtil.isNetworkUrl(str)) {
                DownloadTask.getInstance().runTask(new a() { // from class: com.mbridge.msdk.foundation.download.download.DownLoadUtils.1
                    @Override // com.mbridge.msdk.foundation.same.task.a
                    public void cancelTask() {
                    }

                    @Override // com.mbridge.msdk.foundation.same.task.a
                    public void pauseTask(boolean z11) {
                    }

                    /* JADX WARN: Can't wrap try/catch for region: R(9:(8:13|14|130|15|(11:113|16|(1:18)(1:132)|35|58|(2:117|60)|(1:64)|67|(3:126|69|(1:(2:87|(1:89))(2:84|(1:86)))(1:74))(0)|125|100)|23|(4:25|128|26|(1:28)(1:32))(1:33)|34)(2:41|42)|111|43|(2:123|45)|(1:49)|52|(0)(0)|125|100) */
                    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ce, code lost:
                    
                        r5 = move-exception;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:56:0x00cf, code lost:
                    
                        r11 = r2;
                        r2 = r1;
                        r1 = r5;
                        r5 = r11;
                        r6 = r6;
                        r7 = r7;
                     */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:107:0x0179 A[Catch: Exception -> 0x0175, TRY_LEAVE, TryCatch #4 {Exception -> 0x0175, blocks: (B:103:0x0171, B:107:0x0179), top: B:119:0x0171 }] */
                    /* JADX WARN: Removed duplicated region for block: B:117:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:119:0x0171 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:126:0x010a A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:64:0x00fc A[Catch: Exception -> 0x00f8, TRY_LEAVE, TryCatch #3 {Exception -> 0x00f8, blocks: (B:60:0x00f4, B:64:0x00fc), top: B:117:0x00f4 }] */
                    /* JADX WARN: Removed duplicated region for block: B:77:0x011d  */
                    /* JADX WARN: Type inference failed for: r0v18, types: [com.mbridge.msdk.foundation.download.download.H5DownLoadManager$IOnDownLoadH5Source] */
                    /* JADX WARN: Type inference failed for: r6v0 */
                    /* JADX WARN: Type inference failed for: r6v13 */
                    /* JADX WARN: Type inference failed for: r6v14, types: [java.io.ByteArrayOutputStream] */
                    /* JADX WARN: Type inference failed for: r6v15 */
                    /* JADX WARN: Type inference failed for: r6v17 */
                    /* JADX WARN: Type inference failed for: r6v18 */
                    /* JADX WARN: Type inference failed for: r6v19 */
                    /* JADX WARN: Type inference failed for: r6v2, types: [java.io.ByteArrayOutputStream] */
                    /* JADX WARN: Type inference failed for: r6v20 */
                    /* JADX WARN: Type inference failed for: r6v21 */
                    /* JADX WARN: Type inference failed for: r6v22 */
                    /* JADX WARN: Type inference failed for: r6v23 */
                    /* JADX WARN: Type inference failed for: r6v24 */
                    /* JADX WARN: Type inference failed for: r6v3 */
                    /* JADX WARN: Type inference failed for: r6v4 */
                    /* JADX WARN: Type inference failed for: r6v5 */
                    /* JADX WARN: Type inference failed for: r6v6, types: [java.io.ByteArrayOutputStream] */
                    /* JADX WARN: Type inference failed for: r6v7 */
                    /* JADX WARN: Type inference failed for: r7v17 */
                    /* JADX WARN: Type inference failed for: r7v18 */
                    /* JADX WARN: Type inference failed for: r7v19 */
                    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.String] */
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
                    @Override // com.mbridge.msdk.foundation.same.task.a
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public void runTask() throws java.lang.Throwable {
                        /*
                            Method dump skipped, instruction units count: 388
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.download.download.DownLoadUtils.AnonymousClass1.runTask():void");
                    }
                });
                return;
            }
            if (iOnDownLoadH5Source != null) {
                iOnDownLoadH5Source.onFailed("url is error");
            }
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                th.printStackTrace();
            }
        }
    }
}
