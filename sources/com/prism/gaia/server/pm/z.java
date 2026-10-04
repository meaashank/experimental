package com.prism.gaia.server.pm;

import android.os.Parcel;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class z {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f167678f = "asdf-".concat(z.class.getSimpleName());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f167679g = 1196446288;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f167680h = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f167681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f167682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f167683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, D> f167684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<String, Map<String, D>> f167685e;

    public z() {
        this(new HashMap(), new HashMap());
    }

    public static z l(Parcel parcel) {
        Boolean boolValueOf = null;
        if (parcel.readInt() != 1196446288 || parcel.readInt() != 5) {
            return null;
        }
        long j10 = parcel.readLong();
        long j11 = parcel.readLong();
        int i10 = parcel.readInt();
        Map<String, D> mapM = m(parcel);
        int i11 = parcel.readInt();
        HashMap map = new HashMap(Math.max(i11, 1));
        while (true) {
            int i12 = i11 - 1;
            if (i11 <= 0) {
                break;
            }
            map.put(parcel.readString(), m(parcel));
            i11 = i12;
        }
        z zVar = new z(mapM, map);
        zVar.f167681a = j10;
        zVar.f167682b = j11;
        if (i10 >= 0) {
            boolValueOf = Boolean.valueOf(i10 != 0);
        }
        zVar.f167683c = boolValueOf;
        return zVar;
    }

    public static Map<String, D> m(Parcel parcel) {
        int i10 = parcel.readInt();
        HashMap map = new HashMap(Math.max(i10, 1));
        while (true) {
            int i11 = i10 - 1;
            if (i10 <= 0) {
                return map;
            }
            map.put(parcel.readString(), D.h(parcel));
            i10 = i11;
        }
    }

    public static void p(Parcel parcel, Map<String, D> map) {
        ArrayList arrayList = new ArrayList(map.keySet());
        Collections.sort(arrayList);
        parcel.writeInt(arrayList.size());
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            String str = (String) obj;
            parcel.writeString(str);
            map.get(str).i(parcel);
        }
    }

    public List<String> a() {
        ArrayList arrayList = new ArrayList();
        if (this.f167683c != null) {
            arrayList.add("application:android:enabled=" + this.f167683c);
        }
        for (Map.Entry<String, D> entry : this.f167684d.entrySet()) {
            arrayList.add("application:" + entry.getKey() + "=" + entry.getValue());
        }
        for (Map.Entry<String, Map<String, D>> entry2 : this.f167685e.entrySet()) {
            for (Map.Entry<String, D> entry3 : entry2.getValue().entrySet()) {
                arrayList.add(entry2.getKey() + com.prism.gaia.server.accounts.b.f166434b0 + entry3.getKey() + "=" + entry3.getValue());
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public String b() {
        return "len=" + this.f167681a + " mtime=" + this.f167682b;
    }

    public D c(String str, String str2) {
        D dE = e(str, str2);
        return dE != null ? dE : d(str2);
    }

    public D d(String str) {
        return this.f167684d.get(str);
    }

    public D e(String str, String str2) {
        Map<String, D> map;
        if (str == null || (map = this.f167685e.get(str)) == null) {
            return null;
        }
        return map.get(str2);
    }

    public Map<String, D> f(String str) {
        HashMap map = new HashMap();
        for (Map.Entry<String, Map<String, D>> entry : this.f167685e.entrySet()) {
            D d10 = entry.getValue().get(str);
            if (d10 != null) {
                map.put(entry.getKey(), d10);
            }
        }
        return map;
    }

    public Boolean g() {
        return this.f167683c;
    }

    public boolean h() {
        return this.f167684d.isEmpty() && this.f167685e.isEmpty();
    }

    public boolean i(File file) {
        return this.f167681a >= 0 && this.f167682b >= 0 && file != null && file.exists() && this.f167681a == file.length() && this.f167682b == file.lastModified();
    }

    public void j(String str, D d10) {
        this.f167684d.put(str, d10);
    }

    public void k(String str, String str2, D d10) {
        Map<String, D> map = this.f167685e.get(str);
        if (map == null) {
            map = new HashMap<>();
            this.f167685e.put(str, map);
        }
        map.put(str2, d10);
    }

    public void n(Boolean bool) {
        this.f167683c = bool;
    }

    public void o(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        this.f167681a = file.length();
        this.f167682b = file.lastModified();
    }

    public void q(Parcel parcel) {
        parcel.writeInt(f167679g);
        parcel.writeInt(5);
        parcel.writeLong(this.f167681a);
        parcel.writeLong(this.f167682b);
        Boolean bool = this.f167683c;
        parcel.writeInt(bool == null ? -1 : bool.booleanValue() ? 1 : 0);
        p(parcel, this.f167684d);
        parcel.writeInt(this.f167685e.size());
        for (Map.Entry<String, Map<String, D>> entry : this.f167685e.entrySet()) {
            parcel.writeString(entry.getKey());
            p(parcel, entry.getValue());
        }
    }

    public z(Map<String, D> map, Map<String, Map<String, D>> map2) {
        this.f167681a = -1L;
        this.f167682b = -1L;
        this.f167684d = map;
        this.f167685e = map2;
    }
}
