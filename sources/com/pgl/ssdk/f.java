package com.pgl.ssdk;

import com.pgl.ssdk.c;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public class f {

    public static class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    public static ByteBuffer a(ByteBuffer byteBuffer) throws C3834a {
        return g.b(byteBuffer);
    }

    public static byte[] b(ByteBuffer byteBuffer) throws C3834a {
        return g.c(byteBuffer);
    }

    public static h a(o oVar, c.a aVar, int i10) throws IOException, a {
        try {
            return g.a(oVar, aVar, i10);
        } catch (i e10) {
            throw new a(e10.getMessage());
        }
    }
}
