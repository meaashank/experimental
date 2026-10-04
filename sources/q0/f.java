package Q0;

import Q0.l;
import U6.b;
import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.RemoteException;
import android.os.Trace;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.C1535h0;
import e.T;
import e.f0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1535h0<d, ProviderInfo> f65719a = new C1535h0<>(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Comparator<byte[]> f65720b = new Q0.d();

    public interface a {
        Cursor a(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal);

        void close();
    }

    public static class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentProviderClient f65721a;

        public b(Context context, Uri uri) {
            this.f65721a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // Q0.f.a
        public Cursor a(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.f65721a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException e10) {
                Log.w("FontsProvider", "Unable to query the content provider", e10);
                return null;
            }
        }

        @Override // Q0.f.a
        public void close() {
            ContentProviderClient contentProviderClient = this.f65721a;
            if (contentProviderClient != null) {
                contentProviderClient.release();
            }
        }
    }

    @T(24)
    public static class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentProviderClient f65722a;

        public c(Context context, Uri uri) {
            this.f65722a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }

        @Override // Q0.f.a
        public Cursor a(Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            ContentProviderClient contentProviderClient = this.f65722a;
            if (contentProviderClient == null) {
                return null;
            }
            try {
                return contentProviderClient.query(uri, strArr, str, strArr2, str2, cancellationSignal);
            } catch (RemoteException e10) {
                Log.w("FontsProvider", "Unable to query the content provider", e10);
                return null;
            }
        }

        @Override // Q0.f.a
        public void close() throws Exception {
            ContentProviderClient contentProviderClient = this.f65722a;
            if (contentProviderClient != null) {
                g.a(contentProviderClient);
            }
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f65723a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f65724b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List<List<byte[]>> f65725c;

        public d(String str, String str2, List<List<byte[]>> list) {
            this.f65723a = str;
            this.f65724b = str2;
            this.f65725c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Objects.equals(this.f65723a, dVar.f65723a) && Objects.equals(this.f65724b, dVar.f65724b) && Objects.equals(this.f65725c, dVar.f65725c);
        }

        public int hashCode() {
            return Objects.hash(this.f65723a, this.f65724b, this.f65725c);
        }
    }

    public static /* synthetic */ int a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            byte b11 = bArr2[i10];
            if (b10 != b11) {
                return b10 - b11;
            }
        }
        return 0;
    }

    @f0
    public static void b() {
        f65719a.evictAll();
    }

    public static List<byte[]> c(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    public static boolean d(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals(list.get(i10), list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public static List<List<byte[]>> e(j jVar, Resources resources) {
        List<List<byte[]>> list = jVar.f65729d;
        return list != null ? list : D0.f.c(resources, jVar.f65730e);
    }

    @NonNull
    public static l.b f(@NonNull Context context, @NonNull List<j> list, @Nullable CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        Trace.beginSection(z2.b.m("FontProvider.getFontFamilyResult"));
        try {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < list.size(); i10++) {
                j jVar = list.get(i10);
                ProviderInfo providerInfoG = g(context.getPackageManager(), jVar, context.getResources());
                if (providerInfoG == null) {
                    return new l.b(1, (l.c[]) null);
                }
                arrayList.add(h(context, jVar, providerInfoG.authority, cancellationSignal));
            }
            return new l.b(0, arrayList);
        } finally {
            Trace.endSection();
        }
    }

    @Nullable
    @f0
    public static ProviderInfo g(@NonNull PackageManager packageManager, @NonNull j jVar, @Nullable Resources resources) throws PackageManager.NameNotFoundException {
        Trace.beginSection(z2.b.m("FontProvider.getProvider"));
        try {
            List<List<byte[]>> listE = e(jVar, resources);
            d dVar = new d(jVar.f65726a, jVar.f65727b, listE);
            ProviderInfo providerInfo = f65719a.get(dVar);
            if (providerInfo != null) {
                return providerInfo;
            }
            String str = jVar.f65726a;
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(jVar.f65727b)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + jVar.f65727b);
            }
            List<byte[]> listC = c(packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures);
            Collections.sort(listC, f65720b);
            for (int i10 = 0; i10 < listE.size(); i10++) {
                ArrayList arrayList = new ArrayList(listE.get(i10));
                Collections.sort(arrayList, f65720b);
                if (d(listC, arrayList)) {
                    f65719a.put(dVar, providerInfoResolveContentProvider);
                    return providerInfoResolveContentProvider;
                }
            }
            Trace.endSection();
            return null;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v10 */
    /* JADX WARN: Type inference failed for: r18v2, types: [Q0.f$a] */
    @NonNull
    @f0
    public static l.c[] h(Context context, j jVar, String str, CancellationSignal cancellationSignal) {
        ?? r18;
        String[] strArr;
        a aVar;
        a aVar2;
        Uri uriWithAppendedId;
        Trace.beginSection(z2.b.m("FontProvider.query"));
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath(b.h.f68653a).build();
            a aVarA = e.a(context, uriBuild);
            Cursor cursorA = null;
            try {
                strArr = new String[]{"_id", l.a.f65751a, l.a.f65752b, l.a.f65753c, l.a.f65754d, l.a.f65755e, l.a.f65756f};
                Trace.beginSection(z2.b.m("ContentQueryWrapper.query"));
            } catch (Throwable th) {
                th = th;
                r18 = aVarA;
            }
            try {
                try {
                    cursorA = aVarA.a(uriBuild, strArr, "query = ?", new String[]{jVar.f65728c}, null, cancellationSignal);
                    if (cursorA == null || cursorA.getCount() <= 0) {
                        aVar = aVarA;
                    } else {
                        int columnIndex = cursorA.getColumnIndex(l.a.f65756f);
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = cursorA.getColumnIndex("_id");
                        int columnIndex3 = cursorA.getColumnIndex(l.a.f65751a);
                        int columnIndex4 = cursorA.getColumnIndex(l.a.f65752b);
                        int columnIndex5 = cursorA.getColumnIndex(l.a.f65754d);
                        int columnIndex6 = cursorA.getColumnIndex(l.a.f65755e);
                        while (cursorA.moveToNext()) {
                            int i10 = columnIndex != -1 ? cursorA.getInt(columnIndex) : 0;
                            int i11 = columnIndex4 != -1 ? cursorA.getInt(columnIndex4) : 0;
                            if (columnIndex3 == -1) {
                                aVar2 = aVarA;
                                uriWithAppendedId = ContentUris.withAppendedId(uriBuild, cursorA.getLong(columnIndex2));
                            } else {
                                aVar2 = aVarA;
                                uriWithAppendedId = ContentUris.withAppendedId(uriBuild2, cursorA.getLong(columnIndex3));
                            }
                            arrayList2.add(new l.c(uriWithAppendedId, i11, columnIndex5 != -1 ? cursorA.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorA.getInt(columnIndex6) == 1, i10));
                            aVarA = aVar2;
                        }
                        aVar = aVarA;
                        arrayList = arrayList2;
                    }
                    if (cursorA != null) {
                        cursorA.close();
                    }
                    aVar.close();
                    return (l.c[]) arrayList.toArray(new l.c[0]);
                } finally {
                }
            } catch (Throwable th2) {
                th = th2;
                r18 = context;
                if (cursorA != null) {
                    cursorA.close();
                }
                r18.close();
                throw th;
            }
        } finally {
            Trace.endSection();
        }
    }
}
