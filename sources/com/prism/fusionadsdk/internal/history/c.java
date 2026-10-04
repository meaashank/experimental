package com.prism.fusionadsdk.internal.history;

import J6.f;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import com.prism.fusionadsdk.internal.history.a;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Executor f162338a = Executors.newSingleThreadExecutor();

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f162339a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f162340b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f162341c;

        public a(Context context, String str, int i10) {
            this.f162339a = context;
            this.f162340b = str;
            this.f162341c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.prism.fusionadsdk.internal.history.b bVarD = c.d(this.f162339a, this.f162340b);
                ContentValues contentValues = new ContentValues();
                if (bVarD.moveToNext()) {
                    contentValues.put(a.C0665a.f162325f, Long.valueOf(System.currentTimeMillis()));
                    contentValues.put(a.C0665a.f162322c, Long.valueOf(bVarD.f162329d + ((long) this.f162341c)));
                    c.g(this.f162339a, bVarD.f162326a, contentValues);
                } else {
                    contentValues.put(a.C0665a.f162322c, Integer.valueOf(this.f162341c));
                    contentValues.put(a.C0665a.f162325f, Long.valueOf(System.currentTimeMillis()));
                    contentValues.put(a.C0665a.f162324e, (Integer) 0);
                    contentValues.put(a.C0665a.f162323d, (Integer) 0);
                    contentValues.put(a.C0665a.f162321b, this.f162340b);
                    c.e(this.f162339a, contentValues);
                }
            } catch (Throwable th) {
                c.f(this.f162339a, "whenReqAd_error", th.getMessage());
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f162342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f162343b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f162344c;

        public b(Context context, String str, int i10) {
            this.f162342a = context;
            this.f162343b = str;
            this.f162344c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.prism.fusionadsdk.internal.history.b bVarD = c.d(this.f162342a, this.f162343b);
                ContentValues contentValues = new ContentValues();
                if (bVarD.moveToNext()) {
                    contentValues.put(a.C0665a.f162324e, Long.valueOf(System.currentTimeMillis()));
                    contentValues.put(a.C0665a.f162323d, Long.valueOf(bVarD.f162330e + ((long) this.f162344c)));
                    c.g(this.f162342a, bVarD.f162326a, contentValues);
                } else {
                    contentValues.put(a.C0665a.f162323d, Integer.valueOf(this.f162344c));
                    contentValues.put(a.C0665a.f162324e, Long.valueOf(System.currentTimeMillis()));
                    contentValues.put(a.C0665a.f162325f, (Integer) 0);
                    contentValues.put(a.C0665a.f162322c, (Integer) 0);
                    contentValues.put(a.C0665a.f162321b, this.f162343b);
                    c.e(this.f162342a, contentValues);
                }
            } catch (Throwable th) {
                c.f(this.f162342a, "whenShowAd_error", th.getMessage());
            }
        }
    }

    public static com.prism.fusionadsdk.internal.history.b d(Context context, String str) {
        return new com.prism.fusionadsdk.internal.history.b(context.getContentResolver().query(Uri.parse("content://com.app.hider.master.promax.ad_history.provider/AD_HISTORY"), null, "adid=?", new String[]{str}, null));
    }

    public static void e(Context context, ContentValues contentValues) {
        try {
            context.getContentResolver().insert(Uri.parse("content://com.app.hider.master.promax.ad_history.provider/AD_HISTORY"), contentValues);
        } catch (Throwable th) {
            f(context, "history_insert_error", th.getMessage());
        }
    }

    public static void f(Context context, String str, String str2) {
        try {
            if (f.n() != null) {
                V5.c cVarA = f.f53216p.a(context, str);
                if (str2 == null) {
                    str2 = "unkown";
                }
                cVarA.c("reason", str2).b();
            }
        } catch (Throwable unused) {
        }
    }

    public static void g(Context context, int i10, ContentValues contentValues) {
        try {
            context.getContentResolver().update(Uri.parse("content://com.app.hider.master.promax.ad_history.provider/AD_HISTORY"), contentValues, "_id=?", new String[]{Integer.toString(i10)});
        } catch (Throwable th) {
            f(context, "history_update_error", th.getMessage());
        }
    }

    public static void h(Context context, String str, int i10) {
        f162338a.execute(new a(context, str, i10));
    }

    public static void i(Context context, String str, int i10) {
        f162338a.execute(new b(context, str, i10));
    }
}
