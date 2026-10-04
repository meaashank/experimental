package com.pgl.ssdk;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public abstract class c {

    public static class a extends r {
        public a(long j10, long j11, int i10, long j12, ByteBuffer byteBuffer) {
            super(j10, j11, i10, j12, byteBuffer);
        }
    }

    public static a a(o oVar) throws q, IOException {
        r rVarA = d.a(oVar);
        return new a(rVarA.a(), rVarA.c(), rVarA.b(), rVarA.e(), rVarA.d());
    }
}
