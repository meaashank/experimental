package androidx.core.util;

import android.util.AtomicFile;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.L0;
import kotlin.jvm.internal.V;
import kotlin.text.C5013e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.core.util.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@V({"SMAP\nAtomicFile.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AtomicFile.kt\nandroidx/core/util/AtomicFileKt\n*L\n1#1,72:1\n30#1,13:73\n*S KotlinDebug\n*F\n+ 1 AtomicFile.kt\nandroidx/core/util/AtomicFileKt\n*L\n46#1:73,13\n*E\n"})
public final class C2426c {
    @NotNull
    public static final byte[] a(@NotNull AtomicFile atomicFile) {
        return atomicFile.readFully();
    }

    @NotNull
    public static final String b(@NotNull AtomicFile atomicFile, @NotNull Charset charset) {
        return new String(atomicFile.readFully(), charset);
    }

    public static /* synthetic */ String c(AtomicFile atomicFile, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = C5013e.f218326b;
        }
        return b(atomicFile, charset);
    }

    public static final void d(@NotNull AtomicFile atomicFile, @NotNull ed.l<? super FileOutputStream, L0> lVar) throws IOException {
        FileOutputStream fileOutputStreamStartWrite = atomicFile.startWrite();
        try {
            lVar.invoke(fileOutputStreamStartWrite);
            atomicFile.finishWrite(fileOutputStreamStartWrite);
        } catch (Throwable th) {
            atomicFile.failWrite(fileOutputStreamStartWrite);
            throw th;
        }
    }

    public static final void e(@NotNull AtomicFile atomicFile, @NotNull byte[] bArr) throws IOException {
        FileOutputStream fileOutputStreamStartWrite = atomicFile.startWrite();
        try {
            fileOutputStreamStartWrite.write(bArr);
            atomicFile.finishWrite(fileOutputStreamStartWrite);
        } catch (Throwable th) {
            atomicFile.failWrite(fileOutputStreamStartWrite);
            throw th;
        }
    }

    public static final void f(@NotNull AtomicFile atomicFile, @NotNull String str, @NotNull Charset charset) throws IOException {
        byte[] bytes = str.getBytes(charset);
        kotlin.jvm.internal.G.o(bytes, "this as java.lang.String).getBytes(charset)");
        e(atomicFile, bytes);
    }

    public static /* synthetic */ void g(AtomicFile atomicFile, String str, Charset charset, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            charset = C5013e.f218326b;
        }
        f(atomicFile, str, charset);
    }
}
