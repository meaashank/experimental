package com.google.android.gms.internal.play_billing;

import androidx.datastore.preferences.protobuf.CodedOutputStream;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfv extends IOException {
    public zzfv() {
        super(CodedOutputStream.OutOfSpaceException.f112536a);
    }

    public zzfv(long j10, long j11, int i10, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.format(Locale.US, "Pos: %d, limit: %d, len: %d", Long.valueOf(j10), Long.valueOf(j11), Integer.valueOf(i10))), th);
    }

    public zzfv(Throwable th) {
        super(CodedOutputStream.OutOfSpaceException.f112536a, th);
    }
}
