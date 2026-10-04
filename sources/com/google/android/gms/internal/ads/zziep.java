package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.CodedOutputStream;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class zziep extends IOException {
    public zziep() {
        super(CodedOutputStream.OutOfSpaceException.f112536a);
    }

    public zziep(long j10, long j11, int i10, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.format(Locale.US, "Pos: %d, limit: %d, len: %d", Long.valueOf(j10), Long.valueOf(j11), Integer.valueOf(i10))), th);
    }

    public zziep(Throwable th) {
        super(CodedOutputStream.OutOfSpaceException.f112536a, th);
    }
}
