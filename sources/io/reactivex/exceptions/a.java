package io.reactivex.exceptions;

import io.reactivex.internal.util.ExceptionHelper;
import lc.e;

/* JADX INFO: loaded from: classes7.dex */
public final class a {
    public a() {
        throw new IllegalStateException("No instances!");
    }

    @e
    public static RuntimeException a(@e Throwable th) {
        throw ExceptionHelper.e(th);
    }

    public static void b(@e Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }
}
