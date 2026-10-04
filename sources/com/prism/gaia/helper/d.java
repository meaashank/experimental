package com.prism.gaia.helper;

import android.util.SparseBooleanArray;
import com.prism.commons.utils.I;
import com.prism.commons.utils.l0;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f165030d = l0.b(d.class.getSimpleName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f165031a = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseBooleanArray f165032b = new SparseBooleanArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseBooleanArray f165033c = new SparseBooleanArray();

    public boolean a(Collection<String> collection) {
        ReentrantReadWriteLock.WriteLock writeLock = this.f165031a.writeLock();
        writeLock.lock();
        try {
            return b(collection);
        } finally {
            writeLock.unlock();
        }
    }

    public final boolean b(Collection<String> collection) {
        Iterator<String> it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (j(it.next(), true)) {
                z10 = true;
            }
        }
        return z10;
    }

    public void c() {
        ReentrantReadWriteLock.WriteLock writeLock = this.f165031a.writeLock();
        writeLock.lock();
        try {
            this.f165032b.clear();
            this.f165033c.clear();
        } finally {
            writeLock.unlock();
        }
    }

    public List<String> d() {
        ReentrantReadWriteLock.ReadLock lock = this.f165031a.readLock();
        lock.lock();
        try {
            LinkedList linkedList = new LinkedList();
            for (int i10 = 0; i10 < this.f165032b.size(); i10++) {
                if (this.f165032b.valueAt(i10)) {
                    linkedList.add(U6.c.a(false, this.f165032b.keyAt(i10)));
                }
            }
            for (int i11 = 0; i11 < this.f165033c.size(); i11++) {
                if (this.f165033c.valueAt(i11)) {
                    linkedList.add(U6.c.a(true, this.f165033c.keyAt(i11)));
                }
            }
            lock.unlock();
            return linkedList;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    public int e(boolean z10, int i10) {
        return 26;
    }

    public String f(boolean z10, int i10) {
        return U6.c.a(z10, 26);
    }

    public List<String> g(boolean z10) {
        LinkedList linkedList = new LinkedList();
        SparseBooleanArray sparseBooleanArray = z10 ? this.f165033c : this.f165032b;
        ReentrantReadWriteLock.ReadLock lock = this.f165031a.readLock();
        lock.lock();
        for (int i10 = 0; i10 < sparseBooleanArray.size(); i10++) {
            try {
                if (sparseBooleanArray.valueAt(i10)) {
                    linkedList.add(U6.c.a(z10, sparseBooleanArray.keyAt(i10)));
                }
            } finally {
                lock.unlock();
            }
        }
        return linkedList;
    }

    public int h(String str) {
        if (str != null && !str.equals("com.app.hider.master.promax")) {
            int iX = U6.c.x(str);
            int iY = iX > 0 ? 0 : U6.c.y(str);
            ReentrantReadWriteLock.ReadLock lock = this.f165031a.readLock();
            lock.lock();
            try {
                if (iX > 0) {
                    if (this.f165032b.get(iX)) {
                        return iX;
                    }
                } else if (iY > 0) {
                    if (this.f165033c.get(iY)) {
                        return -iY;
                    }
                }
            } finally {
                lock.unlock();
            }
        }
        return 0;
    }

    public boolean i(String str, boolean z10) {
        ReentrantReadWriteLock.WriteLock writeLock = this.f165031a.writeLock();
        writeLock.lock();
        try {
            return j(str, z10);
        } finally {
            writeLock.unlock();
        }
    }

    public final boolean j(String str, boolean z10) {
        if (str == null) {
            return false;
        }
        int iX = U6.c.x(str);
        if (iX > 0) {
            boolean z11 = this.f165032b.get(iX);
            if (z10) {
                if (!z11) {
                    this.f165032b.put(iX, true);
                    I.b(f165030d, "helper 32bit api%d available", Integer.valueOf(iX));
                    return true;
                }
            } else if (z11) {
                this.f165032b.delete(iX);
                I.b(f165030d, "helper 32bit api%d invalid", Integer.valueOf(iX));
                return true;
            }
        } else {
            int iY = U6.c.y(str);
            if (iY < 0) {
                return false;
            }
            boolean z12 = this.f165033c.get(iY);
            if (z10) {
                if (!z12) {
                    this.f165033c.put(iY, true);
                    I.b(f165030d, "helper 64bit api%d available", Integer.valueOf(iY));
                    return true;
                }
            } else if (z12) {
                this.f165033c.delete(iY);
                I.b(f165030d, "helper 64bit api%d invalid", Integer.valueOf(iY));
                return true;
            }
        }
        return false;
    }
}
