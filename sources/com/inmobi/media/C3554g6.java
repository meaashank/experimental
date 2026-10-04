package com.inmobi.media;

import android.content.ContentValues;

/* JADX INFO: renamed from: com.inmobi.media.g6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3554g6 extends F1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Q4 f152936b;

    public C3554g6() {
        super("logs_v2", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, filename TEXT NOT NULL, saveTimestamp INTEGER NOT NULL, retryCount INTEGER NOT NULL, hasLoggerFinished INTEGER NOT NULL, checkpoints INTEGER NOT NULL,lastRetryTimestamp INTEGER NOT NULL )");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    @Override // com.inmobi.media.F1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.content.ContentValues r12) {
        /*
            r11 = this;
            java.lang.String r0 = "contentValues"
            kotlin.jvm.internal.G.p(r12, r0)
            java.lang.String r0 = "filename"
            java.lang.String r2 = r12.getAsString(r0)
            java.lang.String r0 = "saveTimestamp"
            java.lang.Long r0 = r12.getAsLong(r0)
            java.lang.String r1 = "retryCount"
            java.lang.Integer r1 = r12.getAsInteger(r1)
            java.lang.String r3 = "lastRetryTimestamp"
            java.lang.Long r3 = r12.getAsLong(r3)
            java.lang.String r4 = "checkpoints"
            java.lang.Integer r4 = r12.getAsInteger(r4)
            java.lang.String r5 = "hasLoggerFinished"
            java.lang.Integer r12 = r12.getAsInteger(r5)
            if (r12 != 0) goto L2c
            goto L36
        L2c:
            int r12 = r12.intValue()
            r5 = 1
            if (r12 != r5) goto L36
        L33:
            r12 = r1
            r8 = r5
            goto L38
        L36:
            r5 = 0
            goto L33
        L38:
            com.inmobi.media.f6 r1 = new com.inmobi.media.f6
            kotlin.jvm.internal.G.m(r2)
            kotlin.jvm.internal.G.m(r0)
            long r5 = r0.longValue()
            kotlin.jvm.internal.G.m(r12)
            int r12 = r12.intValue()
            kotlin.jvm.internal.G.m(r3)
            long r9 = r3.longValue()
            kotlin.jvm.internal.G.m(r4)
            int r0 = r4.intValue()
            r3 = r5
            r6 = r9
            r5 = r12
            r9 = r0
            r1.<init>(r2, r3, r5, r6, r8, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3554g6.a(android.content.ContentValues):java.lang.Object");
    }

    @Override // com.inmobi.media.F1
    public final ContentValues b(Object obj) {
        C3540f6 item = (C3540f6) obj;
        kotlin.jvm.internal.G.p(item, "item");
        ContentValues contentValues = new ContentValues();
        contentValues.put("filename", item.f152914a);
        contentValues.put("saveTimestamp", Long.valueOf(item.f152915b));
        contentValues.put("retryCount", Integer.valueOf(item.f152916c));
        contentValues.put("lastRetryTimestamp", Long.valueOf(item.f152917d));
        contentValues.put("checkpoints", Integer.valueOf(item.f152919f));
        contentValues.put("hasLoggerFinished", Integer.valueOf(item.f152918e ? 1 : 0));
        return contentValues;
    }

    public final void a(C3540f6 data) {
        kotlin.jvm.internal.G.p(data, "data");
        a("filename=\"" + data.f152914a + '\"', null);
    }

    public final void b(C3540f6 data) {
        kotlin.jvm.internal.G.p(data, "data");
        b(data, androidx.compose.runtime.R0.a(new StringBuilder("filename=\""), data.f152914a, '\"'), null);
        if (this.f152936b != null) {
            Q4.a();
        }
    }
}
