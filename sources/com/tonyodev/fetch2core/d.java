package com.tonyodev.fetch2core;

import Jb.r;
import com.tonyodev.fetch2core.Downloader;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public interface d {

    public static final class a {
        public static /* synthetic */ String a(d dVar, String str, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createFile");
            }
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return dVar.c(str, z10);
        }

        public static /* synthetic */ boolean b(d dVar, String str, long j10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: preAllocateFile");
            }
            if ((i10 & 2) != 0) {
                j10 = -1;
            }
            dVar.f(str, j10);
            return true;
        }
    }

    boolean a(@NotNull String str, @NotNull String str2);

    boolean b(@NotNull String str);

    @NotNull
    String c(@NotNull String str, boolean z10);

    @NotNull
    r d(@NotNull Downloader.b bVar);

    boolean e(@NotNull String str);

    boolean f(@NotNull String str, long j10);

    @NotNull
    String g(@NotNull Downloader.b bVar);
}
