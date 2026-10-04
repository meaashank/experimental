package com.prism.gaia.server.accounts;

import android.accounts.Account;
import android.util.LruCache;
import android.util.Pair;
import com.prism.commons.utils.P;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f166614b = 64000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f166615a = new b();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Account f166616a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f166617b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f166618c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f166619d;

        public a(Account account, String str, String str2, byte[] bArr) {
            this.f166616a = account;
            this.f166618c = str;
            this.f166617b = str2;
            this.f166619d = bArr;
        }

        public boolean equals(Object obj) {
            if (obj != null && (obj instanceof a)) {
                a aVar = (a) obj;
                if (P.a(this.f166616a, aVar.f166616a) && P.a(this.f166617b, aVar.f166617b) && P.a(this.f166618c, aVar.f166618c) && Arrays.equals(this.f166619d, aVar.f166619d)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((this.f166616a.hashCode() ^ this.f166617b.hashCode()) ^ this.f166618c.hashCode()) ^ Arrays.hashCode(this.f166619d);
        }
    }

    public static class b extends LruCache<a, c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public HashMap<Pair<String, String>, a> f166620a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public HashMap<Account, a> f166621b;

        public class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final List<a> f166622a = new ArrayList();

            public a() {
            }

            public void a(a aVar) {
                this.f166622a.add(aVar);
            }

            public void b() {
                Iterator<a> it = this.f166622a.iterator();
                while (it.hasNext()) {
                    b.this.remove(it.next());
                }
            }
        }

        public b() {
            super(r.f166614b);
            this.f166620a = new HashMap<>();
            this.f166621b = new HashMap<>();
        }

        @Override // android.util.LruCache
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void entryRemoved(boolean z10, a aVar, c cVar, c cVar2) {
            a aVarRemove;
            if (cVar == null || cVar2 != null || (aVarRemove = this.f166620a.remove(new Pair(aVar.f166616a.type, cVar.f166624a))) == null) {
                return;
            }
            aVarRemove.b();
        }

        public void b(Account account) {
            a aVar = this.f166621b.get(account);
            if (aVar != null) {
                aVar.b();
            }
        }

        public void c(String str, String str2) {
            a aVar = this.f166620a.get(new Pair(str, str2));
            if (aVar != null) {
                aVar.b();
            }
        }

        public void d(a aVar, c cVar) {
            Pair<String, String> pair = new Pair<>(aVar.f166616a.type, cVar.f166624a);
            a aVar2 = this.f166620a.get(pair);
            if (aVar2 == null) {
                aVar2 = new a();
            }
            aVar2.a(aVar);
            this.f166620a.put(pair, aVar2);
            a aVar3 = this.f166621b.get(aVar.f166616a);
            if (aVar3 == null) {
                aVar3 = new a();
            }
            aVar3.a(aVar);
            this.f166621b.put(aVar.f166616a, aVar2);
            put(aVar, cVar);
        }

        @Override // android.util.LruCache
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int sizeOf(a aVar, c cVar) {
            return cVar.f166624a.length();
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f166624a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f166625b;

        public c(String str, long j10) {
            this.f166624a = str;
            this.f166625b = j10;
        }
    }

    public String a(Account account, String str, String str2, byte[] bArr) {
        c cVar = this.f166615a.get(new a(account, str, str2, bArr));
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (cVar != null && jCurrentTimeMillis < cVar.f166625b) {
            return cVar.f166624a;
        }
        if (cVar == null) {
            return null;
        }
        d(account.type, cVar.f166624a);
        return null;
    }

    public void b(Account account, String str, String str2, String str3, byte[] bArr, long j10) {
        account.getClass();
        if (str == null || System.currentTimeMillis() > j10) {
            return;
        }
        this.f166615a.d(new a(account, str2, str3, bArr), new c(str, j10));
    }

    public void c(Account account) {
        this.f166615a.b(account);
    }

    public void d(String str, String str2) {
        this.f166615a.c(str, str2);
    }
}
