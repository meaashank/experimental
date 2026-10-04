package io.reactivex.rxjava3.exceptions;

import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import yc.e;

/* JADX INFO: loaded from: classes7.dex */
public final class a {
    public a() {
        throw new IllegalStateException("No instances!");
    }

    @e
    public static RuntimeException a(@e Throwable t10) {
        throw ExceptionHelper.i(t10);
    }

    public static void b(@e Throwable t10) {
        if (t10 instanceof VirtualMachineError) {
            throw ((VirtualMachineError) t10);
        }
        if (t10 instanceof ThreadDeath) {
            throw ((ThreadDeath) t10);
        }
        if (t10 instanceof LinkageError) {
            throw ((LinkageError) t10);
        }
    }
}
