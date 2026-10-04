package com.bykv.vk.openvk.preload.geckox.utils;

import android.os.Process;
import androidx.activity.result.i;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class FileLock {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, Integer> f140622a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f140623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f140624c;

    static {
        System.loadLibrary("file_lock");
    }

    private FileLock(String str, int i10) {
        this.f140624c = str;
        this.f140623b = i10;
    }

    public static FileLock a(String str) {
        try {
            int iD = d(str);
            nLockFile(iD);
            return new FileLock(str, iD);
        } catch (Exception e10) {
            StringBuilder sbA = i.a("lock failed, file:", str, ", pid:");
            sbA.append(Process.myPid());
            sbA.append(" caused by:");
            sbA.append(e10.getMessage());
            throw new RuntimeException(sbA.toString());
        }
    }

    public static FileLock b(String str) {
        try {
            int iD = d(str);
            if (nTryLock(iD)) {
                return new FileLock(str, iD);
            }
            return null;
        } catch (Exception e10) {
            StringBuilder sbA = i.a("try lock failed, file:", str, " caused by:");
            sbA.append(e10.getMessage());
            throw new RuntimeException(sbA.toString());
        }
    }

    public static FileLock c(String str) throws Exception {
        try {
            int iD = d(str);
            if (nTryLock(iD)) {
                return new FileLock(str, iD);
            }
            new FileLock(str, iD).b();
            return null;
        } catch (Exception e10) {
            StringBuilder sbA = i.a("try lock failed, file:", str, " caused by:");
            sbA.append(e10.getMessage());
            throw new RuntimeException(sbA.toString());
        }
    }

    private static int d(String str) throws Exception {
        Integer numValueOf;
        Map<String, Integer> map = f140622a;
        synchronized (map) {
            try {
                numValueOf = map.get(str);
                if (numValueOf == null) {
                    new File(str).getParentFile().mkdirs();
                    numValueOf = Integer.valueOf(nGetFD(str));
                    map.put(str, numValueOf);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return numValueOf.intValue();
    }

    private static native int nGetFD(String str) throws Exception;

    private static native void nLockFile(int i10) throws Exception;

    private static native void nLockFileSegment(int i10, int i11) throws Exception;

    private static native void nRelease(int i10) throws Exception;

    private static native boolean nTryLock(int i10) throws Exception;

    private static native void nUnlockFile(int i10) throws Exception;

    public static FileLock a(String str, int i10) {
        try {
            int iD = d(str);
            nLockFileSegment(iD, i10);
            return new FileLock(str, iD);
        } catch (Exception e10) {
            StringBuilder sbA = i.a("lock segment failed, file:", str, " caused by:");
            sbA.append(e10.getMessage());
            throw new RuntimeException(sbA.toString());
        }
    }

    public final void b() {
        Integer numRemove;
        Map<String, Integer> map = f140622a;
        synchronized (map) {
            numRemove = map.remove(this.f140624c);
        }
        try {
            nRelease(numRemove.intValue());
        } catch (Exception e10) {
            throw new RuntimeException("release lock failed, file:" + this.f140624c + " caused by:" + e10.getMessage());
        }
    }

    public final void a() {
        try {
            nUnlockFile(this.f140623b);
        } catch (Exception unused) {
            throw new RuntimeException("release lock failed，path:" + this.f140624c);
        }
    }
}
