package com.prism.gaia.download;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.prism.gaia.download.j;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final int f164624K = 1;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final int f164625L = 2;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final int f164626M = 3;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final int f164627N = 4;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final int f164628O = 5;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final int f164629P = 6;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final int f164630Q = 7;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final String f164631R = "isWifiRequired";

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f164632A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f164633B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f164634C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public String f164635D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public String f164636E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f164637F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f164638G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public List<Pair<String, String>> f164639H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public p f164640I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public Context f164641J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f164642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f164643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f164644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f164645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f164646e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f164647f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f164648g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f164649h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f164650i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f164651j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f164652k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f164653l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f164654m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f164655n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f164656o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f164657p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f164658q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f164659r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f164660s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f164661t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f164662u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f164663v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f164664w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f164665x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f164666y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f164667z;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ContentResolver f164668a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Cursor f164669b;

        public a(ContentResolver contentResolver, Cursor cursor) {
            this.f164668a = contentResolver;
            this.f164669b = cursor;
        }

        public final void a(d dVar, String str, String str2) {
            dVar.f164639H.add(Pair.create(str, str2));
        }

        public final Integer b(String str, int i10) {
            try {
                Cursor cursor = this.f164669b;
                return Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(str)));
            } catch (Throwable unused) {
                return Integer.valueOf(i10);
            }
        }

        public final Integer c(String str) {
            Cursor cursor = this.f164669b;
            return Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(str)));
        }

        public final Long d(String str, long j10) {
            try {
                Cursor cursor = this.f164669b;
                return Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(str)));
            } catch (Throwable unused) {
                return Long.valueOf(j10);
            }
        }

        public final Long e(String str) {
            Cursor cursor = this.f164669b;
            return Long.valueOf(cursor.getLong(cursor.getColumnIndexOrThrow(str)));
        }

        public final String f(String str) {
            try {
                String string = this.f164669b.getString(this.f164669b.getColumnIndexOrThrow(str));
                if (TextUtils.isEmpty(string)) {
                    return null;
                }
                return string;
            } catch (Throwable unused) {
                return null;
            }
        }

        public final String g(String str) {
            String string = this.f164669b.getString(this.f164669b.getColumnIndexOrThrow(str));
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            return string;
        }

        public d h(Context context, p pVar) {
            d dVar = new d(context, pVar);
            j(dVar);
            i(dVar);
            return dVar;
        }

        /* JADX WARN: Finally extract failed */
        public final void i(d dVar) {
            dVar.f164639H.clear();
            Cursor cursorQuery = this.f164668a.query(Uri.withAppendedPath(dVar.f(), j.b.a.f164786e), null, null, null, null);
            try {
                int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow(j.b.a.f164784c);
                int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow("value");
                cursorQuery.moveToFirst();
                while (!cursorQuery.isAfterLast()) {
                    dVar.f164639H.add(Pair.create(cursorQuery.getString(columnIndexOrThrow), cursorQuery.getString(columnIndexOrThrow2)));
                    cursorQuery.moveToNext();
                }
                cursorQuery.close();
                String str = dVar.f164658q;
                if (str != null) {
                    dVar.f164639H.add(Pair.create("Cookie", str));
                }
                String str2 = dVar.f164660s;
                if (str2 != null) {
                    dVar.f164639H.add(Pair.create("Referer", str2));
                }
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }

        public void j(d dVar) {
            dVar.f164642a = d("_id", 0L).longValue();
            dVar.f164643b = f("uri");
            dVar.f164644c = b(j.b.f164764r, 0).intValue() == 1;
            dVar.f164645d = f("hint");
            dVar.f164646e = f(j.b.f164768t);
            dVar.f164647f = f(j.b.f164770u);
            dVar.f164648g = b("destination", 0).intValue();
            dVar.f164649h = b("visibility", 0).intValue();
            dVar.f164651j = b("status", 0).intValue();
            dVar.f164652k = b("numfailed", 0).intValue();
            dVar.f164653l = b("method", 0).intValue() & 268435455;
            dVar.f164654m = d(j.b.f164780z, 0L).longValue();
            dVar.f164655n = f("notificationpackage");
            dVar.f164656o = f("notificationclass");
            dVar.f164657p = f(j.b.f164694C);
            dVar.f164658q = f("cookiedata");
            dVar.f164659r = f(j.b.f164698E);
            dVar.f164660s = f(j.b.f164700F);
            dVar.f164661t = d("total_bytes", 0L).longValue();
            dVar.f164662u = d(j.b.f164704H, 0L).longValue();
            dVar.f164663v = f("etag");
            dVar.f164664w = b("uid", 0).intValue();
            dVar.f164665x = b("scanned", 0).intValue();
            dVar.f164666y = b(j.b.f164721R, 0).intValue() == 1;
            dVar.f164667z = f(j.b.f164722S);
            dVar.f164632A = b("is_public_api", 0).intValue() != 0;
            dVar.f164633B = b(j.b.f164714M, 0).intValue();
            dVar.f164634C = b(j.b.f164716N, 0).intValue() != 0;
            dVar.f164635D = f("title");
            dVar.f164636E = f("description");
            dVar.f164637F = b(j.b.f164720Q, 0).intValue();
            synchronized (this) {
                dVar.f164650i = b(j.b.f164776x, 0).intValue();
            }
        }
    }

    public int b() {
        NetworkInfo networkInfoD = this.f164640I.d(this.f164664w);
        String str = com.prism.gaia.download.a.f164590a;
        if (networkInfoD == null) {
            return 2;
        }
        if (NetworkInfo.DetailedState.BLOCKED.equals(networkInfoD.getDetailedState())) {
            return 7;
        }
        if (!m() && this.f164640I.c()) {
            return 5;
        }
        networkInfoD.getType();
        return c(networkInfoD.getType());
    }

    public final int c(int i10) {
        if (this.f164632A && this.f164633B != 0 && (u(i10) & this.f164633B) == 0) {
            return 6;
        }
        return d(i10);
    }

    public final int d(int i10) {
        Long lE;
        if (this.f164661t <= 0 || i10 == 1) {
            return 1;
        }
        Long lF = this.f164640I.f();
        if (lF == null || this.f164661t <= lF.longValue()) {
            return (this.f164637F != 0 || (lE = this.f164640I.e()) == null || this.f164661t <= lE.longValue()) ? 1 : 4;
        }
        return 3;
    }

    public void e(PrintWriter printWriter) {
        printWriter.println("DownloadInfo:");
        printWriter.print("  mId=");
        printWriter.print(this.f164642a);
        printWriter.print(" mLastMod=");
        printWriter.print(this.f164654m);
        printWriter.print(" mPackage=");
        printWriter.print(this.f164655n);
        printWriter.print(" mUid=");
        printWriter.println(this.f164664w);
        printWriter.print("  mUri=");
        printWriter.print(this.f164643b);
        printWriter.print(" mMimeType=");
        printWriter.print(this.f164647f);
        printWriter.print(" mCookies=");
        printWriter.print(this.f164658q != null ? "yes" : "no");
        printWriter.print(" mReferer=");
        printWriter.println(this.f164660s != null ? "yes" : "no");
        printWriter.print("  mUserAgent=");
        printWriter.println(this.f164659r);
        printWriter.print("  mFileName=");
        printWriter.println(this.f164646e);
        printWriter.print("  mStatus=");
        printWriter.print(this.f164651j);
        printWriter.print(" mCurrentBytes=");
        printWriter.print(this.f164662u);
        printWriter.print(" mTotalBytes=");
        printWriter.println(this.f164661t);
        printWriter.print("  mNumFailed=");
        printWriter.print(this.f164652k);
        printWriter.print(" mRetryAfter=");
        printWriter.println(this.f164653l);
    }

    public Uri f() {
        return ContentUris.withAppendedId(j.b.f164750k, this.f164642a);
    }

    public Collection<Pair<String, String>> g() {
        return Collections.unmodifiableList(this.f164639H);
    }

    public String h(int i10) {
        switch (i10) {
            case 2:
                return "no network connection available";
            case 3:
                return "download size exceeds limit for mobile network";
            case 4:
                return "download size exceeds recommended limit for mobile network";
            case 5:
                return "download cannot use the current network connection because it is roaming";
            case 6:
                return "download was requested to not use the current network type";
            case 7:
                return "network is blocked for requesting application";
            default:
                return "unknown error with network connectivity";
        }
    }

    public Uri i() {
        return ContentUris.withAppendedId(j.b.f164748j, this.f164642a);
    }

    public boolean j() {
        return j.b.c(this.f164651j) && this.f164649h == 1;
    }

    public boolean k() {
        int i10 = this.f164648g;
        return i10 == 1 || i10 == 5 || i10 == 3 || i10 == 2;
    }

    public final boolean l(long j10) {
        if (c.d().e(this.f164642a) || this.f164650i == 1) {
            return false;
        }
        int i10 = this.f164651j;
        if (i10 != 0 && i10 != 190 && i10 != 192 && i10 != 198) {
            if (i10 == 199) {
                return Environment.getExternalStorageState().equals("mounted");
            }
            switch (i10) {
                case 194:
                    if (p(j10) > j10) {
                        return false;
                    }
                    break;
                case 195:
                case j.b.f164765r0 /* 196 */:
                    if (b() != 1) {
                        return false;
                    }
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    public final boolean m() {
        return this.f164632A ? this.f164634C : this.f164648g != 3;
    }

    public long n(long j10) {
        if (j.b.c(this.f164651j)) {
            return -1L;
        }
        if (this.f164651j != 194) {
            return 0L;
        }
        long jP = p(j10);
        if (jP <= j10) {
            return 0L;
        }
        return jP - j10;
    }

    public void o(boolean z10) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(f());
        intent.setClassName(n.class.getPackage().getName(), n.class.getName());
        intent.setFlags(268435456);
        intent.putExtra(f164631R, z10);
        this.f164641J.startActivity(intent);
    }

    public long p(long j10) {
        int i10 = this.f164652k;
        if (i10 == 0) {
            return j10;
        }
        int i11 = this.f164653l;
        return i11 > 0 ? this.f164654m + ((long) i11) : this.f164654m + ((long) ((this.f164638G + 1000) * 30 * (1 << (i10 - 1))));
    }

    public void q() {
        Intent intent;
        String str = com.prism.gaia.download.a.f164590a;
        if (this.f164655n == null) {
            return;
        }
        if (this.f164632A) {
            intent = new Intent("android.intent.action.DOWNLOAD_COMPLETE");
            intent.setPackage(this.f164655n);
            intent.putExtra("extra_download_id", this.f164642a);
        } else {
            if (this.f164656o == null) {
                return;
            }
            intent = new Intent(j.b.f164756n);
            intent.setClassName(this.f164655n, this.f164656o);
            String str2 = this.f164657p;
            if (str2 != null) {
                intent.putExtra(j.b.f164694C, str2);
            }
            intent.setData(i());
        }
        intent.getExtras();
        this.f164640I.a(intent);
    }

    public boolean r() {
        if (this.f164665x != 0) {
            return false;
        }
        int i10 = this.f164648g;
        return (i10 == 0 || i10 == 4 || i10 == 6) && j.b.g(this.f164651j);
    }

    public void s() {
        Context context = this.f164641J;
        this.f164640I.b(new DownloadThread(context, this.f164640I, this, o.h(context)));
    }

    public void t(long j10, o oVar) {
        if (l(j10)) {
            if (com.prism.gaia.download.a.f164587H) {
                Log.v(com.prism.gaia.download.a.f164590a, "Service spawning thread to handle download " + this.f164642a);
            }
            if (this.f164651j != 192) {
                this.f164651j = 192;
                ContentValues contentValues = new ContentValues();
                contentValues.put("status", Integer.valueOf(this.f164651j));
                this.f164641J.getContentResolver().update(f(), contentValues, null, null);
            }
            c.f164620e.c(this);
        }
    }

    public final int u(int i10) {
        if (i10 != 0) {
            return i10 != 1 ? 0 : 2;
        }
        return 1;
    }

    public d(Context context, p pVar) {
        this.f164639H = new ArrayList();
        this.f164641J = context;
        this.f164640I = pVar;
        this.f164638G = l.f164790a.nextInt(1001);
    }
}
