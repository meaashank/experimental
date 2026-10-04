package com.prism.gaia.server.content;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.Context;
import android.content.ISyncStatusObserver;
import android.content.PeriodicSync;
import android.content.SyncInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteQueryBuilder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Pair;
import android.util.SparseArray;
import android.util.Xml;
import androidx.preference.s;
import com.prism.commons.utils.C3838b;
import com.prism.commons.utils.C3843g;
import com.prism.gaia.naked.compat.android.content.ContentResolverCompat2;
import com.prism.gaia.naked.compat.android.content.PeriodicSyncCompat2;
import com.prism.gaia.naked.compat.android.content.SyncInfoCompat2;
import com.prism.gaia.server.content.e;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;
import s0.x;

/* JADX INFO: loaded from: classes6.dex */
public class j extends Handler {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final boolean f167234A = false;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final String f167235B = "nextAuthorityId";

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final String f167236C = "listen-for-tickles";

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final String f167237D = "offsetInSeconds";

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final String f167238E = "enabled";

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final String f167239F = "user";

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final String f167240G = "listenForTickles";

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final long f167241H = 86400;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final double f167242I = 0.04d;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final long f167243J = 5;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final long f167244K = 2419200000L;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final int f167245L = 0;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final int f167246M = 1;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final int f167248O = 0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final int f167249P = 1;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final int f167250Q = 2;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final int f167251R = 3;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final int f167252S = 4;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static final long f167253T = -1;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final String f167255V = "success";

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final String f167256W = "canceled";

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final int f167257X = 100;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final int f167258Y = 1;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static final long f167259Z = 600000;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int f167260a0 = 2;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final long f167261b0 = 1800000;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final boolean f167262c0 = false;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int f167263d0 = 2;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static HashMap<String, String> f167264e0 = null;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static volatile j f167265f0 = null;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final int f167266g0 = 4;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final int f167267h0 = 0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final int f167268i0 = 100;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final int f167269j0 = 3;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final String f167270k0 = "authority_id";

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final String f167271l0 = "source";

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final String f167272m0 = "expedited";

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final String f167273n0 = "reason";

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final String f167274o0 = "version";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final int f167275p0 = 0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final int f167276q0 = 100;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final int f167277r0 = 101;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final boolean f167279z = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Calendar f167290k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f167291l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f167292m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Context f167293n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f167294o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final D9.a f167295p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final D9.a f167296q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final D9.a f167297r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final D9.a f167298s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f167302w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public d f167303x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f167278y = "asdf-".concat(j.class.getSimpleName());

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static final String[] f167247N = {"START", "STOP"};

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final String[] f167254U = {"SERVER", "LOCAL", "POLL", "USER", "PERIODIC"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray<b> f167280a = new SparseArray<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap<com.prism.gaia.server.accounts.a, a> f167281b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<e> f167282c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseArray<ArrayList<SyncInfo>> f167283d = new SparseArray<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseArray<SyncStatusInfo> f167284e = new SparseArray<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList<f> f167285f = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RemoteCallbackList<ISyncStatusObserver> f167286g = new RemoteCallbackList<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap<ComponentName, SparseArray<b>> f167287h = new HashMap<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f167288i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c[] f167289j = new c[28];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f167299t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f167300u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public SparseArray<Boolean> f167301v = new SparseArray<>();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.prism.gaia.server.accounts.a f167304a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HashMap<String, b> f167305b = new HashMap<>();

        public a(com.prism.gaia.server.accounts.a aVar) {
            this.f167304a = aVar;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f167317a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f167318b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f167319c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f167320d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f167321e;

        public c(int i10) {
            this.f167317a = i10;
        }
    }

    public interface d {
        void a(Account account, int i10, int i11, String str, Bundle bundle);
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f167332a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f167333b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f167334c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f167335d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f167336e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f167337f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f167338g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f167339h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f167340i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f167341j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Bundle f167342k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f167343l;
    }

    static {
        HashMap<String, String> map = new HashMap<>();
        f167264e0 = map;
        map.put("contacts", "com.android.contacts");
        f167264e0.put("calendar", "com.android.calendar");
        f167265f0 = null;
    }

    public j(Context context, File file) throws Throwable {
        this.f167293n = context;
        f167265f0 = this;
        this.f167290k = Calendar.getInstance(TimeZone.getTimeZone("GMT+0"));
        this.f167302w = true;
        File file2 = new File(new File(file, "system"), "sync");
        file2.mkdirs();
        U(file2);
        this.f167295p = new D9.a(new File(file2, "accounts.xml"));
        this.f167296q = new D9.a(new File(file2, "status.bin"));
        this.f167298s = new D9.a(new File(file2, "pending.xml"));
        this.f167297r = new D9.a(new File(file2, "stats.bin"));
        b0();
        f0();
        d0();
        e0();
        c0();
        y0();
        D0();
        B0();
        C0();
    }

    public static long B(Cursor cursor, String str) {
        return cursor.getLong(cursor.getColumnIndex(str));
    }

    public static j J() {
        if (f167265f0 != null) {
            return f167265f0;
        }
        throw new IllegalStateException("not initialized");
    }

    public static void P(Context context) {
        if (f167265f0 != null) {
            return;
        }
        f167265f0 = new j(context, D9.d.i());
    }

    public static j W(Context context) {
        return new j(context, context.getFilesDir());
    }

    public static long e(long j10) {
        if (j10 < 5) {
            return 0L;
        }
        if (j10 < 86400) {
            return (long) (j10 * 0.04d);
        }
        return 3456L;
    }

    public static byte[] m(Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            bundle.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    public static Bundle w0(byte[] bArr) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            return parcelObtain.readBundle();
        } catch (RuntimeException unused) {
            return new Bundle();
        } finally {
            parcelObtain.recycle();
        }
    }

    public static int z(Cursor cursor, String str) {
        return cursor.getInt(cursor.getColumnIndex(str));
    }

    public int A(Account account, int i10, String str) {
        synchronized (this.f167280a) {
            try {
                if (account != null) {
                    b bVarO = o(account, i10, str, "getIsSyncable");
                    if (bVarO == null) {
                        return -1;
                    }
                    return bVarO.f167312g;
                }
                int size = this.f167280a.size();
                while (size > 0) {
                    size--;
                    b bVarValueAt = this.f167280a.valueAt(size);
                    if (bVarValueAt.f167309d.equals(str)) {
                        return bVarValueAt.f167312g;
                    }
                }
                return -1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void A0(e eVar, XmlSerializer xmlSerializer) throws IOException {
        xmlSerializer.startTag(null, "op");
        xmlSerializer.attribute(null, "version", Integer.toString(3));
        xmlSerializer.attribute(null, f167270k0, Integer.toString(eVar.f167330i));
        xmlSerializer.attribute(null, "source", Integer.toString(eVar.f167325d));
        xmlSerializer.attribute(null, f167272m0, Boolean.toString(eVar.f167329h));
        xmlSerializer.attribute(null, "reason", Integer.toString(eVar.f167324c));
        l(xmlSerializer, eVar.f167327f);
        xmlSerializer.endTag(null, "op");
    }

    public final void B0() {
        int size = this.f167282c.size();
        try {
            if (size == 0) {
                this.f167298s.j();
                return;
            }
            FileOutputStream fileOutputStreamI = this.f167298s.i();
            XmlSerializer jVar = new com.prism.gaia.helper.utils.j();
            jVar.setOutput(fileOutputStreamI, C3843g.f162098b);
            for (int i10 = 0; i10 < size; i10++) {
                A0(this.f167282c.get(i10), jVar);
            }
            jVar.flush();
            this.f167298s.d(fileOutputStreamI);
        } catch (IOException unused) {
            if (0 != 0) {
                this.f167298s.c(null);
            }
        }
    }

    public boolean C(int i10) {
        boolean zBooleanValue;
        synchronized (this.f167280a) {
            try {
                Boolean bool = this.f167301v.get(i10);
                zBooleanValue = bool == null ? this.f167302w : bool.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public final void C0() {
        removeMessages(2);
        FileOutputStream fileOutputStreamI = null;
        try {
            fileOutputStreamI = this.f167297r.i();
            Parcel parcelObtain = Parcel.obtain();
            int length = this.f167289j.length;
            for (int i10 = 0; i10 < length; i10++) {
                c cVar = this.f167289j[i10];
                if (cVar == null) {
                    break;
                }
                parcelObtain.writeInt(101);
                parcelObtain.writeInt(cVar.f167317a);
                parcelObtain.writeInt(cVar.f167318b);
                parcelObtain.writeLong(cVar.f167319c);
                parcelObtain.writeInt(cVar.f167320d);
                parcelObtain.writeLong(cVar.f167321e);
            }
            parcelObtain.writeInt(0);
            fileOutputStreamI.write(parcelObtain.marshall());
            parcelObtain.recycle();
            this.f167297r.d(fileOutputStreamI);
        } catch (IOException unused) {
            if (fileOutputStreamI != null) {
                this.f167297r.c(fileOutputStreamI);
            }
        }
    }

    public final b D(Account account, int i10, String str, int i11, boolean z10) {
        com.prism.gaia.server.accounts.a aVar = new com.prism.gaia.server.accounts.a(account, i10);
        a aVar2 = this.f167281b.get(aVar);
        if (aVar2 == null) {
            aVar2 = new a(aVar);
            this.f167281b.put(aVar, aVar2);
        }
        b bVar = aVar2.f167305b.get(str);
        if (bVar == null) {
            if (i11 < 0) {
                i11 = this.f167288i;
                this.f167288i = i11 + 1;
                z10 = true;
            }
            bVar = new b(account, i10, str, i11);
            aVar2.f167305b.put(str, bVar);
            this.f167280a.put(i11, bVar);
            if (z10) {
                y0();
            }
        }
        return bVar;
    }

    public final void D0() {
        removeMessages(1);
        FileOutputStream fileOutputStreamI = null;
        try {
            fileOutputStreamI = this.f167296q.i();
            Parcel parcelObtain = Parcel.obtain();
            int size = this.f167284e.size();
            for (int i10 = 0; i10 < size; i10++) {
                SyncStatusInfo syncStatusInfoValueAt = this.f167284e.valueAt(i10);
                parcelObtain.writeInt(100);
                syncStatusInfoValueAt.writeToParcel(parcelObtain, 0);
            }
            parcelObtain.writeInt(0);
            fileOutputStreamI.write(parcelObtain.marshall());
            parcelObtain.recycle();
            this.f167296q.d(fileOutputStreamI);
        } catch (IOException unused) {
            if (fileOutputStreamI != null) {
                this.f167296q.c(fileOutputStreamI);
            }
        }
    }

    public final b E(ComponentName componentName, int i10, int i11, boolean z10) {
        SparseArray<b> sparseArray = this.f167287h.get(componentName);
        if (sparseArray == null) {
            sparseArray = new SparseArray<>();
            this.f167287h.put(componentName, sparseArray);
        }
        b bVar = sparseArray.get(i10);
        if (bVar == null) {
            if (i11 < 0) {
                i11 = this.f167288i;
                this.f167288i = i11 + 1;
                z10 = true;
            }
            bVar = new b(componentName, i10, i11);
            sparseArray.put(i10, bVar);
            this.f167280a.put(i11, bVar);
            if (z10) {
                y0();
            }
        }
        return bVar;
    }

    public final SyncStatusInfo F(int i10) {
        SyncStatusInfo syncStatusInfo = this.f167284e.get(i10);
        if (syncStatusInfo != null) {
            return syncStatusInfo;
        }
        SyncStatusInfo syncStatusInfo2 = new SyncStatusInfo(i10);
        this.f167284e.put(i10, syncStatusInfo2);
        return syncStatusInfo2;
    }

    public int G() {
        int size;
        synchronized (this.f167280a) {
            size = this.f167282c.size();
        }
        return size;
    }

    public ArrayList<e> H() {
        ArrayList<e> arrayList;
        synchronized (this.f167280a) {
            arrayList = new ArrayList<>(this.f167282c);
        }
        return arrayList;
    }

    public List<PeriodicSync> I(Account account, int i10, String str) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f167280a) {
            try {
                b bVarO = o(account, i10, str, "getPeriodicSyncs");
                if (bVarO != null) {
                    ArrayList<PeriodicSync> arrayList2 = bVarO.f167316k;
                    int size = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size) {
                        PeriodicSync periodicSync = arrayList2.get(i11);
                        i11++;
                        arrayList.add(PeriodicSyncCompat2.Util.ctor(periodicSync));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public SyncStatusInfo K(Account account, int i10, String str) {
        if (account == null || str == null) {
            return null;
        }
        synchronized (this.f167280a) {
            try {
                int size = this.f167284e.size();
                for (int i11 = 0; i11 < size; i11++) {
                    SyncStatusInfo syncStatusInfoValueAt = this.f167284e.valueAt(i11);
                    b bVar = this.f167280a.get(syncStatusInfoValueAt.authorityId);
                    if (bVar != null && bVar.f167309d.equals(str) && bVar.f167308c == i10 && account.equals(bVar.f167307b)) {
                        return syncStatusInfoValueAt;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean L(Account account, int i10, String str) {
        synchronized (this.f167280a) {
            boolean z10 = false;
            try {
                if (account != null) {
                    b bVarO = o(account, i10, str, "getSyncAutomatically");
                    if (bVarO != null && bVarO.f167311f) {
                        z10 = true;
                    }
                    return z10;
                }
                int size = this.f167280a.size();
                while (size > 0) {
                    size--;
                    b bVarValueAt = this.f167280a.valueAt(size);
                    if (bVarValueAt.f167309d.equals(str) && bVarValueAt.f167308c == i10 && bVarValueAt.f167311f) {
                        return true;
                    }
                }
                return false;
            } finally {
            }
        }
    }

    public ArrayList<f> M() {
        ArrayList<f> arrayList;
        synchronized (this.f167280a) {
            try {
                int size = this.f167285f.size();
                arrayList = new ArrayList<>(size);
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList.add(this.f167285f.get(i10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public int N() {
        return this.f167294o;
    }

    public ArrayList<SyncStatusInfo> O() {
        ArrayList<SyncStatusInfo> arrayList;
        synchronized (this.f167280a) {
            try {
                int size = this.f167284e.size();
                arrayList = new ArrayList<>(size);
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList.add(this.f167284e.valueAt(i10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public e Q(e eVar) throws Throwable {
        synchronized (this.f167280a) {
            try {
                try {
                    b bVarD = D(eVar.f167322a, eVar.f167323b, eVar.f167326e, -1, true);
                    e eVar2 = new e(eVar);
                    eVar2.f167330i = bVarD.f167310e;
                    this.f167282c.add(eVar2);
                    d(eVar2);
                    F(bVarD.f167310e).pending = true;
                    m0(2);
                    return eVar2;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    public long R(Account account, int i10, int i11, String str, long j10, int i12, boolean z10, Bundle bundle) {
        synchronized (this.f167280a) {
            try {
                b bVarO = o(account, i10, str, "insertStartSyncEvent");
                if (bVarO == null) {
                    return -1L;
                }
                f fVar = new f();
                fVar.f167341j = z10;
                fVar.f167332a = bVarO.f167310e;
                int i13 = this.f167300u;
                int i14 = i13 + 1;
                this.f167300u = i14;
                fVar.f167333b = i13;
                if (i14 < 0) {
                    this.f167300u = 0;
                }
                fVar.f167334c = j10;
                fVar.f167336e = i12;
                fVar.f167343l = i11;
                fVar.f167342k = bundle;
                fVar.f167337f = 0;
                this.f167285f.add(0, fVar);
                while (this.f167285f.size() > 100) {
                    this.f167285f.remove(r3.size() - 1);
                }
                long j11 = fVar.f167333b;
                m0(ContentResolverCompat2.Util.getStatusOfSyncObserverType());
                return j11;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean S(Account account, int i10, String str) {
        synchronized (this.f167280a) {
            try {
                Iterator<SyncInfo> it = u(i10).iterator();
                while (it.hasNext()) {
                    b bVarN = n(SyncInfoCompat2.Util.getAuthorityId(it.next()));
                    if (bVarN != null && bVarN.f167307b.equals(account) && bVarN.f167309d.equals(str) && bVarN.f167308c == i10) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean T(Account account, int i10, String str) {
        synchronized (this.f167280a) {
            try {
                int size = this.f167284e.size();
                for (int i11 = 0; i11 < size; i11++) {
                    SyncStatusInfo syncStatusInfoValueAt = this.f167284e.valueAt(i11);
                    b bVar = this.f167280a.get(syncStatusInfoValueAt.authorityId);
                    if (bVar != null && i10 == bVar.f167308c && ((account == null || bVar.f167307b.equals(account)) && bVar.f167309d.equals(str) && syncStatusInfoValueAt.pending)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void U(File file) {
        File file2 = new File(file, "pending.bin");
        if (file2.exists()) {
            file2.delete();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean V() {
        /*
            r14 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.util.SparseArray<com.prism.gaia.server.content.j$b> r1 = r14.f167280a
            int r1 = r1.size()
            r2 = 0
            r3 = r2
            r4 = r3
        Le:
            r5 = 1
            if (r3 >= r1) goto L4e
            android.util.SparseArray<com.prism.gaia.server.content.j$b> r6 = r14.f167280a
            java.lang.Object r6 = r6.valueAt(r3)
            com.prism.gaia.server.content.j$b r6 = (com.prism.gaia.server.content.j.b) r6
            java.util.HashMap<java.lang.String, java.lang.String> r7 = com.prism.gaia.server.content.j.f167264e0
            java.lang.String r8 = r6.f167309d
            java.lang.Object r7 = r7.get(r8)
            r11 = r7
            java.lang.String r11 = (java.lang.String) r11
            if (r11 != 0) goto L27
            goto L3b
        L27:
            r0.add(r6)
            boolean r7 = r6.f167311f
            if (r7 != 0) goto L2f
            goto L3b
        L2f:
            android.accounts.Account r7 = r6.f167307b
            int r8 = r6.f167308c
            java.lang.String r9 = "cleanup"
            com.prism.gaia.server.content.j$b r7 = r14.o(r7, r8, r11, r9)
            if (r7 == 0) goto L3d
        L3b:
            r8 = r14
            goto L4b
        L3d:
            android.accounts.Account r9 = r6.f167307b
            int r10 = r6.f167308c
            r12 = -1
            r13 = 0
            r8 = r14
            com.prism.gaia.server.content.j$b r4 = r8.D(r9, r10, r11, r12, r13)
            r4.f167311f = r5
            r4 = r5
        L4b:
            int r3 = r3 + 1
            goto Le
        L4e:
            r8 = r14
            int r1 = r0.size()
            r3 = r2
        L54:
            if (r3 >= r1) goto L69
            java.lang.Object r4 = r0.get(r3)
            int r3 = r3 + 1
            com.prism.gaia.server.content.j$b r4 = (com.prism.gaia.server.content.j.b) r4
            android.accounts.Account r6 = r4.f167307b
            int r7 = r4.f167308c
            java.lang.String r4 = r4.f167309d
            r14.i0(r6, r7, r4, r2)
            r4 = r5
            goto L54
        L69:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.prism.gaia.server.content.j.V():boolean");
    }

    public final b X(XmlPullParser xmlPullParser, int i10) {
        int i11;
        String str;
        b bVarD;
        try {
            i11 = Integer.parseInt(xmlPullParser.getAttributeValue(null, "id"));
        } catch (NullPointerException | NumberFormatException unused) {
            i11 = -1;
        }
        if (i11 < 0) {
            return null;
        }
        String attributeValue = xmlPullParser.getAttributeValue(null, "authority");
        String attributeValue2 = xmlPullParser.getAttributeValue(null, f167238E);
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "syncable");
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "account");
        String attributeValue5 = xmlPullParser.getAttributeValue(null, "type");
        String attributeValue6 = xmlPullParser.getAttributeValue(null, "user");
        String attributeValue7 = xmlPullParser.getAttributeValue(null, "package");
        String attributeValue8 = xmlPullParser.getAttributeValue(null, "class");
        int i12 = attributeValue6 == null ? 0 : Integer.parseInt(attributeValue6);
        if (attributeValue5 == null) {
            attributeValue5 = "com.google";
            str = "unknown";
        } else {
            str = attributeValue3;
        }
        b bVar = this.f167280a.get(i11);
        if (bVar == null) {
            bVarD = attributeValue4 != null ? D(new Account(attributeValue4, attributeValue5), i12, attributeValue, i11, false) : E(new ComponentName(attributeValue7, attributeValue8), i12, i11, false);
            if (i10 > 0) {
                bVarD.f167316k.clear();
            }
        } else {
            bVarD = bVar;
        }
        bVarD.f167311f = attributeValue2 == null || Boolean.parseBoolean(attributeValue2);
        if ("unknown".equals(str)) {
            bVarD.f167312g = -1;
        } else {
            bVarD.f167312g = (str == null || Boolean.parseBoolean(str)) ? 1 : 0;
        }
        return bVarD;
    }

    public final void Y(XmlPullParser xmlPullParser, Bundle bundle) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "name");
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "type");
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "value1");
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "value2");
        try {
            if ("long".equals(attributeValue2)) {
                bundle.putLong(attributeValue, Long.parseLong(attributeValue3));
                return;
            }
            if (x.b.f238261b.equals(attributeValue2)) {
                bundle.putInt(attributeValue, Integer.parseInt(attributeValue3));
                return;
            }
            if ("double".equals(attributeValue2)) {
                bundle.putDouble(attributeValue, Double.parseDouble(attributeValue3));
                return;
            }
            if (x.b.f238262c.equals(attributeValue2)) {
                bundle.putFloat(attributeValue, Float.parseFloat(attributeValue3));
                return;
            }
            if (x.b.f238265f.equals(attributeValue2)) {
                bundle.putBoolean(attributeValue, Boolean.parseBoolean(attributeValue3));
            } else if (x.b.f238264e.equals(attributeValue2)) {
                bundle.putString(attributeValue, attributeValue3);
            } else if ("account".equals(attributeValue2)) {
                bundle.putParcelable(attributeValue, new Account(attributeValue3, attributeValue4));
            }
        } catch (NullPointerException | NumberFormatException unused) {
        }
    }

    public final void Z(XmlPullParser xmlPullParser) {
        int i10;
        try {
            i10 = Integer.parseInt(xmlPullParser.getAttributeValue(null, "user"));
        } catch (NullPointerException | NumberFormatException unused) {
            i10 = 0;
        }
        String attributeValue = xmlPullParser.getAttributeValue(null, f167238E);
        this.f167301v.put(i10, Boolean.valueOf(attributeValue == null || Boolean.parseBoolean(attributeValue)));
    }

    public SyncInfo a(e.l lVar) throws Throwable {
        synchronized (this.f167280a) {
            try {
                try {
                    h hVar = lVar.f167158a;
                    b bVarD = D(hVar.f167213a, hVar.f167216d, hVar.f167214b, -1, true);
                    SyncInfo syncInfoCtor = SyncInfoCompat2.Util.ctor(bVarD.f167310e, bVarD.f167307b, bVarD.f167309d, lVar.f167161d);
                    u(bVarD.f167308c).add(syncInfoCtor);
                    l0();
                    return syncInfoCtor;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    public final PeriodicSync a0(XmlPullParser xmlPullParser, b bVar) {
        long jE;
        Bundle bundle = new Bundle();
        String attributeValue = xmlPullParser.getAttributeValue(null, x.c.f238292Q);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "flex");
        try {
            long j10 = Long.parseLong(attributeValue);
            try {
                jE = Long.parseLong(attributeValue2);
            } catch (NullPointerException unused) {
                jE = e(j10);
            } catch (NumberFormatException unused2) {
                jE = e(j10);
            }
            PeriodicSync periodicSyncCtor = PeriodicSyncCompat2.Util.ctor(bVar.f167307b, bVar.f167309d, bundle, j10, jE);
            bVar.f167316k.add(periodicSyncCtor);
            return periodicSyncCtor;
        } catch (NullPointerException | NumberFormatException unused3) {
            return null;
        }
    }

    public void b(PeriodicSync periodicSync, int i10) throws Throwable {
        x0(periodicSync, i10, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0074 A[Catch: all -> 0x001c, IOException -> 0x001f, XmlPullParserException -> 0x0022, TryCatch #10 {IOException -> 0x001f, XmlPullParserException -> 0x0022, all -> 0x001c, blocks: (B:4:0x0009, B:7:0x0017, B:12:0x0025, B:14:0x0031, B:18:0x0041, B:21:0x0047, B:25:0x0055, B:24:0x0051, B:26:0x005d, B:30:0x006b, B:33:0x0070, B:35:0x0074, B:36:0x0086, B:38:0x008a, B:43:0x0094, B:45:0x00a3, B:47:0x00ad, B:49:0x00b5, B:52:0x00c0, B:54:0x00c8, B:55:0x00cc, B:57:0x00d3, B:60:0x00dd, B:61:0x00e2, B:64:0x00eb, B:66:0x00f3, B:67:0x00f8, B:29:0x0067, B:32:0x006e), top: B:106:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a3 A[Catch: all -> 0x001c, IOException -> 0x001f, XmlPullParserException -> 0x0022, TryCatch #10 {IOException -> 0x001f, XmlPullParserException -> 0x0022, all -> 0x001c, blocks: (B:4:0x0009, B:7:0x0017, B:12:0x0025, B:14:0x0031, B:18:0x0041, B:21:0x0047, B:25:0x0055, B:24:0x0051, B:26:0x005d, B:30:0x006b, B:33:0x0070, B:35:0x0074, B:36:0x0086, B:38:0x008a, B:43:0x0094, B:45:0x00a3, B:47:0x00ad, B:49:0x00b5, B:52:0x00c0, B:54:0x00c8, B:55:0x00cc, B:57:0x00d3, B:60:0x00dd, B:61:0x00e2, B:64:0x00eb, B:66:0x00f3, B:67:0x00f8, B:29:0x0067, B:32:0x006e), top: B:106:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0051 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b0() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.prism.gaia.server.content.j.b0():void");
    }

    public void c(int i10, ISyncStatusObserver iSyncStatusObserver) {
        synchronized (this.f167280a) {
            this.f167286g.register(iSyncStatusObserver, Integer.valueOf(i10));
        }
    }

    public final void c0() throws Throwable {
        SQLiteDatabase sQLiteDatabaseOpenDatabase;
        SyncStatusInfo syncStatusInfo;
        boolean z10;
        File databasePath = this.f167293n.getDatabasePath("syncmanager.db");
        if (databasePath.exists()) {
            String path = databasePath.getPath();
            try {
                sQLiteDatabaseOpenDatabase = SQLiteDatabase.openDatabase(path, null, 1);
            } catch (SQLiteException unused) {
                sQLiteDatabaseOpenDatabase = null;
            }
            if (sQLiteDatabaseOpenDatabase != null) {
                boolean z11 = sQLiteDatabaseOpenDatabase.getVersion() >= 11;
                SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
                sQLiteQueryBuilder.setTables("stats, status");
                HashMap map = new HashMap();
                map.put("_id", "status._id as _id");
                String str = "account";
                map.put("account", "stats.account as account");
                String str2 = "account_type";
                if (z11) {
                    map.put("account_type", "stats.account_type as account_type");
                }
                map.put("authority", "stats.authority as authority");
                map.put("totalElapsedTime", "totalElapsedTime");
                map.put("numSyncs", "numSyncs");
                map.put("numSourceLocal", "numSourceLocal");
                map.put("numSourcePoll", "numSourcePoll");
                map.put("numSourceServer", "numSourceServer");
                map.put("numSourceUser", "numSourceUser");
                map.put("lastSuccessSource", "lastSuccessSource");
                String str3 = "totalElapsedTime";
                map.put("lastSuccessTime", "lastSuccessTime");
                String str4 = "lastSuccessTime";
                map.put("lastFailureSource", "lastFailureSource");
                String str5 = "lastFailureSource";
                map.put("lastFailureTime", "lastFailureTime");
                String str6 = "lastFailureTime";
                map.put("lastFailureMesg", "lastFailureMesg");
                String str7 = "lastFailureMesg";
                String str8 = "pending";
                map.put("pending", "pending");
                sQLiteQueryBuilder.setProjectionMap(map);
                sQLiteQueryBuilder.appendWhere("stats._id = status.stats_id");
                String str9 = "numSourceServer";
                String str10 = "authority";
                String str11 = "numSyncs";
                String str12 = "numSourceLocal";
                String str13 = "numSourcePoll";
                Cursor cursorQuery = sQLiteQueryBuilder.query(sQLiteDatabaseOpenDatabase, null, null, null, null, null, null);
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(cursorQuery.getColumnIndex(str));
                    String string2 = z11 ? cursorQuery.getString(cursorQuery.getColumnIndex(str2)) : null;
                    if (string2 == null) {
                        string2 = "com.google";
                    }
                    String string3 = cursorQuery.getString(cursorQuery.getColumnIndex(str10));
                    String str14 = str10;
                    Account account = new Account(string, string2);
                    String str15 = str;
                    String str16 = str8;
                    String str17 = str2;
                    String str18 = str4;
                    String str19 = str5;
                    String str20 = str6;
                    String str21 = str7;
                    String str22 = str3;
                    b bVarD = D(account, 0, string3, -1, false);
                    int size = this.f167284e.size();
                    SyncStatusInfo syncStatusInfoValueAt = null;
                    while (true) {
                        if (size <= 0) {
                            syncStatusInfo = syncStatusInfoValueAt;
                            z10 = false;
                            break;
                        }
                        size--;
                        syncStatusInfoValueAt = this.f167284e.valueAt(size);
                        if (syncStatusInfoValueAt.authorityId == bVarD.f167310e) {
                            syncStatusInfo = syncStatusInfoValueAt;
                            z10 = true;
                            break;
                        }
                    }
                    if (!z10) {
                        syncStatusInfo = new SyncStatusInfo(bVarD.f167310e);
                        this.f167284e.put(bVarD.f167310e, syncStatusInfo);
                    }
                    syncStatusInfo.totalElapsedTime = cursorQuery.getLong(cursorQuery.getColumnIndex(str22));
                    String str23 = str11;
                    syncStatusInfo.numSyncs = cursorQuery.getInt(cursorQuery.getColumnIndex(str23));
                    String str24 = str12;
                    syncStatusInfo.numSourceLocal = cursorQuery.getInt(cursorQuery.getColumnIndex(str24));
                    String str25 = str13;
                    syncStatusInfo.numSourcePoll = cursorQuery.getInt(cursorQuery.getColumnIndex(str25));
                    String str26 = str9;
                    syncStatusInfo.numSourceServer = cursorQuery.getInt(cursorQuery.getColumnIndex(str26));
                    syncStatusInfo.numSourceUser = cursorQuery.getInt(cursorQuery.getColumnIndex("numSourceUser"));
                    syncStatusInfo.numSourcePeriodic = 0;
                    syncStatusInfo.lastSuccessSource = cursorQuery.getInt(cursorQuery.getColumnIndex("lastSuccessSource"));
                    syncStatusInfo.lastSuccessTime = cursorQuery.getLong(cursorQuery.getColumnIndex(str18));
                    syncStatusInfo.lastFailureSource = cursorQuery.getInt(cursorQuery.getColumnIndex(str19));
                    str4 = str18;
                    str5 = str19;
                    str6 = str20;
                    syncStatusInfo.lastFailureTime = cursorQuery.getLong(cursorQuery.getColumnIndex(str20));
                    syncStatusInfo.lastFailureMesg = cursorQuery.getString(cursorQuery.getColumnIndex(str21));
                    syncStatusInfo.pending = cursorQuery.getInt(cursorQuery.getColumnIndex(str16)) != 0;
                    str9 = str26;
                    str3 = str22;
                    str = str15;
                    str8 = str16;
                    str2 = str17;
                    str7 = str21;
                    str10 = str14;
                    str11 = str23;
                    str12 = str24;
                    str13 = str25;
                }
                cursorQuery.close();
                SQLiteQueryBuilder sQLiteQueryBuilder2 = new SQLiteQueryBuilder();
                sQLiteQueryBuilder2.setTables("settings");
                Cursor cursorQuery2 = sQLiteQueryBuilder2.query(sQLiteDatabaseOpenDatabase, null, null, null, null, null, null);
                while (cursorQuery2.moveToNext()) {
                    String string4 = cursorQuery2.getString(cursorQuery2.getColumnIndex("name"));
                    String string5 = cursorQuery2.getString(cursorQuery2.getColumnIndex("value"));
                    if (string4 != null) {
                        if (string4.equals("listen_for_tickles")) {
                            r0(string5 == null || Boolean.parseBoolean(string5), 0);
                        } else if (string4.startsWith("sync_provider_")) {
                            String strSubstring = string4.substring(14, string4.length());
                            int size2 = this.f167280a.size();
                            while (size2 > 0) {
                                size2--;
                                b bVarValueAt = this.f167280a.valueAt(size2);
                                if (bVarValueAt.f167309d.equals(strSubstring)) {
                                    bVarValueAt.f167311f = string5 == null || Boolean.parseBoolean(string5);
                                    bVarValueAt.f167312g = 1;
                                }
                            }
                        }
                    }
                }
                cursorQuery2.close();
                sQLiteDatabaseOpenDatabase.close();
                new File(path).delete();
            }
        }
    }

    public final void d(e eVar) {
        try {
            FileOutputStream fileOutputStreamF = this.f167298s.f();
            try {
                try {
                    try {
                        XmlSerializer jVar = new com.prism.gaia.helper.utils.j();
                        jVar.setOutput(fileOutputStreamF, C3843g.f162098b);
                        A0(eVar, jVar);
                        jVar.flush();
                        this.f167298s.d(fileOutputStreamF);
                        fileOutputStreamF.close();
                    } catch (IOException unused) {
                        this.f167298s.c(fileOutputStreamF);
                        fileOutputStreamF.close();
                    }
                } catch (IOException unused2) {
                }
            } catch (Throwable th) {
                try {
                    fileOutputStreamF.close();
                } catch (IOException unused3) {
                }
                throw th;
            }
        } catch (IOException unused4) {
            B0();
        }
    }

    public final void d0() throws Throwable {
        FileInputStream fileInputStreamG;
        this.f167298s.f22985a.exists();
        FileInputStream fileInputStream = null;
        try {
            try {
                fileInputStreamG = this.f167298s.g();
            } catch (IOException unused) {
                return;
            }
        } catch (IOException unused2) {
        } catch (XmlPullParserException unused3) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
            xmlPullParserNewPullParser.setInput(fileInputStreamG, null);
            int eventType = xmlPullParserNewPullParser.getEventType();
            while (eventType != 2 && eventType != 1) {
                eventType = xmlPullParserNewPullParser.next();
            }
            if (eventType == 1) {
                try {
                    fileInputStreamG.close();
                    return;
                } catch (IOException unused4) {
                    return;
                }
            }
            xmlPullParserNewPullParser.getName();
            do {
                if (eventType == 2) {
                    try {
                        String name = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getDepth() == 1 && "op".equals(name)) {
                            String attributeValue = xmlPullParserNewPullParser.getAttributeValue(null, "version");
                            if (attributeValue == null || Integer.parseInt(attributeValue) != 3) {
                                throw new IOException("Unknown version.");
                            }
                            int iIntValue = Integer.valueOf(xmlPullParserNewPullParser.getAttributeValue(null, f167270k0)).intValue();
                            boolean zBooleanValue = Boolean.valueOf(xmlPullParserNewPullParser.getAttributeValue(null, f167272m0)).booleanValue();
                            int iIntValue2 = Integer.valueOf(xmlPullParserNewPullParser.getAttributeValue(null, "source")).intValue();
                            int iIntValue3 = Integer.valueOf(xmlPullParserNewPullParser.getAttributeValue(null, "reason")).intValue();
                            b bVar = this.f167280a.get(iIntValue);
                            if (bVar != null) {
                                e eVar = new e(bVar.f167307b, bVar.f167308c, iIntValue3, iIntValue2, bVar.f167309d, new Bundle(), zBooleanValue);
                                eVar.f167331j = null;
                                this.f167282c.add(eVar);
                            }
                        } else {
                            xmlPullParserNewPullParser.getDepth();
                        }
                    } catch (NumberFormatException unused5) {
                    }
                }
                eventType = xmlPullParserNewPullParser.next();
            } while (eventType != 1);
            fileInputStreamG.close();
        } catch (IOException unused6) {
            fileInputStream = fileInputStreamG;
            if (fileInputStream == null) {
                return;
            }
            fileInputStream.close();
        } catch (XmlPullParserException unused7) {
            fileInputStream = fileInputStreamG;
            if (fileInputStream == null) {
                return;
            }
            fileInputStream.close();
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = fileInputStreamG;
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException unused8) {
                }
            }
            throw th;
        }
    }

    public final void e0() {
        try {
            byte[] bArrH = this.f167297r.h();
            Parcel parcelObtain = Parcel.obtain();
            int i10 = 0;
            parcelObtain.unmarshall(bArrH, 0, bArrH.length);
            parcelObtain.setDataPosition(0);
            while (true) {
                int i11 = parcelObtain.readInt();
                if (i11 == 0) {
                    return;
                }
                if (i11 != 101 && i11 != 100) {
                    return;
                }
                int i12 = parcelObtain.readInt();
                if (i11 == 100) {
                    i12 += 12236;
                }
                c cVar = new c(i12);
                cVar.f167318b = parcelObtain.readInt();
                cVar.f167319c = parcelObtain.readLong();
                cVar.f167320d = parcelObtain.readInt();
                cVar.f167321e = parcelObtain.readLong();
                c[] cVarArr = this.f167289j;
                if (i10 < cVarArr.length) {
                    cVarArr[i10] = cVar;
                    i10++;
                }
            }
        } catch (IOException unused) {
        }
    }

    public void f(i iVar) {
        boolean z10;
        i iVar2;
        synchronized (this.f167280a) {
            try {
                z10 = false;
                for (a aVar : this.f167281b.values()) {
                    for (b bVar : aVar.f167305b.values()) {
                        if (bVar.f167313h == -1 && bVar.f167314i == -1) {
                            iVar2 = iVar;
                        } else {
                            bVar.f167313h = -1L;
                            bVar.f167314i = -1L;
                            com.prism.gaia.server.accounts.a aVar2 = aVar.f167304a;
                            iVar2 = iVar;
                            iVar2.f(aVar2.f166405a, aVar2.f166406b, bVar.f167309d, 0L);
                            z10 = true;
                        }
                        iVar = iVar2;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10) {
            m0(1);
        }
    }

    public final void f0() {
        try {
            byte[] bArrH = this.f167296q.h();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.unmarshall(bArrH, 0, bArrH.length);
            parcelObtain.setDataPosition(0);
            while (true) {
                int i10 = parcelObtain.readInt();
                if (i10 == 0 || i10 != 100) {
                    return;
                }
                SyncStatusInfo syncStatusInfo = new SyncStatusInfo(parcelObtain);
                if (this.f167280a.indexOfKey(syncStatusInfo.authorityId) >= 0) {
                    syncStatusInfo.pending = false;
                    this.f167284e.put(syncStatusInfo.authorityId, syncStatusInfo);
                }
            }
        } catch (IOException unused) {
        }
    }

    public void g() {
        synchronized (this.f167280a) {
            this.f167280a.clear();
            this.f167281b.clear();
            this.f167287h.clear();
            this.f167282c.clear();
            this.f167284e.clear();
            this.f167285f.clear();
            b0();
            f0();
            d0();
            e0();
            c0();
            y0();
            D0();
            B0();
            C0();
        }
    }

    public void g0(SyncInfo syncInfo, int i10) {
        synchronized (this.f167280a) {
            u(i10).remove(syncInfo);
        }
        l0();
    }

    public final Pair<b, SyncStatusInfo> h(b bVar) {
        return Pair.create(new b(bVar), new SyncStatusInfo(F(bVar.f167310e)));
    }

    public void h0(Account account, int i10, String str) {
        synchronized (this.f167280a) {
            i0(account, i10, str, true);
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            synchronized (this.f167280a) {
                D0();
            }
        } else if (i10 == 2) {
            synchronized (this.f167280a) {
                C0();
            }
        }
    }

    public boolean i(e eVar) {
        boolean z10;
        int i10;
        synchronized (this.f167280a) {
            try {
                z10 = false;
                if (this.f167282c.remove(eVar)) {
                    if (this.f167282c.size() == 0 || (i10 = this.f167299t) >= 4) {
                        B0();
                        this.f167299t = 0;
                    } else {
                        this.f167299t = i10 + 1;
                    }
                    b bVarO = o(eVar.f167322a, eVar.f167323b, eVar.f167326e, "deleteFromPending");
                    if (bVarO != null) {
                        int size = this.f167282c.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 >= size) {
                                F(bVarO.f167310e).pending = false;
                                break;
                            }
                            e eVar2 = this.f167282c.get(i11);
                            if (eVar2.f167322a.equals(eVar.f167322a) && eVar2.f167326e.equals(eVar.f167326e) && eVar2.f167323b == eVar.f167323b) {
                                break;
                            }
                            i11++;
                        }
                    }
                    z10 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        m0(2);
        return z10;
    }

    public final void i0(Account account, int i10, String str, boolean z10) {
        b bVarRemove;
        a aVar = this.f167281b.get(new com.prism.gaia.server.accounts.a(account, i10));
        if (aVar == null || (bVarRemove = aVar.f167305b.remove(str)) == null) {
            return;
        }
        this.f167280a.remove(bVarRemove.f167310e);
        if (z10) {
            y0();
        }
    }

    public void j(Account[] accountArr, int i10) {
        synchronized (this.f167280a) {
            try {
                SparseArray sparseArray = new SparseArray();
                Iterator<a> it = this.f167281b.values().iterator();
                while (it.hasNext()) {
                    a next = it.next();
                    if (!C3838b.d(accountArr, next.f167304a.f166405a) && next.f167304a.f166406b == i10) {
                        for (b bVar : next.f167305b.values()) {
                            sparseArray.put(bVar.f167310e, bVar);
                        }
                        it.remove();
                    }
                }
                int size = sparseArray.size();
                if (size > 0) {
                    while (size > 0) {
                        size--;
                        int iKeyAt = sparseArray.keyAt(size);
                        this.f167280a.remove(iKeyAt);
                        int size2 = this.f167284e.size();
                        while (size2 > 0) {
                            size2--;
                            if (this.f167284e.keyAt(size2) == iKeyAt) {
                                SparseArray<SyncStatusInfo> sparseArray2 = this.f167284e;
                                sparseArray2.remove(sparseArray2.keyAt(size2));
                            }
                        }
                        int size3 = this.f167285f.size();
                        while (size3 > 0) {
                            size3--;
                            if (this.f167285f.get(size3).f167332a == iKeyAt) {
                                this.f167285f.remove(size3);
                            }
                        }
                    }
                    y0();
                    D0();
                    B0();
                    C0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j0(PeriodicSync periodicSync, int i10) throws Throwable {
        x0(periodicSync, i10, false);
    }

    public void k(StringBuilder sb2) {
        sb2.append("Pending Ops: ");
        sb2.append(this.f167282c.size());
        sb2.append(" operation(s)\n");
        ArrayList<e> arrayList = this.f167282c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            e eVar = arrayList.get(i10);
            i10++;
            e eVar2 = eVar;
            sb2.append("(" + eVar2.f167322a);
            sb2.append(", u" + eVar2.f167323b);
            sb2.append(U6.j.f68738d + eVar2.f167326e);
            sb2.append(U6.j.f68738d + eVar2.f167327f);
            sb2.append(")\n");
        }
    }

    public void k0(ISyncStatusObserver iSyncStatusObserver) {
        synchronized (this.f167280a) {
            this.f167286g.unregister(iSyncStatusObserver);
        }
    }

    public final void l(XmlSerializer xmlSerializer, Bundle bundle) throws IOException {
        for (String str : bundle.keySet()) {
            xmlSerializer.startTag(null, s.f115701h);
            xmlSerializer.attribute(null, "name", str);
            Object obj = bundle.get(str);
            if (obj instanceof Long) {
                xmlSerializer.attribute(null, "type", "long");
                xmlSerializer.attribute(null, "value1", obj.toString());
            } else if (obj instanceof Integer) {
                xmlSerializer.attribute(null, "type", x.b.f238261b);
                xmlSerializer.attribute(null, "value1", obj.toString());
            } else if (obj instanceof Boolean) {
                xmlSerializer.attribute(null, "type", x.b.f238265f);
                xmlSerializer.attribute(null, "value1", obj.toString());
            } else if (obj instanceof Float) {
                xmlSerializer.attribute(null, "type", x.b.f238262c);
                xmlSerializer.attribute(null, "value1", obj.toString());
            } else if (obj instanceof Double) {
                xmlSerializer.attribute(null, "type", "double");
                xmlSerializer.attribute(null, "value1", obj.toString());
            } else if (obj instanceof String) {
                xmlSerializer.attribute(null, "type", x.b.f238264e);
                xmlSerializer.attribute(null, "value1", obj.toString());
            } else if (obj instanceof Account) {
                xmlSerializer.attribute(null, "type", "account");
                Account account = (Account) obj;
                xmlSerializer.attribute(null, "value1", account.name);
                xmlSerializer.attribute(null, "value2", account.type);
            }
            xmlSerializer.endTag(null, s.f115701h);
        }
    }

    public void l0() {
        m0(4);
    }

    public final void m0(int i10) {
        ArrayList arrayList;
        synchronized (this.f167280a) {
            try {
                int iBeginBroadcast = this.f167286g.beginBroadcast();
                arrayList = null;
                while (iBeginBroadcast > 0) {
                    iBeginBroadcast--;
                    if ((((Integer) this.f167286g.getBroadcastCookie(iBeginBroadcast)).intValue() & i10) != 0) {
                        if (arrayList == null) {
                            arrayList = new ArrayList(iBeginBroadcast);
                        }
                        arrayList.add((ISyncStatusObserver) this.f167286g.getBroadcastItem(iBeginBroadcast));
                    }
                }
                this.f167286g.finishBroadcast();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            while (size > 0) {
                size--;
                try {
                    ((ISyncStatusObserver) arrayList.get(size)).onStatusChanged(i10);
                } catch (RemoteException unused) {
                }
            }
        }
    }

    public b n(int i10) {
        b bVar;
        synchronized (this.f167280a) {
            bVar = this.f167280a.get(i10);
        }
        return bVar;
    }

    public final void n0(Account account, int i10, int i11, String str, Bundle bundle) {
        this.f167303x.a(account, i10, i11, str, bundle);
    }

    public final b o(Account account, int i10, String str, String str2) {
        b bVar;
        a aVar = this.f167281b.get(new com.prism.gaia.server.accounts.a(account, i10));
        if (aVar == null || (bVar = aVar.f167305b.get(str)) == null) {
            return null;
        }
        return bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0074 A[Catch: all -> 0x002d, TryCatch #0 {all -> 0x002d, blocks: (B:9:0x001b, B:11:0x0025, B:13:0x002b, B:17:0x0030, B:42:0x0097, B:18:0x0036, B:19:0x0041, B:21:0x0047, B:23:0x004f, B:25:0x0059, B:29:0x0064, B:30:0x006e, B:32:0x0074, B:34:0x007c, B:37:0x0085, B:39:0x008b, B:41:0x0091), top: B:48:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void o0(android.accounts.Account r17, int r18, java.lang.String r19, long r20, long r22) {
        /*
            r16 = this;
            r1 = r16
            r7 = r20
            r9 = r22
            android.util.SparseArray<com.prism.gaia.server.content.j$b> r11 = r1.f167280a
            monitor-enter(r11)
            r0 = 1
            if (r17 == 0) goto Le
            if (r19 != 0) goto L13
        Le:
            r2 = r17
            r4 = r19
            goto L36
        L13:
            r5 = -1
            r6 = 1
            r2 = r17
            r3 = r18
            r4 = r19
            com.prism.gaia.server.content.j$b r2 = r1.D(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L2d
            long r3 = r2.f167313h     // Catch: java.lang.Throwable -> L2d
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 != 0) goto L30
            long r3 = r2.f167314i     // Catch: java.lang.Throwable -> L2d
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 != 0) goto L30
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L2d
            return
        L2d:
            r0 = move-exception
            goto L9e
        L30:
            r2.f167313h = r7     // Catch: java.lang.Throwable -> L2d
            r2.f167314i = r9     // Catch: java.lang.Throwable -> L2d
            r5 = r0
            goto L97
        L36:
            java.util.HashMap<com.prism.gaia.server.accounts.a, com.prism.gaia.server.content.j$a> r3 = r1.f167281b     // Catch: java.lang.Throwable -> L2d
            java.util.Collection r3 = r3.values()     // Catch: java.lang.Throwable -> L2d
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L2d
            r5 = 0
        L41:
            boolean r6 = r3.hasNext()     // Catch: java.lang.Throwable -> L2d
            if (r6 == 0) goto L97
            java.lang.Object r6 = r3.next()     // Catch: java.lang.Throwable -> L2d
            com.prism.gaia.server.content.j$a r6 = (com.prism.gaia.server.content.j.a) r6     // Catch: java.lang.Throwable -> L2d
            if (r2 == 0) goto L62
            com.prism.gaia.server.accounts.a r12 = r6.f167304a     // Catch: java.lang.Throwable -> L2d
            android.accounts.Account r12 = r12.f166405a     // Catch: java.lang.Throwable -> L2d
            boolean r12 = r2.equals(r12)     // Catch: java.lang.Throwable -> L2d
            if (r12 != 0) goto L62
            com.prism.gaia.server.accounts.a r12 = r6.f167304a     // Catch: java.lang.Throwable -> L2d
            int r12 = r12.f166406b     // Catch: java.lang.Throwable -> L2d
            r13 = r18
            if (r13 == r12) goto L64
            goto L41
        L62:
            r13 = r18
        L64:
            java.util.HashMap<java.lang.String, com.prism.gaia.server.content.j$b> r6 = r6.f167305b     // Catch: java.lang.Throwable -> L2d
            java.util.Collection r6 = r6.values()     // Catch: java.lang.Throwable -> L2d
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L2d
        L6e:
            boolean r12 = r6.hasNext()     // Catch: java.lang.Throwable -> L2d
            if (r12 == 0) goto L41
            java.lang.Object r12 = r6.next()     // Catch: java.lang.Throwable -> L2d
            com.prism.gaia.server.content.j$b r12 = (com.prism.gaia.server.content.j.b) r12     // Catch: java.lang.Throwable -> L2d
            if (r4 == 0) goto L85
            java.lang.String r14 = r12.f167309d     // Catch: java.lang.Throwable -> L2d
            boolean r14 = r4.equals(r14)     // Catch: java.lang.Throwable -> L2d
            if (r14 != 0) goto L85
            goto L6e
        L85:
            long r14 = r12.f167313h     // Catch: java.lang.Throwable -> L2d
            int r14 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r14 != 0) goto L91
            long r14 = r12.f167314i     // Catch: java.lang.Throwable -> L2d
            int r14 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r14 == 0) goto L6e
        L91:
            r12.f167313h = r7     // Catch: java.lang.Throwable -> L2d
            r12.f167314i = r9     // Catch: java.lang.Throwable -> L2d
            r5 = r0
            goto L6e
        L97:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L2d
            if (r5 == 0) goto L9d
            r1.m0(r0)
        L9d:
            return
        L9e:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L2d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.prism.gaia.server.content.j.o0(android.accounts.Account, int, java.lang.String, long, long):void");
    }

    public final b p(ComponentName componentName, int i10, String str) {
        b bVar = this.f167287h.get(componentName).get(i10);
        if (bVar == null) {
            return null;
        }
        return bVar;
    }

    public void p0(Account account, int i10, String str, long j10) {
        synchronized (this.f167280a) {
            try {
                b bVarD = D(account, i10, str, -1, true);
                if (bVarD.f167315j == j10) {
                    return;
                }
                bVarD.f167315j = j10;
                m0(1);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Pair<Long, Long> q(Account account, int i10, String str) {
        synchronized (this.f167280a) {
            try {
                b bVarO = o(account, i10, str, "getBackoff");
                if (bVarO != null) {
                    long j10 = bVarO.f167313h;
                    if (j10 >= 0) {
                        return Pair.create(Long.valueOf(j10), Long.valueOf(bVarO.f167314i));
                    }
                }
                return null;
            } finally {
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:28:0x003d
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public void q0(android.accounts.Account r9, int r10, java.lang.String r11, int r12) throws java.lang.Throwable {
        /*
            r8 = this;
            r0 = 1
            if (r12 <= r0) goto L5
            r12 = r0
            goto L9
        L5:
            r1 = -1
            if (r12 >= r1) goto L9
            r12 = r1
        L9:
            android.util.SparseArray<com.prism.gaia.server.content.j$b> r1 = r8.f167280a
            monitor-enter(r1)
            r6 = -1
            r7 = 0
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            com.prism.gaia.server.content.j$b r9 = r2.D(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L3d
            int r10 = r9.f167312g     // Catch: java.lang.Throwable -> L39
            if (r10 != r12) goto L20
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1c
            return
        L1c:
            r0 = move-exception
            r9 = r0
            r2 = r8
            goto L3f
        L20:
            r9.f167312g = r12     // Catch: java.lang.Throwable -> L39
            r8.y0()     // Catch: java.lang.Throwable -> L39
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L39
            if (r12 <= 0) goto L34
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            r6 = r5
            r5 = -5
            r2 = r8
            r2.n0(r3, r4, r5, r6, r7)
            goto L35
        L34:
            r2 = r8
        L35:
            r8.m0(r0)
            return
        L39:
            r0 = move-exception
            r2 = r8
        L3b:
            r9 = r0
            goto L3f
        L3d:
            r0 = move-exception
            goto L3b
        L3f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3d
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.prism.gaia.server.content.j.q0(android.accounts.Account, int, java.lang.String, int):void");
    }

    public ArrayList<Pair<b, SyncStatusInfo>> r() {
        ArrayList<Pair<b, SyncStatusInfo>> arrayList;
        synchronized (this.f167280a) {
            try {
                arrayList = new ArrayList<>(this.f167280a.size());
                for (int i10 = 0; i10 < this.f167280a.size(); i10++) {
                    arrayList.add(h(this.f167280a.valueAt(i10)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:24:0x004a
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public void r0(boolean r10, int r11) throws java.lang.Throwable {
        /*
            r9 = this;
            android.util.SparseArray<com.prism.gaia.server.content.j$b> r1 = r9.f167280a
            monitor-enter(r1)
            android.util.SparseArray<java.lang.Boolean> r0 = r9.f167301v     // Catch: java.lang.Throwable -> L45
            java.lang.Object r0 = r0.get(r11)     // Catch: java.lang.Throwable -> L45
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L45
            if (r0 == 0) goto L19
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L15
            if (r0 != r10) goto L19
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L15
            return
        L15:
            r0 = move-exception
            r10 = r0
            r3 = r9
            goto L48
        L19:
            android.util.SparseArray<java.lang.Boolean> r0 = r9.f167301v     // Catch: java.lang.Throwable -> L45
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r10)     // Catch: java.lang.Throwable -> L45
            r0.put(r11, r2)     // Catch: java.lang.Throwable -> L45
            r9.y0()     // Catch: java.lang.Throwable -> L45
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L45
            if (r10 == 0) goto L36
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            r4 = 0
            r6 = -7
            r7 = 0
            r3 = r9
            r5 = r11
            r3.n0(r4, r5, r6, r7, r8)
            goto L37
        L36:
            r3 = r9
        L37:
            r10 = 1
            r9.m0(r10)
            android.content.Context r10 = r3.f167293n
            android.content.Intent r11 = com.prism.gaia.naked.compat.android.content.ContentResolverCompat2.Util.getIntentOfSyncConnStatusChange()
            r10.sendBroadcast(r11)
            return
        L45:
            r0 = move-exception
            r3 = r9
        L47:
            r10 = r0
        L48:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4a
            throw r10
        L4a:
            r0 = move-exception
            goto L47
        */
        throw new UnsupportedOperationException("Method not decompiled: com.prism.gaia.server.content.j.r0(boolean, int):void");
    }

    public Pair<b, SyncStatusInfo> s(Account account, int i10, String str) {
        Pair<b, SyncStatusInfo> pairH;
        synchronized (this.f167280a) {
            pairH = h(D(account, i10, str, -1, true));
        }
        return pairH;
    }

    public void s0(d dVar) {
        if (this.f167303x == null) {
            this.f167303x = dVar;
        }
    }

    public final int t() {
        this.f167290k.setTimeInMillis(System.currentTimeMillis());
        int i10 = this.f167290k.get(6);
        if (this.f167291l != this.f167290k.get(1)) {
            this.f167291l = this.f167290k.get(1);
            this.f167290k.clear();
            this.f167290k.set(1, this.f167291l);
            this.f167292m = (int) (this.f167290k.getTimeInMillis() / 86400000);
        }
        return i10 + this.f167292m;
    }

    public void t0(int i10, PeriodicSync periodicSync, long j10) {
        synchronized (this.f167280a) {
            try {
                b bVar = this.f167280a.get(i10);
                int i11 = 0;
                while (true) {
                    if (i11 >= bVar.f167316k.size()) {
                        break;
                    }
                    if (periodicSync.equals(bVar.f167316k.get(i11))) {
                        this.f167284e.get(i10).setPeriodicSyncTime(i11, j10);
                        break;
                    }
                    i11++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final List<SyncInfo> u(int i10) {
        List<SyncInfo> listW;
        synchronized (this.f167280a) {
            listW = w(i10);
        }
        return listW;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:22:0x0035
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public void u0(android.accounts.Account r9, int r10, java.lang.String r11, boolean r12) {
        /*
            r8 = this;
            android.util.SparseArray<com.prism.gaia.server.content.j$b> r1 = r8.f167280a
            monitor-enter(r1)
            r6 = -1
            r7 = 0
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            com.prism.gaia.server.content.j$b r9 = r2.D(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L35
            boolean r10 = r9.f167311f     // Catch: java.lang.Throwable -> L31
            if (r10 != r12) goto L17
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            return
        L13:
            r0 = move-exception
            r9 = r0
            r2 = r8
            goto L37
        L17:
            r9.f167311f = r12     // Catch: java.lang.Throwable -> L31
            r8.y0()     // Catch: java.lang.Throwable -> L31
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L31
            if (r12 == 0) goto L2b
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            r6 = r5
            r5 = -6
            r2 = r8
            r2.n0(r3, r4, r5, r6, r7)
            goto L2c
        L2b:
            r2 = r8
        L2c:
            r9 = 1
            r8.m0(r9)
            return
        L31:
            r0 = move-exception
            r2 = r8
        L33:
            r9 = r0
            goto L37
        L35:
            r0 = move-exception
            goto L33
        L37:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L35
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.prism.gaia.server.content.j.u0(android.accounts.Account, int, java.lang.String, boolean):void");
    }

    public List<SyncInfo> v(int i10) {
        ArrayList arrayList;
        synchronized (this.f167280a) {
            try {
                List<SyncInfo> listW = w(i10);
                arrayList = new ArrayList();
                Iterator<SyncInfo> it = listW.iterator();
                while (it.hasNext()) {
                    arrayList.add(SyncInfoCompat2.Util.ctor(it.next()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b2 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:4:0x0009, B:6:0x0011, B:13:0x0029, B:15:0x002b, B:29:0x0077, B:31:0x0082, B:36:0x009f, B:38:0x00b2, B:40:0x00ba, B:43:0x00c2, B:54:0x0113, B:59:0x012b, B:63:0x0140, B:60:0x012f, B:62:0x0136, B:55:0x0117, B:57:0x011f, B:44:0x00e0, B:46:0x00ec, B:49:0x00f6, B:51:0x0104, B:52:0x0106, B:32:0x008a, B:34:0x008e, B:24:0x005a, B:25:0x0060, B:26:0x0066, B:27:0x006c, B:28:0x0072), top: B:68:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e0 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:4:0x0009, B:6:0x0011, B:13:0x0029, B:15:0x002b, B:29:0x0077, B:31:0x0082, B:36:0x009f, B:38:0x00b2, B:40:0x00ba, B:43:0x00c2, B:54:0x0113, B:59:0x012b, B:63:0x0140, B:60:0x012f, B:62:0x0136, B:55:0x0117, B:57:0x011f, B:44:0x00e0, B:46:0x00ec, B:49:0x00f6, B:51:0x0104, B:52:0x0106, B:32:0x008a, B:34:0x008e, B:24:0x005a, B:25:0x0060, B:26:0x0066, B:27:0x006c, B:28:0x0072), top: B:68:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0113 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:4:0x0009, B:6:0x0011, B:13:0x0029, B:15:0x002b, B:29:0x0077, B:31:0x0082, B:36:0x009f, B:38:0x00b2, B:40:0x00ba, B:43:0x00c2, B:54:0x0113, B:59:0x012b, B:63:0x0140, B:60:0x012f, B:62:0x0136, B:55:0x0117, B:57:0x011f, B:44:0x00e0, B:46:0x00ec, B:49:0x00f6, B:51:0x0104, B:52:0x0106, B:32:0x008a, B:34:0x008e, B:24:0x005a, B:25:0x0060, B:26:0x0066, B:27:0x006c, B:28:0x0072), top: B:68:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0117 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:4:0x0009, B:6:0x0011, B:13:0x0029, B:15:0x002b, B:29:0x0077, B:31:0x0082, B:36:0x009f, B:38:0x00b2, B:40:0x00ba, B:43:0x00c2, B:54:0x0113, B:59:0x012b, B:63:0x0140, B:60:0x012f, B:62:0x0136, B:55:0x0117, B:57:0x011f, B:44:0x00e0, B:46:0x00ec, B:49:0x00f6, B:51:0x0104, B:52:0x0106, B:32:0x008a, B:34:0x008e, B:24:0x005a, B:25:0x0060, B:26:0x0066, B:27:0x006c, B:28:0x0072), top: B:68:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012b A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:4:0x0009, B:6:0x0011, B:13:0x0029, B:15:0x002b, B:29:0x0077, B:31:0x0082, B:36:0x009f, B:38:0x00b2, B:40:0x00ba, B:43:0x00c2, B:54:0x0113, B:59:0x012b, B:63:0x0140, B:60:0x012f, B:62:0x0136, B:55:0x0117, B:57:0x011f, B:44:0x00e0, B:46:0x00ec, B:49:0x00f6, B:51:0x0104, B:52:0x0106, B:32:0x008a, B:34:0x008e, B:24:0x005a, B:25:0x0060, B:26:0x0066, B:27:0x006c, B:28:0x0072), top: B:68:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012f A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:4:0x0009, B:6:0x0011, B:13:0x0029, B:15:0x002b, B:29:0x0077, B:31:0x0082, B:36:0x009f, B:38:0x00b2, B:40:0x00ba, B:43:0x00c2, B:54:0x0113, B:59:0x012b, B:63:0x0140, B:60:0x012f, B:62:0x0136, B:55:0x0117, B:57:0x011f, B:44:0x00e0, B:46:0x00ec, B:49:0x00f6, B:51:0x0104, B:52:0x0106, B:32:0x008a, B:34:0x008e, B:24:0x005a, B:25:0x0060, B:26:0x0066, B:27:0x006c, B:28:0x0072), top: B:68:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void v0(long r18, long r20, java.lang.String r22, long r23, long r25) {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.prism.gaia.server.content.j.v0(long, long, java.lang.String, long, long):void");
    }

    public final List<SyncInfo> w(int i10) {
        ArrayList<SyncInfo> arrayList = this.f167283d.get(i10);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList<SyncInfo> arrayList2 = new ArrayList<>();
        this.f167283d.put(i10, arrayList2);
        return arrayList2;
    }

    public c[] x() {
        c[] cVarArr;
        synchronized (this.f167280a) {
            c[] cVarArr2 = this.f167289j;
            int length = cVarArr2.length;
            cVarArr = new c[length];
            System.arraycopy(cVarArr2, 0, cVarArr, 0, length);
        }
        return cVarArr;
    }

    public final void x0(PeriodicSync periodicSync, int i10, boolean z10) throws Throwable {
        synchronized (this.f167280a) {
            try {
                try {
                    long j10 = periodicSync.period;
                    try {
                        try {
                            b bVarD = D(periodicSync.account, i10, periodicSync.authority, -1, false);
                            int i11 = 0;
                            if (z10) {
                                int size = bVarD.f167316k.size();
                                while (true) {
                                    if (i11 >= size) {
                                        bVarD.f167316k.add(PeriodicSyncCompat2.Util.ctor(periodicSync));
                                        F(bVarD.f167310e).setPeriodicSyncTime(bVarD.f167316k.size() - 1, 0L);
                                        break;
                                    }
                                    PeriodicSync periodicSync2 = bVarD.f167316k.get(i11);
                                    if (!PeriodicSyncCompat2.Util.syncExtrasEquals(periodicSync.extras, periodicSync2.extras)) {
                                        i11++;
                                    } else if (periodicSync.period == periodicSync2.period && PeriodicSyncCompat2.Util.flexTimeEquals(periodicSync, periodicSync2)) {
                                        y0();
                                        D0();
                                    } else {
                                        bVarD.f167316k.set(i11, PeriodicSyncCompat2.Util.ctor(periodicSync));
                                    }
                                }
                                y0();
                                D0();
                                m0(1);
                            }
                            SyncStatusInfo syncStatusInfo = this.f167284e.get(bVarD.f167310e);
                            Iterator<PeriodicSync> it = bVarD.f167316k.iterator();
                            int i12 = 0;
                            while (it.hasNext()) {
                                if (PeriodicSyncCompat2.Util.syncExtrasEquals(it.next().extras, periodicSync.extras)) {
                                    it.remove();
                                    if (syncStatusInfo != null) {
                                        syncStatusInfo.removePeriodicSyncTime(i12);
                                    }
                                    i11 = 1;
                                } else {
                                    i12++;
                                }
                            }
                            if (i11 == 0) {
                                y0();
                                D0();
                                return;
                            }
                            y0();
                            D0();
                            m0(1);
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            y0();
                            D0();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                throw th;
            }
        }
    }

    public long y(Account account, int i10, String str) {
        synchronized (this.f167280a) {
            try {
                b bVarO = o(account, i10, str, "getDelayUntil");
                if (bVarO == null) {
                    return 0L;
                }
                return bVarO.f167315j;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y0() {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.prism.gaia.server.content.j.y0():void");
    }

    public void z0() {
        synchronized (this.f167280a) {
            try {
                if (this.f167299t > 0) {
                    B0();
                }
                D0();
                C0();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Account f167322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f167323b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f167324c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f167325d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f167326e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Bundle f167327f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ComponentName f167328g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f167329h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f167330i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public byte[] f167331j;

        public e(Account account, int i10, int i11, int i12, String str, Bundle bundle, boolean z10) {
            this.f167322a = account;
            this.f167323b = i10;
            this.f167325d = i12;
            this.f167324c = i11;
            this.f167326e = str;
            this.f167327f = bundle != null ? new Bundle(bundle) : bundle;
            this.f167329h = z10;
            this.f167330i = -1;
            this.f167328g = null;
        }

        public e(e eVar) {
            this.f167322a = eVar.f167322a;
            this.f167323b = eVar.f167323b;
            this.f167324c = eVar.f167324c;
            this.f167325d = eVar.f167325d;
            this.f167326e = eVar.f167326e;
            this.f167327f = eVar.f167327f;
            this.f167330i = eVar.f167330i;
            this.f167329h = eVar.f167329h;
            this.f167328g = eVar.f167328g;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ComponentName f167306a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Account f167307b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f167308c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f167309d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f167310e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f167311f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f167312g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f167313h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f167314i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f167315j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final ArrayList<PeriodicSync> f167316k;

        public b(b bVar) {
            this.f167307b = bVar.f167307b;
            this.f167308c = bVar.f167308c;
            this.f167309d = bVar.f167309d;
            this.f167306a = bVar.f167306a;
            this.f167310e = bVar.f167310e;
            this.f167311f = bVar.f167311f;
            this.f167312g = bVar.f167312g;
            this.f167313h = bVar.f167313h;
            this.f167314i = bVar.f167314i;
            this.f167315j = bVar.f167315j;
            this.f167316k = new ArrayList<>();
            ArrayList<PeriodicSync> arrayList = bVar.f167316k;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                PeriodicSync periodicSync = arrayList.get(i10);
                i10++;
                this.f167316k.add(PeriodicSyncCompat2.Util.ctor(periodicSync));
            }
        }

        public b(Account account, int i10, String str, int i11) {
            this.f167307b = account;
            this.f167308c = i10;
            this.f167309d = str;
            this.f167306a = null;
            this.f167310e = i11;
            this.f167311f = false;
            this.f167312g = -1;
            this.f167313h = -1L;
            this.f167314i = -1L;
            ArrayList<PeriodicSync> arrayList = new ArrayList<>();
            this.f167316k = arrayList;
            arrayList.add(PeriodicSyncCompat2.Util.ctor(account, str, new Bundle(), 86400L, j.e(86400L)));
        }

        public b(ComponentName componentName, int i10, int i11) {
            this.f167307b = null;
            this.f167308c = i10;
            this.f167309d = null;
            this.f167306a = componentName;
            this.f167310e = i11;
            this.f167311f = true;
            this.f167312g = -1;
            this.f167313h = -1L;
            this.f167314i = -1L;
            ArrayList<PeriodicSync> arrayList = new ArrayList<>();
            this.f167316k = arrayList;
            arrayList.add(PeriodicSyncCompat2.Util.ctor(null, null, new Bundle(), 86400L, j.e(86400L)));
        }
    }
}
