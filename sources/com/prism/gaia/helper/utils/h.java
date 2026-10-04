package com.prism.gaia.helper.utils;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes6.dex */
public class h {
    public static Throwable a(Throwable th) {
        Throwable targetException;
        return (!(th instanceof InvocationTargetException) || (targetException = ((InvocationTargetException) th).getTargetException()) == null) ? th : targetException;
    }
}
