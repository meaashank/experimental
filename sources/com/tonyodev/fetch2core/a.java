package com.tonyodev.fetch2core;

import Jb.r;
import Jb.t;
import android.content.ContentResolver;
import android.content.Context;
import com.tonyodev.fetch2core.Downloader;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f194464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f194465b;

    public a(@NotNull Context context, @NotNull String defaultTempDir) {
        G.p(context, "context");
        G.p(defaultTempDir, "defaultTempDir");
        this.f194464a = context;
        this.f194465b = defaultTempDir;
    }

    @Override // com.tonyodev.fetch2core.d
    public boolean a(@NotNull String oldFile, @NotNull String newFile) {
        G.p(oldFile, "oldFile");
        G.p(newFile, "newFile");
        if (oldFile.length() == 0 || newFile.length() == 0) {
            return false;
        }
        return t.o(oldFile, newFile, this.f194464a);
    }

    @Override // com.tonyodev.fetch2core.d
    public boolean b(@NotNull String file) {
        G.p(file, "file");
        return t.f(file, this.f194464a);
    }

    @Override // com.tonyodev.fetch2core.d
    @NotNull
    public String c(@NotNull String file, boolean z10) {
        G.p(file, "file");
        return t.d(file, z10, this.f194464a);
    }

    @Override // com.tonyodev.fetch2core.d
    @NotNull
    public r d(@NotNull Downloader.b request) {
        G.p(request, "request");
        String str = request.f194454d;
        ContentResolver contentResolver = this.f194464a.getContentResolver();
        G.o(contentResolver, "getContentResolver(...)");
        return t.n(str, contentResolver);
    }

    @Override // com.tonyodev.fetch2core.d
    public boolean e(@NotNull String file) {
        G.p(file, "file");
        if (file.length() == 0) {
            return false;
        }
        try {
            ContentResolver contentResolver = this.f194464a.getContentResolver();
            G.o(contentResolver, "getContentResolver(...)");
            t.n(file, contentResolver).close();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.tonyodev.fetch2core.d
    public boolean f(@NotNull String file, long j10) throws IOException {
        G.p(file, "file");
        if (file.length() == 0) {
            throw new FileNotFoundException(file.concat(" file_not_found"));
        }
        if (j10 < 1) {
            return true;
        }
        t.b(file, j10, this.f194464a);
        return true;
    }

    @Override // com.tonyodev.fetch2core.d
    @NotNull
    public String g(@NotNull Downloader.b request) {
        G.p(request, "request");
        return this.f194465b;
    }

    @NotNull
    public final Context h() {
        return this.f194464a;
    }
}
