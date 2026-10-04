package com.inmobi.media;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/* JADX INFO: renamed from: com.inmobi.media.q3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3691q3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3704r3 f153289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean[] f153290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f153291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3732t3 f153292d;

    public C3691q3(C3732t3 c3732t3, C3704r3 c3704r3) {
        this.f153292d = c3732t3;
        this.f153289a = c3704r3;
        this.f153290b = c3704r3.f153306c ? null : new boolean[c3732t3.f153388h];
    }

    public final OutputStream a(int i10) {
        FileOutputStream fileOutputStream;
        C3677p3 c3677p3;
        synchronized (this.f153292d) {
            try {
                C3704r3 c3704r3 = this.f153289a;
                if (c3704r3.f153307d != this) {
                    throw new IllegalStateException();
                }
                if (!c3704r3.f153306c) {
                    this.f153290b[i10] = true;
                }
                File fileB = c3704r3.b(i10);
                try {
                    fileOutputStream = new FileOutputStream(fileB);
                } catch (FileNotFoundException unused) {
                    this.f153292d.f153381a.mkdirs();
                    try {
                        fileOutputStream = new FileOutputStream(fileB);
                    } catch (FileNotFoundException unused2) {
                        return C3732t3.f153380q;
                    }
                }
                c3677p3 = new C3677p3(this, fileOutputStream);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3677p3;
    }

    public final void a(String str, int i10) throws Throwable {
        OutputStreamWriter outputStreamWriter = null;
        try {
            OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(a(i10), Bc.f151811b);
            try {
                outputStreamWriter2.write(str);
                Bc.a(outputStreamWriter2);
            } catch (Throwable th) {
                th = th;
                outputStreamWriter = outputStreamWriter2;
                Bc.a(outputStreamWriter);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
