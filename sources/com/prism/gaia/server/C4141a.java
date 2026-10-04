package com.prism.gaia.server;

import java.io.FileNotFoundException;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.prism.gaia.server.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4141a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<Integer> f166364a = new ThreadLocal<>();

    /* JADX INFO: renamed from: com.prism.gaia.server.a$a, reason: collision with other inner class name */
    public interface InterfaceC0674a<T> {
        T run() throws FileNotFoundException;
    }

    /* JADX INFO: renamed from: com.prism.gaia.server.a$b */
    public interface b<T> {
        T run();
    }

    public static void a() {
        ThreadLocal<Integer> threadLocal = f166364a;
        Integer num = threadLocal.get();
        threadLocal.set(Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public static void b() {
        ThreadLocal<Integer> threadLocal = f166364a;
        Integer num = threadLocal.get();
        if (num == null || num.intValue() <= 1) {
            threadLocal.remove();
        } else {
            threadLocal.set(Integer.valueOf(num.intValue() - 1));
        }
    }

    public static <T> T c(Callable<T> callable) throws Exception {
        a();
        try {
            return callable.call();
        } finally {
            b();
        }
    }

    public static <T> T d(InterfaceC0674a<T> interfaceC0674a) throws FileNotFoundException {
        a();
        try {
            return interfaceC0674a.run();
        } finally {
            b();
        }
    }

    public static <T> T e(b<T> bVar) {
        a();
        try {
            return bVar.run();
        } finally {
            b();
        }
    }

    public static boolean f() {
        Integer num = f166364a.get();
        return num != null && num.intValue() > 0;
    }
}
